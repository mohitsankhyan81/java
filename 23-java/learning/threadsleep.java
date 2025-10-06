class thread1 extends Thread{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Thread1 "+i);
      try{
        Thread.sleep(3000);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}

class thread2 extends Thread{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Thread2 "+i);
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class threadsleep{
  public static void main(String arg[]) throws InterruptedException{
    thread1 t1=new thread1();
    thread2 t2=new thread2();

    t1.start();
    t2.start();
  }
}