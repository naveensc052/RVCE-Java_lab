package four;

class Demonetisation extends Exception{
	Demonetisation(int amount){
		super("deposit of odd currency "+amount +"greater than 5000 rupees");
	}
}

class account{
	int balance = 500;
	void deposit(String currencytype, int amount) {
		try {
			if(currencytype.equalsIgnoreCase("old") && amount > 5000) {
				throw new Demonetisation(amount);
			}
			else {
				balance += amount;
				System.out.println("Deposited "+amount);
			}
		}
		catch(Demonetisation e) {
			System.out.println(e.getMessage());
		}
		
	}
	void withdraw(int amount) {
		
			if(balance - amount < 500) {
				System.out.println("Withdraw not possible ");
			}
			else {
				balance -= amount;
				System.out.println("Withdrawed "+amount);
			}
		
	}
	void balance() {
		System.out.println("Balance "+balance);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account ac=new account();
		ac.deposit("old",400);
		ac.withdraw(300);
		ac.balance();
		ac.deposit("old",6000);
		ac.withdraw(7000);

	}

}
