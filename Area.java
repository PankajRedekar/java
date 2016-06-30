import java.lang.*;
//import java.util.*;
import java.util.Scanner;

class Area
{
 public static void main(String[] args)
{
int r;
double area;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Radius : ");
r=sc.nextInt();
area=r*r*3.14;
System.out.print("Area of circle : "+ area);
}}
