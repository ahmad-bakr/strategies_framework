package com.strategy.containers;

/**
 * Strategy interface
 * @author ahmad.bakr
 *
 */
public interface Strategy {
    
    /**
     * Get strategy id
     * @return strategy id
     */
    String getId();
    
    /**
     * Start the strategy
     */
    void start();
    
    /**
     * Stop the strategy
     */
    void stop();

}
