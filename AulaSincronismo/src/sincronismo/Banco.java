/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronismo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Stefano
 */
public class Banco {
    
   private Lock lock2 = new ReentrantLock();
    
     
    synchronized public Boolean Sacar(Conta conta, double valor, String identificacaoExtrato)
    {
       
        try
        {
           // lock2.lock();
            
            double saldo = conta.getSaldo();    

            if (valor > saldo)
            {
                System.out.println("Saldo insuficiente");
                return false;
            }

            double saldoAtualizado = saldo - valor;        

            conta.setSaldo(saldoAtualizado);

            System.out.println(identificacaoExtrato + ", sacou: 100,00 - saldo atualizado: " + saldoAtualizado);

            return true;
        }
        finally
        {
          // lock2.unlock();
        }
    }   
}
