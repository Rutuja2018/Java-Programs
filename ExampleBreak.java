import java.io.*;
import java.util.*;
   
  class ExampleBreak
{
 public static void main(String[]args)
{
  for(int i=0;i<100;i+=10)
  {

  System.out.println(i);
  if( i == 40)
  {
  //break;
  continue;
  }
  }

}
}