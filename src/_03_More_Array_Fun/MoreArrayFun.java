package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	static //1. Create a main method to test the other methods you write.
	Random random = new Random();
	public static void main(String[] args) {
		String[] strings = new String[]{"testing, ", "testing, ", "1, ", "2, ", "3"};
		stringPrinter(strings);
		backwardsStringPrinter(strings);
		halfStringPrinter(strings);
		randomStringPrinter(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void stringPrinter(String[] array) {
		for(int i = 0; i <= array.length-1; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void backwardsStringPrinter(String[] array) {
		for(int i = array.length-1; i >= 0; i--) {
		System.out.println(array[i]);
		}
	
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void halfStringPrinter(String[] array) {
		for(int i = 0; i <= array.length-1; i++) {
			if(i%2==0) {
			System.out.println(array[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void randomStringPrinter(String[] array) {
		ArrayList<Integer> usedIndexes = new ArrayList<>();
		
		System.out.println("--------------------------------");
		
		for(int i = 0; i <= array.length-1; i++) {
			// 1. Get random number
			int r = random.nextInt(array.length);
			
			// 2. Check if that number has already been printed
			if( usedIndexes.contains(r) ) {
				// Number has been printed
				i--;
				continue;
			} else {
				// Number has NOT been printed so print it
				usedIndexes.add(r);
				System.out.println(array[r]);
			}
		}
	}
	
}
