//Java Program to Make a Simple Calculator Using switch...case
import java.util.Scanner;
public class Simple_Calculator
{
	public static void main(String[] args) 
	{
	   // int sw;
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER :");
		int num1 = sc.nextInt();
		System.out.println("ENTER SECOND NUMBER :");
		int num2 = sc.nextInt();
		System.out.println("ENTER\n1 ADD\t 2 SUBTARCT\n3 MULTIPLY\t4 DIVIDE");
		int sw = sc.nextInt();
	    switch(sw)
		{
		    case 1:
		        System.out.println("SUM\t:"+(num1+num2));
		        break;
		    case 2:
		        System.out.println("SUBTRACTION\t:"+(num1-num2));
		        break;
		   case 3:
		       System.out.println("MULTIPLY\t:"+(num1*num2));
		       break;
		   case 4:
		       System.out.println("DIVIDE\t:"+(num1/num2));
		       break;
		   default:
		       System.out.println("ENTER A VALID KEYWORD");
		}
		
	}
}
