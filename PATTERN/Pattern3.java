/*
A
B B
C C C
D D D D
E E E E E
*/
import java.util.Scanner;
public class Pattern3
{
	public static void main(String[] args) 
	{
	    char i,j;
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST LETTER\t:");
		char c1 = sc.next().charAt(0);
		System.out.println("ENTER SECOND LETTER\t:");
		char c2 = sc.next().charAt(0);
		for (i=c1;i<=c2;i++)
		{
		    for(j=c1;j<=i;j++)
		    {
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}
