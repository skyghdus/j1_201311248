package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //volatile 쓰레드에 들어있는 변수값을 다른 쓰레드에서 사용가능하게 하기 위해 매인 메모리로 값을 넘겨 줌
  //private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  //public static synchronized Singleton getInstance() {//synchronized 쓰레드 사용할 때 명령어
  public static Singleton getInstance() {
    if(uniqueInstance == null) { 
      synchronized(Singleton.class) {
        if(uniqueInstance == null) {
          System.out.println("creating...");
          uniqueInstance = new Singleton();
        }
      }
    }
    System.out.println("returning...");
    System.out.println("num called..."+numCalled++);
    return uniqueInstance;
  }
}
    
    