//Java Program to Calculate the Sum of Natural Numbers
import java.util.Scanner;
public class SumNatural
{
	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER LAST DIGIT OF NATURAL NUMBER:\t");
		num = sc.nextInt();
		for (int i=1;i<=num ;i++)
		{
		sum =sum+i;
		}
		System.out.println("SUM OF 1 to "+num+" IS :\t"+sum);
 	}
}
