package com.andreyuhai.selenium.bot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumBot implements BotBehaviour {

    WebDriver driver;

    public SeleniumBot(int browser_type, boolean headless, boolean incognito){
        initializeDriver(browser_type, headless, incognito);
    }

    @Override
    public void run() {

    }

    private void initializeDriver(int browser_type, boolean headless, boolean incognito) {
        if (browser_type == Browser.FIREFOX ) {
            driver = createFirefoxDriver(headless, incognito);
        } else {
            driver = createChromeDriver(headless, incognito);
        }
    }

    // Creates a Chrome driver and returns it.
    private ChromeDriver createChromeDriver(boolean headless, boolean incognito) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(headless);
        if (incognito) {
            options.addArguments("incognito");
        }
        return new ChromeDriver(options);
    }

    // Creates a Firefox driver and returns it.
    private FirefoxDriver createFirefoxDriver(boolean headless, boolean incognito) {
        FirefoxOptions options = new FirefoxOptions();
        if (headless) {
            options.addArguments("--headless");
        }
        if (incognito) {
            options.addArguments("-private");
        }
        return new FirefoxDriver(options);
    }
}
