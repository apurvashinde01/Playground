import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
        int exponent = in.nextInt();
  		int ans = power(base,exponent);
	    System.out.print(ans); 
	}

	public static int power(int base , int exponent)
	{
	    int power = 1;
	    for(int i = 1; i<= exponent; i++)
	    {
	        power = power * base;
	    }
	    return power;
	}
} 