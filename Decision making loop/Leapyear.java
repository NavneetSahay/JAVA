//Java Program to Check Leap Year
import java.util.Scanner;
public class Leapyear
{
	public static void main(String[] args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR YEAR:");
		year = sc.nextInt();
		if(year%4==0)
		  { if(year%100==0)
		    {
		        if(year%400==0)
		        System.out.println("YEAR IS LEAP YEAR:");
		        else
		        System.out.println("YEAR IS NOT LEAP YEAR");
		    }
		      
		  }
	//	System.out.println("YEAR IS LEAP YEAR:");
		else
		System.out.println(year+"\t:YEAR IS NOT LEAP YEAR");
	}
}
