/**
 * @(#)QuestionFive.java
 *
 *
 * @Wendy Mei
 *CISC 3150
 *Question 5
 * @version 1.00 2017/9/5
 */
import java.util.*;

public class QuestionFive {
    public static void main(String [] args) {
    	int ax,bx,cx, ay, by, cy;
    	double lenA, lenB, lenC;
    	String test;
    	System.out.println("Please enter the x coordinate for point number A and hit enter");  
	    Scanner input=new Scanner(System.in);
	    ax = input.nextInt();
	    System.out.println("Please enter the y coordinate for point number A and hit enter");
	    ay = input.nextInt();
	    System.out.println("Please enter the x coordinate for point number B and hit enter");  
	    bx = input.nextInt();
	    System.out.println("Please enter the y coordinate for point number B and hit enter");
	    by = input.nextInt();
	    System.out.println("Please enter the x coordinate for point number C and hit enter");  
	    cx = input.nextInt();
	    System.out.println("Please enter the y coordinate for point number C and hit enter");
	    cy = input.nextInt();
	    lenA=length(ax, ay, bx, by);
	    lenB=length(ax, ay, cx, cy);
	    lenC=length(bx, by, cx, cy);
	    System.out.println("The length for side A to B is " + lenA);  
	    System.out.println("The length for side A to C is " + lenB);  
	    System.out.println("The length for side B to C is " + lenC);
	    test = realtri(lenA, lenB, lenC);
	    System.out.println("This triangle is " + test);
    }
    //finding the length of each side
    public static double length(int a1, int a2, int b1, int b2)
    {
    	double p1 = Math.pow((b1-a1), 2);
    	double p2 = Math.pow((b2-a2), 2);
    	double sum = p1 + p2;
    	double result =Math.sqrt(sum);
    	return result;
    	
    }
    //comparing to see if the sum of any 2 sides is greater than the third
    public static String realtri(double lenA, double lenB, double lenC)
    {
    	String result1= "false";
    	String result2="true";
    	if ((lenA + lenB <= lenC) || (lenA + lenC <= lenB) || (lenC + lenB <= lenA))
    	{
    		return result1;
    	}
    	else {
    		return result2;
    	}
    }
    
}