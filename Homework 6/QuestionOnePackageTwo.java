/*
*Wendy Mei
*CISC 3150
*Homework 6 Question 1
*Access Protected variables of the parent class from a child class
*/

package childClass;
import java.util.*;
import parentClass.*;
public class QuestionOnePackageTwo extends QuestionOnePackageOne {
	public void printChanges(){	
		System.out.println("In Child Class");
		testing = 5;
		System.out.println("Protected variable testing equal to : " + testing);
	}

}
