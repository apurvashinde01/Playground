import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str = sc.nextLine();
      String arr[] = str.split(" ");
	  //System.out.println(arr.length);
      for(String temp : arr)
      {
      System.out.println(temp);
      }
    }
}