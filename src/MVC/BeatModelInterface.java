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
public interface BeatModelInterface {
    void initialize();
  
    void on();
  
    void off();
  
    void setBPM(int bpm);
  
    int getBPM();
  
    void registerObserver(BeatObserver o);
  
    void removeObserver(BeatObserver o);
    
    // какое то гониво с двумя типами наблюдптелей
    void registerObserver(BPMObserver o);
  
    void removeObserver(BPMObserver o);

}
