package headfirst.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza {
  public SMStylePotatoPizza() {
    name = "SM Style Sauce and Potato Pizza";
    dough = "Thin Crust Dough";
    sauce="Marinara Pizza Sauce";
    toppings.add("Big Potato");
    toppings.add("Parmesan");
  }
}