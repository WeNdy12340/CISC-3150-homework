/*
*Wendy Mei
*CISC 3150
*HW 9
* DID NOT Work
*Only Printed the array separately.
*I try to do a few verison of it and rename it HwNine.java and HomeworkNine.java but still did not work 
*/
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class QuestionOne {
	public static void main(String [] args)throws InterruptedException{
		A newa=new A();
		B newb=new B();
		C newc=new C();
		D newd=new D();
		Thread t1=new Thread(newa);
		Thread t2=new Thread(newb);
		Thread t3=new Thread(newc);
		Thread t4=new Thread(newd);
		t1.start();
		try{
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();	
		t4.join();
		}catch(InterruptedException a){
			a.printStackTrace();		
		}
	}
}
class A implements Runnable{
	static String [] arr1={"A", "E", "I", "M", "Q", "U", "Y"};
	public void run(){
		try{
		for(int i=0; i<arr1.length;i++){
			System.out.println(arr1[i]);
			
		}
		}
		catch(Throwable t){}
		
	}
}
class B implements Runnable{
	static String [] arr2={"B", "F", "J", "N", "R", "V", "Z"};
	public void run(){
		for(int i=0; i<arr2.length;i++){
			System.out.println(arr2[i]);
			
		}
	}
}
class C implements Runnable{
	static String [] arr3={"C", "G", "K", "O", "S", "W"};
	public void run(){
		for(int i=0; i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
	}
}
class D implements Runnable{
	static String [] arr4={"D", "H", "L", "P", "T", "X"};
	public void run(){
		for(int i=0; i<arr4.length;i++){
			System.out.println(arr4[i]);
		}
	}
}
