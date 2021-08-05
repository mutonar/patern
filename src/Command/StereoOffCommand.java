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
class StereoOffCommand implements CommandWithUndo {
    Stereo stereo;
 
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
 
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}