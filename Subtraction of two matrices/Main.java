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
    
   //subtracting
    int mat3[][] = new int[row_size][col_size]; 
    for (int i = 0; i < col_size ; i++)
    {
      for (int j = 0; j < row_size ; j++)
      { 
     	 mat3[i][j] =  mat[i][j] - mat2[i][j] ;
      }
    }
    printing_2D(mat3); 
  } 
} 
