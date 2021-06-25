/*
 Program to print the elements of an array in reverse order

Input:

arr = [1, 2, 3, 4, 5]  
Output:

Original array: 1 2 3 4 5
Array in reverse order: 5 4 3 2 1
*/

import java.util.*;
public class Array_reverse
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
        System.out.print("Origional array : ");
        for (i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nArray in reverse order: ");
        for (i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}