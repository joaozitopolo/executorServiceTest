/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.executorservicetest;

/**
 *
 * @author joao.polo
 */
public class Laucher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            ExecutorAccessService.instance.addSingleTask(new TextSingleTask("test " + i*13));
        }
        ExecutorAccessService.instance.shutdown();
    }
    
}
