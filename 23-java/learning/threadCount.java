
class mythread1 extends Thread{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Thread1 : "+i);
    }
  }
}

class mythread2 extends Thread{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Thread2 : "+i);
    }
  }
}

public class threadCount{
  public static void main(String arg[]) throws InterruptedException{
    mythread1 t1=new mythread1();
    mythread2 t2=new mythread2();

    t1.start();
    t1.join();
    t2.start();
    t2.join();
  }
}
