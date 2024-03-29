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
 * Несколько комманд в одной
 * 
 */
public class MacroCommand implements CommandWithUndo {
    CommandWithUndo[] commands;
 
    public MacroCommand(CommandWithUndo[] commands) {
        this.commands = commands;
    }
 
    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
         for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
