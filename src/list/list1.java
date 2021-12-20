package list;

import java.util.ArrayList;
import java.util.List;

public class list1 {

	public static void main(String[] args) {
		/*
		 * From the names in the list given as input Write a program that deletes the
		 * ones having letters 'a' in it regardless of lowercase or uppercase
		 *
		 * INPUT : list1={"John","Emily","Tian","Heidi","Small"} OUTPUT : [John,Emily,
		 * Heidi]
		 */

		List<String> list1 = new ArrayList<>();
		list1.add("John");
		list1.add("Emily");
		list1.add("Tian");
		list1.add("Heidi");
		list1.add("Small");
		List<String> list2 = new ArrayList<>();

		System.out.println("The original list is as follows : " + list1);

		for (String k : list1) {
			if (!k.contains("a")) {
				list2.add(k);

			}
		}
		System.out.println("The newly generated list is as follows : " + list2);

	}

}
