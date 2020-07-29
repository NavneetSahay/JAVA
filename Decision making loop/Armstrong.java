//Java Program to Check Armstrong Number
import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) 
	{
	    int remainder=0,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number :");
		int num1 = sc.nextInt();
		int num2 = num1;
		while (num1 != 0)
        {
            remainder = num1 % 10;
            result += Math.pow(remainder, 3);
            num1 /= 10;
        }
        if (result == num2)
            System.out.println(num2 + " : an Armstrong number ");
        else
            System.out.println(num2 + " : not an Armstrong number ");
		
	}
}
