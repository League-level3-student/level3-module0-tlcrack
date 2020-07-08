package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String a = "a";
String b = "b";
String ab = "ab";
String ba = "ba";
String aaa = "aaa";
String aab = "aab";
String aba = "aba";
String[] stringArray = new String[5];
stringArray[0]=a;
stringArray[1]=b;
stringArray[2]=ab;
stringArray[3]=ba;
stringArray[4]=aaa;

String[] strArr = { "str1", "str2", "str3" };

		//2. print the third element in the array
System.out.println(stringArray[2]);
		//3. set the third element to a different value
stringArray[2]=aab;
		//4. print the third element again
System.out.println(stringArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = stringArray.length-1; i>=0; i--) {
			stringArray[i]=aba;
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = stringArray.length-1; i>=0; i--) {
			System.out.println(stringArray[i]);
		}
		//7. make an array of 50 integers
int[] intArray = new int[50];
for(int i = intArray.length-1; i>=0; i--) {
	intArray[i]=i;
}
		//8. use a for loop to make every value of the integer array a random number
Random r = new Random();
for(int i = intArray.length-1; i>=0; i--) {
	int n =r.nextInt(50);
	intArray[i]=n;
}
		//9. without printing the entire array, print only the smallest number on the array
int n = 50;
int t = -1;
for(int i = intArray.length-1; i>=0; i--) {
	if(intArray[i]<n) {
		n=intArray[i];
	}
	if(intArray[i]>t) {
		t=intArray[i];
	}
}
System.out.println(n);
System.out.println(t);
System.out.println(intArray[intArray.length-1]);
		//10 print the entire array to see if step 8 was correct

	Arrays.sort( intArray );
	System.out.println("smallest: " + intArray[0] + "; largest: " + intArray[intArray.length-1]);
		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
