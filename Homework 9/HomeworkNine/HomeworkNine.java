/*
*Wendy Mei
*CISC 3150
*HW 9
* DID NOT Work
*
*/
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class HomeworkNine {
	public static void main(String [] args){
		String [] arr1={"A", "E", "I", "M", "Q", "U", "Y"};
		String [] arr2={"B", "F", "J", "N", "R", "V", "Z"};
		String [] arr3={"C", "G", "K", "O", "S", "W"};
		String [] arr4={"D", "H", "L", "P", "T", "X"};
		try{
		Thread t1=new Thread(new datas(arr1));
		Thread t2=new Thread(new datas(arr2));
		Thread t3=new Thread(new datas(arr3));
		Thread t4=new Thread(new datas(arr4));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t1.join(1000);
		t2.join(1000);
		t3.join(1000);
		t4.join(1000);
		}
		catch(InterruptedException e){
					
		}	
	}
}
class datas implements Runnable{
	String []arrays;
	public datas(String [] a){
		this.arrays=a;	
	}
	public void run(){
		for(int i=0;i<arrays.length;i++){
			System.out.println(arrays[i]);		
		}
	}
}
