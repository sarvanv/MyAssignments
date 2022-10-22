package week3day2assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		// Remove the duplicates using Set.
				System.out.println("Duplicate Numbers are:");
				Set<Integer> num = new LinkedHashSet<Integer>();

				// If the number is already in Set, it will return false.
				for (int eachNumber : data) {
					boolean isDuplicateNumber = num.add(eachNumber);
					if (isDuplicateNumber == false)
						System.out.println(eachNumber);

				}
	}

}
