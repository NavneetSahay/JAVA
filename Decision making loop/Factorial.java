//Java Program to Find Factorial of a Number
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for (int i=num ; i>=1; i--) 
		{
		fact=fact*i;
		}
		System.out.println("FACTORIAL OF NUMBER: "+fact);
	}
}
