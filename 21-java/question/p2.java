import java.util.Random;
import java.util.Scanner;

class gessno{
  public int number;
  public int gesscount;
  public int userinput;

  public gessno(){
    Random rand=new Random();
    number=rand.nextInt(100)+1;
    gesscount=0;
  }

  public void getinput(){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the number from 1 to 100 ");
    userinput=sn.nextInt();
    gesscount++;
  }

  public boolean  iscorrect(){
    if(userinput==number){
      System.out.println("THis is the corect gess " + gesscount);
      return true;
    }
    else if(userinput>number){
      System.out.println("Number is so high");
    }
    else{
      System.out.println("Number is too low");
    }
    return false;
  }
  
  public int getcount(){
    return gesscount;
  }
  public void setcount(int gess){
    this.gesscount=gess;
  }
}

public class p2{
  public static void main(String arg[]){
    gessno g=new gessno();
    boolean win=false;

    while(!win){
      g.getinput();
      win=g.iscorrect();
    }
  }
}