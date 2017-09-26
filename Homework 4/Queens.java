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
	public int solution(int num){
		int count=0;
		int countQ=0;
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
		//checking if the solution have all the Queens
		for (int a=0; a<size; a++){
				for (int b=0; b<size; b++){
					if(board[a][b]=="Q"){
						count++;
					}				
				}
		}
		//printing out the solution
		if(count==size){
			countQ=1;
			for (int g=0; g<size; g++){
					System.out.println();
					for (int h=0; h<size; h++){
						System.out.print(board[g][h]);
					}
			}
		}
		return countQ;
	}
	//call to print out all the possible solution
	public void printSol(){
		int total=0;
		for (int sol = 0 ; sol<size;sol++){
			total+=solution(sol);
			System.out.println();
		}
		System.out.println("There are " + total + " solutions found.");
		
	}
}
