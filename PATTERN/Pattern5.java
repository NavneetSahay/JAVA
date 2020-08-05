/*
1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1
*/
import java.util.Scanner;
public class Pattern5
{
	public static void main(String[] args)
	{
	    int i,j;
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER :");
		int num1 = sc.nextInt();
		System.out.println("ENTER SECOND NUMBER :");
		int num2 = sc.nextInt();
		for (i=num2;i>=num1;i--)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
