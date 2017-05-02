package headfirst.factory.pizzaaf;

public class ChicagiPizzaStore extends PizzaStore {
  Pizza createPizza(String item) { //package privit "~"
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new ChicagoPizzaIngredientFactory();
    if(item.equals("Chicagopizza")) {
      //pizza = new NYStyleCheesePizza();
      //return pizza;  재귀함수 사용시에 사용하고 나머지는 안쓰는게 좋음
      pizza = new CheesePizza(inFac);
    } 
    return pizza;
  }
}