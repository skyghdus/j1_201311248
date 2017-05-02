package headfirst.factory.pizzaaf;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  //String dough;
  Dough dough;
  String sauce;
  Cheese cheese;
  ArrayList<String> toppings = new ArrayList<String>();
  /*public void prepare() {
    System.out.println("preparing " + name);
  }*/
  protected abstract void prepare();
  public void bake() {
    System.out.println("bake " + dough);
  }
  public void cut() {
    System.out.println("cut " + name);
  }
  public void box() {
    System.out.println("box " + name);
  }
}