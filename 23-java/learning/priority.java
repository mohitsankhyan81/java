class therad1 extends Thread{
  private String myname;
  private int mypriority;


  public void setMyname(String n){
    myname=n;
  }

  public String getname(){
    return myname;
  }

  public void setpriority(int p){
    mypriority=p;
  }

  public int getpriority(){
    return mypriority;
  }

  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println(getname()+" : "+i+" priority is "+getpriority());
    }
  }
}

public class priority {
  public static void main(String arg[]){
    therad1 t1=new therad1();
    t1.setMyname("Mohit");
    t1.setpriority(1);
    t1.start();
  }
}
