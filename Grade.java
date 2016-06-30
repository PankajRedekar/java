import java.lang.*;
import java.util.*;

class Grade
{
 public static void main(String[] pr)
  { 
   int mark;
   Scanner sc = new Scanner(System.in);
   System.out.print("\nEnter Your marks : ");
   mark = sc.nextInt();
   if(mark >= 66 && mark <= 100)
  { 
   System.out.println("\nYou got distingtoin...");
  }
  else
  {
    if(mark <66 && mark >=60)
    {
    System.out.println("\nYou got First Class...");
    }
    else
    {
      if(mark >=45 && mark <60)
      {
      System.out.println("\nYour Are in......");
      }
      else
      {
        if(mark>1 && mark<45)
        {
        System.out.println("\nBetter Luck Next time......");
        }
        else
        {
         System.out.println("\nInvalid mark.....");
        }   
      }
   }
  }}}