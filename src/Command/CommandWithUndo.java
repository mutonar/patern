/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 * Интерфейс комманда то метод, исполнения и отмены
 */
interface CommandWithUndo {
    public void execute();
    public void undo();

}
