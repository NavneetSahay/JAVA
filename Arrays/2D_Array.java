/*Initialize and print all elements of a 2D array.*/
import java.util.*;
public class 2D_Array
{
	public static void main(String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
		System.out.println("Enter dimension of 1'st array");
		int num1 = sc.nextInt();
		System.out.println("Enter dimension of 2'nd array");
		int num2 = sc.nextInt();
		int [][] arr = new int [num1][num2];
		System.out.println("Enter "+num1*num2+" numbers");
		for ( int i =0;i<num1;i++)
		for (int j =0;j<num2;j++)
		{
		    arr[i][j] = sc.nextInt(); 
		}
		//LOOP FOR DISPLAYING 
		System.out.println("ELEMENT IN "+num1+" x "+num2+" ARE");
		for (int i =0;i<arr.length;i++)
		{
		for (int j = 0;j<arr[i].length;j++)
		{
		    System.out.print(arr[i][j]+"   ");
		}
		System.out.println();
		}
		
	}
}
