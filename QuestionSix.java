/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 6
*tokenize individual characters
*/
import java.util.*;
public class QuestionSix{
	public static void main (String [] args){
		String test="This is a test.";
		Scanner input=new Scanner (test);
		input.useDelimiter("");
		while (input.hasNext()){
			System.out.println(input.next());		
		}
		input.close();
		System.out.println("The delimiter that should be use here is \"\"");
	}
}
