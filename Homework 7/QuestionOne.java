/*
Wendy Mei
CISC 3150
This program does not work
run into many problems
have to type in input one by one and hit enter, also need to enter the input twice
i try to fix it until now, but still got into confusion
*/

import java.util.*;
public class QuestionOne{
	public static void main (String[] args) throws Exception{
		double num1=0;
		String op="";
		double num2=0;
		double result=0;
		String check="";
		System.out.println("Please enter your calculation problem");
		Scanner input1= new Scanner(System.in);
		try{
			
			if(input1.hasNextDouble()==true){
				num1=input1.nextDouble();
			}
			else {
				throw new LookAtMrAlgebraOverHereException();
			}
			if((check=input1.next()).isEmpty()){
				throw new UserIsADumbassException();
			}
			System.out.println(num1);
		}	
		catch(LookAtMrAlgebraOverHereException ex){
			System.out.println("You did not enter a number");
		}
		catch(UserIsADumbassException uide){
			System.out.println("You forgot to enter a number");
		}
		Scanner operator=new Scanner(System.in);
		try{
			op=operator.next();
			if(!(op.equals("+") || op.equals("-") || op.equals("*") ||op.equals("/") ||op.equals("%"))){
				throw new IllegalOperationException();
			}
			System.out.println(op);
		}
		catch(IllegalOperationException ioe){
			System.out.println("You did not enter an operation");
		}
		Scanner input2=new Scanner(System.in);
		try{
			if(input2.hasNextDouble()==true){
				num2=input2.nextDouble();
			}
			else {
				throw new LookAtMrAlgebraOverHereException();
			}
			if((check=input2.next()).isEmpty()){
				throw new UserIsADumbassException();
			}
			System.out.println(num2);
		}	
		catch(LookAtMrAlgebraOverHereException ex){
			System.out.println("You did not enter a number");
		}
		catch(UserIsADumbassException uide){
			System.out.println("You forgot to enter a number");
		}
		if(op.equals("+")){
			result = num1 + num2;		
		}
		else if(op.equals("-")){
				result = num1 - num2;		
			}
			else if( op.equals("*")){
					result = num1*num2;				
				}
				else if(op.equals("/")){
						if(num2!=0){
							result = num1/num2;
						}		
					}
					else if(op.equals("%")){
						result = num1 % num2;		
					}
		System.out.println(result);
	}
	
}
class LookAtMrAlgebraOverHereException extends IllegalArgumentException{
	public LookAtMrAlgebraOverHereException(){
		super();
	}
} 
class IllegalOperationException extends IllegalArgumentException{
	public IllegalOperationException(){
		super();
	}
}
class UserIsADumbassException extends IllegalArgumentException{
	public UserIsADumbassException(){
		super();
	} 
} 
