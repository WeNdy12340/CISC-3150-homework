/*
*Wendy Mei
*CISC 3150
*Homework 6 Question 1
*Access Protected variables of the parent class from a child class
*The two java files have to be removed if I want to run this Driver class.
*/
//Driver Class
import parentClass.*;
import childClass.*;
public class DriverMainClass{
	public static void main(String []args){
			QuestionOnePackageOne test= new QuestionOnePackageOne();
			test.printString();
			QuestionOnePackageTwo testor= new QuestionOnePackageTwo();
			testor.printChanges();
		}
}
