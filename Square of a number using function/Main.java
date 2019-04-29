import java.util.Scanner;
class Main
{
       public static int square(int m)
   {
      int square = m * m;
      return square;
   }
	public static void main (String[] args)
    {
	 // Type your code here   
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int square = square(n);
     System.out.println(square);
	} 
}