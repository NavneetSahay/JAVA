//Java Program to Compute Quotient and Remainder
import java.util.Scanner;
class Division {
  public static void main(String[] args) 
  {
    int num,div,rem=0,quot=0;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number :");
    num = reader.nextInt();
    System.out.println("ENTER DIVISOR :");
    div = reader.nextInt();
    quot=num/div;
    //rem=num%div;
    rem=num-(div*quot);
    System.out.println("Quotient :"+quot+ "\tRemainder :"+rem);
  }
}
