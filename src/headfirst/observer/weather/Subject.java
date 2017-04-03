package headfirst.observer.weather;

public interface Subject {
  //observable �ڹ� ���̺귯�� ��ü ���� observable javadoc  ���۰˻�
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}