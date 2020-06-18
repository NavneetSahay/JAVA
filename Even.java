import java.util.Scanner;
public class Even
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
        System.out.println("Enter  Number: ");
        int num = reader.nextInt();
	    if (num % 2 == 0)
	{
		System.out.println("EVEN\n");
	}
	else
	{
	    System.out.println("ODD\n");
	}
	}
}