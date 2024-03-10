import java.io.*;
import java.util.*;
  
 class Scholarship
{
  public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your marks and exam marks");
 int Marks=sc.nextInt();
 int examMarks=sc.nextInt();
  
  if(Marks>90)
{
 if(examMarks>=80)
System.out.println("you got 20% off on your admission fees");

else
System.out.println("Sorry you dont get any concession");

}
else
{
System.out.println("Sorry! You are not eligible for giving Scholarship test.");

}
}
}