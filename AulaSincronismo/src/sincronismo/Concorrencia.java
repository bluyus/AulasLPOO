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
public class Concorrencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta contaConjunta = new Conta(1000);       

        Cliente pai = new Cliente("pai", contaConjunta); 
        Cliente mae = new Cliente("mae", contaConjunta); 
        Cliente filho = new Cliente("filho", contaConjunta); 
        
        pai.start();
        mae.start();
        filho.start();
    }
    
}
