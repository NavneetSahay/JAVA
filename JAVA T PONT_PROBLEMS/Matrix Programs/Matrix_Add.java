/********
Program to calculate the addition of 2 matrices

Input:

Matrix a = [1, 0, 1]  
           [4, 5, 6]  
           [1, 2, 3]  
   
matrix b = [1, 1, 1]  
           [2, 3, 1]  
           [1, 5, 1] 
           
Output:

Addition of two matrices: [2 1 2]
                          [6 8 7]
                          [2 7 4]           
**************************/
import java.util.*;
public class Matrix_Add
{
	public static void main(String[] args)
	{
	    Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of row & colum in matrix 1 :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int [][] arr = new int [num1][num2];
		System.out.println("Enter number of row & colum in matrix 2 :");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int [][] arr2 = new int [num3][num4];
		
		int [][] sum = new int [num1][num2];
		int i=0,j=0,k=0,l=0,m=0,n=0;
		//Checking dimension condition
		if (num1==num3 && num2 == num4)
		{
		System.out.println("Enter "+num1*num2+" Element in 1st ");
		//input for matrix 1
		for (  i =0;i<num1;i++)
		for ( j =0;j<num2;j++)
		{
		    arr[i][j] = sc.nextInt(); 
		}
		
		//input for matrix 2
		System.out.println("Enter "+num3*num4+" Element in 2nd ");
		for (  k =0;k<num1;k++)
		for ( l =0;l<num2;l++)
		{
		    arr2[k][l] = sc.nextInt(); 
		}
		
		//LOOP FOR DISPLAYING  matrix 1
		System.out.println("MATRIX 1 ELEMENT "+num1+" x "+num2+" ARE");
		for ( i =0;i<num1;i++)
		{
		for ( j = 0;j<num2;j++)
		{
		    System.out.print(arr[i][j]+"   ");
		}
		System.out.println();
		}
				//LOOP FOR DISPLAYING  matrix 2
		System.out.println("MATRIX 2 ELEMENT "+num1+" x "+num2+" ARE");
		for ( k =0;k<num3;k++)
		{
		for ( l = 0;l<num4;l++)
		{
		    System.out.print(arr2[k][l]+"   ");
		}
		System.out.println();
		}
		//LOOP FOR Performing sum
		//System.out.println("SUM OF  "+num3+" x "+num4+"MATRIX ARE");
		for ( m =0;m<num1;m++)
		{
		for ( n = 0;n<num2;n++)
		{
		    sum[m][n] = arr[m][n]+arr2[m][n];
		}
		//System.out.println();
		}
		
		//LOOP FOR DISPLAYING  Sum
		System.out.println("SUM OF  "+num3+" x "+num4+" MATRIX ARE");
		for ( m =0;m<num1;m++)
		{
		for ( n = 0;n<num2;n++)
		{
		    System.out.print(sum[m][n]+" ");
		}
		System.out.println();
		}
		//
		}
		else
		{
		    System.out.println("matrix can not perform due to diferent diferent dimension");
		}
	}
}