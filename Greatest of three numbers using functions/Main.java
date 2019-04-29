import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int ans =  greatest(n1,n2,n3);
      System.out.println(ans);
	}
  
    public static int greatest(int n1,int n2,int n3){
    if((n1>n2) && (n1>n3))
    {
    return n1;
    }
    else if((n2>n1) && (n2>n3))
    {
    return n2;
    }
      else
      {
      return n3;
      }
    }
}