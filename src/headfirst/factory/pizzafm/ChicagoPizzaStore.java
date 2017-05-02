package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    if(item.equals("Chicagopizza")) {
      pizza = new ChicagoStyleCheesePizza();
      //return pizza;  ����Լ� ���ÿ� ����ϰ� �������� �Ⱦ��°� ����
    } else if(item.equals("SMpizza")) {
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}
    
  