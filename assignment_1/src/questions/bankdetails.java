package questions;

public class bankdetails {
	private double balance;
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("deposited: "+amount);
	}
	
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance = balance-amount;
			System.out.println("withdraw: "+amount);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public double getbalance() {
		return balance;
	}

}
class Savings extends bankdetails{
	
}
class Current extends bankdetails{

	public static void main(String[] args) {
	Savings s=new Savings();
	s.deposit(5000);
	s.withdraw(2000);
	
	Current c=new Current();
	c.deposit(10000);
	c.withdraw(3000);
	
	}
}
