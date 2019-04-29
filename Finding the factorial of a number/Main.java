import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in = new Scanner(System.in);
	  int num = in.nextInt();
	  System.out.print(facto(num));
	}
	public static int facto(int num)
	{
	  if(num == 0)
      {
	    return 1;
	  }        
      else 
      {
	    return num * facto(num - 1);        
      }
	}
}