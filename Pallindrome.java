import java.io.*;
import java.util.*;
   
    class Pallindrome
{
 public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int num1 = sc.nextInt();
  int r,sum=0,temp;
     
 temp = num1;
  while(num1>0)
{
  r = num1%10;
 sum = (sum*10)+r;
num1= num1/10;
}

    if(temp==sum)
{
  System.out.println("Pallindrome");
}
  else
{ 
 System.out.println("Not A Pallindrome");

}
}
}
   
   