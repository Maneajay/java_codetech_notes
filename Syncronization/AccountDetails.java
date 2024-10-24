package Syncronization;

public class AccountDetails implements Runnable {
Account account =new Account();

	@Override
	public void run() {
		for(int x=0;x<2;x++) {
			
				if(account.getBalance() <=0) {
					System.out.println("account is overdrawn::");
				}
			
			makewithdrawl(500);
			}
	}
private synchronized void makewithdrawl(int amt) {
	if(account.getBalance() >=0) {
		System.out.println(Thread.currentThread().getName()+  "is goint to withdraw amount ::  "+amt);
}
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	int bal=account.withdraw(amt);
	System.out.println(Thread.currentThread().getName()+  "withdrew complated ::  "+amt);
		
	}

}
