package com.main;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
import javax.swing.*;

public class InterestCalculator {

	JFrame f;
	InterestCalculator()
	{
		f=new JFrame("Interest Calculator");
		JLabel l1=new JLabel("Interest Rate calculator");
		l1.setBounds(200,20, 750,50);  
		  l1.setFont(new Font("Verdana", Font.PLAIN, 30));
	      l1.setPreferredSize(new Dimension(350, 200));
	      f.add(l1);
		f.setLayout(null);    
	    f.setSize(850,850);    
	    f.setVisible(true); 
		
	}
	
	public static void main(String[] args) {
	new InterestCalculator();
	

	}

}
