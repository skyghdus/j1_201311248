package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    if(item.equals("NYpizza")) {
      pizza = new NYStyleCheesePizza();
      //return pizza;  ����Լ� ���ÿ� ����ϰ� �������� �Ⱦ��°� ����
    } else if(item.equals("SMpizza")) {
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}
    
  