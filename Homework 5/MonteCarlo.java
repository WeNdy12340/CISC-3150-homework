/*
*Wendy Mei
*CISC 3150
*Hw 5 Question 1
*The Monte Carlo Method
*This will take a LONG TIME to finish running because it is generating 4 billion random dots
*use www.mathcs.emory.edu to research for monte carlo method infor
*/
import java.util.*;
public class MonteCarlo{
	public static void main(String[] args){
		System.out.println("Please enter the radius of the circle: ");
		Scanner input= new Scanner(System.in);
		double r=input.nextDouble();
		double x;
		double y;
		long inCircle=0L;
		long outCircle=0L;
		for(long i=0; i<4000000000L; i++){
			x=Math.random();
			y=Math.random();
			//checking with the equation of a circle
			if((Math.pow(x,2) + Math.pow(y,2)) <=Math.pow(r,2)){
				inCircle++;	
			}
			else{
				outCircle++;		
			}
		}
		//printing out the ratio of the area of the top right quadrant to the area of the square
		double ratio1=((Math.PI * Math.pow(r,2))/4)/Math.pow(r,2);
		System.out.println("The ratio of the area of the top right quadrant of the circle to the area of the square is equal to: " + ratio1);
		System.out.println(inCircle + " fall inside the circle");
		System.out.println(outCircle + " fall outside the circle");
		double ratio2= ((double)inCircle/(double)4000000000L);
		System.out.println("The ratio of the total number fall within the cicle out of the 4,000,000,000 is equal to: " +ratio2);
		double pi= 4 *((double)inCircle/(double)4000000000L);
		System.out.println("PI = " + pi);
	}
}
