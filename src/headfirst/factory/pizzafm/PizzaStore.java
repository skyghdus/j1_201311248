package headfirst.factory.pizzafm;

public abstract class PizzaStore { //객체생성불가능
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    //pizza=factory.createPizza(type); simple factory와 다른점!
    pizza.bake();
    pizza.prepare();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}