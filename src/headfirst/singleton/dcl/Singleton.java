package headfirst.singleton.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance; //volatile �����忡 ����ִ� �������� �ٸ� �����忡�� ��밡���ϰ� �ϱ� ���� ���� �޸𸮷� ���� �Ѱ� ��
  //private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private Singleton() {
  }
  //public static synchronized Singleton getInstance() {//synchronized ������ ����� �� ��ɾ�
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
    
    