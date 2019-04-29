import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int arr_size;
        Scanner Sc = new Scanner(System.in);
        arr_size = Sc.nextInt();
        int arr[] = new int[arr_size];
        for (int index = 0; index < arr_size; index++) 
        {
            arr[index] = Sc.nextInt();
        }
        boolean flag = false ; 
        int front = 0 , end = arr_size - 1;
        for (int index_1 = 0; index_1 < arr_size; index_1++) 
        {
				if(arr[front] != arr[end])
                {
                   flag = true ;
                   break;
                }
          	    else
                {
                  front++;
                  end--;
                }
        }
        if(flag != true)
                System.out.print("Yes");
         else
           		System.out.print("No");     
    }
}