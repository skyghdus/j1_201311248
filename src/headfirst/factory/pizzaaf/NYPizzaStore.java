package headfirst.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    if(item.equals("NYpizza")) {
      //pizza = new NYStyleCheesePizza();
      //return pizza;  ����Լ� ���ÿ� ����ϰ� �������� �Ⱦ��°� ����
      pizza = new CheesePizza(inFac);
    } 
    return pizza;
  }
}