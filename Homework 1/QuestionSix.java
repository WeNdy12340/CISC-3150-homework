/**
 * @(#)QuestionSix.java
 *
 *
 * @Wendy Mei
 *CISC 3150
 *Question 6
 * @version 1.00 2017/9/6
 */

import java.util.*;

public class QuestionSix {

    public static void main(String [] args) {
    	int ax, ay,bx, by;
    	double radius1, radius2;
    	String result;
    	System.out.println("Please enter the x coordinate for the first circle and hit enter");  
	    Scanner input=new Scanner(System.in);
	    ax = input.nextInt();
	    System.out.println("Please enter the y coordinate for the first circle and hit enter");
	    ay = input.nextInt();
	    System.out.println("Please enter the radius for the first circle and hit enter");
	    radius1 = input.nextDouble();
	    System.out.println("Please enter the x coordinate for the Second circle and hit enter");
	    bx = input.nextInt();
	    System.out.println("Please enter the y coordinate for the Second circle and hit enter");
	    by = input.nextInt();
	    System.out.println("Please enter the radius for the second circle and hit enter");
	    radius2 = input.nextDouble();
	    result=checking(ax, ay, radius1, bx, by, radius2);
	    System.out.println(result);
    }
    //The formula is from math.stackexchange.com
    // This is to compare the two circle
    public static String checking(int a1, int a2, double r1, int b1, int b2, double r2)
    {
    	String answer;
    	
    	if(Math.sqrt(Math.pow((b1-a1), 2) + Math.pow((b2-a2), 2)) == (r1-r2)){
    		answer = "The two circle are completely within one another";
    	}
    		else if(Math.pow((a1-b1),2)+ Math.pow((a2-b2),2) <= Math.pow((r1-r2),2)){
    			answer = "The two circle are overlapping"; 
    		}
    			else if(Math.sqrt(Math.pow((b1-a1), 2) + Math.pow((b2-a2), 2)) == (r1+r2)){
    				answer = "The two circle are touching each other"; 
    				}
    				else {
    					answer = "The two circle are separate from each another"; 
    				}
    	return answer;
    } 
    
    
}