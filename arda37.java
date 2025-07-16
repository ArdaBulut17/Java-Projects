package a;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class arda37 {
    public static void main(String[] args) {
    
    	JFrame f = new JFrame("Calculator Examples");
    	JLabel l1 , l2 , l3;
    	JTextField tf1 , tf2 , tf3;
    	JButton b1 , b2 , b3 , b4;
    	
    	l1 = new JLabel("Enter number one : ");
    	l1.setBounds(20, 10, 200, 30);
    	
    	tf1 = new JTextField();
    	tf1.setBounds(20, 40, 200, 30);
    	
    	l2 = new JLabel("Enter number two : ");
    	l2.setBounds(20, 70, 200, 30);
    	
    	tf2 = new JTextField();
    	tf2.setBounds(20, 100, 200, 30);
    	
    	l3 = new JLabel("Result : ");
    	l3.setBounds(20, 130, 200, 30);
    	
    	tf3 = new JTextField();
    	tf3.setBounds(20, 160, 200, 30);
    	tf3.setEditable(false);
    	
    	b1 = new JButton("Addition");
    	b1.setBounds(20, 220, 200, 30);
    	b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a1 = Integer.parseInt(tf1.getText());
				int b1 = Integer.parseInt(tf2.getText());
				int c1 = a1 + b1;
				String Result = String.valueOf(c1);
				tf3.setText(Result);
				
			}
    		
    	});
    	
    	b2 = new JButton("Subtraction");
    	b2.setBounds(20, 260, 200, 30);
    	b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a2 = Integer.parseInt(tf1.getText());
				int b2 = Integer.parseInt(tf2.getText());
				int c2 = a2 - b2;
				
				String Result = String.valueOf(c2);
				tf3.setText(Result);
				
				
			}
    		
    	});
    	
    	b3 = new JButton("Multiplication");
    	b3.setBounds(20, 300, 200, 30);
    	b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a3 = Integer.parseInt(tf1.getText());
				int b3 = Integer.parseInt(tf2.getText());
				int c3 = a3 * b3;
				
				String Result = String.valueOf(c3);
				tf3.setText(Result);
				
				
			}
    		
    	});
    	b4 = new JButton("Division");
    	b4.setBounds(20, 340, 200, 30);
    	b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a4 = Integer.parseInt(tf1.getText());
				int b4 = Integer.parseInt(tf2.getText());
				int c4 = a4 / b4;
				
				String Result = String.valueOf(c4);
				tf3.setText(Result);
				
				
			}
    		
    	});
    	
    	
    	
    	f.add(l1);
    	f.add(tf1);
    	f.add(l2);
    	f.add(tf2);
    	f.add(l3);
    	f.add(tf3);
    	f.add(b1);
    	f.add(b2);
    	f.add(b3);
    	f.add(b4);
        f.setSize(300, 500);
        f.setLayout(null);
    	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    	f.setVisible(true);
    }
}
