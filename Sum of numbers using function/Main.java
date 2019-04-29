import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(sum_of_numbers(n)); 
	}

	public static int sum_of_numbers(int n)
	{
	    int sum = 0;
	    for(int i = 1; i<= n; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
	}
}