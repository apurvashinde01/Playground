import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
     int count = sc.nextInt();
     int i=1,temp = 0;
     do{
     if(i%2!=0)
     {
      System.out.println(i);
      temp++;
      i++;
     }
      else
      i++;
     }while(temp<count);
     }
	}