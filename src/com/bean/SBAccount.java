package com.bean;

public class SBAccount extends Account {
public double calculateInterest()
 {
	//String str="Normal";
	//if(str.equals("Normal"))
		setInterestRate(4);
	
	double interest=amount*interestRate/100.0;
	return interest;
	
 }
}
