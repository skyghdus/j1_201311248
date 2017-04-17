package headfirst.factory.pizza;

//import headfirst.factory.pizza.Pizza;

public class PizzaStore {
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza=factory.createPizza(type);
    pizza.bake();
    pizza.prepare();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
    