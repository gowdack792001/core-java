package com.xworkz.atm;

import java.util.Scanner;

public class AtmTester {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount to be withdrawn");
		int amount = sc.nextInt();
		
		Money money = new Money();
		try {
			money.check(amount);
		} catch (AtmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
