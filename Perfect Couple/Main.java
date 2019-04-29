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
        int sum = Sc.nextInt();
        for (int index_1 = 0; index_1 < arr_size; index_1++) 
        {
            for (int index_2 = index_1 + 1; index_2 < arr_size; index_2++) 
            { 
				if(arr[index_1]+arr[index_2] == sum )
                   System.out.println(arr[index_1]+", "+arr[index_2]);
            }
        }
    }
}