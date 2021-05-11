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
public class ThreadB extends Thread {
  int total;
    @Override
    public void run(){

        for(int i=0; i<10000; i++){
            total += i;
        }
    }
  
}
