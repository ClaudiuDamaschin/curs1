/*2. Sa se implementeze o metoda care primeste ca parametri doua siruri ordonate de numere si
returneaza un sir ordonat compus din elementele celor doua siruri. 

int[] sortedConcatenation(int[] sir1, int[] sir2) {...

Exemplu: 
sortedConcatenation({1,1,2,3,5}, {1,5,6,9}) => {1,1,1,2,3,5,5,6,9}
sortedConcatenation({1,2,3}, {2,3,4}) => {1,2,2,3,3,4}*/

package teme3;

import java.util.Arrays;

public class SirOrdonat {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 8, 9, 2 };
		int[] arr1 = { 2, 7, 8, 9, 7, 8 };
		Arrays.sort(arr);
		Arrays.sort(arr1);

		System.out.println(Arrays.toString(sortedConcatenation(arr, arr1)));

	}

	private static int[] sortedConcatenation(int[] arr, int[] arr1) {
		int lungimeArr = arr.length;
		int lungimeArr1 = arr1.length;
		int newArray[] = new int[lungimeArr + lungimeArr1];
		System.arraycopy(arr, 0, newArray, 0, lungimeArr);
		System.arraycopy(arr1, 0, newArray, lungimeArr, lungimeArr1);
		Arrays.sort(newArray);
		return newArray;
	}

}
