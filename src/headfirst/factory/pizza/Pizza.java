package headfirst.factory.pizza;

import java.util.ArrayList;

public class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
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
}