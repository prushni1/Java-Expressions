import java.util.Scanner;


public class DemoExpressions {
	
	/*
	 * 
	 * Write a program to print the result of the following expressions provided the integer variable a is
20 and b is 10.


int b= a-- - --a;
int c=a--;
int d=a>>2;
int e=a&b;

a=20
b=10
 
 I dont understand this  : int b= a-- - --a
 
 int c=a-- =18   System.out.println( a--)
 
 int d= a>>2   System.out.println(Integer.toBinaryString(20 >> 2))
 int e=a&b;    System.out.println((a&b))


	 * */
	public static void main(String args[])
	{	
	
		int a=20,b=10;
		Scanner scan=new Scanner(System.in);
	 
		 System.out.println(  "1) int b=  a-- - --a   RESULT IS :  b= "+ ( (a--)-(--a) ) );
		 System.out.println(  "2) int c=a--  RESULT IS : c= "+( a--) );
		 System.out.println(  "3) int d= a>>2 RESULT IS : d= "+(Integer.toBinaryString(20>>2)) );
		 System.out.println(  "4) int e=a&b RESULT IS : e= "+(a&b));
		 
	}
}
