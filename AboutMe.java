import java.io.*;
import java.util.*;

  class AboutMe  {
    public static void main(String[] args)

{
   Mydata(); 
   Jiva  obj1 = new Jiva();
   obj1.details();
}

public static void Mydata(){
   
  String name1 ="RUtuja Thormote";
System.out.println(name1);

}
}
  class Jiva   {
          public static void details(){
     String mothersName ="Sakshi";
     String fathersName =" MS Dhoni";  
     System.out.println(mothersName);
    System.out.println(fathersName);
}       

}