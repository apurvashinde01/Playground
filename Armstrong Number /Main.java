import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int copy = num , sum = 0, lastdig;
      while(num > 0)
      {
          lastdig = num%10;
          sum = sum + lastdig*lastdig*lastdig;
          num = num/10;
      }
     if(sum == copy)
     {
     System.out.println("Armstrong Number");
     }
     else
     {
       System.out.println("Not a Armstrong Number");
     }
	}
}