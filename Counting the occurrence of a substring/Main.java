import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
StringBuilder sb1 = new StringBuilder(str1);
String str2 = sc.nextLine();
StringBuilder sb2 = new StringBuilder(str2);
int str_len1 = sb1.length();
int str_len2 = sb2.length();
int idx = 0;
boolean flag = false;
int occ =0;
  for(int i = 0; i < (str_len1 -str_len2 + 1); i++ )
  {
      int k = i;
      int count = 0; 

      for(int j = 0; j < str_len2 ; j++ )
    {
      if(sb2.charAt(j) == sb1.charAt(k++))
      {
          count++;
      }
      if(count == str_len2)
      {
          occ++;
      }
    }  
  }  
      System.out.print(occ);
}
}