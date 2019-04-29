import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int a[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = in.nextInt();		//input arr
            }
        }
      int b[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
           int k = 0;
            for(int j = r1 - 1 ; j >= 0; j--){             
               b[j][i] = a[i][k++]  ;    
          }
        }
              for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
              System.out.print(b[i][j]+" ");
            }
                System.out.println();
        }
    }
}