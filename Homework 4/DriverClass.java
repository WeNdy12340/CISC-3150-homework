/*
*Wendy Mei
*CISC 3150
*Homework 4
*driver class to ask for how many queens the user wants
*/
import java.util.*;
public class DriverClass{
	public static void main(String [] args){
		int num;
		System.out.println("Please enter the number of Queens you want to place on the board and hit enter: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		Queens inputQ=new Queens(num);
		inputQ.printSol();
	}
}
