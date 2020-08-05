/*
*
* *
* * *
* * * *
* * * * *
*/
import java.util.Scanner;
public class Pattern1
{
	public static void main(String[] args)
	{
	    int i,j;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of rows:");
	    int row =sc.nextInt();
	    for (i=1;i<=row;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
		
	}
}
