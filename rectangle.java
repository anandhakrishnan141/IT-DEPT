import java.util.*;
class rec
{
 int length;
 int breadth;
 rec(int l,int b)
 {
  length=l;
   breadth=b;
 }
 void area()
  {
  System.out.print("Area of rectangle ="); 
  System.out.println(length*breadth);
   }
}
public class rectangle
{
  public static void main(String Args[])
  {
  int l;
  int b;
  Scanner d=new Scanner(System.in);
  System.out.println("Enter length =");
  l=d.nextInt();
  System.out.println("Enter breadth =");
  b=d.nextInt();
  rec x=new rec(l,b);
  x.area();
  }
}