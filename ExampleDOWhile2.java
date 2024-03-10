import java.io.*;
import java.io.*;
   
    class ExampleDoWhile2
       {
     public static void main(String[]args)
    {
     int num = 3;
     do
     {
      if(num%2==0)
    {
      System.out.println(num);
    }
      num += 3;
    } while( num <= 30);
    }
    }