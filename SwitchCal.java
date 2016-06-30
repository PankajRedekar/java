import java.lang.*;
import java.util.*;

class SwitchCal
{
 public static void main(String[] pr)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("\nEnter two No : ");
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.print("\n1.Addition\n2.Substraction\n3.Multiplication\nEnter your Choice : ");
  int ch = sc.nextInt();
  switch(ch)
  {
   case 1:System.out.println("\nAdditiion is : "+(a+b));
          break; 
   case 2:System.out.println("\nSubstraction is : "+(a-b));
          break;
   case 31:System.out.println("\nMultiplication is : "+(a*b));
          break;
   default:System.out.println("Sorry wrong Input!!!!!!!!!!");
          break;
 }}
}