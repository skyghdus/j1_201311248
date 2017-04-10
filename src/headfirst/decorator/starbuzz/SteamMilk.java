package headfirst.decorator.starbuzz;

public class SteamMilk extends CondimentDecorator {
  Beverage beverage;
  public SteamMilk(Beverage b) {
    this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+" adding Steam Milk";
  } 
  public double cost() {
    return beverage.cost()+0.3;
  }
}