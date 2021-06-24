/*
    Find largest and smallest elements of an array and sum of largest and smallest
*/

import java.util.Scanner;
class LargestSmallest
{
public static void main (String args[])
{
    Scanner scan=new Scanner(System.in);
    int min,max;
    System.out.println("Enter number of array");
    int n=scan.nextInt();
    int arr[]=new int[n]; 
    for(int i=0; i<n; i++)
    {
        arr[i]=scan.nextInt();
    }
    min=arr[0];
    max=arr[0];
   for(int i=0; i<n; i++)
   {
     if(min>arr[i])
    {
       min=arr[i];
    }
     if(max<arr[i])
    {
       max=arr[i];  
    }
   }
   System.out.println("MIN : "+min+"\nMAX : "+max);
   System.out.print(max+min);
}
}