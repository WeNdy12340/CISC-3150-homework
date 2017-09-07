/**
 * @(#)QuestionTwo.java
 *
 *
 * @Wendy Mei 
 *CISC 3150
 *Question 2
 * @version 1.00 2017/9/5
 */

import java.util.*;
public class QuestionTwo {
//read radius from user and calculate the area of the circle
    public static void main(String [] args){
    	double area;
    	System.out.println("Please enter a radius: ");
    	Scanner input=new Scanner(System.in);
    	while (input.hasNextDouble()){
    		double radius = input.nextDouble();
    		area = Math.PI * Math.pow(radius,2);
    		System.out.println(area);
    		System.out.println("Please enter a radius: ");
    	}
    }
    
    
}