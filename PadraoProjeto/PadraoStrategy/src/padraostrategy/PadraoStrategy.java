/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

import padraostrategy.Pato.Pato;
import padraostrategy.Pato.PatoBorracha;
import padraostrategy.Pato.PatoReal;

/**
 *
 * @author Stefano
 */
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pato pato = new PatoReal();     
        pato.Imagem();
        pato.Nadar();        
        pato.Grasnar();
        pato.Voar();
        
        Pato pato2 = new PatoBorracha();     
        pato2.Imagem();
        pato2.Nadar();        
        pato2.Grasnar();
        pato2.Voar();          
    }
    
}
