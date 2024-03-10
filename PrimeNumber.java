import java.io.*;
import java.util.*;
  
 class PrimeNumber
{
  public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENter a Number");
int num1 = sc.nextInt();
if(num1%1==0 && num1%num1==0)
{
 System.out.println("Prime");

}
else
System.out.println("Not prime");

}
}