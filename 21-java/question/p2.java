
import java.util.Random;
import java.util.Scanner;

class game{
  private int number;
  private int countgess;
  private int userinput;

  public game(){
    Random rand=new Random();
    number=rand.nextInt(100)+1;
    countgess++;
  }

  public void getinput(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter input between 1 to 100 ");
    userinput=sc.nextInt();
    countgess++;
  }

  public boolean isCorrectNumber(){
    if(userinput==number){
      System.out.println("Congrats your win the game on "+countgess);
      return true;
    }
    else if(userinput>number){
      System.out.println("The input is so high ");
    }
    else{
      System.out.println("The nomber is too low ");
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