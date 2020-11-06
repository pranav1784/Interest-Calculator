package com.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import com.bean.*;
public class InterestCalculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterTheAmount;
	private JTextField txtEnterNoOf;
	private JTextField txtEnterTheAge;
	private JTextField textField;
	FDAccount ob1=new FDAccount();
	RDAccount ob2=new RDAccount();
	SBAccount ob3=new SBAccount();
	
private JTextField recur;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestCalculator1 frame = new InterestCalculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterestCalculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700,700 );
		String type[]= {"Fixed deposit","Recurring deposit","Simple deposit"};
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String type2[]= {"INDIAN","NRI"};
		
		JLabel lblNewLabel = new JLabel("Interest calculator");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel.setBounds(201, 23, 232, 47);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(type);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(25, 123, 170, 47);
		contentPane.add(comboBox);
		JComboBox comboBox2 = new JComboBox(type2);
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox2.setBounds(456, 199, 170, 32);
		contentPane.add(comboBox2);
		comboBox2.setVisible(false);
		
		JButton btnNewButton = new JButton("CLICK HERE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Recurring deposit"))
				{
					txtEnterTheAmount.setVisible(true);
					txtEnterNoOf.setVisible(false);
					recur.setVisible(true);
					
					comboBox2.setVisible(false);
					txtEnterTheAge.setVisible(true);
				}
				else if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Fixed deposit"))
				{
					txtEnterTheAmount.setVisible(true);
					txtEnterNoOf.setVisible(true);
					recur.setVisible(false);
					txtEnterTheAge.setVisible(true);
					comboBox2.setVisible(false);
				}
				else if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Simple deposit"))
				{
					txtEnterTheAmount.setVisible(true);
					txtEnterNoOf.setVisible(false);
					recur.setVisible(false);
					
					txtEnterTheAge.setVisible(false);
					comboBox2.setVisible(true);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(25, 241, 119, 41);
		contentPane.add(btnNewButton);
		
		txtEnterTheAmount = new JTextField();
		txtEnterTheAmount.setText("Enter the amount");
		txtEnterTheAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterTheAmount.setBounds(456, 138, 170, 32);
		contentPane.add(txtEnterTheAmount);
		txtEnterTheAmount.setColumns(10);
		
		txtEnterNoOf = new JTextField();
		txtEnterNoOf.setText("Enter no of days");
		txtEnterNoOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterNoOf.setBounds(456, 199, 170, 32);
		contentPane.add(txtEnterNoOf);
		txtEnterNoOf.setColumns(10);
		
		recur= new JTextField();
		recur.setText("Enter no of Months");
		recur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		recur.setBounds(456, 199, 170, 32);
		contentPane.add(recur);
		recur.setColumns(10);
		
		txtEnterTheAge = new JTextField();
		txtEnterTheAge.setText("Enter the age");
		txtEnterTheAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterTheAge.setColumns(10);
		txtEnterTheAge.setBounds(456, 263, 170, 32);
		contentPane.add(txtEnterTheAge);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(147, 400, 309, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Total Interest");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(25, 403, 126, 42);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		try {
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				if(SwingUtilities.isEventDispatchThread())
//				{
//					JOptionPane.showMessageDialog(contentPane,"Please fill out the options");
//					return;
//				}
				 if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Fixed deposit"))
				{
					double a=Double.parseDouble(txtEnterTheAmount.getText());
					ob1.setAmount(a);
					int b=Integer.parseInt(txtEnterNoOf.getText());
					ob1.setNoOfDays(b);
					int c=Integer.parseInt(txtEnterTheAge.getText());
					ob1.setAgeOfACHolder(c);
					double d=ob1.calculateInterest();
					textField.setText("Interest Amt of FD will be "+d);
					//System.out.println(d);
				}
				 if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Recurring deposit"))
				{
						double a=Double.parseDouble(txtEnterTheAmount.getText());
						ob2.setAmount(a);
						int b=Integer.parseInt(recur.getText());
						ob2.setNoOfMonth(b);
						int c=Integer.parseInt(txtEnterTheAge.getText());
						ob2.setAgeOfACHolder(c);
						double d=ob2.calculateInterest();
						textField.setText("Interest Amt of RD will be "+d);
						
				}
				 if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Simple deposit"))
				 {
					 double a=Double.parseDouble(txtEnterTheAmount.getText());
					 double c,b;
					 ob3.setAmount(a);
					 if(comboBox2.getItemAt(comboBox2.getSelectedIndex()).equals("INDIAN"))
					 {
						  b=ob3.calculateInterest();
						 textField.setText("Interest Amt of SD will be "+b);
					 }
					if(comboBox2.getItemAt(comboBox2.getSelectedIndex()).equals("NRI"))
					 
					 {
						 c=ob3.getAmount();
						c=c*6/100;
						textField.setText("Interest Amt of SD will be "+c);
					 }
					 
				 }
				 
			}
		});
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(contentPane,"Please fillout the options!");  
		}
	
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(489, 359, 104, 47);
		contentPane.add(btnNewButton_1);
	}
}
