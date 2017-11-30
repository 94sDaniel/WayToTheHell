/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    Heroes poseidon;
    Heroes perseo;
    
    // persoanjes de computadora
    Personajes hades;
    Personajes abigor;
    Personajes can_cerbero;
    Personajes grifo;
    Personajes medusa;
    Personajes centauro;
    Personajes craken;
    Personajes hidra;
    Personajes leon_nemea;
    Personajes minotauro;
    Personajes quimera;
    Personajes arpia;
    Personajes esfinge;
    Personajes ciclope;
    Personajes Python;
    Personajes scylla;

    public Lucha (Heroes zeus, Heroes poseidon, Heroes perseo, Personajes hades, Personajes abigor, Personajes can_cerbero, Personajes grifo, Personajes medusa, Personajes centauro, Personajes craken, Personajes hidra, Personajes leon_nemea, Personajes minotauro, Personajes quimera, Personajes arpia, Personajes esfinge, Personajes ciclope, Personajes Python, Personajes scylla) {
        this.zeus =  zeus;
        this.poseidon =  poseidon;
        this.perseo = perseo;
        this.hades = hades;
        this.abigor = abigor;
        this.can_cerbero = can_cerbero;
        this.grifo = grifo;
        this.medusa = medusa;
        this.centauro = centauro;
        this.craken = craken;
        this.hidra = hidra;
        this.leon_nemea = leon_nemea;
        this.minotauro = minotauro;
        this.quimera = quimera;
        this.arpia = arpia;
        this.esfinge = esfinge;
        this.ciclope = ciclope;
        this.Python = Python;
        this.scylla = scylla;
    }
    
    /**
     * funcion generada para medir la velocidad del los opnentes inciales y asignar el primer ataque al mas rapido
     * @param seleccion
     * @return 
     */
    public String atacar (int seleccion){
        String mensaje = "";
        if (zeus.getSpeed()> grifo.getSpeed()){
            batalla(zeus,grifo,seleccion);
            if(zeus.getLife()> 0){
                int seleccionCom = grifo.getAtk();
                mensaje += "\n" + batalla(zeus, grifo,seleccionCom);
            }else{
                mensaje += "\n El ganador es " +zeus.getNombre();
            }
        }else{
            int seleccionCom = grifo.getAtk();
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
    

