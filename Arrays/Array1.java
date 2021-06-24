/*
Take 10 integer inputs from user and store them in an array and print them on screen
*/
import java.util.*;
public class Array1
{
    public static void main (String[] args) 
    {
        /* code */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int[] Arr = new int[num];
        System.out.println("Enter "+ num +" number");
        for (int i=0;i<Arr.length;i++ )
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Elements in array");
        for (int i =0;i<num;i++)
        {
            //System.out.print("Elements is "+i+" index are "+Arr[i]);
            System.out.print(Arr[i]+" ");
            //System.out.println();
        }
    }
}