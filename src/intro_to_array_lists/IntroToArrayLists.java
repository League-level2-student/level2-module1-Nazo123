package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> name = new ArrayList<String>();
		//2. Add five Strings to your list
		name.add("Bob");
		name.add("Hello");
		name.add("Mabey");
		name.add("Yes");
		name.add("No");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i<5;i++) {
			
			System.out.println(name.get(i));
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for (String s : name) {
			System.out.println(s);
			}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int i =1; i<6; i++) {
			if (i%2==0) {
				System.out.println(name.get(i-1));
			}
		}
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int i = 4; i>-1;i--) {
			System.out.println(name.get(i));
		}
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for (String s : name) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	
	}
}
