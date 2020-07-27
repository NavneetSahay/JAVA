//Java Program to Calculate the Power of a Number
import java.util.Scanner;
public class Power
{
	public static void main(String[] args)
	{
	    int base,exp;
	    double Power=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base of power:");
		base = sc.nextInt();
		System.out.println("Enter exponent of power");
		exp = sc.nextInt();
		//Using for loop
		/*for (int i=1;i<=exp;i++)
		{
		    Power=Power*base;
		}*/
		//using math function
		Power = Math.pow(base,exp);
		System.out.println(Power);
	}
}
