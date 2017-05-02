package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    if(item.equals("Chicagopizza")) {
      pizza = new ChicagoStyleCheesePizza();
      //return pizza;  재귀함수 사용시에 사용하고 나머지는 안쓰는게 좋음
    } else if(item.equals("SMpizza")) {
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}
    
  