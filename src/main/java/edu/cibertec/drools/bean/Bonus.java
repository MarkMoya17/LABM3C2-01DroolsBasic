package edu.cibertec.drools.bean;

public class Bonus {

	private String type;
	private long amount;
	
	public Bonus(String type, long amount) {
		super();
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bonus [type=" + type + ", amount=" + amount + "]";
	}
	
	
	
}
