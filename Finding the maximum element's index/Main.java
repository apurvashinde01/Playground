import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i = 0; i< n; i++)
   {
   	arr[i] = sc.nextInt();
   }
   int max = arr[0];
   int idx = -1;
    for(int i = 0; i< n; i++)
   {
   		if(max <= arr[i])
        {
        max = arr[i];
        idx = i;
        }
   }
   System.out.print(idx); 
  }
}