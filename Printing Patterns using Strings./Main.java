import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int strLen = str.length();
    int cen = (strLen)/ 2;
    char ch = str.charAt(cen);
	int j;
    StringBuilder sb = new StringBuilder("");
    for(int i = cen ; i < strLen ; i++)
    {
    	sb.append(str.charAt(i));
    }
    for(int i = 0 ; i < cen ; i++)
    {
    	sb.append(str.charAt(i));
    }
    
    for(int i = 0 ; i < strLen ; i++)
    {
             for(j = (strLen - i - 1); j > 0; j--) 
            { 
                System.out.print(" "); 
            }  
            for(j=0; j<=i; j++) 
            { 
                System.out.print(sb.charAt(j)); 
            } 
            System.out.println();
    }
  }
}