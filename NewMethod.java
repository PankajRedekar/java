import java.lang.*;
import java.util.*;


class NewMethod
{
 public static void main(String[] pr)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("\nEnter two no : ");
   int a=sc.nextInt();
   int b=sc.nextInt();
NewMethod obj=new NewMethod();
obj.display(a,b);
 }

 public void display(int x, int y )
  {
   System.out.println("\nAddition is : "+(x+y));
  } 
}