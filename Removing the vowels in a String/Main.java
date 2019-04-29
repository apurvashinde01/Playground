import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	String input= sc.nextLine(); 
    StringBuilder sb  = new StringBuilder("");
    int str_len = input.length();
	String newInputString = input.replaceAll("[AEIOUaeiou]", "");
    System.out.print(newInputString);
  }
}