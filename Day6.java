import java.io.*;
import java.util.*;


  class Day6{

  public static void main(String [] args)
{
  System.out.println("-------------------------------------------------------------------------------------");

  System.out.println("         SWAMI VIVEKANAND SCHOOL LATUR");
  System.out.println("");
 System.out.println("         Maharashtra State Board of Secondary and Higher Secondary Education");
  System.out.println("");
 System.out.println("---------------------------------------------------------------------------------------");
System.out.println("");

System.out.println("  Name:- RUTUJA ANIL THORMOTE                           Date:- 2nd feb 2018");
System.out.println("");
System.out.println("  Roll N0:- T2021291246033    sec:-A         Exam:- SSC 10th      ");
System.out.println("");
System.out.println("---------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("Subject          | Full Marks | Marks Obtained");
System.out.println("");
System.out.println("---------------------------------------------------------------------------------------");
  int Em =35;
System.out.println("English          | 100        |" + Em);
  int Mm = 50;
System.out.println("Maths            | 100        |" + Mm);
 int  ssm = 60;
System.out.println("Social Science   | 100        |" + ssm);
 int  sm = 96;
System.out.println("Science          | 100        |" + sm);
 int sanm = 100;
System.out.println("Sanskrit         | 100        |" + sanm);
System.out.println("");
System.out.println("__________________________________________________________________________________________");
System.out.println("");
int totalmarks = Em + Mm + ssm + sm + sanm;
double total = 500;
double percentage = (totalmarks/total)*100;
 String grade =(percentage<=35)?("F"):((percentage>=35 && percentage<=45)?("C"):((percentage<=60 && percentage>45)?("B"):((percentage>60 && percentage<=80)?("B+"):((percentage>80 && percentage<=90)?("A"):((percentage>90 && percentage<=100)?("A+"):("Invalid input")))))); 

System.out.println("Total      : 500              | Marks Obtained :" + totalmarks);
System.out.println("percentage : "+ percentage +"            | Grade           : " + grade  );
System.out.println("");

System.out.println("__________________________________________________________________________________________");
System.out.println("");
System.out.println("");
String remarks =(grade =="A+")?("Excellent"):((grade=="A")?("Great"):((grade =="B+")?("Good"):((grade=="B")?("Better"):((grade=="c")?("Need to improve"):((grade=="F")?("Failed"):("Better luck next time"))))));
System.out.println(" Remarks : " +  remarks     + "                   SIGNATURE");

System.out.println("__________________________________________________________________________________________");
   





   




}
  }