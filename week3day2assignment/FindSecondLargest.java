package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
				
				Set<Integer> ts = new TreeSet<Integer>();
				for(int i=0;i<data.length;i++)
				{
					ts.add(data[i]);
				}
				List<Integer> nl=new ArrayList<Integer>();
				for(int dup1:ts)
					nl.add(dup1);
				System.out.println("Numbers in list:"+nl);
					Collections.reverse(nl);
					System.out.println("Second largest is:"+nl.get(1));
				
				
	}

}
