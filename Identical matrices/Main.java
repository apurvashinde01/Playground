import java.util.*;
class Main{ 
  public static void printing_2D(int mat[][]) 
  { 
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat.length; j++){ 
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int col_size = sc.nextInt();
    int mat[][] = new int[row_size][col_size]; 
    for (int i = 0; i < col_size ; i++)
    {
      for (int j = 0; j < row_size ; j++)
      { 
     	 mat[i][j] = sc.nextInt();
      }
    }
    int mat2[][] = new int[row_size][col_size]; 
    for (int i = 0; i < col_size ; i++)
    {
      for (int j = 0; j < row_size ; j++)
      { 
     	 mat2[i][j] = sc.nextInt();
      }
    }   
   //comparing
    boolean flag = false;
    for (int i = 0; i < col_size ; i++)
    {
      for (int j = 0; j < row_size ; j++)
      { 
     	if(mat[i][j] != mat2[i][j])
        {
        flag = true;
        break;
        }
      }
    }
   if(flag != true)
     System.out.print("Yes");
    else
        System.out.print("No");
  } 
} 