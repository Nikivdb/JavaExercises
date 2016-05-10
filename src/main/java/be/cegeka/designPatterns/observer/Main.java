package be.cegeka.designPatterns.observer;

import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new ScheduledTask(), 0, 3000);

        Thread.sleep(30000); // Sleep for 30 seconds

        timer.cancel();
    }
}
