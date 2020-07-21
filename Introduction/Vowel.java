import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args) 
	{
	    char ch;
		Scanner reader = new Scanner(System.in);
		System.out.println("ENTER A LETTER");
		ch = reader.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.println("ENTERED LETTER is VOWEL :"+ch);
		else
		System.out.println("ENTERED LETTER IS CONSTATNT: "+ch);
	}
}
