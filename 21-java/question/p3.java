class Cylinder{
  public int radius;
  public int height;

  public Cylinder(int r,int h){
    radius=r;
    height=h;
  }
  public int getradius(){
    return radius;
  }

  public void setradius(int radius){
    this.radius=radius;
  }

  public int getheight(){
    return height;
  }

  public void setheight(int height){
    this.height=height;
  }

  public double surfaceArea(){
    return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
  }

  public double volume(){
    return Math.PI * radius *radius *height;
  }
}
class rectangle{
    private int length;
    public int breadth;

    public rectangle(int a,int b){
      length=a;
      breadth=b;
    }

    public int getlength(){
      return length;
    }

    public int getbreadth(){
      return breadth;
    }
}
public class p3{
  public static void main(String arg[]){
    // Cylinder cy=new Cylinder(12,9);
    // // cy.setheight(12);
    // // cy.setradius(9);
    // int h=cy.getheight();
    // System.out.println(h);

    // int r=cy.getradius();
    // System.out.println(r);


    // System.out.println(cy.surfaceArea());
    // System.out.println(cy.volume());


    rectangle rec=new rectangle(12,11);
    System.out.println(rec.getlength());
    System.out.println(rec.getbreadth());
  }
}