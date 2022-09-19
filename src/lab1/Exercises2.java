package lab1;

import java.util.Scanner;

public class Exercises2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence: ");
		String oldString = sc.nextLine();
		String newString = "";
		
		Scanner read = new Scanner(oldString);
		
		while(read.hasNext()) {
		String word = read.next();
		newString += Character.toUpperCase(word.charAt(0))+ word.substring(1) + " ";
		}
		System.out.println(newString.trim());
		
	}

}
