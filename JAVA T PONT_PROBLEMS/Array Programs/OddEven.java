/***

Java Program to print Odd and Even Numbers from an Array

***/
import java.util.*;
public class OddEven
{
	public static void main(String[] args)
	{
		System.out.print("Enter array size : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] array = new int [num];
		System.out.println("Enter element : ");
		for (int i=0;i<num ;i++ )
		{
		    array[i] = sc.nextInt();
		}
		System.out.println("Even numbers in array :");
		for (int i=0;i<array.length;i++)
		{
		    if (array[i]%2==0)
		    {
		        System.out.print(array[i]+" ");
		    }
		}
		System.out.println("\nOdd numbers in array :");
		for (int i=0;i<array.length;i++)
		{
		    if (array[i]%2!=0)
		    {
		        System.out.print(array[i]+" ");
		    }
		}
	}
}
