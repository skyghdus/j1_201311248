package headfirst.factory.pizzaaf;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.orderPizza("NYpizza");
  }
}