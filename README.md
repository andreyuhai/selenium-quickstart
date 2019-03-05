## Selenium QuickStart Project

This is a quickstart Selenium `maven` project which you can build your Selenium command-line or GUI application on top easily.

---

Since I have often been using Selenium and creating command-line and GUI apps, I decided to create a quickstart project so I can start building on top of it, instead of writing the same things over and over again.

I've already implemented two bots:
- `SeleniumBot` is for use in command-line applications.
- `SeleniumBotSw` which extends SwingWorker, is for use in GUI applications.

You can extend those classes above and start writing your own Selenium bot.
---
I've also implemented one behaviour class which is implementing `BotBehaviour`. You would also need to implement `DoneBehaviour` and `ProcessBehaviour` if you wish to use in your SwingWorker app.

This class basically creates a `WebDriver` and has methods to do so. To add more functionality to your bot you can extend to this class and add your methods. Then you can set this as `BotBehaviour` of your main bot and then just call it like `botBehaviour.run()`:

- in `doInBackground()` method for `SwingWorker` apps.
- in `run()` method of `Runnable` objects.

to run your bot.

I will be updating this project as I add new methods, classes, features, etc.
