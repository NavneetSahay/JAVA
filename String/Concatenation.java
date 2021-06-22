//String Concatenation 

import java.util.*;
class Concatenation
{  
 public static void main(String args[])
 {  
     	Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String");
		String st1 = sc.nextLine();
		//sc.nextLine();
		String st2 = sc.nextLine();
		String fn = st1.concat(st2);
		System.out.println(fn);
 }  
}