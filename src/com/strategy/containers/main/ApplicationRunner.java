package com.strategy.containers.main;

import com.strategy.containers.StrategiesContainer;
import com.strategy.containers.Strategy;
import com.strategy.startegies.StrategyA;
import com.strategy.startegies.StrategyB;

/**
 * Application Runner
 * @author ahmad.bakr
 *
 */
public class ApplicationRunner {

    public static void main(String[] args) throws InterruptedException {
        // Define a container
        StrategiesContainer container = new StrategiesContainer();

        // Define the strategies
        Strategy strategyA = new StrategyA();
        Strategy startegyB = new StrategyB();

        // Add the strategies to the container
        container.add(strategyA);
        container.add(startegyB);

        // Start the container
        container.runAll();

        Thread.currentThread().join();
    }
}
