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
 * реализация управления с функцией отмены
 */
public class RemoteControlWithUndo {
    CommandWithUndo[] onCommands;
    CommandWithUndo[] offCommands;
    CommandWithUndo undoCommand; // добавим новое поле для запоминания предыдущего значения комманды

 
    public RemoteControlWithUndo() {
        onCommands = new CommandWithUndo[7];
        offCommands = new CommandWithUndo[7];
 
        CommandWithUndo noCommand = new NoCommand(); // Заполняет все ячейки командные по умолчанию пустым действием
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand; // по умолчанию заносим пустую комманду
    }
  
    public void setCommand(int slot, CommandWithUndo onCommand, CommandWithUndo offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
 
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot]; // Запоминаем текущую комманду
    }
 
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot]; // Запоминаем текущую комманду другой кнопки
    }
  
    // --- Метод выполнения предыдущего действия ---
     public void undoButtonWasPushed() {
        undoCommand.undo();
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
