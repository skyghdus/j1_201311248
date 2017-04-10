package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator {
  Beverage beverage;
  public Caramel(Beverage b) {
    this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+" adding caramel";
  } 
  public double cost() {
    return beverage.cost()+0.2;
  }
}