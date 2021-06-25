/*
Program to print the largest element present in an array

Input:

arr = [25, 11, 7, 75, 56]  
Output:

Largest element present in given array: 75
*/

import java.util.*;
public class Largest
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
        int max = arr[0];
        for (i=0;i<arr.length;i++)
        {
            if (max<arr[i])
            max=arr[i];
        }
        System.out.println("Largest element present in given array : "+max);
    }
}