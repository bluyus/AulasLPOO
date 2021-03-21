/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaencapsulamento;

import aulaencapsulamento.estatico.ClasseEstatica;
import aulaencapsulamento.estatico.Constantes;

/**
 *
 * @author Stefano
 */
public class AulaEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteSemEncapsulamento cliente = new ClienteSemEncapsulamento();
        cliente.nome = "Maria";
        cliente.cpf = "111.111.111-11";
        
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setCpf("111.111.111-11");
        
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getCpf());
        
        String valor = ClasseEstatica.getValor();
        System.out.println(valor);        
        
        int valor2 = Constantes.VERSAO;
        System.out.println(valor2);    
    }
    
}
