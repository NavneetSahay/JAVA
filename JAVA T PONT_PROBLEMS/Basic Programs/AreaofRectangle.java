/*****************
 
Program to calculate the area of rectangle

Program to calculate the area of rectangle
Input:

Width = 10, Height = 5  
Output:

Area of Rectangle = Width * Height
                  = 10 * 5
                  = 50
                  
******************/

import java.util.*;
class AreaofRectangle
{
    public static void main (String[] args)
    {
        /* code */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width :\t");
        int num1 = sc.nextInt();
        System.out.print("\nEnter Height :\t");
        int num2 = sc.nextInt();
        System.out.print("\nArea of Rectangle :\t"+num2*num1);
    }
}