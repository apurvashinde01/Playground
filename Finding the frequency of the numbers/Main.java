import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      int occ[] = new int[k];
      for(int i = 0; i < n ; i++)
      {
      	arr[i] = sc.nextInt();
      }
   
      int num = 0;
      for(int i = 0; i < k ; i++)
      {
        num++;
        for(int j = 0 ; j < n ; j++)
        {
          if(num == arr[j])
          { occ[i]++; }
        }
      }
      
       for(int i = 0; i < k ; i++)
      {
      	System.out.println((i+1)+" "+occ[i]);
      }   
    }   
}