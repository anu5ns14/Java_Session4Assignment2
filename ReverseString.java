package Com.Training.Oops;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str = scan.nextLine();
		int len = str.length();
		String reverse = "";
		for(int i = len-1; i >= 0; i--){
			
			reverse = reverse + str.charAt(i);
			
		}
		
		System.out.println("Reverse of the string is :"+reverse);
	}
	
}
