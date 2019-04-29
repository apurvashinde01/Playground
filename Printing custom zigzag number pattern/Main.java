import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int odd = 1 , even = 0 ;
          for(int i = 1;i <= n; i++)
          {
          if(i%2!=0)
          {
                for(int j = 1;j <= n-1;j++)
                {
                  System.out.print(odd);
                }
                
                for(int j = 1;j <= 1;j++)
                {
                  even = even + 2;
                  System.out.print(even);
                }
          
	       }
           else
           {
                for(int j = 1;j <= 1;j++)
                {
                  odd = odd + 2;
                  System.out.print(odd);
                }
                
                for(int j = 1;j <= n - 1;j++)
                {
                  System.out.print(even);
                }    
	       }
           System.out.println(); 
}
}
}