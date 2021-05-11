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

    public Banco banco;
    
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
    
    Conta(double saldoInicial)
    {
        this.banco = new Banco();
        setSaldo(saldoInicial);
        System.out.println("Saldo inicial: " + getSaldo());
    }
    
}
