import java.io.*;
import java.util.*;
  
  class Reverse
{
 public static void main(String[]args)
{
 int rev = 0;
 int num1 = 6594542;
 while(num1!=0){

 
  int rem = num1 % 10;
  rev = rev * 10 + rem;
  num1 = num1/10;

}
  System.out.println(rev);
}

}