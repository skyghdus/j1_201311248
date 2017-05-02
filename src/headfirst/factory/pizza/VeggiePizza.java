package headfirst.factory.pizza;

public class VeggiePizza extends Pizza {
  public VeggiePizza() {
    name = "veggie pizza";
    dough = "thin dough";
    sauce = "tomato";
    toppings.add("veggie");
  }
}