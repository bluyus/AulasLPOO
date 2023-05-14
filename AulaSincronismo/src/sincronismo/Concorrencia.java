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
       
       // Criação de recurso compartilhado 
       Conta contaConjunta = new Conta(1000);      
       
       Cliente pai = new Cliente(contaConjunta, "pai"); 
       Cliente mae = new Cliente(contaConjunta, "mae"); 
       Cliente filho = new Cliente(contaConjunta, "filho"); 
        
       pai.start();
       mae.start();
       filho.start();
    }    
}
