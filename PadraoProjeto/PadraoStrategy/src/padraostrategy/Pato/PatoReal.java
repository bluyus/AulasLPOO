/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy.Pato;

import padraostrategy.ComportamentoGrasnar.GrasnarReal;
import padraostrategy.ComportamentoVoar.VoarComAsas;

/**
 *
 * @author Stefano
 */
public class PatoReal extends Pato {
    
    public PatoReal(){   
        this.setComportamentoGrasnar(new GrasnarReal());
        this.setComportamentoVoar(new VoarComAsas());
    }

    @Override
    public void Imagem() {
        System.out.println("Sou o pato-real ou marreco selvagem!!!!");
    }
    
}
