//Java Program to Reverse a Number
import java.util.Scanner;
public class Reverse
{
  public static void main (String[]args)
  {
    int num,temp=0,rev = 0;
    Scanner sc = new Scanner (System.in);
      System.out.println ("ENTER A NUMBER : ");
      num = sc.nextInt ();
      while(num>0)
      {
          temp = num%10;
          rev = rev *10+temp;
          num = num/10;
      }
      System.out.println(rev);
  }
}
