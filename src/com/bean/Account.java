package com.bean;
abstract class Account {
	
double interestRate;

double amount;

abstract double calculateInterest();
public double getAmount()
{
	return amount;
}
public void setAmount(double amount)
{
this.amount=amount;
}
public double getInterestRate()
{
	return interestRate;
}
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}
}

