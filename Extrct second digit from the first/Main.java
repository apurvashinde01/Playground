import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sec_digit;
     while(n>=100)
     {
       n = n/10;
     }
     sec_digit = n%10; 
       System.out.println(sec_digit);
	}
}