/*
Reverse a number in array.
*/
import java.util.*;
public class Sum_Product 
{
    public static void main (String[] args) 
    {
        /* code */
        int i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = s.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter the value ");
        for( i =0;i<arr.length;i++)
        {
            arr[i] = s.nextInt();
        }
        int sum=0;
        int mul=1;
        for( i = 0; i< arr.length; i++)
        {
           sum = sum +arr[i];
           mul = mul*arr[i]; 
        }
        System.out.println("SUM :\t"+sum+"\nMultiply :\t"+mul);
    }
}