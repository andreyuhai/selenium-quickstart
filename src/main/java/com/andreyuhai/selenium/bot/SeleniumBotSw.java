package com.andreyuhai.selenium.bot;

import javax.swing.*;
import java.util.List;

public class SeleniumBotSw extends SwingWorker {

    BotBehaviour botBehaviour;
    DoneBehaviour doneBehaviour;
    ProcessBehaviour processBehaviour;

    @Override
    protected void process(List chunks) {
        processBehaviour.process();
    }

    @Override
    protected void done() {
        doneBehaviour.done();
    }

    @Override
    protected Object doInBackground() throws Exception {
        botBehaviour.run();
        return null;
    }
}
