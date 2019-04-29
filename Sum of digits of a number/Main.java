import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sum = 0;
     int last_digit;
     while(n>0)
     {
       last_digit=n%10;
	   sum = sum + last_digit;
       n = n/10;
     }
       System.out.println(sum);
	}
}