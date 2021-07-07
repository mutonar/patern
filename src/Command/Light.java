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
 * Оборудование свет.
 * 
 */
class Light extends Equipment{
    
    Light(String nameEquipment) {
        discription = nameEquipment;
    }

    void on() {
        System.out.println("Light ON " + discription);
    }

    void off() {
         System.out.println("Light OFF " + discription);
    }
    
}
