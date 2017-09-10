/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 2
*ask user the year and the day the first of January fell on. Display calender of the whole year
*/
import java.util.*;
public class QuestionTwo{
	public static void main (String [] args){
		int year;
		int day;
		boolean test;
		Scanner input= new Scanner(System.in);
		System.out.println("What year of the calender do you want to see?");
		year=input.nextInt();
		test= checkLeapYear(year);
		System.out.println("What day the first of January fell on? Please choose from the following number and hit enter");
		System.out.println("0.Sun 1.Mon 2.Tue 3.Wed 4.Thurs 5.Fri 6.Sat ");
		day=input.nextInt();
		printCal(day, year, test);
	}
//check if the year enter is a leap year
	public static boolean checkLeapYear(int i){
		if((i%4==0 && i%100!=0) || (i%400==0)){
			return true;
		}
		else{
			return false;
		}
	}
// print out the calender
	public static void printCal(int d, int y, boolean t){
		int count =d;
		String [] month = new String[] {"January", "February", "March", "April", "May", 		"June", "July", "August", "September", "October", "November", "December"};
		String week = " Su  Mo Tu We Th Fr Sa"; 
		// call another function to print out the days of the months
		for(int i=0; i < month.length; i++){
			System.out.printf("%12s %d\n", month[i], y);
			System.out.printf("%3s\n", week);
			if(i==0 || i==2 || i==4 || i==6 || i==7 || i==9 || i==11){
				count=printDays(32,count);
			}
			else if(i==1){
					if (t==true){
						count=printDays(30,count);
					}
					else{
						count=printDays(29,count);
					} 
				}
				else{
					count=printDays(31,count);
				}

		}
	}
//print out the days in the month
	public static int printDays(int days, int counts)
	{
		String space= " ";
		if(counts!=0){
			for(int reset=0; reset<counts;reset++){
				
			 	System.out.printf("%3s", space);
			}
			
		}
		for(int c=1; c<days; c++){ 
			System.out.printf("%3d", c);
			counts++;
			if (counts==7){
				System.out.printf("\n");
				counts=0;
			}
		}
		System.out.printf("\n\n");
		return counts;
	}
}
