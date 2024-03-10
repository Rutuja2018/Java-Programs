import java.io.*;
import java.util.*;

class BloodDonation

{

public static void main(String[]args)

{

  Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Age");
    int age = sc.nextInt();
   System.out.println("Enter your hb");
    int  hb = sc.nextInt();

  System.out.println("Enter your blood group");
   char bg =  sc.next().charAt(0);
System.out.println("Are you on drugs");
  char drugs =  sc.next().charAt(0);
System.out.println("do you have any disease");
 char dis =  sc.next().charAt(0);
   
      if(age>=18 && age<=60)
     {
  if(hb>=12)
{
  if(drugs=='n')
 {
   if(dis=='n')
{
    System.out.println("You are eligible for donating Blood");
}
  else
{
    System.out.println("Sorry you have a disease");
 } 
} 
 else
{
    System.out.println("Sorry you are a drug consumer");
}
}
  else
{
 System.out.println("Sorry your hb is less. ");
}
}


else
{
System.out.println("You are not eligible for blood donation");
}
}
}   
   
