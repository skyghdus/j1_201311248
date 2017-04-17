package headfirst.factory.pizza;

public class CheesePizza extends Pizza {
  public CheesePizza() {
    name="CheesePizza";
    dough="Regular Crust";
    sauce="Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}