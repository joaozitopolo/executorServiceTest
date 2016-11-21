/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.executorservicetest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author joao.polo
 * @see http://www.baeldung.com/java-executor-service-tutorial
 */
public class ExecutorAccessService {
    
    public final static ExecutorAccessService instance = new ExecutorAccessService();
    
    ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    private ExecutorAccessService() {
    }
    
    public void addSingleTask(SingleTask singleTask) {
        executorService.execute(singleTask);
    }
    
    public void shutdown() {
        executorService.shutdown();
    }
    
}
