package headfirst.state.gumballstate;

public class NoQuarterState implements State {
  GumballMachine gm;//Context
  public NoQuarterState(GumballMachine gm) {
    this.gm=gm;
  }
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gm.setState(gm.getHasQuarterState());
  }
  public void ejectQuarter() {
    System.out.println("You were not inserted a quarter");
  }
  public void turnCrank() {
    System.out.println("You can not turn the crank");
  }
  public void dispense() {
    System.out.println("insert a quarter");
  }
}