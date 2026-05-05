/*
File: Lesson 5.4 - Arrays, split, swapping
Author: Stephen Li
Date Created: May 4, 2026
Date Last Modified: May 5, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void stringSwap(String[] array1, int index1, int index2) {
		String temp = array1[index1];
		array1[index1] = array1[index2];
		array1[index2] = temp;
	}

	public static void reverse(int[] array1) {
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[array1.length - 1 - i];
		}
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array2[i];
		}
	}

	public static String[] toWordArray(String word1) {
		word1 = word1.trim();
		if (word1.equals("")) {
			return new String[0];
		}
		else {
			return word1.split(" +");
		}
	}
} 
