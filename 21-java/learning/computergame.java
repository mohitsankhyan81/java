
import java.util.Random;
import java.util.Scanner;

class game{
  private String[] option={"rock","paper","sissor"};
  Random rand=new Random();

  public String getcomputerchoice(){
    return option[rand.nextInt(option.length)];
  }

  public int getwiner(String user,String computer){
    if(user.equals(computer)){
      System.out.println("Game is drow");
      return 0;
    }
    else if(user.equals("rock")&&computer.equals("sissor")||user.equals("sissor")&&computer.equals("paper")||user.equals("paper")&&computer.equals("rock")){
      System.out.println("you win");
      return 1;
    }
    return -1;
  }
}

public class  computergame{
  public static void main(String arg[]){
    game g=new game();
    Scanner sn=new Scanner(System.in);

    System.out.println("Enter the number from 1 to 20");
    int totalgames=sn.nextInt();
    sn.nextLine();
    int userscore=0,computerscore=0,drow=0;

    for(int i=1;i<=totalgames;i++){
      System.out.println("===Round "+i+" ===");
      System.out.println("Enter rock paper sissor");

      String userchoice = sn.nextLine().toLowerCase();
      
      if(!userchoice.equals("rock")&&!userchoice.equals("paper")&&!userchoice.equals("sissor")){
        System.out.println("invalid way");
        i--;
        continue;
      }

      String computerchoice=g.getcomputerchoice();
      System.out.println("Computer choice: "+computerchoice);

      int result=g.getwiner(userchoice, computerchoice);

      if(result==1){
        userscore++;
      }
      else if(result==-1){
        computerscore++;
      }
      else{
        drow++;
      }

      System.out.println("Score =>\n" + "UserScore "+userscore+" computer score: "+computerscore+" Drow: "+drow);

      if(userscore>computerscore){
        System.out.println("you win");
      }
      else if(computerscore>userscore){
        System.out.println("computer Win");
      }
      else{
        System.out.println("Match Drow");
      }
    }
}
}