 import java.io.*;
 import java.util.*;
   
   class PositiveNumber
{
 public static void main(String[]args)
{
 int num1 = -120;
  String result = (num1<=0 || num1>0)?((num1>0)?("positive"):("NEgative")):("Invalid Input");
  
System.out.println(result);


}
}