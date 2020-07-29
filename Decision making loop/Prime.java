//Java Program to Check Whether a Number is Prime or Not
import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		int num,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		for (int i=2;i<num;i++) 
		{
		 if(num % i == 0)
		 System.out.println(i);
		 count++;
		}
		if(count<1)
		{
		    System.out.println("PRIME");
		}
		else
		{
		    System.out.println("NOT PRIME");
		}
	}
}
