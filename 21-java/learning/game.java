
import java.util.Random;
import java.util.Scanner;

class gamegess{
  public int number;
  public int gessnocount;
  public int userinput;

  public gamegess(){
    Random rand=new Random();
    number=rand.nextInt(100)+1;
    gessnocount=0;
  }

  public void userinputg(){
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter no form 1 to 100");
    userinput=sn.nextInt();
    gessnocount++;
  }

  public boolean isCorrect(){
    if(number==userinput){
      System.out.println("Congrats you get correct in "+gessnocount);
      return true;
    }
    else if(userinput>number){
      System.out.println("No is so high...");
    }
    else{
      System.out.println("No is so low...");
    }
    return false;
  }

  public int geessno(){
    return gessnocount;
  }
  public void setgesscount(int gess){
    this.gessnocount=gess;
  }
}

public class game {
  public static void main(String arg[]) {
      gamegess g=new gamegess();
    boolean win=false;

    while(!win){
      g.userinputg();
      win=g.isCorrect();
    }
  }
}
