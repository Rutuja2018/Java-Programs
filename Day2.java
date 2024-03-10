import java.io.*;
import java.util.*;
   
   class Day2  {

          public static void main(String[]args)

       {
          char num = '-';
  
            String result = ( num<=90 && num>=65 || num<=122 && num>=97 ) ? ("Alphabet") : ("Not an Alphabet");

           System.out.println(result);             

        }
}