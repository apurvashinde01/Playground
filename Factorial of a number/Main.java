import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int facto = 1;
      for(int i=1; i<=num;++i)
      {
          facto = facto*i;
      }
       System.out.println(facto);
	}
}