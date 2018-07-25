import java.util.*;
class Rectangle
{
 int length;
 int breadth;
 Rectangle(int l,int b)
{
 length=l;
 breadth=b;
}
}
class RectangleHeight extends Rectangle
{
 int height;
 RectangleHeight(int l,int b,int h)
 {
  super(l,b);
  height=h;
 }
void volume()
 {
 int v;
 v=length*breadth*height;
 System.out.println("Volume ="+v);
 }
}
public class inheritance
{
 public static void main(String args[])
{
  int l,b,h;
  Scanner d=new Scanner(System.in);
  System.out.println("Enter length =");
  l=d.nextInt();
  System.out.println("Enter breadth =");
  b=d.nextInt();
  System.out.println("Enter height =");
  h=d.nextInt();
 RectangleHeight a=new RectangleHeight(l,b,h);
 a.volume();
}
}