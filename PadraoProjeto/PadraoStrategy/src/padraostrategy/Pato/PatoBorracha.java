/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy.Pato;

import padraostrategy.ComportamentoGrasnar.GrasnarPorApito;
import padraostrategy.ComportamentoVoar.NaoPodeVoar;

/**
 *
 * @author Stefano
 */
public class PatoBorracha extends Pato {

    public PatoBorracha(){
        this.setComportamentoGrasnar(new GrasnarPorApito());
        this.setComportamentoVoar(new NaoPodeVoar());
    }
    
    @Override
    public void Imagem() {
        System.out.println("Sou um pato de borracha....");
    }
    
}
