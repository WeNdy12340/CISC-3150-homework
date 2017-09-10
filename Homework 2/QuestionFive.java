/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 5
*Change Scanner delimiter
*/
import java.util.*;
public class QuestionFive{
	public static void main (String [] args){
		// change scanner delimiter and tokenize comma
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter a line: ");
		String test= input.nextLine();
		Scanner changeDelim= new Scanner(test).useDelimiter(",");
		while(changeDelim.hasNextLine()){
			System.out.println(changeDelim.next());
		}
		changeDelim.close();
	}
}
