//Java Program to Count Number of Digits in an Integer
import java.util.Scanner;
public class NumberofDigits
{
	public static void main(String[] args) 
	{
	    int count=0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		while(num>=9)
		{
		    num = num/10;
	    	count++ ;
		}
		System.out.println(count+1);
	}
}
