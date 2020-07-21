// Find ASCII value of a character
import java.util.Scanner;
 public class ASCII
 {
   public static void main(String[] args)
   {
     char ch;
     int ascii;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter  a character: ");
        ch = reader.next().charAt(0);
        ascii = ch;
        System.out.println("ASCII NUMBER OF ENTERED CHARACTER IS :"+ascii);
   }
 }