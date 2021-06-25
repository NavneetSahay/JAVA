/*
Program to print the smallest element present in an array

Input:

arr = [25, 11, 7, 75, 56]  
Output:

Smallest element present in given array: 7
*/

import java.util.*;
public class Smallest
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
        int min=arr[0];
        for (i=0;i<arr.length;i++) 
        {
            if (min>arr[i]) 
            min = arr[i];
        }
         System.out.println("Smallest element present in given array: "+min);
    }
}