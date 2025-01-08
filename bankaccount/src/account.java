
public class account {
	int accountno;
	double balance;
	String name;
	static int count=100;
	private int pin;
	static int pinGen=4444;
	account( double balance,String name)
	{	
		this.accountno = count++;
		this.name=name;
		this.balance = balance;
		pin=pinGen++;
	}
	public int getAccountno() {
		return accountno;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	void deposit(double amt)
	{
			balance=balance+amt;
			System.out.println(amt+"Rs Added to your Account and total balance is "+this.balance);
	}
	void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+"Rs withdraw from your Account and total balance is "+this.balance);
		}
		else 
			System.out.println("Insuffiecint Balance");
	}
}

class SBI_Bank extends account
{

	SBI_Bank(double balance,String name) {
		super(balance, name);
	}
	
}

class Axis_Bank extends account
{

	public Axis_Bank(double balance, String name) {
		super(balance, name);
	}
	
}