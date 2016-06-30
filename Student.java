import java.lang.*;
import java.util.*;

class Student
{
 public static void main(String[] pr)
 {
String name = new String[3];
int roll= new int[3];
float mark= new float[3];
  Scanner sc= new Scanner(System.in);
for(int i=0;i<3;i++)
{
  System.out.print("\nEnter Student name  : ");
  name[i] = sc.nextLine();
  System.out.print("\nEnter Student roll  : ");
  roll[i] = sc.nextInt();
  System.out.print("\nEnter Student marks : ");
  mark[i] = sc.nextFloat();
}
for(int i=0;i<3;i++)
{
  System.out.println("\n\nName    : "+name[i]+"\nRoll no : "+roll[i]+"\nMarks   : "+mark[i]);
 }}
}