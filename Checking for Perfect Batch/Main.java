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
   	arr[i] = sc.nextInt();	//i/p arr
   }
    int sum_arr[] = new int[n];
    int idx = 0;
   
      	int sum1 = 0,sum2 = 0;
		for(int j = 0; j < 3 ; j++)
        {
        	sum1 = sum1 + arr[j] ;
        }
 		
      	for(int j = 3; j < 6 ; j++)
        {
        	sum2 = sum2 + arr[j] ;
        }
 
        	if(sum1 == sum2)
            {
			System.out.print("Perfect Batch");
            }
			else
            {
            System.out.print("Not a Perfect Batch");
            }
  }
}