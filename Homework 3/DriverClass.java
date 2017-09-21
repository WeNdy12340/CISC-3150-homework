/*
*Wendy Mei
*CISC 3150
*Homework 3 driver Class
*testing our verison of the String class
*/
public class DriverClass{
	public static void main(String [] args){
		char[] testing={'H', 'e','A', 'l','o'};
		MyString test=new MyString(testing);
		System.out.println(test.charAt(1));

		System.out.println(test.length());

		MyString results=test.substring(1,3);
		System.out.println(results.toString());
		
		results = test.toLowerCase();
		System.out.println(results.toString());

		results = test.toUpperCase();
		System.out.println(results.toString());

		char[] test2={'H', 'a','l', 'l','o'};
		MyString testequal=new MyString(test2);
		System.out.println(test.equals(testequal));
		
		System.out.println(test.getMyString());

		MyString intprint=new MyString();
		intprint=intprint.valueOf(12);

		System.out.println(intprint.toString());
		
	}
}
