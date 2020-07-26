//Java Program to Display Characters from A to Z using loop
//import java.util.Scanner;
public class AtoZ
{
	public static void main(String[] args) 
	{
	 //   Scanner sc = new Scanner(System.in);
	    System.out.println("Characters from A to Z using loop");
	    for (int i=65;i<=90;i++)
	    {
	        char ch = (char)i;
	        System.out.print(ch+" ");
	    }
	    System.out.println("\nCharacters from a to a using loop");
	    for (char j='a';j<='z';j++)
	    {
	        System.out.print(j+" ");
	    }
	}
}
