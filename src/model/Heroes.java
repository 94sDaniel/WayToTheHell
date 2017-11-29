/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JCALLE
 */
public class Heroes extends Personajes{
    
    public Heroes(String nombre, int life, int atk, int speed) {
        super(nombre, life, atk, speed);
    }
    
    private int specialAbility;
}
