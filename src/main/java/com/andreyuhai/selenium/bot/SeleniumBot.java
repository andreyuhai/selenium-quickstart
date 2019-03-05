package com.andreyuhai.selenium.bot;

public class SeleniumBot {

    BotBehaviour botBehaviour;

    public void setBotBehaviour(BotBehaviour botBehaviour) {
        this.botBehaviour = botBehaviour;
    }

    public void run() {
        botBehaviour.run();
    }
}
