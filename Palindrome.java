import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Palindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word or phrase to test if it is a palindrome.");
		String input = sc.nextLine();
		System.out.println(isPalindrome(input));

	}
	public static String reverseStringAndRemoveNonAlpha(String text) {
		String original = "";
		String reverseString = "";
		
		for(int i = 0; i < text.length(); i++) { // push only characters that are alphabetic
			if(Character.isAlphabetic(text.charAt(i))) {
				original+=text.charAt(i);
			}
		}
		for (int i = original.length()-1;i>=0;i--) {
			reverseString+= Character.toString(original.charAt(i));
		}
		
		return reverseString;
	}



	// Returns true if the text is a palindrome, false if not.
	public static boolean isPalindrome(String text) {

		text = text.toLowerCase();
		String test = "";
		for(int i = 0; i < text.length(); i++) { // loop through characters in the word
			Character c = (Character)text.charAt(i);
			if((Character.isAlphabetic(c))){ // if character is alphabetic, add to c
				test += c;
			}
		}
		if(test.equals(reverseStringAndRemoveNonAlpha(text).toLowerCase())) { // if test equals text that is reversed
			return true;
		}
		else 
			return false;
	}
}
