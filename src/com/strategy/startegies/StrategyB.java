package com.strategy.startegies;

import com.strategy.containers.Strategy;

/**
 * An example of a strategy
 * @author ahmad.bakr
 *
 */
public class StrategyB implements Strategy{

    @Override
    public String getId() {
        return "strategy B";
    }

    @Override
    public void start() {
        System.out.println("Hello from strategy B");
    }

    @Override
    public void stop() {
        System.out.println("");
    }

    @Override
    public void beforeStart() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void afterFinish() {
        // TODO Auto-generated method stub
        
    }

}
