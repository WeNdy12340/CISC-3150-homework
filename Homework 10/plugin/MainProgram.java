/*
*Wendy Mei
*CISC 3150
*Homework 10
* search through directory looking for names, give users an option, then execute
*used example in class as a reference
*/
import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class MainProgram{
	public static void main(String [] args)throws Throwable{
/*
		//print all the files name in the plugin folder
		String name =System.getProperty("user.dir");
		File target =new File(name);
		if(target.exists() && target.isDirectory()){
			File[] targetFile=target.listFiles();
			for (int i=0; i< targetFile.length; i++){
				if(targetFile[i].isFile()){
					System.out.println(targetFile[i].getName());
				}
			}
		} 
*/
		//print the constuctor of plugin one
		Class <?> myclass1 =Class.forName("PluginOne");
		Constructor<?> [] a = myclass1.getConstructors();
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		//print the constructor of plugin two
		Class <?> myclass2 =Class.forName("PluginTwo");
		Constructor<?> [] b = myclass2.getConstructors();
		for (int j=0; j<b.length; j++){
			System.out.println(b[j]);
		}
		//letting the user chose which plugin to execute
		int option;
		Scanner input= new Scanner(System.in);
		System.out.println("Do you want to execute Plugin One or Plugin Two? Please enter 1 to execute Plugin One or 2 to execute Plugin Two" );
		option = input.nextInt();
		if (option != 1 && option != 2){
			System.out.println("You did not enter a valid option");		
		}
		else if(option==1){
				PluginOne c = new PluginOne();			
				c.whoSaysHello();
				c.whoSaysBye();			
			}
			else{
				PluginTwo d = new PluginTwo();			
				d.whoSaysHello();
				d.whoSaysBye();	
			}
	}
}
