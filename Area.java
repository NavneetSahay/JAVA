import java.util.*;

class Figure{
	double dim1,dim2;
	public void area() {System.out.println("Not defined");}
}

class Triangle extends Figure{
	public void area() {
		double temp=0.5*dim1*dim2;
		System.out.println("Area of Triangle="+temp);
	}
}
class Rectangle extends Figure{		
	public void area() {
		double temp=(dim1*dim2);
		System.out.println("Area of Rectangle="+temp);
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Figure f;
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		System.out.println("Enter two dimentions");
		t.dim1=sc.nextDouble();
		t.dim2=sc.nextDouble();
		f=t;
		f.area();
		System.out.println("Enter two dimentions");
		r.dim1=sc.nextDouble();
		r.dim2=sc.nextDouble();	
		f=r;
		f.area();
	}

}