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
 * Класс который не делает нечего
 */
public class NoCommand implements CommandWithUndo {
    
    @Override
    public void execute() { }

    @Override
    public void undo() {
        
    }
}
