//String compare by all 3 methods

import java.util.*;
public class StringCompare
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String for comparision");
		String st1 = sc.nextLine();
		//sc.nextLine();
		String st2 = sc.nextLine();
		String st3 = "GENIOUS";
		String st4 = new String("GENIOUS");
		String st5 = "genious";
		System.out.println("Enter\n 1. equals() method \n 2. = = operator\n 3.compareTo() method" );
		int num = sc.nextInt();
		switch(num)
		{
		case 1:
		    {
		           System.out.println(st1.equals(st2)); 
		           System.out.println(st1.equals(st3));
		           System.out.println(st3.equalsIgnoreCase(st5));
		           break;
		    }
		case 2:
		    {
		          System.out.println(st1==st2);
                  System.out.println(st3==st4);//false(because st3 refers to instance created in nonpool) 
                  break;
		    }
		case 3:
		    {
		         System.out.println(st1.compareTo(st2));
		         break;
		    }
		default :
		{
		    System.out.println("Enter a valid Number");
		}
		}
	}
}
