import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
     try{
     int n = sc.nextInt();
      System.out.print(n);
     }
     catch(InputMismatchException e)
     {
       System.out.print("Input Mismatch Exception occurred");
     }
   }
}