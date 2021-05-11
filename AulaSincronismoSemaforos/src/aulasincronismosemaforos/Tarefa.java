/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasincronismosemaforos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefano
 */
public class Tarefa extends Thread {
    
    public int numero;
    public Semaphore s;
    
    public Tarefa(int numero, Semaphore s)
    {
        this.numero = numero;
        this.s = s;
    }
    
    @Override
    public void run(){
 
        try 
        {
        s.acquire();
        
         System.out.println("Thread nº " + numero + " - Inicio ");
        
        int tempo = 2000;
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread nº " + numero + " - Final ");
        
        }  
        catch (InterruptedException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }        finally
        {
          s.release();
        }    
    }
    
}
