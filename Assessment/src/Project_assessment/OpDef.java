package Project_assessment;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OpDef extends operations {
	
	Scanner sc = new Scanner(System.in);
	File f = new File("C:\\Phase1_Project");
	String fn;
	
	String[] files = f.list();
    List<String> fl = new ArrayList<>(Arrays.asList(files));
	
	
	void Welcome() {
        System.out.println("**************************************");
        System.out.println("* SimpliLearn Phase 1 Project: Core Java");
        System.out.println("* Application Name: Company Lockers Pvt. Ltd. File Management");
        System.out.println("* Developer: Amogha Kekuda *");
        System.out.println("**************************************");
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("User Interface: ");
        System.out.println("1. Show Files");
        System.out.println("2. Create/Delete/Search Files");
        System.out.println("3. Close the Application");
        System.out.println("--------------------------------------");
        System.out.println("\n");
        System.out.print("Enter your choice: ");
	}
	
	void RepeatedChoice() {
			System.out.println("--------------------------------------");
			System.out.println("\n");
		 	System.out.println("User Interface: ");
	        System.out.println("1. Show Files");
	        System.out.println("2. Create/Delete/Search Files");
	        System.out.println("3. Close the Application");
	        System.out.println("--------------------------------------");
	        System.out.println("\n");
	        System.out.print("Enter your choice: ");	
	        
	}

	public void createfile(String s) throws IOException, FileNotFoundException {
		this.fn=s;
		
		File nf = new File("C:\\Phase1_Project\\"+fn+".txt");
		if (nf.exists())
		{
			System.out.println("File already exists!\n");
		}
		else
		{
			nf.createNewFile();
			System.out.println("File created!\n");
			this.fl.add(fn);
		}
		
	}
	

	public void deletefile(String s) throws IOException, FileNotFoundException {
		this.fn=s;
		
		File nf = new File("C:\\Phase1_Project\\"+fn+".txt");
		if (nf.exists())
		{
			nf.delete();
			this.fl.remove(fn);
			System.out.println("File Deleted");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	
	public void Showfiles() {
		fl.sort(null);
		if (fl.isEmpty())
		{
			System.out.println("No Folders to Display");		
		}
		else
		{
			System.out.println("\nFiles in the folder:\n");
			for(String s: fl)
			{
				System.out.println(s);
			}
		}
		
	}
	
	public void searchfile(String s) throws IOException, FileNotFoundException {
		
		this.fn=s;
		
		File nf = new File("C:\\Phase1_Project\\"+fn+".txt");
		if (nf.exists())
		{
			System.out.println("File Exists!\n");
		}
		else
		{
			System.out.println("File does not exist\n");
		}
		
	}
	
	public OpDef() {                 //Constructor
		File f = new File("C:\\Phase1_Project");
		if (f.exists()==false)
		{
			f.mkdir();
		}
	}
	
	public String yesno() {
		String q = sc.next();
		
		while ((!q.equalsIgnoreCase("yes"))&&(!q.equalsIgnoreCase("no")))
		{
			System.out.println("Invalid Entry, Try again\n");
			q = sc.next();
		}
		
		return q;	
	}	

}
