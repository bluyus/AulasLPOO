/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy.Pato;

import padraostrategy.ComportamentoGrasnar.IComportamentoGrasnar;
import padraostrategy.ComportamentoVoar.IComportamentoVoar;

/**
 *
 * @author Stefano
 */
public abstract class Pato {
    private IComportamentoVoar comportamentoVoar;
    private IComportamentoGrasnar comportamentoGrasnar;
    
    public void setComportamentoVoar(IComportamentoVoar tipoComportamento){
        this.comportamentoVoar = tipoComportamento;
    }
    
    public void setComportamentoGrasnar(IComportamentoGrasnar tipoComportamento){
        this.comportamentoGrasnar = tipoComportamento;
    }
    
    public Pato(){
        
    }
    
    public abstract void Imagem();
    
    public void Voar(){
       comportamentoVoar.Voar();
    }
    
    public void Grasnar(){
        comportamentoGrasnar.Grasnar();
    } 
    
    public void Nadar(){
        System.out.println("Nadando...");
    }
}
