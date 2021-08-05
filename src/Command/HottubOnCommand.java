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
class HottubOnCommand implements CommandWithUndo {
    Hottub hottub;
 
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
 
    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}