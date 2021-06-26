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
class Stereo extends Equipment{

    private int volume = 0;
    
    Stereo(String nameEquipment) {
        discription = nameEquipment;
    }
    
    void on() {
        System.out.println("Stereo ON " + discription);
    }
    void off() {
        System.out.println("Stereo OFF " + discription);
    }

    void setCD() {
        System.out.println("Stereo setCD " + discription);
    }

    void setVolume(int i) {
        volume = i;
        System.out.println("Stereo volume " + discription);
    }
}
