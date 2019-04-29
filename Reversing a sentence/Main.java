import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        
        int str_len = words.length;
        int front = 0;
        int end = str_len - 1;
            while(front!= end)
            {
            String ch1 = words[end];
            String ch2 = words[front];
            String temp = ch1;
            words[end] = ch2;
            words[front] = temp;
            end--;
            front++;
            }
		for(String ans : words)	
             System.out.print(ans+" ");
            
    }
}