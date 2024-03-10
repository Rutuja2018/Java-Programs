import java.io.*;
import java.util.*;
  
 class  LeapYear
{
 public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter year");
  int y1 = sc.nextInt();

   if( y1%4 == 0 && y1 > 0)
{
  System.out.println("its a leap year"); 
}
 else
{
  System.out.println("not a Leap year.");

}
}
}