import java.io.*;
import java.util.*;
class Figure1{
	double balance,interest_rate;
	public void si()
	{
		System.out.println("None");
	}
}

class Bank1 extends Figure1{
	static double interest_rate=0.1;
	double temp;
	public void si()
	{
		temp=balance*interest_rate;
		System.out.println("Simple interest for 1year in Bank1="+temp);
	}
}
class Bank2 extends Figure1{
	static double interest_rate=0.15;
	double temp;
	public void si()
	{
		temp=balance*interest_rate;
		System.out.println("Simple interest for 1year in Bank2="+temp);
	}
}
public class Interest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Figure1 f;
		Bank1 b1=new Bank1();
		Bank2 b2=new Bank2();
		System.out.println("Enter balance");
		b1.balance=Double.parseDouble(br.readLine());
		b2.balance=Double.parseDouble(br.readLine());
		f=b1;
		f.si();
		f=b2;
		f.si();
	}

}