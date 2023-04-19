package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService is = new BrazilInterestService(2.0, amount, months);

		try {
			is.payment(amount, months);
			System.out.println(is);
		}

		catch (InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}