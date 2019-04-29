import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
int str_len1 = str1.length();

int occ[] = new int[26];
int offset = 0;  //index of occurence array
  for(int i = 0; i < 26; i++ )
{
    occ[i] = -1 ;
} 
// For str 1
for(int i = 0; i < str_len1 ; i++ )
{
    if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
    	{
			offset = str1.charAt(i) - 'a';
      		occ[offset]++;
        }
        else if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
        {
			offset = str1.charAt(i) - 'A';
      		occ[offset]++;
        }
}
 
  for(int i = 0 ; i < 26 ; i++)
    {
		if(occ[i] == -1 )
        {
           char ch = (char)(i  + 97);
           System.out.print(ch+" ");
        }
    }
}
}