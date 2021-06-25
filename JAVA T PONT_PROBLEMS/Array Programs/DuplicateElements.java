/****

Program to print the duplicate elements of an array

Input:

arr = [1, 2, 3, 4, 2, 7, 8, 8, 3];  
Output:

Duplicate elements in given array:
2
3
8
*****/
import java.util.*;
public class DuplicateElements
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array ");
		int num = sc.nextInt();
		int [] array = new int [num];
		for (int i=0;i<num;i++)
		{
		    array[i]=sc.nextInt();
		}
		System.out.println("Duplicate elements in given array : ");
		int count=0;
		for (int i=0;i<array.length;i++)
		{
		    for (int j = i+1;j<array.length;j++)
		    {
		        if (array[i]==array[j])
		        {
		        System.out.println(array[j]+" ");
		        }
		    }
		   // System.out.println();
		}
	}
}
