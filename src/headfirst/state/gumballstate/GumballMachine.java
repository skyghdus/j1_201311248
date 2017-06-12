package headfirst.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State state=soldOutState;
  int count=0;
  public GumballMachin(int num) {
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
    this.count=num;
    if(num>0) {
      state=noQuarterState;
    }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuater() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  public void setState(State s) {
    this.state=s;
  }
  public State getState() {
    return state;
  }
  public State getNoQuarterState() {
    return noQuarterState;
  }
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  public State getSoldState() {
    return soldState;
  }
  public int getCount() {
    return count;
  }
}