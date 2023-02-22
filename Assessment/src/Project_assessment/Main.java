package Project_assessment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		OpDef op = new OpDef();
		op.Welcome();
		String Choice1 = sc.next();
		String Choice2 = null;
		String fn=null;
		String R;
		boolean exit=false;
		
		while ((!Choice1.equals("1"))&&(!Choice1.equals("2"))&&(!Choice1.equals("3")))
		{
			System.out.println("Invalid Entry, Try Again!!(1-3)\n");
			Choice1 = sc.next();
		}
		
		while ((Choice1.equals("1"))||(Choice1.equals("2")))
		{
			switch (Choice1)
			{
			case "1":
			{
				op.Showfiles();
				break;
			}
			case "2":
			{
				System.out.println("\n1.Add\n2.Delete\n3.Search\n4.Main Menu\n5.Exit\n");
				Choice2 = sc.next();
				
				while ((!Choice2.equals("1"))&&(!Choice2.equals("2"))&&(!Choice2.equals("3"))&&(!Choice2.equals("4"))&&(!Choice2.equals("5")))
				{
					System.out.println("Invalid Entry, Try Again (1-5)");
					Choice2 = sc.next();
				}
				
				while ((Choice2.equals("1"))||(Choice2.equals("2"))||(Choice2.equals("3"))||(Choice2.equals("4"))||(Choice2.equals("5")))
				{
					switch (Choice2)
					{
						case "1":
						{
							System.out.println("Enter file name to add: ");
							fn = sc.next();
							op.createfile(fn);
							break;
						}
						case "2":
						{
							System.out.println("Enter file name to delete: ");
							fn = sc.next();
							op.deletefile(fn);
							break;
						}
						case "3":
						{
							System.out.println("Enter file name to Search: ");
							fn = sc.next();
							op.searchfile(fn);
							break;
						}						
					}
					if ((Choice2.equals("1"))||(Choice2.equals("2"))||(Choice2.equals("3")))
					{
						System.out.println("\nWould you like to go back to the Previous menu?\n");
						R = op.yesno();
						if (R.equalsIgnoreCase("yes"))
						{
							System.out.println("\n1.Add\n2.Delete\n3.Search\n4.Main Menu\n5.Exit\n");
							Choice2=sc.next();
						}
						else
						{
							Choice2="6";
							exit = true;
						}
							
					}
					else if (Choice2.equals("4"))
					{
						exit=false;
						break;
					}
					else if (Choice2.equals("5"))
					{
						Choice2="6";
						exit=true;
						break;
					}
					
				}
			}
			}
			if (exit==false )
			{
				System.out.println("\nWould you like to go back to the main menu?(Yes/No)\n");
				R=op.yesno();
				if (R.equalsIgnoreCase("yes"))
				{
					op.RepeatedChoice();
					Choice1=sc.next();
				}
				else
					Choice1="3";
			}
			else
			{
				Choice1="3";
			}
			
		}
		System.out.println("\n--||Thank you for using the application!||--");
		
	}
}