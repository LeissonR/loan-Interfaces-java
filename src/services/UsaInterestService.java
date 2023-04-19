package services;

import java.security.InvalidParameterException;

public class UsaInterestService {

	private double amount;
	private int months;
	private double interestRate;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero.");
		}
		this.amount = amount;
		this.months = months;
		return amount * Math.pow(1.0 + interestRate / 100, months);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Payment after " + months + " months: \n");
		sb.append("USA payment: " + String.format("%.2f", payment(amount, months)));
		return sb.toString();
	}

}
