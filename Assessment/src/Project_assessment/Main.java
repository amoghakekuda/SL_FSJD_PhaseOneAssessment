package Project_assessment;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		OpDef op = new OpDef();
		op.Welcome();
		int choice = sc.nextInt();
		String yn;
		
		while (choice!=5)
		{
			switch (choice)
			{
				case 1:
				{
					System.out.println("Choice 1");
					break;
				}
				case 2:
				{
					System.out.println("Choice 2");
					break;
				}
				case 3:
				{
					System.out.println("Choice 3");
					break;
				}
				case 4:
				{
					System.out.println("Choice 4");
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
				choice=5;
			}
			}
		System.out.println("Thank you for using the application!");
		}
		
	}
	
	
