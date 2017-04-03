package headfirst.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;
 
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
 
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
 
  public void display() {
    System.out.println("현재날씨: " + temperature + "Cº, 습도는 " + humidity + "% 입니다.(기압 " + pressure + ")");
  }
}