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
              int facto = 1;
          for(int i=1; i<=lastdig;++i)
          {
              facto = facto*i;
          }
          sum = sum + facto;
          num = num/10;
      }
      
     if(sum == copy)
     {
     System.out.println("Yes");
     }
     else
     {
       System.out.println("No");
     }
	}
}