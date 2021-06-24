/*
Reverse a number in array.
*/
import java.util.*;
public class Reverse
{
    public static void main (String[] args) 
    {
        /* code */
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}