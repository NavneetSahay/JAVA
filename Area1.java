import java.io.*;
import java.util.*;

interface AreaI{
	void find_area();
}

class Triangle1 implements AreaI{
	double dim1,dim2;
	public void find_area()
	{
		System.out.println("Area of triangle="+(0.5*dim1*dim2));
	}
}

class Rectangle1 implements AreaI{
	double dim1,dim2;
	public void find_area()
	{
		System.out.println("Area of rectangle="+(dim1*dim2));
	}
}
public class Area1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		AreaI f;
		Triangle1 t=new Triangle1();
		Rectangle1 r=new Rectangle1();
		System.out.println("Enter two dimentions");
		t.dim1=Double.parseDouble(br.readLine());
		t.dim2=Double.parseDouble(br.readLine());
		f=t;
		f.find_area();
		System.out.println("Enter two dimentions");
		r.dim1=Double.parseDouble(br.readLine());
		r.dim2=Double.parseDouble(br.readLine());
		f=r;
		f.find_area();
	}

}