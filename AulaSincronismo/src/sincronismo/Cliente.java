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
   
    private String nome;
    private Conta conta;
    
    Cliente(String nome, Conta conta)
    {
        this.conta = conta;
        this.nome = nome;
    }
    
    public void run()
    {
        while (this.conta.banco.Sacar(conta, 100, nome))
        {
          //  try {
          //      Thread.currentThread().sleep(200);
          //  } catch (InterruptedException ex) {
          //      Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          //  }
        }
           // System.out.println(nome + ", sacou: 100,00 - saldo atualizado: " + conta.getSaldo());
    }  
}
