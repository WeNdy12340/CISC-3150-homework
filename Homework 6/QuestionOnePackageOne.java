/*
*Wendy Mei
*CISC 3150
*Homework 6 Question 1
*Access Protected variables of the parent class from a child class
*/
package parentClass;
import java.util.*;
	public class QuestionOnePackageOne{
	protected int testing;
	public void printString(){	
		testing=1;
		System.out.println("In Parent Class");
		System.out.println("Protected variable testing equal to : " + testing);
	}
}
