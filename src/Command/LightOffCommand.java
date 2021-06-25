/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 * Реализация комманды светаы
 */
public class LightOffCommand implements Command {
    Light light;
 
    public LightOffCommand(Light light) {
        this.light = light;
    }
 
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
