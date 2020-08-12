/*Java Program to Multiply two Floating Point Numbers*/
import java.util.Scanner;
public class Multiply_Floating
{
    public static void Prime(double num1,double num2)
    {
        System.out.println("MULTIPLY :"+num1*num2);
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new number :");
		double num1 = sc.nextDouble();
		System.out.println("Enter a Second number :");
		double num2 = sc.nextDouble();
		Prime(num1,num2);
	}
}
