package week3day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] num= {4,5,6,6,2,3,8,9,7,5};
		int c=1;
		List<Integer> mn=new ArrayList<Integer>();
		for(int n:num)
		{
			mn.add(n);
		}
		Collections.sort(mn);
		Set<Integer> num1=new TreeSet<Integer>(mn);
		System.out.println(num1);
		for(int mn1:num1)
		{
			if(c!=mn1)
			{
				System.out.println("Missing number is:"+c);
				break;
			}
			else
			{
				c=c+1;
			}
		}
		
	}

}
