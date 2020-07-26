//Java Program to Check Whether a Number is Positive or Negative
import java.util.Scanner;
public class PositiveorNegative
{
	public static void main(String[] args)
	{
	    double num;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("ENTER A NUMBER :\t");
	    num = sc.nextDouble();
	    if(num>0)
	    System.out.println(num+" :Number is Positive");
	    else if(num<0)
	    System.out.println(num+" :Number is Negative");
	    else
	    System.out.println(num+" :Number is Zero");
	}
}
