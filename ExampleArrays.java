import java.io.*;
import java.util.*;
  
 class ExampleArrays
{
  public static void main(String[] args)
{
  int [] number = {12,24,54,87,90,76,93,26};
   Arrays.sort(number);
   //System.out.println("The length of array is " + number.length);

    for(int i=0;i<number.length;i++)
   {
 
    System.out.println(number[i]);
}
}
}