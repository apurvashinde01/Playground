import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
 Scanner sc = new Scanner(System.in);
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
  int n3 = sc.nextInt(); 
 int ans1 = gcd(n1,n2);
 int ans = gcd(ans1,n3);
System.out.println(ans);
}  
  
 public static int gcd(int n1, int n2)
{ 
 int gcd = 0;
 int min;
   
       if(n1 > n2)
         {
         min = n2;
         }
      else
        {
        min = n1;
        }
   
        while(min>=1)
        {
            if((n1%min==0)&&(n2%min==0))
            {
              gcd = min;
              break;
            }
            min--;
        }
   		return gcd;
        }
 } 
