/*
Program to print the number of elements present in an array

Input:

arr = [1, 2, 3, 4, 5]  
Output:

Number of elements present in given array: 5
*/

import java.util.*;
public class Numberofelements
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
        System.out.println("Number of elements present in given array : "+arr.length);
    }
}