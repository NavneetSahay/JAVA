//Java Program to Check Whether a Number is Palindrome or Not
import java.util.Scanner;
public class Palindrome
{
  public static void main (String[]args)
  {
    int num,temp=0,rev = 0;
    Scanner sc = new Scanner (System.in);
      System.out.println ("ENTER A NUMBER : ");
      num = sc.nextInt ();
      int num2=num;
      while(num>0)
      {
          temp = num%10;
          rev = rev *10+temp;
          num = num/10;
      }
      //System.out.println("REVERSE OF NUMBER :"+rev);
      if (num2==rev)
      {
          System.out.println("Number "+num2+" :- Palindrome number");
      }
      else
      {
          System.out.println("Number "+num2+" :- NOT a Palindrome number");
      }
      
  }
}
