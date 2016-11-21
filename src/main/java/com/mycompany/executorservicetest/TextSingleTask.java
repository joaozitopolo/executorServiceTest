/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.executorservicetest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao.polo
 */
public class TextSingleTask extends SingleTask {
    
    String text;

    public TextSingleTask(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        try {
            System.out.println(this);
            Thread.sleep(500 + (long)(1500.0 * Math.random()));
        } catch(InterruptedException ex) {
            Logger.getLogger(TextSingleTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "TextSingleTask{" + "text=" + text + " id=" + getId() + '}';
    }
    
}
