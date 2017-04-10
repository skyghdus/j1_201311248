package headfirst.decorator.starbuzz;

public class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso coffee";
  }
  public double cost() {
    return 0.8;
  }
}