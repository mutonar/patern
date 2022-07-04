/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

import java.util.ArrayList;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;

/**
 *
 * @author nazarov
 */
public class BeatModel implements BeatModelInterface, MetaEventListener { //Необходимо для MIDI-кода работа со звуком
    /*  */
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>(); // Два унаблюдателя.
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
 
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }
 
    public void on() {
        sequencer.start();
        setBPM(90);
    }
 
    public void off() {
        setBPM(0);
        sequencer.stop();
    }
 
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }
  
    public int getBPM() {
        return bpm;
    }
  
    void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(BeatObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meta(MetaMessage meta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
