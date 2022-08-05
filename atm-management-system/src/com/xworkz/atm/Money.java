package com.xworkz.atm;

public class Money {
	
	public void check(int amount)throws AtmException{
		if(amount<=25000 && (amount>=100)&&(amount%100)==0){
			System.out.println("your transaction is being processed");
		}
		else{
			throw new AtmException();
		}
	}

}
