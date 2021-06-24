//Write a program to check if elements of an array are same or not it read from front or back.
import java.util.*;
public class Split2middle
{
    public static void main (String[] args)
    {
        /* code */
        System.out.println("Enter number in array");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int [num];
        int arr2[] = new int [num];
        int arr3[] = new int [num];
        System.out.println("Enter "+num+" elements in array ");
        for (int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<num/2;i++)
        {
            //System.out.print(arr[i]+" ");
            arr2 [j] = arr[i];
            System.out.print(arr2[j]+" ");
        }
        System.out.println();
        int k=0;
        for(int i=num/2;i<arr.length;i++)
        {
            arr3 [k] = arr[i];
            System.out.print(arr3[k]+" ");
        }
    }
}