package net.learning.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
	
	public static void main(String[] args) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		int principal = 0;
		float monthlyInterestRate = 0;
		int numbeOfPayments = 0;
		
		while(true) {
			System.out.print("Principal: ");
			principal = scanner.nextInt();
			if(principal >= 1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter value between 1000 (one thousand) and 1000000 (one million)");
		}
		
		while(true) {
			System.out.print("Annual interest rate: ");
			float annualInterestRate = scanner.nextFloat();
			if(annualInterestRate >= 1 && annualInterestRate <= 30) {
				monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR ;
				break;
			}
			System.out.println("Enter value between 1 (one) and 30 (thirty)");			
		}
		
		while(true) {
			System.out.print("Period (Years): ");
			byte numberOfYears = scanner.nextByte();
			if(numberOfYears >= 1 && numberOfYears <= 30) {
				numbeOfPayments = numberOfYears * MONTHS_IN_YEAR ;
				break;
			}
			System.out.println("Enter value between 1 (one) and 30 (thirty)");			
		}
		
		double mortgage = principal 
							* ( monthlyInterestRate * Math.pow((1+monthlyInterestRate), numbeOfPayments)) 
							/ (Math.pow((1+monthlyInterestRate), numbeOfPayments) -1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: "+mortgageFormatted);

	}

}
