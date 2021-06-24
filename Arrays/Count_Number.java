/*
Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
*/
import java.util.*;
public class Count_Number
{
    public static void main (String[] args) 
    {
        /* code */
        int i,count=0,count2=0,count3=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnts u wanna store in array");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
           if (arr[i]%2==0) 
           {
            count++;
           }
           if(arr[i]>0)
           {
               count2++;
           }
           else if(arr[i]<0)
           {
               count3++;
           }
        }
        System.out.println("EVEN = " +count+ "\nODD = " +(arr.length-count)+
        "\nPositive ="+count2+ "\nnegative =" +count3+ "\nZEROS'S= "+(arr.length-(count2+count3)));
    }
}