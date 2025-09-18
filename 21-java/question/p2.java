
import java.util.Random;
import java.util.Scanner;

class game{
  public int number;
  public int countgess;
  public int userinput;

  public game(){
    Random rand=new Random();
    number=rand.nextInt(100)+1;
    countgess=0;
  }

  public void getinput(){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter no between 1 to 100 ");
    userinput=sn.nextInt();
    countgess++;
  }

  public boolean isCorrectNumber(){
    if(userinput==number){
      System.out.println("congrats we find number in "+countgess);
      return true;
    }
    else if(userinput>number){
      System.out.println("This is to high");
    }
    else{
      System.out.println("this is to low");
    }
    return false;
  }
  
  public int getcount(){
  return countgess;
  }

  public void setcount(int gess){
    this.countgess=gess;
  }
}


public class p2{
  public static void main(String arg[]){
    game g=new game();
    boolean win=false;

    while(!win){
      g.getinput();
      win=g.isCorrectNumber();
    }
  }
}