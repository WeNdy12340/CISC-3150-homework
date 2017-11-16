/*
*Wendy Mei
*CISC 3150
*Hw 8 
*Goes through the file system and outputs a tree diagram.
* I test it with the current directory I am using, which is my Desktop
* If I test it inside my Homework 8 folder, it will only show QuestionOne.java, QuestionOne.class, QuestionTwo.txt and my dir_tree.txt files. 
*/
import java.util.*;
import java.io.*;
public class QuestionOne{
	public static void main(String[] args) throws java.io.IOException{
		int track =1;
		java.io.File file =new java.io.File("dir_tree.txt");
		java.io.PrintWriter output =new java.io.PrintWriter(file);
		//Finding the current Directory
		output.println(System.getProperty("user.dir"));
		String name =System.getProperty("user.dir");
		File target =new File(name);
		if(target.exists() && target.isDirectory()){
			File[] targetFile=target.listFiles();
			printTree(targetFile, track, output);
		} 
		output.close();
	}
//Printing the Tree
	public static void printTree(File [] array, int count, PrintWriter temp){
		String spaces="-----";
		for (int i=0; i< array.length; i++){
			if(array[i].isFile()){
				for (int a=0; a< count; a++)
				temp.print(spaces);
				temp.println(array[i].getName());
			}
			if(array[i].isDirectory()){
				for (int a=0; a< count; a++)
				temp.print(spaces);
				temp.println("Directory: " + array[i].getName());
				String subname=array[i].getName();
				count++;
				inSubDir(subname, count, temp);
				count--;
			}
		}
	}
//Goes through the Sub Directories
	public static void inSubDir(String subDirName, int count2, PrintWriter output2){
		File target2 =new File(subDirName);
		if(target2.exists() && target2.isDirectory()){
			File[] targetFile2=target2.listFiles();
			printTree(targetFile2, count2, output2);
		}
	}
}
