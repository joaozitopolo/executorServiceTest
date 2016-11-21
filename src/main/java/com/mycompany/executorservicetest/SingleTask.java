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
public abstract class SingleTask implements Runnable {
    
    static int nextId;
    
    private int id = ++nextId;
    
    public int getId() {
        return id;
    }
    
}
