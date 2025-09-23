
import java.util.Random;
import java.util.Scanner;

class game{
  private String[] option={"rock","paper","Sissor"};
  public Random rand=new Random();

  public String getcommputerchoice(){
    return option[rand.nextInt(option.length)];
  }

  public int decidewin(String user,String computer){
    if(user.equals(computer)){
      System.out.println("Match drow");
      return 0;
    }
    else if(user.equals("paper")&&computer.equals("rock")||user.equals("rock")&&computer.equals("Sissor")||computer.equals("Sissor")&&user.equals("paper")){
      System.out.println("You Win");
      return 1;
    }
    else{
      System.out.println("computer win");
      return -1;
    }
  }
}

public class computer {
  public static void main(String arg[]){
    game g=new game();
    Scanner sn=new Scanner(System.in);

    System.out.println("Enter the round (3,5,10,20)");
    int totalgames=sn.nextInt();
    sn.nextLine();
    int userscore=0,computerscore=0,drow=0;

    for(int i=1;i<=totalgames;i++){
      System.out.println("===Round "+i+" ===");
      System.out.println("Enter rock paper sisor");

      String userchoice=sn.nextLine().toLowerCase();

      if(!userchoice.equals("rock")&&!userchoice.equals("paper")&&!userchoice.equals("Sissor")){
        System.out.println("This is the invalid option");
        i--;
        continue;
      }

      String computerchoice=g.getcommputerchoice();
      System.out.println("Computer take: "+computerchoice);

      int result=g.decidewin(userchoice, computerchoice);

      if(result==1){
        userscore++;
      }
      else if(result==-1){
        computerscore++;
      }
      else{
        drow++;
      }

      System.out.println("Score is =>\nYour Score "+userscore+" Computer Score: "+computerscore+" Drow "+drow);

      System.out.println("---Final Score---");
      if(userscore>computerscore){
        System.out.println("You Win");
      }
      else if(computerscore>userscore){
        System.out.println("Computer win");
      }
      else{
        System.out.println("Match drow");
      }
    }
    sn.close();
  }
}
