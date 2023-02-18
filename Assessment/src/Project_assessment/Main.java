package Project_assessment;
import java.io.IOException;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		OpDef op = new OpDef();
		op.Welcome();
		int choice = sc.nextInt();
		int choice2;
		
		String yn,fn;
		
		while (choice!=3)
		{
			switch (choice)
			{
				case 1:
				{
					System.out.println("Choice 1");
					op.Showfiles();
					break;
				}
				case 2:
				{
					System.out.println("1.Add\n2.Delete\n3.Search");
					choice2=sc.nextInt();
					switch (choice2)
					{
					case 1:
					{
						System.out.println("Enter file name to add: ");
						fn = sc.next();
						op.createfile(fn);
						break;
					}
					case 2:
					{
						System.out.println("Enter file name to delete: ");
						fn = sc.next();
						op.deletefile(fn);
						break;
					}
					case 3:
					{
						System.out.println("Enter file name to Search: ");
						fn = sc.next();
						op.searchfile(fn);
						break;
					}
					}
					break;
				}
				case 3:
				{
					System.out.println("Choice 3");
					break;
				}
			}
			System.out.println("\n");
			System.out.println("Would you like to go back to the menu?(Yes/No)");
			yn=sc.next();
			System.out.println(yn);
			while (yn.equals("yes")==false&&yn.equals("no")==false)
			{
				System.out.println("Invalid Entry, Try Again");
				yn=sc.next();
				yn=yn.toLowerCase();
			}
			if (yn.equalsIgnoreCase("yes"))
			{
				op.RepeatedChoice();
				choice = sc.nextInt();
			}
			else
			{
				choice=3;
			}
			}
		System.out.println("Thank you for using the application!");
		}
		
	}
	
	
