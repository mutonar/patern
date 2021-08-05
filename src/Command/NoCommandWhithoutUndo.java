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
 * Класс который не делает нечего без отмены
 */
public class NoCommandWhithoutUndo implements Command {
    
    @Override
    public void execute() { }

}
