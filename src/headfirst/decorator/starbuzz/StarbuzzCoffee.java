package headfirst.decorator.starbuzz;

public class StarbuzzCoffee {
  public static void main(String args[]) {
    Beverage beverage = new HouseBlend();
    beverage = new Mocha(beverage);
    beverage = new Whip(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
    Beverage beverage1 = new Espresso();
    beverage1 = new Caramel(beverage1);
    beverage1 = new SteamMilk(beverage1);
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
  }
}