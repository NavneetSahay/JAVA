/*

Java String toUpperCase() and toLowerCase() method

*/

import java.util.*;
public class Method
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter name 4 CAPS");
		String st1 = sc.nextLine();
		System.out.println("Enter name 4 small");
		String st2 = sc.nextLine();
		//function for converting in upper case
		String f1=st1.toUpperCase();
		System.out.println(f1);
		//direcltly using function in print StackTraceElement
		System.out.println(st2.toLowerCase());
	}
}
