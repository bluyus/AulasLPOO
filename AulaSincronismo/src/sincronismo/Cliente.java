/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronismo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefano
 */
public class Cliente extends Thread {
   
    private Conta conta;
    
    Cliente(Conta conta, String nome)
    {
        super(nome);
        this.conta = conta;
    }
    
    @Override
    public void run()
    {
        try { 
            while (conta.Sacar(100)){}
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }  
}
