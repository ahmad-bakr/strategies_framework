package com.strategy.containers;

import java.util.Random;

/**
 * A thread worker class
 * @author ahmad.bakr
 *
 */
public class Worker extends Thread {

    private Strategy strategy;

    private boolean isRunning;

    private Random r;

    /**
     * Constructor
     * @param strategy strategy
     */
    public Worker(Strategy strategy) {
        this.strategy = strategy;
        this.r = new Random();
        this.isRunning = false;
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.strategy.start();
                Thread.sleep(getRandomSleepingTime() * 1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void start() {
        this.isRunning = true;
        super.start();
    }

    /**
     * Get the strategy of the worker
     * @return the strategy 
     */
    public Strategy getStrategy() {
        return strategy;
    }

    /**
     * Is the thread running
     * @return true/false
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Get random number for thread sleeping
     * @return random number between 2 and 10
     */
    private int getRandomSleepingTime() {
        return r.nextInt(10) + 2;
    }

}
