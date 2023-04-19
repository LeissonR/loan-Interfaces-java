package services;

public class BrazilInterestService implements InterestService {

	private double amount;
	private int months;
	private double interestRate;

	public BrazilInterestService(double interestRate, double amount, int months) {
		this.interestRate = interestRate;
		this.amount = amount;
		this.months = months;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Payment after " + months + " months: \n");
		sb.append("Brazil payment: " + String.format("%.2f", payment(amount, months)));
		return sb.toString();
	}

}
