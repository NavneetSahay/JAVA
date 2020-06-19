import java.util.Scanner;
public class SumN
{
    public static void main (String[] args)
    {
        int i,sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter First number of Series: ");
        int st = reader.nextInt();
        System.out.print("Enter last  number of Series: ");
        int end = reader.nextInt();
        for (i=st;i<=end;i++) 
        {
            System.out.println(+i);
            sum=sum+i;
        }
        System.out.println(" SUM OF SERIES :"+sum);
    }
}