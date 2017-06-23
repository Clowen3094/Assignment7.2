
package session7_assignment2;
/* program to find a substring in a String by using 
   an inbuilt method of String class*/
import java.util.Scanner;
public class SubString {
	public static void main(String[] args) {
		String str, sub;
		int i, c;
		boolean f=false;
		
		/*scanner class object is used to take a string as input form user*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		str= s.nextLine();
		
		System.out.println("Enter sub string to be find: ");
		sub= s.nextLine();	
		s.close();
		//finding sub string in the given string using boolean variable
		for( c = 0 ; c < str.length() ; c++ )
	      {
	         for( i = 1 ; i <= str.length() - c ; i++ )
	         {
	        	 String ssub = str.substring(c, c+i);
	             if(sub.equals(ssub)){
	            	 System.out.println("Sub string found");
	            	 f=true;
	            	 return;
	             }
	         }
	      }	
		 if(f==false){
			 System.out.println("Sub string not found!!");				 
		 } 
	}
}