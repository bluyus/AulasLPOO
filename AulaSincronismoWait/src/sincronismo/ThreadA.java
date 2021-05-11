/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronismo;

/**
 *
 * @author Stefano
 */
public class ThreadA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();

        synchronized(b){
            
            System.out.println("Esperando a Thread B completar a sua tarefa...");
            b.wait();  
        }
        
        System.out.println("O valor da somatória é: " + b.total);
    }
    }
    
