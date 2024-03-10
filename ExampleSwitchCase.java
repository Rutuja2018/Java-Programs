import java.io.*;
import java.util.*;
   
 class ExampleSwitchCase
{

  public static void main(String[]args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a key");
 int n = sc.nextInt();

 switch(n) 
 {
  case 1 -> System.out.println("hello");
  case 2 -> System.out.println("bye");
  case 3 -> System.out.println("Love you");

 default -> System.out.println("not valid");

}


}
}