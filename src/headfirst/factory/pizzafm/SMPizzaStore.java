package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    if(item.equals("SMpizza")) {
      pizza = new SMStylePotatoPizza();
      //return pizza;  ����Լ� ���ÿ� ����ϰ� �������� �Ⱦ��°� ����
    } 
    return pizza;
  }
}