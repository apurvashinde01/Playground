import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int col = sc.nextInt();
      for(int i = 1 ; i <= row ; i++)
      {
        int num = row;
        int x = row - i + 1 ;
        for(int j = 1 ; j < i ; j++)
        {
          System.out.print(num--);
        }
        for(int j = 1 ; j <= row - i + 1 ; j++)
        {
          System.out.print(x);
        }
         System.out.println();
      }
    }
}