package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage {
  //description = "houseblend coffee";
  public HouseBlend() {
    description = "houseblend coffee";
  }
  //public String getDescription() {
  //  return description;
  //}
  //public abstract double cost();
  public double cost() {
    return 0.89;
  }
}