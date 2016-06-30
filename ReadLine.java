import java.lang.*;
import java.util.*;

class ReadLine
{
  public static void main(String[] pr)
  { 
   Scanner myScanner = new Scanner(System.in);
   System.out.print("Enter any string : ");
   String str = myScanner.next();
   System.out.println("\nYour String is : " + str + " " + pr[0]);
  }
}