/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 */
class TV extends Equipment{
    
    TV(String nameEquipment) {
        discription = nameEquipment;
    }

    void on() {
        System.out.println("TV ON " + discription);
    }

    void off() {
         System.out.println("TV OFF " + discription);
    }
    
}
