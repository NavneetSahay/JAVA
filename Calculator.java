/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
	   // int cs=0;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter first number:");
		int num1 = scan.nextInt();
		System.out.println(" Enter Second number:");
		int num2 = scan.nextInt();
		System.out.println(" Enter\n 1 : ADD    ||    2 :SUBTRACT\3 : MULTIPLY    ||    4: DIVIDE");
		int cs = scan.nextInt();
		System.out.println(" :" +cs);
		switch(cs)
		{
		    case 1:
		        int Sum = num1+num2;
		        System.out.println("Sum of two number is "+Sum);
		        break;
		    case 2:
		        int Sub = num1-num2;
		        System.out.println("SUBTRACT :"+Sub);
		    case 3:
		        int Mul = num1*num2;
		        System.out.println("MULTIPLY:"+Mul);
		    case 4:
		        float Div = num1/num2;
		        System.out.println("DIVIDE:"+Div);
		    default:
		        System.out.println("Enter a valid number");
		        break;
		}
	}
}
