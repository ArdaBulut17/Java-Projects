package summerstudy;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class a15 {
static int a = 25000;
static	 int b = 10000;
static int activeLoan = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		JFrame f = new JFrame("Example");
		JLabel l1,l2;
		JTextField tf1;
		JPasswordField pf1;
		JButton btn;
		JCheckBox ch1;
		
		
		l1 = new JLabel("Username : ");
		l1.setBounds(20,20,100,30);
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		tf1 = new JTextField();
		tf1.setBounds(90, 20, 100, 30);
		tf1.setFont(new Font("Arial", Font.BOLD, 12));
		
		l2 = new JLabel("Password : ");
		l2.setBounds(20, 60, 100, 30);
		l2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		pf1 = new JPasswordField();
		pf1.setBounds(90, 60, 100, 30);
		
		btn = new JButton("Login");
		btn.setBounds(90, 100, 100, 30);
		
		ch1 = new JCheckBox("Remember me ");
		ch1.setBounds(20, 130, 200, 30);
		ch1.setBackground(Color.LIGHT_GRAY);
		
		
		btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String username = tf1.getText();
					String password = new String(pf1.getPassword());
					
					
	if (username.trim().equals("arda") && password.trim().equals("0905")) {
	          JOptionPane.showMessageDialog(f, "Login Successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
   JFrame frm = new JFrame("BANK");
   
   JLabel ll1,ll2,ll3;
   JTextField t1;
   JButton b1,b2,b3,b4,b5,b6,b7;
   JTextArea tArea;
   
   
 

   

   
   ll1 = new JLabel("Welcome to the Bank Account,Arda BULUT. What do you want? ");
   ll1.setBounds(0, 0, 500, 30);
   ll1.setFont(new Font("Arial", Font.BOLD, 16));
   ll1.setForeground(Color.BLUE);
   
   ll2 = new JLabel("Your cash : "+a +"TL");
   ll2.setBounds(0, 50, 250, 30);
   ll2.setFont(new Font("Verdana", Font.PLAIN, 14));
   

   ll3 = new JLabel("Your credit limit is : "+b + "TL");
   ll3.setBounds(0, 80, 250, 30);
   ll3.setFont(new Font("Verdana", Font.PLAIN, 14));
   
   b1= new JButton("Deposit Money");
   b1.setBounds(0, 120, 200, 30);
   b1.setFont(new Font("Tahoma", Font.BOLD, 14));
   b1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String amountStr = JOptionPane.showInputDialog(frm, "Enter amount to deposit:");
        try {
            int amount = Integer.parseInt(amountStr);
            if (amount > 0) {
                a += amount;
                ll2.setText("Your cash : " + a + " TL");
                JOptionPane.showMessageDialog(frm, amount + " TL deposited successfully!");
            } else {
                JOptionPane.showMessageDialog(frm, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frm, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
		
	
	   
   });
   
   b2 = new JButton("Withdraw Money");
   b2.setBounds(0, 160, 200, 30);
   b2.setFont(new Font("Tahoma", Font.BOLD, 14));
   b2.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog(frm, "Withdraw amount:");
        if (input != null) {
            try {
                int amount = Integer.parseInt(input);
                if (amount > 0 && amount <= a) {
                    a -= amount;   
                    ll2.setText("Your cash : " + a + " TL");
                } else if (amount > a) {
                    JOptionPane.showMessageDialog(frm, "Insufficient funds!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frm, "Amount must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frm, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
		
	}
	   
	   
   });
   
   b3 = new JButton("Loan Application");
   b3.setBounds(0, 200, 200, 30);  
   b3.setFont(new Font("Tahoma", Font.BOLD, 14));
   b3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog(frm, "Enter loan amount:");
        if (input != null) {
            try {
                int amount = Integer.parseInt(input);
                if (amount > 0 && amount <= b) {
                    a += amount;  
                    b -= amount; 
                    activeLoan = amount;
                    ll2.setText("Your cash : " + a + " TL");
                    ll3.setText("Your credit limit is : " + b + " TL");
                    JOptionPane.showMessageDialog(frm, "Loan approved!\nAmount: " + amount + " TL", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else if (amount > b) {
                    JOptionPane.showMessageDialog(frm, "Loan request exceeds your limit!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frm, "Amount must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frm, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
		
	}
	   
	   
   });
   
   b4 = new JButton("Loan Info");
   b4.setBounds(0, 240, 200, 30);
   b4.setFont(new Font("Tahoma", Font.BOLD, 14));
   b4.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (activeLoan > 0) {
            JOptionPane.showMessageDialog(frm,
                "Active Loan: " + activeLoan + " TL\nRemaining Limit: " + b + " TL");
        } else {
            JOptionPane.showMessageDialog(frm,
                "YOU DO NOT HAVE ANY ACTIVE CREDITS",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
	}
	   
	   
   });
   
   b5 = new JButton("Card Informations");
   b5.setBounds(0, 280, 200, 30);
   b5.setFont(new Font("Tahoma", Font.BOLD, 14));
   b5.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame("Card Informations");
		JLabel lb1,lb2,lb3,lb4;
		JButton bn1,bn2;
		
		lb1 = new JLabel("Card Number : 5423 7400 0905 ****");
		lb1.setBounds(20, 10, 300, 100);
		
		lb2 = new JLabel("Valid Thru : 09/29");
		lb2.setBounds(20, 40, 300, 100);
		
		lb3 = new JLabel("CVC : 525");
		lb3.setBounds(20, 70, 300, 100);
		
		lb4 = new JLabel("Name Surname : Arda BULUT");
		lb4.setBounds(20, 100, 300, 100);
		
		bn1 = new JButton("Continue Processing");
		bn1.setBounds(20, 170, 200, 30);
		bn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fr.dispose();
				frm.setVisible(true);
				
				
			}
			
		});
		
		bn2 = new JButton("Card Return");
		bn2.setBounds(20, 220, 200, 30);
		bn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
				
				
			}
			
		});
		
		
		
		fr.add(lb1);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		fr.add(bn1);
		fr.add(bn2);
		fr.setSize(300, 300);
		fr.setLayout(null);
		fr.setVisible(true);
		
	}
	   
   });
   
   
   b6 = new JButton("LogOut");
   b6.setBounds(0, 320, 200, 30);
   b6.setFont(new Font("Tahoma", Font.BOLD, 14));
   b6.addActionListener(e3 ->{
	   frm.dispose();
	   f.setVisible(true);
   });
   
   b7 = new JButton("Exit");
   b7.setBounds(0, 360, 200, 30);
   b7.setFont(new Font("Tahoma", Font.BOLD, 14));
   b7.addActionListener(e4 ->{
	   System.exit(0);
   });
   
   JButton b8 = new JButton("Pay Loan");
   b8.setBounds(220, 120, 200, 30);  // Deposit ile aynı Y, sağ tarafa X kaydırıldı
   b8.setFont(new Font("Tahoma", Font.BOLD, 14));
   b8.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           if (activeLoan > 0) {
               String input = JOptionPane.showInputDialog(frm, "Enter amount to pay:");
               if (input != null) {
                   try {
                       int payAmount = Integer.parseInt(input);
                       if (payAmount > 0 && payAmount <= activeLoan) {
                           activeLoan -= payAmount; 
                           b += payAmount;     
                           ll3.setText("Your credit limit is : " + b + " TL");
                           JOptionPane.showMessageDialog(frm, "Payment successful!\nRemaining Loan: " + activeLoan + " TL");
                       } else {
                           JOptionPane.showMessageDialog(frm, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
                       }
                   } catch (NumberFormatException ex) {
                       JOptionPane.showMessageDialog(frm, "Please enter a number!", "Error", JOptionPane.ERROR_MESSAGE);
                   }
               }
           } else {
               JOptionPane.showMessageDialog(frm, "No active loan to pay!", "Info", JOptionPane.INFORMATION_MESSAGE);
           }
       }
   });
   
JLabel timeLabel = new JLabel();
timeLabel.setBounds(250, 430, 300, 30); 

new javax.swing.Timer(1000, new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        java.util.Date now = new java.util.Date();
        timeLabel.setText(now.toString()); 
    }
}).start();





frm.getContentPane().setBackground(Color.LIGHT_GRAY);
   frm.add(ll1);
   frm.add(ll2);
   frm.add(ll3);
   frm.add(b1);
   frm.add(b2);
   frm.add(b3);
   frm.add(b4);
   frm.add(b5);
   frm.add(b6);
   frm.add(b7);
   frm.add(b8);
   frm.add(timeLabel);
   frm.setSize(500, 500);
   frm.setLayout(null);
   frm.setVisible(true);
	} else {
	          JOptionPane.showMessageDialog(f, "WRONG INFO!!!", "Error", JOptionPane.ERROR_MESSAGE);
	                }
				}
		
			});
		
		JLabel timeLabel = new JLabel();
		timeLabel.setBounds(170, 330, 400, 30); 

		new javax.swing.Timer(1000, new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        java.util.Date now = new java.util.Date();
		        timeLabel.setText(now.toString()); 
		    }
		}).start();
		
		
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(pf1);
		f.add(btn);
		f.add(ch1);
		f.add(timeLabel);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
