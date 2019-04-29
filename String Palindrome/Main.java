import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
StringBuilder sb = new StringBuilder(str);
int str_len = sb.length();
int front = 0;
int end = str_len - 1;
int count = 0;
      boolean flag = true;
	while(front!= end)
    {
    char ch1 = sb.charAt(end--);
    char ch2 = sb.charAt(front++);
    if(ch1 == ch2)
    {
     count++;
    }
    }
  if(count == (str_len/2))
    {
 	 System.out.print("Yes");
    }
  else
     {
 	 System.out.print("No");
    }

}
}