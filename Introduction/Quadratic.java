//  Java Program to Find all Roots of a Quadratic Equation
import java.util.Scanner;
public class Quadratic
{
	public static void main(String[] args) {
		int a,b,c;
		double d=0,root1=0,root2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER co-effi X^2 ");
		a = sc.nextInt();
		System.out.println("ENTER co-effi X ");
		b = sc.nextInt();
		System.out.println("ENTER Constant number ");
		c = sc.nextInt();
		System.out.println("QUADETRIC EQUETION :\n"+a+"X^2+"+b+"X+"+c);
		d=b*b-4*a*c;
		System.out.println("Discriminate D of Quadratic Equation :"+d);
		if (d>0)
		{
		   root1=(-b+ Math.sqrt(d))/2*a;
		   root2=(-b- Math.sqrt(d))/2*a;
		   System.out.println("ROOT OF EQUETION\nroot1 : "+root1+"\troot2: "+root2);
		}
		else if(d == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;"+ root1);
        }
        else
        {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);

           // System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi"+ realPart+ imaginaryPart+ realPart+ imaginaryPart);
        }
	}
}
