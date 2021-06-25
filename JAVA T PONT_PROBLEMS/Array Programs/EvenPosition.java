/*
7) Program to print the elements of an array present on even position

Input:

arr = [1, 2, 3, 4, 5]  
Output:

Elements of given array present on even position:
2
4
*/

import java.util.*;
public class  EvenPosition
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
        System.out.print("Elements of given array present on even position: ");
        for (i=0;i<arr.length;i++)
        {
            //position = index+1
            if ((i+1)%2==0)
            System.out.print(arr[i]+" ");
        }
    }
}