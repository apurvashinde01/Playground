//import required packages
import java.util.*;
class Faculty
{
  public void salary(int sal)
  {
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
    int bonus =3000;
    System.out.println("CSE Faculty: "+(sal+bonus));
  }
}
class IT extends Faculty
{
  public void salary(int sal)
  {
    int bonus = 5000;
    System.out.println("IT Faculty: "+(sal+bonus));
  }
}
class ECE extends Faculty
{
  public void salary(int sal)
  {
    int bonus = 4500;
    System.out.println("ECE Faculty: "+(sal+bonus));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int sal = sc.nextInt();
    if(sal > 0)
    {
    Faculty obj1 = new Faculty();
    obj1.salary(sal);
    CSE obj2 = new CSE();
    obj2.salary(sal);
    IT obj3 = new IT();
    obj3.salary(sal);
    ECE obj4 = new ECE();
    obj4.salary(sal);
    }
    else
        System.out.println("null");
  }
}