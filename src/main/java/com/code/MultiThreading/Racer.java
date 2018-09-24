package com.code.MultiThreading;

/**
 * Created by prem on 5/13/2017.
 */
public class Racer implements Runnable {
    public static String winner;

    private void race() {
        for (int distance = 0; distance < 100; distance++) {
//            System.out.println("Distance Covered by" + Thread.currentThread().getName() + "is: " + distance + "Meter");
            if (distance == 300 && Thread.currentThread().getName().equals("rabbit")) {
                try {
                    System.out.println(Thread.currentThread().getName() + "is sleeping......");
                    Thread.sleep(1000 * 10); // no garuntee that it will wait for 10 sec
                } catch (InterruptedException e) {
                    e.getStackTrace();
                }
            }
            //check if race is completed
            boolean isRaceWon = this.isRaceWon(distance);
            if (isRaceWon)
                break;
        }

    }

    private static boolean isRaceWon(int totalDistance) {
        boolean isRaceWon = false;
        if ((Racer.winner == null) && (totalDistance == 100)) {
            String winnerName = Thread.currentThread().getName();
            Racer.winner = winnerName; // setting winners name
            System.out.println("Winner is: " + Racer.winner);
            isRaceWon = true;
        } else if (Racer.winner == null)
            isRaceWon = false;
        else if (Racer.winner != null)
            isRaceWon = true;
        return isRaceWon;
    }

    public void run() {
        this.race();
    }
}
