// PRINT THE ALTERNATE INDEX
import java.util.*;
public class AlternateIndex
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.nextLine();
		System.out.println("STRING AT EVEN PLACES");
		for (int i=0; i<= st.length()-1;i++) 
		{
		    if (i%2==0)
		    {
		        
		        System.out.print(st.charAt(i));
		    }
		}
		System.out.println("\nString at ODD places");
		for (int i=0; i<= st.length()-1;i++) 
		{
		    if (i%2!=0)
		    {
		        System.out.print(st.charAt(i));
		    }
		}
	}
}
