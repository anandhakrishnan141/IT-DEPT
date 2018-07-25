import java.util.*;
class Media
{
 String title;
 int pub;
 Media(String ti,int p)
 {
 title=ti;
 pub=p;
 }
}
class Book extends Media
{
 int pages;
 Book(String ti,int p,int n)
 {
 super(ti,p);
 pages=n;
 }
  void display()
 {
  System.out.println("Title :"+title);
  System.out.println("Publications :"+pub);
  System.out.println("Number of pages  :"+pages);
 }
}
class Tape extends Media
{
 int time;
 Tape(String ti,int p,int t)
 {
 super(ti,p);
 time=t;
 }
 
 void display()
 {
  System.out.println("Title :"+title);
  System.out.println("Publications :"+pub);
  System.out.println("Running time :"+time);
 }
}
public class bookshop
{
 public static void main(String Args[])
{
  int x;
  Scanner d=new Scanner(System.in);
  System.out.println("Enter 1 for tape 0 for book :");
  x=d.nextInt();
  if(x==1)
  {
    String pi;
    int p,n;
    Scanner e=new Scanner(System.in);
    System.out.println("Enter details of Books ");
    System.out.println("Enter title :  ");
    pi=e.nextLine();
    System.out.println("publications : ");
    p=e.nextInt();
    System.out.println("no of pages  :");
    n=e.nextInt();
    Book a=new Book(pi,p,n);
    a.display();
  }
  else
   {
    String ti;
    int t,l;   
    Scanner g=new Scanner(System.in);
    System.out.println("Enter details of Tapes ");
    System.out.println("Enter title   :");
    ti=g.nextLine();
    System.out.println("Enter publications  : ");
    l=g.nextInt();
    System.out.println("Enter Running time   :");
    t=g.nextInt();
    Tape b=new Tape(ti,l,t);
    b.display();
   }
   
  
  }  
}