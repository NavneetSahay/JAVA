/*
12) Program to print the sum of all the elements of an array

Input:

arr = [1, 2, 3, 4, 5]  

Output:

Sum of all the elements of an array: 15
*/

import java.util.*;
public class SUM
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
        int sum=0;
        for (i=0;i<arr.length;i++) 
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of all the elements of an array : "+sum);
    }
}