package headfirst.command.undo;

import java.util.*;

public class RemoteControlWithUndo {
  //Command slot;
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  public RemoteControlWithUndo() {
    onCommands=new Command[7];//nullobject pattern
    offCommands=new Command[7];
    Command noCommand = new NoCommand();
    for(int i=0;i<7;i++) {
      //onCommands[i]=new NoCommand();
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot, Command oncommand, Command offcommand) {
    onCommands[slot] = oncommand;
    offCommands[slot] = offcommand;
  }
  public  void onButtonWasPressed(int slot) {
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public  void offButtonWasPressed(int slot) {
    offCommands[slot].execute();
    undoCommand=offCommands[slot];
  }
  public void undoButtonWasPressed() {
    undoCommand.undo();
  }
}