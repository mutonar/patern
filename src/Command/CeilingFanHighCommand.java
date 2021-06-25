/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 * 
 *Управление команды вентилятором
 * 
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;// предыдущая скорость вентилятора
  
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
 
    public void execute() {
        prevSpeed = ceilingFan.getSpeed(); // В методе execute перед измнением скорости ее предыдущее значение сохраняется для возможной отмены.
        ceilingFan.high();
    }
 
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}