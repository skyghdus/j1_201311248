package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    if(item.equals("NYpizza")) {
      pizza = new NYStyleCheesePizza();
      //return pizza;  재귀함수 사용시에 사용하고 나머지는 안쓰는게 좋음
    } else if(item.equals("SMpizza")) {
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}
    
  