/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
import java.util.Scanner;
public class Pattern2
{
	public static void main(String[] args)
	{
	    int i,j,row;
		System.out.println("Enter number of rows\t:");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		for (i=1;i<=row;i++)
		{
		    for(j=1;j<=i;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.print("\n");
		}
	}
}
