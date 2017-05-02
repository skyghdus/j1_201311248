package headfirst.factory.pizzaaf;

//public class NYStyleCheesePizza extends Pizza {
public class CheesePizza extends Pizza {
  PizzaIngredientFactory inFac;
  public CheesePizza(PizzaIngredientFactory ingredientFac) {
    name = "NY Style Cheese Pizza";
    this.inFac=ingredientFac;
    //dough = "Thin Crust Dough";
    //sauce="Marinara Pizza Sauce";
    //toppings.add("Grated Reggiano Cheese");
    //toppings.add("Parmesan");
  }
  public void prepare() {
    System.out.println("preparing");
    dough=inFac.createDough();
    cheese=inFac.createCheese();
  }
}