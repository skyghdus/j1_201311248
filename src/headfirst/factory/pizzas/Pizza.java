package headfirst.factory.pizzas;

import java.util.ArrayList;

public class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  public String getName() {
    return name;
  }
  public void prepare() {
    System.out.println("preparing" + name);
  }
  public void bake() {
    System.out.println("bake" + name);
  }
  public void cut() {
    System.out.println("cut" + name);
  }
  public void box() {
    System.out.println("box" + name);
  }
  public String toString() {
    // code to display pizza name and ingredients
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append((String )toppings.get(i) + "\n");
    }
    return display.toString();
  }
}