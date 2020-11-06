package com.bean;

public class FDAccount extends Account {
//private double interestRate;
//private double amount;
private int noOfDays;
private int ageOfACHolder;

public double calculateInterest()
{
double rateOfInterest=0;
double interest=0;
if(amount<10000000)
{
	
	if(noOfDays>=7&&noOfDays<=14)
		rateOfInterest=4.5;
	else if(noOfDays>=15&&noOfDays<=29)
		rateOfInterest=4.75;
	else if(noOfDays>=30&&noOfDays<45)
		rateOfInterest=5.50;
	else if(noOfDays>=45&&noOfDays<=60)
		rateOfInterest=7.00;
	else if(noOfDays>=61&&noOfDays<=184)
		rateOfInterest=7.50;
	else if(noOfDays>=185&&noOfDays<=365)
		rateOfInterest=8.00;
if(ageOfACHolder>=65)
	rateOfInterest+=0.5;

}
else
{
	if(noOfDays>=7&&noOfDays<=14)
		rateOfInterest=6.50;
	else if(noOfDays>=15&&noOfDays<=29)
		rateOfInterest=6.75;
	else if(noOfDays>=30&&noOfDays<45)
		rateOfInterest=6.75;
	else if(noOfDays>=45&&noOfDays<=60)
		rateOfInterest=8.00;
	else if(noOfDays>=61&&noOfDays<=184)
		rateOfInterest=8.50;
	else if(noOfDays>=185&&noOfDays<=365)
		rateOfInterest=10.00;	
}
interest=amount*rateOfInterest/100;
//interestRate=rateOfInterest;
return interest;
}

public double getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public double getAgeOfACHolder() {
	return ageOfACHolder;
}
public void setAgeOfACHolder(int ageOfACHolder) {
	this.ageOfACHolder = ageOfACHolder;
}

}
