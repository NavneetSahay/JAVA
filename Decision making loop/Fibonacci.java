//Java Program to Display Fibonacci Series
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[] args) 
	{
	    int term,num1=0,num2=1,fibo=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms ");
		term = sc.nextInt();
		for (int i=1;i<=term-1;i++)
		{
		    fibo = num1 + num2;
	    	System.out.print(num1+",");
	    	num1 = num2;
	    	num2 = fibo;
		}
		System.out.print(num1);
	}
}
