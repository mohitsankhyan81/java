class perimiter{
  int length;
  int breadth;

    //default constructor
    perimiter() {
      length=0;
      breadth=0;
    }

    //perametrized constructor
    perimiter(int a,int b){
      length=a;
      breadth=b;
    }
    
    void calculateperameter(){
      int per=2*(length+breadth);

      System.out.println("The peremeter of rectangle is "+per);
    }
    
}

public class construct1{
  public static void main(String[] args) {
      perimiter per=new perimiter(3,5);

      System.out.println(per.length);
      System.out.println(per.breadth);
      per.calculateperameter();
  }
}