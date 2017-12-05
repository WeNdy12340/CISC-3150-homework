/*
*Wendy Mei
*CISC 3150
*HW 9
* DID NOT Work, took reference of the example in class.
*Keep printing A and not stop
*/
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class HwNine {
	public static void main(String [] args){
		Record r=new Record();
		Printing p= new Printing(r); 
		A newa=new A(p);
		B newb=new B(p);
		C newc=new C(p);
		D newd=new D(p);
		Thread t1=new Thread(newa);
		Thread t2=new Thread(newb);
		Thread t3=new Thread(newc);
		Thread t4=new Thread(newd);
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}
}
class Record{
	int count=0;
	int i=0;
	String [] arr1={"A", "E", "I", "M", "Q", "U", "Y"};
	String [] arr2={"B", "F", "J", "N", "R", "V", "Z"};
	String [] arr3={"C", "G", "K", "O", "S", "W"};
	String [] arr4={"D", "H", "L", "P", "T", "X"};
}
class A implements Runnable{
	Printing p;
	A(Printing p){
		this.p=p;
	}
	public void run(){
		while(true){
			p.A();		
		}	
	}
}
class B implements Runnable{
	Printing p;
	B(Printing p){
		this.p=p;
	}
	public void run(){
		while(true){
			p.B();		
		}	
	}
}
class C implements Runnable{
	Printing p;
	C(Printing p){
		this.p=p;
	}
	public void run(){
		while(true){
			p.C();		
		}	
	}
}
class D implements Runnable{
	Printing p;
	D(Printing p){
		this.p=p;
	}
	public void run(){
		while(true){
			p.D();		
		}	
	}
}
class Printing{
	Record r;
	Lock L= new ReentrantLock();
	Condition printA=L.newCondition();
	Condition printB=L.newCondition();
	Condition printC=L.newCondition();
	Condition printD=L.newCondition();
	Printing(Record r){
		this.r=r;	
	}
	public void A(){
		L.lock();
		try{
			while(r.count!=26){
				System.out.println(r.arr1[r.i]);
				printB.signal();
				printA.wait();
				r.count++;
				
			}
			System.out.println(r.arr1[r.i]);
			r.count++;
		}catch(Throwable t){}
		finally{
			L.unlock();
		}
	}
	public void B(){
		L.lock();
		try{
			while(r.count!=26){
				System.out.println(r.arr2[r.i]);
				printC.signal();
				printB.await();	
			}
			System.out.println(r.arr2[r.i]);
			r.count++;
		}catch(Throwable t){}
		finally{
			L.unlock();
		}
	}
	public void C(){
		L.lock();
		try{
			while(r.count!=26){
				System.out.println(r.arr3[r.i]);
				printD.signal();
				printC.await();		
			}
			System.out.println(r.arr3[r.i]);
			r.count++;
		}catch(Throwable t){}
		finally{
			L.unlock();
		}
	}
	public void D(){
		L.lock();
		try{
			while(r.count!=26){
				System.out.println(r.arr4[r.i]);
				printA.signal();
				printD.await();		
			}
			System.out.println(r.arr4[r.i]);
			r.count++;
			r.i++;
			System.out.println(r.i);
		}catch(Throwable t){}
		finally{
			L.unlock();
		}
	}
}
