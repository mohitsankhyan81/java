class Mythread extends Thread{
  public void run(){
    System.out.println("This is the thread");
  }
}


public class threat {
  public static void main(String arg[]){
    Mythread t1=new Mythread();
    t1.start();
  }
}
