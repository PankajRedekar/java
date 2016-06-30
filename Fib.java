import java.lang.*;
import java.util.*;

class Fib
{
 public static void main(String[] pr)
 {
  Scanner sc= new Scanner(System.in);
  //System.out.print("\nEnter Initial Two No : ");
  int a=0,c=1;
  System.out.print("\nEnter Total No : ");
  int b=sc.nextInt();
  System.out.println(a + "\n" + c); 
  for(int i=0;i<b;i++)
  {
   int x;
   x=a+c;
   a=c;
   c=x;
   System.out.println(x);
  }
}
}