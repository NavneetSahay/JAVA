/*
Program to copy all elements of one array into another array
ARRAY 1  
1   2  3  4  5  
  
ARRAY 2  
1   2  3  4  5 
*/

import java.util.*;
public class Coppy_Array
{
    public static void main (String[] args) 
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int [] arr1 = new int[num];
        int [] arr2 = new int[num];
        System.out.println("Enter "+num+" Elements ");
        for( i =0;i<num;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        System.out.println("Array 1");
        for( i = 0; i< arr2.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nArray 2");
        for( i = 0; i< arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}