/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *Esta clase guarda a los personajes tipo heroes
 * @author Daniel Sierra Calle - David Parra - Gerson Herrera
 * @since 30/11/2017
 * @version 1.0
 */
public class Heroes extends Personajes{
    
    // Solo los herores tendran una habilidad especial para atacar a los montruos
    private int specialAbility;
    
    public Heroes(String nombre, int life, int atk, int speed,int specialAbility) {
        super(nombre, life, atk, speed);
        int specialAbility1 = this.specialAbility;
    }
    
    /**
     * @return the specialAbility
     */
    public int getSpecialAbility() {
        return specialAbility;
    }

    /**
     * @param specialAbility the specialAbility to set
     */
    public void setSpecialAbility(int specialAbility) {
        this.specialAbility = specialAbility;
    }
    
}
