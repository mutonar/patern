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
class TVOnCommand implements CommandWithUndo {
    TV tv;
 
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
 
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
