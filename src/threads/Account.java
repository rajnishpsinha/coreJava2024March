package threads;

public class Account {
	private int balance;
	
	synchronized public void withdraw(int amount)
	{
		if(getBalance()<amount)
		{
			try {
				System.out.println("Insufficient amount, waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setBalance(getBalance()-amount);
			System.out.println("after withdrawal: "+ getBalance());
			
		}
		
	}
	
	synchronized public void deposit(int amount)
	{
		setBalance(getBalance()+amount);
		System.out.println("Amount after deposit:  "+getBalance());
		notify();
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
