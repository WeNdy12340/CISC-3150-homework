/*
*Wendy Mei
*CISC 3150
*Homework 2 Question 1
*ask user the height of the number pyramid they want and display on the screen
*/
import java.util.*;
public class QuestionOne{
	public static void main (String [] args){
		int height;
		int count=0;
		int back;
		Scanner input=new Scanner(System.in);
		System.out.println("How tall of a pyramid do you want to display on the screen?");
		height=input.nextInt();
		while(height != 0){
			count++;
			for (int i=1;i<height; i++){
				System.out.printf(" ");
			}
			for(int j=1;j<=count;j++){
				System.out.printf("%d", j);
				if(j==count && count !=1){
					back=count;
					while(back!=1){
						back--;
						System.out.printf("%d", back);
					}
				}
			}
			System.out.printf("\n");
			height--;
		}
		
	}
}
