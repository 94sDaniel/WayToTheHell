/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Gameover;
import View.Story;
import model.Heroes;
import model.Personajes;

/**
 *
 *  @author Daniel Sierra Calle - David Parra - Gerson Herrera
 * @since 30/11/2017
 * @version 1.0
 */
public class Lucha {
     // personajes de usuario
    Heroes zeus;
//    Heroes poseidon;
//    Heroes perseo;
    
    // persoanjes de computadora
    Personajes hades;
//  Personajes abigor;
//    Personajes can_cerbero;
//    Personajes grifo;
//    Personajes medusa;
//    Personajes centauro;
//    Personajes craken;
//    Personajes hidra;
//    Personajes leon_nemea;
//    Personajes minotauro;
//    Personajes quimera;
//    Personajes arpia;
//    Personajes esfinge;
//    Personajes ciclope;
//    Personajes Python;
//    Personajes scylla;

    public Lucha (Heroes zeus, Personajes hades) {
        this.zeus =  zeus;
        this.hades = hades;
        
    }
    
    /**
     * funcion generada para medir la velocidad del los opnentes inciales y asignar el primer ataque al mas rapido
     * @param seleccion
     * @return 
     */
    public String atacar (int seleccion){
        String mensaje = "";
        Personajes atacante, defensor;
        if (zeus.getSpeed()> hades.getSpeed()){
            batalla(zeus,hades,seleccion);
            if(zeus.getLife()> 0){
                int seleccionCom = hades.getAtk();
                mensaje += "\n" + batalla(zeus, hades,seleccionCom);
            }else{
                mensaje += "\n El ganador es " +zeus.getNombre();
               Gameover jFrame = new Gameover();
            jFrame.setVisible(true);
            }
        }else{
            int seleccionCom = hades.getAtk();
        }
        return mensaje;
    }
    
    /**
     * 
     * @param atacante
     * @param defensor
     * @param seleccion
     * @return 
     */
    public String batalla(Personajes atacante, Personajes defensor, int seleccion ){
        //throw new UnsupportedOperationException("No esta soportado");
        String mensaje = "";
        switch(seleccion){
            case 1:
                int dano = atacante.getAtk() - defensor.getLife();
                if (dano<1){
                    dano = 1;
                }
                defensor.setLife(defensor.getLife()-dano);
                mensaje = atacante.getNombre()+""+ dano+"";
                break;
            default:
                    mensaje="";
        }
        return mensaje;
    }
    
}
    

