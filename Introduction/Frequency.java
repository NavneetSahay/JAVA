//Java Program to Find the Frequency of Character in a String
import java.util.Scanner;
//import java.lang.String;
class Frequency
{  
public static void main(String[] args)  
{  
    int i,count=0;
Scanner sc= new Scanner(System.in);   
System.out.print("Enter a string: ");
//String input 
String str = sc.nextLine();  
System.out.print("Enter a Character to check Frequency :\t");
//Character input
char c = sc.next().charAt(0);
for (i=0;i< str.length();i++ ) 
{
    if(c == str.charAt(i))
    {
         count++;
    }
}
System.out.println("Frequency of Character :"+c+"="+count);
}  
} 