package headfirst.observer.weather;

public interface Subject {
  //observable 자바 라이브러리 대체 가능 observable javadoc  구글검색
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}