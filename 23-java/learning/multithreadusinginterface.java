class thread1 implements Runnable{
  private String name;

  thread1(String n){
    name=n;
  }

  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println(name +" : "+i);
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        
      }
    }
  }
}


public class multithreadusinginterface{
  public static void main(String arg[]) throws InterruptedException{
    thread1 t1=new thread1("mohit");
    Thread t=new Thread(t1);
    t.start();
    t.join();

    thread1 t2=new thread1("ankit");
    Thread tc=new Thread(t2);
    tc.start();
    tc.join();
  }
}