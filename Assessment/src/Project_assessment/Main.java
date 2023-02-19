package Project_assessment;
import java.io.IOException;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		OpDef op = new OpDef();
		op.Welcome();
		String choice = sc.next();
		String choice2="";
		
		while (choice.equals("1")==false&&choice.equals("2")==false&&choice.equals("3")==false)
		{
			System.out.println("Invalid Entry, Try Again");
			choice=sc.next();
		}
		
		String yn,fn;
		
		while (!choice.equals("3"))
		{
			switch (choice)
			{
				case "1":
				{
					op.Showfiles();
					break;
				}
				case "2":
				{
					System.out.println("1.Add\n2.Delete\n3.Search\n4.Main Menu\n5.Exit");
					choice2=sc.next();
					while (!choice2.equals("4"))
					{
						switch (choice2)
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
						case "4":
							break;
							
						case "5":
							break;
						}
						
						if (!choice2.equals("5")&&!choice2.equals("4"))
						{
							System.out.println("Would you like to go back to the previous menu?");
							String choice3=sc.next();
							while(choice3.equals("yes")==false&&choice3.equals("no")==false)
							{
								System.out.println("Invalid Entry, Try Again");
								choice3=sc.next();
							}
							if(choice3.equalsIgnoreCase("yes"))
							{
								System.out.println("1.Add\n2.Delete\n3.Search\n4.Main Menu\n5.Exit");
								choice2=sc.next();
								
								while (choice2.equals("1")==false&&choice2.equals("2")==false&&choice2.equals("3")==false&&choice2.equals("4")==false&&choice2.equals("5")==false)
								{
									System.out.println("Invalid Entry, Try Again");
									choice2=sc.next();
								}
							}
							else
							{
								break;
							}
						}
						else
							break;
					}
				}
			}
			if (!choice.equals("2")&&(!choice.equals("5"))&&!choice.equals("4"))
			{
				System.out.println("\n");
				System.out.println("Would you like to go back to the main menu?(Yes/No)");
				yn=sc.next();
				while (yn.equals("yes")==false&&yn.equals("no")==false)
				{
					System.out.println("Invalid Entry, Try Again");
					yn=sc.next();
					yn=yn.toLowerCase();
				}
				if (yn.equalsIgnoreCase("yes"))
				{
					op.RepeatedChoice();
					choice = sc.next();
				}
				else if (choice.equals("2")&&choice2.equals("4"))
				{
					op.RepeatedChoice();
					choice = sc.next();
				}
			
				else 
				{
					choice="3";
				}
			}
			else
			{
				break;
			}
			}
		System.out.println("\n--**Thank you for using the application!**--\n");
		}
		
	}
	
	
