//Java Program to Remove All Whitespaces from a String
import java.util.Scanner;
public class Remove_whitespaces
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR STRING :");
		String str = sc.nextLine();
		str=str.replaceAll("\\s","");
		System.out.println("FINAL STRING AFTER WHITESPACCED :\n"+str);
	}
}
