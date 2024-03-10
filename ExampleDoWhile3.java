import java.io.*;
import java.util.*;
   
 class ExampleDoWhile3
{
  public static void main(String[]args)
{
  int rem=0;
  int a = 12345;
    
  do
{
  rem=a%10;
  a=a/10;
 if(rem%2==0)
System.out.println(rem);
} while(a>0);

}
}