/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

/**
 *
 * @author nazarov
 */
public class HeartController  implements ControllerInterface {
    HeartModelInterface model;
    DJView view;
  
    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }
  
    public void start() {}
 
    public void stop() {}
    
    public void increaseBPM() {}
    
    public void decreaseBPM() {}
  
    public void setBPM(int bpm) {}
}