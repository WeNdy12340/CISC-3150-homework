/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 3
*Check if a string is a palindrome
*/
import java.util.*;
public class QuestionThree{
	public static void main (String [] args){
		String check;
		int i=0;
		System.out.println("Please enter a word or line: ");
		Scanner input = new Scanner(System.in);
		check= input.nextLine();
		int j=check.length()-1; 
		while(i<check.length()){
			if(check.charAt(i)==check.charAt(j)){
				i++;
				j--;
			}
			else{	
				System.out.println("This string is not a palindrome.");	
				break;
			}
			if(i==check.length()){
					System.out.println("This string is a palindrome.");
			}
		}
	}
}
