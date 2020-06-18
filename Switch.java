import java.util.Scanner;
public class Switch 
{
    public static void main (String[] args) 
    {
        String day;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int week = reader.nextInt();
        switch(week)
        {
            case 1:
                day = "SUNDAY";
                break;
            case 2:
                day = "MONDAy";
                break;
            case 3:
                day = "TUESDAY";
                 break;
            case 4:
                day = "WEDNESDAY";
                 break;
            case 5:
                day = "THRUSDAY";
                 break;
            case 6:
                day = "FRIDAY";
                break;
            case 7:
                day = "SATURDAY";
                break;
 /*           case 8:
                day = "SUNDAY";
                break;*/
            default:
                day = "INVALID DAY";
            break;
        }
        System.out.println("The day is " + day);
    }
}