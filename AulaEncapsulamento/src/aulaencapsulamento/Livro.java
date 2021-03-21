package aulaencapsulamento;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefano
 */
public class Livro {

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    private String isbn;
    
    private int numPaginas;
    
    public void emprestar(){
    
    }
    
    public void devolver(){
    
    }
    
    public void reservar(int dias){
    
    }
    
    public int reservar(Date data){
        return 1;
    }
    
    public int reservar(Date data, Cliente cliente){
        return 1;
    }
    
}
