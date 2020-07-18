package edu.cibertec.drools.bean;

public class Account {

	private String id;
	private long balance;
	
		
	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	
}
