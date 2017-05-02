package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore smStore = new SMPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
  Pizza pizza = nyStore.orderPizza("NYpizza");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = chicagoStore.orderPizza("Chicagopizza");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("SMpizza");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  /*pizza = chicagoStore.orderPizza("clam");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("pepperoni");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = chicagoStore.orderPizza("pepperoni");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("veggie");
  System.out.println("Ethan ordered a " + pizza.getName() + "\n");
  pizza = chicagoStore.orderPizza("veggie");
  System.out.println("Joel ordered a " + pizza.getName() + "\n");*/
 }
}