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
public class Personajes {
    
    private String nombre;
    
    private int life;
    
    private int atk;
    
    private int speed;
    
    private int colife;
    
    private int coatk;
    
    private int cospeed;
   

    public Personajes(String nombre, int life, int atk, int speed){
        this.nombre = nombre;
        this.life = life;
        this.speed = speed;
        this.cospeed = speed;
        this.colife = life;
        this.coatk = atk;
        
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @param atk the atk to set
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the colife
     */
    public int getColife() {
        return colife;
    }

    /**
     * @param colife the colife to set
     */
    public void setColife(int colife) {
        this.colife = colife;
    }

    /**
     * @return the coatk
     */
    public int getCoatk() {
        return coatk;
    }

    /**
     * @param coatk the coatk to set
     */
    public void setCoatk(int coatk) {
        this.coatk = coatk;
    }

    /**
     * @return the cospeed
     */
    public int getCospeed() {
        return cospeed;
    }

    /**
     * @param cospeed the cospeed to set
     */
    public void setCospeed(int cospeed) {
        this.cospeed = cospeed;
    }
    
}




