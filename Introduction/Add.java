//Program to Add Two Integers
import java.util.Scanner;
class Add {
  public static void main(String[] args) {
    
        int Sum=0;
    	Scanner reader = new Scanner(System.in);
        System.out.println("Enter  first Number: ");
        int num1 = reader.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = reader.nextInt();
        Sum=num1+num2;
     System.out.println("Sum of two number :"+Sum);
    
    
  }
}
