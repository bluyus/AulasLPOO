package aulaencapsulamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefano
 */
public class Cliente {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        
        if (cpf == "111.111.111-11"){
            System.out.println("CPF Inválido");
            return;
        }
               
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private String cpf;
    private String nome;
}
