import java.util.Arrays;
public class Coppyarray
{
	public static void main(String[] args)
	{
	    int [] initial= {4,7,2,1,29,45};
	    int[] fnl = new int [6];
	    for (int i=0;i<initial.length;i++)
	    {
	    fnl[i]=initial[i];
	    }
	    //Arrays to String
	    System.out.print(Arrays.toString(fnl));
	}
}