import java.io.*;
import java.util.*;
   
  class ExampleDoWhile
    {
    public static void main(String[]args)

   {  
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = obj.nextInt();
    int num3 = 1;
    do
  {
   System.out.println(num1*num3);
   num3++;

  } while(num3 <= 10);


  }

  }