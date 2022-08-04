/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

/**
 *
 * @author nazarov
 * 
 * //Применяем патерн Адаптер для адаптирования текущей модели.
 */
public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;
 
    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }
    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
    public int getBPM() {
        return heart.getHeartRate();
    }
  
    public void setBPM(int bpm) {}
   
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }
    
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }
     
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }
  
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
