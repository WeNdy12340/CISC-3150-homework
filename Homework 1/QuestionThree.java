/**
 * @(#)QuestionThree.java
 *
 *
 * @Wendy Mei 
 *CISC 3150
 *Question 3
 * @version 1.00 2017/9/5
 */
import java.util.*;

public class QuestionThree {
//randomly generate a numbers between 1-12 and display the english name of the month
   public static void main(String [] args){
	   	int result;
	   	result = 1 + (int)(Math.random()*12);
	   	String month;
	   	switch (result){
		   	case 1: month =	"January";
		   			break;
		   	case 2: month =	"February";
		   			break;
		   	case 3: month =	"March";
		   			break;
		   	case 4: month =	"April";
		   			break;
		   	case 5: month =	"May";
		   			break;
		   	case 6: month =	"June";
		   			break;
		   	case 7: month =	"July";
		   			break;
		   	case 8: month =	"August";
		   			break;
		   	case 9: month =	"September";
		   			break;
		   	case 10: month = "October";
		   			break;
		   	case 11: month = "November";
		   			break;
		   	case 12: month = "December";
		   			break;
		   	default: month = "";
		   			 break;
	   	}
	   	System.out.println(result + " " + month);
    }    
}