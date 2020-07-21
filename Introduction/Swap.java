//Java Program to Swap Two Numbers
import java.util.Scanner;
class Swap {
  public static void main(String[] args) 
  /*{
  with third variable
    int num1,num2,swap;
    Scanner reader = new Scanner(System.in);
    System.out.println("ENTER TWO NUMBERS :");
    num1 = reader.nextInt();
    num2 = reader.nextInt();
    swap= num2;
    num2=num1;
    num1=swap;
    System.out.println("FIRST NUMBER : "+num1+"\tSECOND NUMBER :"+num2);
  }*/
       {
    //without using third variable
       int num1,num2;
       Scanner sc= new Scanner(System.in);
       System.out.println("ENTER FIRST NUMBER :");
       num1 = sc.nextInt();
       System.out.println("ENTER SECOND NUMBER :");
       num2 = sc.nextInt();
       num1=num1+num2;
       num2=num1-num2;
       num1=num1-num2;
       System.out.println("FIRST NUMBER :"+num1+"\tSECOND NUMBER:"+num2);
       }
}