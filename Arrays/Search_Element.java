/*
Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
Now, tell user whether that number is present in array or not.
*/
import java.util.*;
public class Search_Element
{
    public static void main (String[] args) 
    {
        /* code */
        int i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int[] Arr = new int[num];
        System.out.println("Enter "+ num +" number");
        for ( i=0;i<Arr.length;i++ )
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number u wanna search in array");
        int num2 = sc.nextInt();
        for ( i =0;i<Arr.length;i++)
        {
            if (Arr[i]==num2)
            {
                count++;
                System.out.println(num2 +" presnt AR INDEX " + (i+1));
                return;
            }
        }
        if (count>0)
        {
          //  System.out.println(num2 +" presnt AR INDEX " + i);
        }
        else
        {
            System.out.println("Not presnt in array");
        }
    }
}