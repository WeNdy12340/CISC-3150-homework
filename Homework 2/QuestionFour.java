/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 4
*break out of nested loops using labels
*/
import java.util.*;
public class QuestionFour{
	public static void main (String [] args){
		int count=20;
		labelTest: for(int i=0; i<count;i++){
			for (int a=0; a<count; a++){
				if (i + a == 10){
					break labelTest;
				}
			}
		System.out.println("Testing inside the loop");
		}
		System.out.println("Break out of loop");
	}
}
