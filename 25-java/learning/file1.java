
import java.io.File;
import java.io.IOException;

public class file1{
  public static void main(String arg[]){
    try{
      File f=new File("myfile.txt");
      if(f.createNewFile()){
        System.out.println("File name "+f.getName());
      }
      else{
        System.out.println("File is already exist");
      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}