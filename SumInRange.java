import java.io.*;
import java.util.*;
  
  class  SumInRange
{

 public static void main(String[]args)

{
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter two numbers");
  int num1 = sc.nextInt();
  int num2 = sc.nextInt();
   

  int sum = 0;
    
   for(int i = num1;i<=num2;i++)

{
  sum = sum + i;

}
System.out.println(sum);

}
}