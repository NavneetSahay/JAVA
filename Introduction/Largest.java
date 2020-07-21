// Find Largest Among three numbers using if..else statement
import java.util.Scanner;
public class Largest
{
  public static void main(String[] args)
  {
    int num1,num2,num3;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER FIRST NUMBER: ");
    num1 = sc.nextInt();
    System.out.println("ENTER SECOND NUMBER: ");
    num2 = sc.nextInt();
    System.out.println("ENTER THIRD NUMBER: ");
    num3 = sc.nextInt();
    if(num1>=num2 && num1>=num3)
    {
        System.out.println("FIRSRT NUMBER IS LARGEST :"+num1);
    }
    else if(num2>=num1 && num2>=num3)
    {
        System.out.println("SECOND NUMBER IS LARGEST :"+num2);
    }
    else
    {
        System.out.println("THIRD NUMBER IS LARGEST :"+num3);
    }
  }
}