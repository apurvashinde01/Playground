import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for( int i = 0 ; i < n ; i++)
  {
  	arr[i] = sc.nextInt();
  }
   int key1 = sc.nextInt();
   int key2 = sc.nextInt();
 /*  int idx1 = searchElem(arr , key1);	
   int idx2 = searchElem(arr , key2);
   */
  System.out.println(searchElem(arr , key1));
  System.out.println(searchElem(arr , key2));
}
  public static int searchElem(int arr[], int key)
  {
    int idx = -1;
    for(int i = 0 ; i < arr.length ; i++)
    {
    	if(key == arr[i])
        {
        	idx = i;
          	break;
        }
    }
    return idx;
  }
}
