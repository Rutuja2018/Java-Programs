import java.io.*;
import java.util.*;
  
    class revstring
{
 public static void main(String[]args)
{
   Scanner ob = new Scanner(System.in);
  System.out.println("Enter a String :");
   String s1 = ob.nextLine();
   String reverse ="";
    
    for(int i=0;i<s1.length();i++)
{
  reverse = s1.charAt(i) + reverse;

}
  System.out.println("Reversed String  " + reverse);
}
}