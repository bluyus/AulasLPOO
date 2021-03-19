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
public class ZarroAmericano extends Pato {

    public ZarroAmericano(){   
        this.setComportamentoGrasnar(new GrasnarReal());
        this.setComportamentoVoar(new VoarComAsas());
    }
    
    
    @Override
    public void Imagem() {
        System.out.println("Sou o Zarro-americano, conhecido também como a \"ruiva\" ");
    }
    
}
