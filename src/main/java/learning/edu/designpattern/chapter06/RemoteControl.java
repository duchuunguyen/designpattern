package learning.edu.designpattern.chapter06;

import learning.edu.designpattern.chapter06.command.Command;
import learning.edu.designpattern.chapter06.command.NoCommand;

import java.text.MessageFormat;

/**
 * Created by duchuunguyen on 6/28/17.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            offCommands[i] = noCommand;
            onCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < 7; i++) {
            buffer.append(MessageFormat.format("[slot {0}] - [{1}] - [{2}]\n",
                    i,
                    onCommands[i].getClass().getCanonicalName(),
                    offCommands[i].getClass().getCanonicalName()));
        }
        return buffer.toString();
    }
}
