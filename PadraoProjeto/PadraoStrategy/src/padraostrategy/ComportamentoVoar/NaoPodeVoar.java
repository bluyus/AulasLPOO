/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy.ComportamentoVoar;

/**
 *
 * @author Stefano
 */
public class NaoPodeVoar implements IComportamentoVoar {

    @Override
    public void Voar() {
        System.out.println("Não sabe voar....");
    }
    
}
