//Java Program to Round a Number to n Decimal Places
import java.util.Scanner;
import java.text.DecimalFormat;
public class Decimalformat
{
	public static void main(String[] args)
	{
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER:");
		num=sc.nextDouble();
		//System.out.format("%.3f", num);
		DecimalFormat df=new DecimalFormat("#.###");
		System.out.println(df.format(num));
	}
}
