package be.cegeka.designPatterns.observer;

import java.util.TimerTask;

public class ScheduledTask extends TimerTask{

    @Override
    public void run() {
        // This will be called every 3 seconds. Create here you backend that will notify your views.
        System.out.println("test");
    }
}
