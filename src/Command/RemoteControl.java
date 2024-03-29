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
 * реализация управления без отмены что бы реализовать функциональный интерфейс
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
 
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
 
        Command noCommand = new NoCommandWhithoutUndo(); // Заполняет все ячейки командные по умолчанию пустым действием
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
  
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
 
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
 
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
  
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
