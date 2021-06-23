/*

The string replace() method replaces all occurrence of first
sequence of character with second sequence of character

*/

import java.util.*;
public class Replace
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		String st1 = "IT'S REALLY SAD TO SEE INDIA CHOKED AGAIN IN FINAL";
		String st2 = st1.replace(" ","");
		System.out.println(st2);
	}
}
