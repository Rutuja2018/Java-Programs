import java.io.*;
import java.util.*;
  
    class GreatestOfTwo
   
    {
    public static void main(String[]args)
    {
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter three Numbers");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   int num3 = sc.nextInt();  
     if(num1>num2)
{
    System.out.println(num1 + "Is the greatest among the two");   
}
  else
   System.out.println(num2 + "Is the greatest.");


    }
    }