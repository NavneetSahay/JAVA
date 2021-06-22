//Substring in Java

import java.util.*;
class Substring
{  
   public static void main(String args[])
   {  
     	Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st1 = sc.nextLine();
		System.out.println(st1.substring(4));
		System.out.println(st1.substring(0,3));
    }  
}