/* Java Program to Display Prime_range Numbers Between Intervals Using Function*/
import java.util.Scanner;
public class Prime_range
{
    public static void Prime(int num1,int num2)
    {
        int i,j,count;
        for(i=num1;i<=num2;i++)
        {
            count=0;
            for (j=2;j<=i/2;j++)
            {
              if (i%j==0)
              {
                  count++;
              }
            }
            if (count<1)
            {
            System.out.print(i+" ");
            }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new number :");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second number :");
		int num2 = sc.nextInt();
		Prime(num1,num2);
	}
}