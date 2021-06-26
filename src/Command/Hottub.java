/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 * 
 * Джакузи
 * 
 */
class Hottub extends Equipment{

    private int force = 0;
    
    void on() {
        System.out.println("Hottub ON " + discription);
    }

     void off() {
        System.out.println("Hottub OFF " + discription);
    }

    void setForce(int i) {
        force = i;
        System.out.println("Hottub volume " + discription);
    }
    
}
