package headfirst.factory.pizzafm;

public abstract class PizzaStore { //��ü�����Ұ���
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    //pizza=factory.createPizza(type); simple factory�� �ٸ���!
    pizza.bake();
    pizza.prepare();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}