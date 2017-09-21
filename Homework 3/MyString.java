/*
*Wendy Mei
*CISC 3150
*Homework 3 MyString Class
*Creating our verison of the String class
*/
public final class MyString{
	private int size;
	private final char[] initial;
	//constructor	
	public MyString(){
		size=0;
		initial = new char[size];
	}
	//copying the data in input into the char array we have initialized 
	public MyString(char[] chars){
		size=chars.length;
		initial=new char[size];
		for(int d=0; d<size; d++){
			initial[d]=chars[d];		
		}
	}
	//returning the char value at that index
	public char charAt(int index){
		char result;
		result=initial[index];
		return result;
	}
	//return the length of the char array
	public int length(){
		return size;
	}
	//return only part of the array that is wanted to be included
	public MyString substring(int begin, int end){
		int count=0;
		int len = end-begin+1;
		char[] newChar=new char[len];
		for (int j=begin; j<=end; j++){
			newChar[count]=initial[j];
				count++;	
		}
		MyString subs= new MyString(newChar);
		return subs;
	}
	//change the MyString data to lowercase
	public MyString toLowerCase(){
		char record;
		char[] lcData= new char [size];
		for(int a=0; a<size; a++){	
			record=Character.toLowerCase(initial[a]);
			lcData[a]=record;
		}
		MyString lcStr= new MyString(lcData);
		return lcStr;
	}
	//change the MyString data to uppercase 
	public MyString toUpperCase(){
		char recordb;
		char[] ucData= new char [size];
		for(int b=0; b<size; b++){
			recordb=Character.toUpperCase(initial[b]);
			ucData[b]=recordb;
		}
		MyString ucStr= new MyString(ucData);
		return ucStr;
	}
	// check to see if two input are the same
	public boolean equals (MyString s){
		for(int c=0; c<size; c++){
			if(initial[c]!=s.initial[c]){
				return false;
			}
		}
		return true;
		
	}
	//return MyString
	public MyString getMyString(){
		MyString same=new MyString(initial);
		return same;
	}
	//covert into String
	public String toString(){
		String newStr = new String (initial);
		return newStr;
	}
	//MyString representation for int
	public static MyString valueOf(int i){
		char temp=(char)i;
		char[] temps={temp};
		MyString dk=new MyString(temps);
		return dk;
	}
}
