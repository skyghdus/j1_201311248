package headfirst.command.undo;
public class NoCommand implements Command {
  public void execute() {
    System.out.println("아무것도 안함");
  }
  public void undo() {
    
  }
}