/*
5) Program to print the elements of an array

Input:

arr = [1, 2, 3, 4, 5]  
Output:

Elements of given array: 1 2 3 4 5
*/

import java.util.*;
public class PrintArray
{
    public static void main (String[] args) 
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of given array: \n");
        for (i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}