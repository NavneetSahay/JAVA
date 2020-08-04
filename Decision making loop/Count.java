//Java Program to Count the Number of Vowels and Consonants in a Sentence
import java.util.Scanner;
public class Count
{
	public static void main(String[] args) 
	{
		String st;
		char ch=0;
		int vowel=0,Consonants=0,digit=0,space=0;
		System.out.println("Enter a string\t:");
		Scanner s = new Scanner(System.in);
		st = s.nextLine();
		st = st.toLowerCase();
		//System.out.println(st);
		for(int i=1;i<st.length();i++)
		{
		ch = st.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch == 'u')
		{
		    vowel++;
		}
		else if(ch>='a'&& ch<='z')
		{
		    Consonants++;
		}
		else if(ch>='0'&&ch<='9')
		{
		    digit++;
		}
		else if(ch== ' ')
		{
		    space++;
		}
		}
		System.out.println("VOWELS\t\t:"+vowel+"\nCONSTANTS\t:"+Consonants+"\nDIGITS\t\t:"+digit+"\nSPACE\t\t:"+space);
		//System.out.println();
		//System.out.println();
	}
}
