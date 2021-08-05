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
class HottubOffCommand implements CommandWithUndo {
    Hottub hottub;
 
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
 
    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}