package headfirst.command.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light();
    LightOffCommand lightOff=new LightOffCommand(light);
    LightOnCommand lightOn=new LightOnCommand(light);
    remote.setCommand(0, lightOn, lightOff);
    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPressed();
  }
}