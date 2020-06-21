public class Multidimarray
{
	public static void main(String[] args) {
		int a[][]={{3,5,2,7,1},{9,5,4,2},{3,1,3}};
		System.out.println("length of row 1 :"+a[0].length);
		System.out.println("length of row 2 :"+a[1].length);
		System.out.println("length of row 3 :"+a[2].length);
		for (int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
		{
		    System.out.println(a[i][j]);
		}
	}
}
 
