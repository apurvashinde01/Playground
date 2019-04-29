import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int shape = sc.nextInt();
      switch(shape)
      {
        case 1 :
          {
            int s = sc.nextInt();
          	System.out.println(s*s);
            break;
          }
        case 2 :
          {
            int l = sc.nextInt();
            int br = sc.nextInt();
          	System.out.println(l*br);
            break;
          }
        case 3 :
          {
            int b = sc.nextInt();
            int h = sc.nextInt();
          	System.out.println(0.5*b*h);
            break;
          }
        case 4 :
          {
            int r = sc.nextInt();
          	System.out.println(3.14*r*r);
            break;
          }
      }
    }
}