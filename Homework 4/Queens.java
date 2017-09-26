/*
*Wendy Mei
*CISC 3150
*Homework 4 N-Queens problem with loop and array
*/
import java.util.*;
public class Queens{
	private int size;
	private String [][]board= new String[size][size];
	//constructor
	public Queens(){
		size=0;
		String[][]board=new String[size][size];
	}
	//creating a double array according to the user input
	public Queens(int sizes){
		size=sizes;
		String [][]board= new String[size][size];
	}
	//finding the solution and print
	public void solution(int num){
		int test=num;
		String [][]board= new String[size][size];
		for (int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				if(board[test][j]==null){
					board[test][j]="Q";
				}
				else if(board[i][j]==null){
					board[i][j]="Q";
					test=i;
					}
				int temp=j;
				int tempi=test;
				while ((board[test][j]=="Q" && temp!=size-1)){
					board[test][temp+1]="_";
					temp++;			
				}
				while (board[test][j]=="Q" && tempi!=size-1){
					board[tempi+1][j]="_";
					tempi++;				
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && tempi!=size-1 && temp!=size-1){
					board[tempi+1][temp+1]="_";
					tempi++;
					temp++;				
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && tempi>0 && temp!=size-1){
					board[tempi-1][temp+1]="_";
					tempi--;
					temp++;				
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && tempi!=size-1 && temp>0){
					board[tempi+1][temp-1]="_";
					tempi++;
					temp--;				
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && tempi>0 && temp>0){
					board[tempi-1][temp-1]="_";
					tempi--;
					temp--;				
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && temp>0){
					board[test][temp-1]="_";
					temp--;			
				}
				temp=j;
				tempi=test;
				while (board[test][j]=="Q" && tempi>0){
					board[tempi-1][j]="_";
					tempi--;			
				}
			}
		}
		//printing out the solution
		for (int g=0; g<size; g++){
				System.out.println();
				for (int h=0; h<size; h++){
					System.out.print(board[g][h]);
				}
		}
	}
	//call to print out all the possible solution
	public void printSol(){
		for (int sol = 0 ; sol<size;sol++){
			solution(sol);
			System.out.println();
		}
		
	}
}
