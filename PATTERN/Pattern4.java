/*
* * * * *
* * * *
* * * 
* *
*
*/
import java.util.Scanner;
public class Pattern4
{
	public static void main(String[] args)
	{
	    int i,j;
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ROW\t:");
		int row = sc.nextInt();
		for (i=row;i>=1;i--)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
