package headfirst.factory.pizzaaf;

public class ChicagiPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new ChicagoPizzaIngredientFactory();
    if(item.equals("Chicagopizza")) {
      //pizza = new NYStyleCheesePizza();
      //return pizza;  ����Լ� ���ÿ� ����ϰ� �������� �Ⱦ��°� ����
      pizza = new CheesePizza(inFac);
    } 
    return pizza;
  }
}