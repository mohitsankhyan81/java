class Myrunnable implements Runnable{
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Thread1 "+i);
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}

public class threatusinginterface {
  public static void main(String arg[]){
    Myrunnable my=new Myrunnable();
    Thread t=new Thread(my);
    t.start();
  }
}
