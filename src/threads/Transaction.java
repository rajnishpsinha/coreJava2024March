package threads;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account = new Account();
account.setBalance(1000);
new Thread("t1"){public void run(){account.withdraw(1200);}}.start();
new Thread("t2"){public void run(){account.deposit(300);}}.start();
	}

}
