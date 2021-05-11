/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasincronismosemaforos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Stefano
 */
public class AulaSincronismoSemaforos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int quantidadeTarefas = 10;
        int quantidadeSemaforo = 3;
        Semaphore s = new Semaphore(quantidadeSemaforo);        
        
        Tarefa[] tarefas = new Tarefa[quantidadeTarefas];
        
        for (int i = 0; i < quantidadeTarefas; i++) {
          tarefas[i] = new Tarefa(i, s);
          tarefas[i].start();
        } 
    }   
}
