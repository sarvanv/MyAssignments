package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		ArrayList<String> sc=new ArrayList<String>();
		int[] size=new int[4];
		sc.add("HCL");
		sc.add("Wipro");
		sc.add("Aspire Systems");
		sc.add("CTS");
		
	
		// get the length of the array
		System.out.println("Length of the array:"+size.length);

		// sort the array		
		Collections.sort(sc);
		

		// Iterate it in the reverse order
		Collections.reverse(sc);

		// print the array
		System.out.println("Reverse order:"+sc);
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
