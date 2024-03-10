import java.io.*;
import java.util.*;
     
     class CountEvenOdd
{
 public static void main(String[]args)
 {
  int a = 27943932;
  int rem = 0;
  int even = 0;
 int odd = 0;
   do
   {
    rem = a%10;
    if(rem%2==0)
    {
      even++;
    }
else
{
 odd++;
}
a=a/10;

}while(a>0);
 System.out.println("the number of even digits " + even +" and the number of odd number of digits are " + odd);
}
}