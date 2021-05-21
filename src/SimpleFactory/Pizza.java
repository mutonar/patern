/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SimpleFactory;

/**
 *
 * @author nazarov
 */
class Pizza {

    
   // Стандартные методы для всех пицц
    void prepare() {
        System.out.println("Prepare");
    }
    
    void bake() {
        System.out.println("Bake");
    }

    void cut() {
        System.out.println("Cut");
    }

    void box() {
        System.out.println("Box");
    }
    
}
