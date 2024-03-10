import java.io.*;
import java.util.*;
  
    class Day5 
{
 public static void main(String[]args)

{
  double temp = 34.4;
  String Result = (temp<=10 && temp>=0)?("very cold"):((temp>10 && temp<=20)?("Cold"):((temp<=30 && temp>20)?("summary"):((temp<=40 && temp>30)?("very hot"):("Wrong input"))));

System.out.println(Result);

}

}