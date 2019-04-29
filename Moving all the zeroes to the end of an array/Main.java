import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i = 0;
  int arr[] = new int[n];
  int noz = 0;
  for(i = 0 ; i < n ; i++)
  {
  	arr[i] = sc.nextInt();
    if(arr[i] == 0)
      {
          noz++;
      }
  }
  int k = 0;
  int m = n - noz;
  int temp[] = new int[n];
  for(i = 0 ; i < n ; i++)
  {
    if(arr[i] > 0)
    {
  	 temp[k++] = arr[i];
    }
     else 
     {
     temp[m++] = arr[i];
     }
  }
  
    for(i = 0 ; i < n ; i++)
  {
	System.out.print(temp[i]+" ");
  }
  
}
}