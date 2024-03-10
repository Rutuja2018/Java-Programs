import java.io.*;
import java.util.*;
   
  class EvensInRangeUsingWhile
  {
    public static void main(String[]args)
    {

     int num1 = 100;
     while(num1<=300)
{
  if(num1%2==0)
   System.out.println(num1);  
  num1++;
}
  int num2 = 400;
   do
{
  num2++;
if(num2%2!=0)
 System.out.println(num2);

}while(num2<800);
   }
}
   