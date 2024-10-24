package Syncronization;

public class MainTest {
public static void main(String[] args) {
	AccountDetails accountdetails =new AccountDetails();
	Thread thread1 =new Thread(accountdetails);
	Thread thread2 =new Thread(accountdetails);
	Thread thread3 =new Thread(accountdetails);
	Thread thread4 =new Thread(accountdetails);
	Thread thread5 =new Thread(accountdetails);
	thread1.setName("jevan");
	thread2.setName("soham");
	thread3.setName("sumit");
	thread4.setName("nikhil");
	thread5.setName("ram");
	thread1.start();
	thread2.start();
	thread3.start();
	thread4.start();
	thread5.start();
}
}
