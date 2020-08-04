//Java Program to Display Factors of a Number
import java.util.Scanner;
public class Factors
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER FOR FACTOR");
		int num = sc.nextInt();
		System.out.println("FATOR :");
		for (int i=1;i<=num;i++)
		{
		    if (num%i==0)
		    System.out.print(+i+" ");
		}
		
	}
}
