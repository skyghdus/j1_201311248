package headfirst.observer.weather;

import java.util.*;

public class WeatherStation {

 public static void main(String[] args) {
  WeatherData weatherData = new WeatherData();
 
  CurrentConditionsDisplay currentDisplay = 
   new CurrentConditionsDisplay(weatherData);
  //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
  //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

  weatherData.setMeasurements(18, 65, 30.4f);
  weatherData.setMeasurements(21, 70, 29.2f);
  weatherData.setMeasurements(23, 90, 29.2f);
 }
}