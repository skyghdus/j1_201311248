package headfirst.factory.pizzaaf;

public abstract class PizzaStore { //객체생성불가능
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    //pizza=factory.createPizza(type); simple factory와 다른점!
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}