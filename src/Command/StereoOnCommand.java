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
class StereoOnCommand implements CommandWithUndo {
    Stereo stereo;
 
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
 
    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
