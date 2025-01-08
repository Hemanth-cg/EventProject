import java.util.Scanner;
public class bank {
	public static void main(String[] args) {
		account a=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("********************WELCOME TO BANK*******************************");
		while(true) {
		System.out.println("\nPress 1: Create Account");
		System.out.println("Press 2: Get the balance");
		System.out.println("Press 3: Amount deposit ");
		System.out.println("Press 4: Amount withdraw");
		System.out.println("Press 5: Change Pin");
		System.out.println("Press 6: Login");
		System.out.println("Press 7: To exit");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter SBI/Axis Account");
			String input=sc.next();
			if(input.equalsIgnoreCase("SBI"))
			{
			System.out.println("Enter the Name and Inital amount:");
			String nm=sc.next();
			double amt=sc.nextDouble();
			a=new SBI_Bank(amt,nm);
			System.out.println("Your account created Successfully ");
			System.out.println("Account Details ");
			System.out.println("Account No: "+a.getAccountno());
			System.out.println("Name: "+a.getName());
			System.out.println("Pin: "+a.getPin());
			System.out.println("Total balance: "+a.getBalance());
			break;
			}
			else if(input.equalsIgnoreCase("Axis"))
			{
			System.out.println("Enter the Name and Inital amount:");
			
			String nm=sc.next();
			double am=sc.nextDouble();
			a=new Axis_Bank(am,nm);
			System.out.println("Your account created Successfully ");
			System.out.println("Account Details ");
			System.out.println("Account No: "+a.getAccountno());
			System.out.println("Name: "+a.getName());
			System.out.println("Pin: "+a.getPin());
			System.out.println("Total balance: "+a.getBalance());
			break;
			}
		case 2:if(a!=null) {
			System.out.println("Balance "+a.getBalance());
			break;
			} 
			else
			{
				System.out.println("Please create account");
				break;
			}
		case 3:if(a!=null) {
			System.out.println("Enter the Amount to deposit");
			double d=sc.nextDouble();
			a.deposit(d);
			break;
			}
		case 4:if(a!=null) {
			System.out.println("Enter the Amount to Withdraw");
			double w=sc.nextDouble();
			a.withdraw(w);
			break;
			}
		case 5:if(a!=null) {
			System.out.println("Enter the Old pin");
			int op=sc.nextInt();
			if(op==a.getPin())
			{
				System.out.println("Enter the new pin");
				int np=sc.nextInt();
				System.out.println("Re-enter the new pin");
				int rp=sc.nextInt();
				if(np==rp)
				{
				a.setPin(np);
				System.out.println("New Pin is "+a.getPin());
				}
				break;
			}
			else 
			{
				System.out.println("Invalid pin");
				break;
			}
		}
		else {
			System.out.println("Please create account");
			break;
		}
		case 6:if(a!=null) {
			System.out.println("Enter the Account No and Name");
			int an=sc.nextInt();
			String s=sc.next();
			if(an==a.getAccountno() || s==a.getName())
			{
				System.out.println("Login successfull");
			}
			else
			{
				System.out.println("Invalid Login");
			}
			break;
		}
		else {
			System.out.println("Please create account");
			break;
		}
		case 7:System.out.println("thank You ");
			 System.exit(0);
		}
	  }
	}
}
