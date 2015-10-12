package com.strategy.containers;

/**
 * A thread worker class
 * @author ahmad.bakr
 *
 */
public class Worker extends Thread{

    private Strategy strategy;
    
    public Worker(Strategy strategy) {
        this.strategy = strategy;
    }
    
    @Override
    public void run() {
        this.strategy.start();
    }
    
    /**
     * Get the strategy of the worker
     * @return the strategy 
     */
    public Strategy getStrategy() {
        return strategy;
    }
    
}
