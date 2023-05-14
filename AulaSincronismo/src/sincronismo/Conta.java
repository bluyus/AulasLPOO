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
public class Conta {
    
    /**
     * @return the saldo
     */
      public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
     public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    private double saldo;
    
    public Boolean Sacar(double valor) throws InterruptedException
    {
     //   Esperar();
       Thread.sleep(10000);
 
        double saldoAtual = getSaldo();    

        if (valor > saldoAtual)
        {
            System.out.println("Saldo insuficiente");
            return false;
        }

        double saldoAtualizado = saldoAtual - valor;        

        setSaldo(saldoAtualizado);  
        
        System.out.println(Thread.currentThread().getName() + " sacou: R$ 100,00. Saldo apos saque: R$ " + saldoAtualizado);
        return true;
    }  
    
    Conta(double saldoInicial)
    {
        setSaldo(saldoInicial);
        System.out.println("Saldo inicial: R$ " + getSaldo());
    } 
}
