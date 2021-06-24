/*
Reverse a number in array.
*/
import java.util.*;
public class Coppy_Reverse
{
    public static void main (String[] args) 
    {
        /* code */
        int i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = s.nextInt();
        int [] arr1 = new int[num];
        int [] arr2 = new int[num];
        System.out.println("Enter the value ");
        for( i =0;i<arr1.length;i++)
        {
            arr1[i] = s.nextInt();
        }
        for(i = arr2.length-1;i>=0;i--)
        {
            arr2[i] = arr1[j];
            j++;
        }
        System.out.println("PRINT COPPIED array");
        for( i = 0; i< arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}