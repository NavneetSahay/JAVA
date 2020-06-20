public class Average
{
    public static void main (String[] args) 
    {
        int sum=0;
        double avg=0;
        int[] num = {74,79,98,78,65,99};
        for (int i=0;i<num.length;i++ ) 
        sum=sum+num[i];
        avg=((double) sum/(double) num.length);
        System.out.println(sum);
        System.out.println(avg);
    }
}