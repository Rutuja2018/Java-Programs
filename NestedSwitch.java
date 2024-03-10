import java.io.*;
import java.util.*;
  
   class NestedSwitch
{
  public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter a Key");
  int num = sc.nextInt();
  
  switch(num)
{
 case 1 -> {
              Scanner ob = new Scanner(System.in);
              System.out.println("press any key a,b,c,d");
               String s = ob.nextLine();
              switch(s)
             {
               case "a"-> { 
                           Scanner obj4 = new Scanner(System.in);
                           System.out.println("Enter y or z");
                           String r1 = obj4.nextLine();
                           switch(r1)
                           {                           
                              case "y" -> System.out.println(" you have selected y");
                              case "z" -> System.out.println("you have selected z");
                              case "w" -> System.out.println(" you have selected w");
                              default  -> System.out.println("Wrong Input");
                           }
                         }
               case "b" -> System.out.println(" you have selected b");
               case "c" -> System.out.println(" you have selected c");
               case "d" -> System.out.println(" you have selected d");
               default -> System.out.println("Wrong input");
            }
           }
 case 2 ->  {
              Scanner obj = new Scanner(System.in);
              System.out.println("press any key e,f,g,h");
               String s = obj.nextLine();
              switch(s)
             {
               case "e"-> System.out.println(" you  have selected e");
               case "f" -> System.out.println(" you have selected f");
               case "g" -> System.out.println(" you have selected g");
               case "h" -> System.out.println(" you have selected h");
               default -> System.out.println("Wrong input");
            }
           }
 case 3 ->  {
              Scanner obj1 = new Scanner(System.in);
              System.out.println("press any key i,j,k,l");
               String s = obj1.nextLine();
              switch(s)
             {
               case "i"-> System.out.println(" you  have selected i");
               case "j" -> System.out.println(" you have selected j");
               case "k" -> System.out.println(" you have selected k");
               case "l" -> System.out.println(" you have selected l");
               default -> System.out.println("Wrong input");
            }
           }
 case 4 ->  {
              Scanner obj2 = new Scanner(System.in);
              System.out.println("press any key m,n,o,p");
               String s = obj2.nextLine();
              switch(s)
             {
               case "m"-> System.out.println(" you  have selected m");
               case "n" -> System.out.println(" you have selected n");
               case "o" -> System.out.println(" you have selected o");
               case "p" -> System.out.println(" you have selected p");
               default -> System.out.println("Wrong input");
            }
           }


default -> System.out.println("Wrong inputs");

}
}
}