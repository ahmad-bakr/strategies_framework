package com.strategy.containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.strategy.containers.exceptions.StrategyAlreadyExistsException;

/**
 * Strategies container. Manages all Strategies and their workers.
 * @author ahmad.bakr
 *
 */
public class StrategiesContainer {

    private List<Worker> workersList;

    private Map<String, Integer> workersMap;

    public StrategiesContainer() {
        workersList = new ArrayList<Worker>();
        workersMap = new HashMap<String, Integer>();
    }
    
    /**
     * Run all the workers
     */
    public synchronized void runAll(){
        for(Worker worker : workersList){
            worker.start();
        }
    }

    /**
     * Add new strategy to the containers
     * @param strategy strategy
     * @throws Exception Exception if the strategy already exists
     */
    public synchronized void add(Strategy strategy) throws StrategyAlreadyExistsException {
        if (workersMap.containsKey(strategy.getId())) {
            throw new StrategyAlreadyExistsException();
        }
        Worker worker = new Worker(strategy);
        workersList.add(worker);
        workersMap.put(strategy.getId(), workersList.size() - 1);
    }
    
    /**
     * Get a strategy
     * @param id strategy id
     * @return the strategy if exists, otherwise null
     */
    public Strategy getStrategy(String id){
        if(workersMap.containsKey(id)){
            return workersList.get(workersMap.get(id)).getStrategy();
        }
        return null;
    }
    

}
