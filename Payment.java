import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.sql.*;

import javax.swing.border.LineBorder;
public class Payment extends JFrame  implements ActionListener{
	JTextField searhTextfield,amounttext;
	JButton searchbtn,Paymentvtn,homeBtn;
	JLabel[] allLabel;
	JLabel logolabel;
	JLabel Header;
	JComboBox paymentdateJComboBox;
	//JLabel ageJLabel;
	Payment(){
		 Font myFont = new Font("Serif", Font.BOLD, 22);
		ImageIcon home = new ImageIcon("E:\\MumuProject\\Image\\Homepage.jpg");
		ImageIcon pay = new ImageIcon("E:\\MumuProject\\Image\\P1.jpg");  
		logolabel=new JLabel(pay);
		logolabel.setBounds(400,60,120,400);
		this.add(logolabel);
		
		
		allLabel=new JLabel[10];
		allLabel[0]=new JLabel("Name:");
		allLabel[0].setFont(myFont);
		allLabel[0].setBounds(50,90,70,30);
		this.add(allLabel[0]);
		
		searhTextfield=new JTextField();
		searhTextfield.setFont(myFont);
		searhTextfield.setBounds(130,65,150,30);
		this.add(searhTextfield);
		
		Header=new JLabel("**Welcome to payment Slip**");
		Header.setFont(myFont);
		Header.setBounds(130,20,350,30);
		this.add(Header);
		
		searchbtn=new JButton("Search");
		//searchbtn.setFont(myFont);
		searchbtn.setBounds(280,65,90,30);
		this.add(searchbtn);
		
		Paymentvtn=new JButton("Payment");
		//searchbtn.setFont(myFont);
		Paymentvtn.addActionListener(this);
		Paymentvtn.setBounds(170,380,100,50);
		this.add(Paymentvtn);
		searchbtn.addActionListener(this);
		
		homeBtn=new JButton(home);
		//searchbtn.setFont(myFont);
		homeBtn.addActionListener(this);
		homeBtn.setBounds(05,02,90,50);
		this.add(homeBtn);
		
		allLabel[1]=new JLabel("Id:");
		allLabel[1].setFont(myFont);
		allLabel[1].setBounds(50,140,70,30);
		this.add(allLabel[1]);
		
		allLabel[2]=new JLabel("Floor:");
		allLabel[2].setFont(myFont);
		allLabel[2].setBounds(50,190,70,30);
		this.add(allLabel[2]);
		
		
		allLabel[3]=new JLabel();
	  	allLabel[3].setBorder(new LineBorder(new Color(0,0,0),1)); //colouring line border thickness 1 and colour code
		allLabel[3].setBounds(130,100,150,25);
		this.add(allLabel[3]);
		
		allLabel[4]=new JLabel();
	  	allLabel[4].setBorder(new LineBorder(new Color(0,0,0),1)); //colouring line border thickness 1 and colour code
		allLabel[4].setBounds(130,150,150,25);
		this.add(allLabel[4]);
		
		allLabel[5]=new JLabel();
	  	allLabel[5].setBorder(new LineBorder(new Color(0,0,0),1)); //colouring line border thickness 1 and colour code
		allLabel[5].setBounds(130,200,150,25);
		this.add(allLabel[5]);
		
		allLabel[6]=new JLabel("Amount:");
		allLabel[6].setFont(myFont);
		allLabel[6].setBounds(30,250,90,30);
		this.add(allLabel[6]);
		
		allLabel[7]=new JLabel("Payment_date:");
		allLabel[7].setFont(myFont);
		allLabel[7].setBounds(10,300,140,30);
		this.add(allLabel[7]);
		
		
		amounttext=new JTextField();
		amounttext.setBounds(130,250,150,25);
		this.add(amounttext);
		
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
		paymentdateJComboBox=new JComboBox();
		paymentdateJComboBox.addItem(sd.format(date));
		paymentdateJComboBox.setBounds(170,300,100,40);
		this.add(paymentdateJComboBox);
		
		
       this.setSize(600,520);
       this.setLayout(null);
       this.setVisible(true);
	
		
	}
	
	public void actionPerformed(ActionEvent e){
String StudentId= searhTextfield.getText();	    
		if(e.getSource()==searchbtn){
			 try {
				Class.forName("com.mysql.jdbc.Driver");  //Driver setup
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", ""); //Driver conection
				Statement stmt = con.createStatement();  
				ResultSet    rs =  stmt.executeQuery("SELECT * FROM studentregistration WHERE  Id= '"+StudentId+"'");    
				while(rs.next())
				{
					String pName = rs.getString("Name");
					String pNo = rs.getString("Id");
                  String Fllor = rs.getString("Floor");
					
					
					allLabel[3].setText(pName);
					allLabel[4].setText(pNo);
					allLabel[5].setText(Fllor);
					//ageJLabel.setText(page);
					//releaseJLabel[6].setText(prelease);
					
				}
				con.close();
            
            
        }		 catch (Exception ex) {
					JOptionPane.showMessageDialog(this, "Error ocure");
				}
		}
		
		else if(e.getSource()==Paymentvtn){
			
			String query1="";
			//String name= amount.getText();
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement  stmt = con.createStatement();
				 query1= "UPDATE studentregistration  SET Ammount='"+amounttext.getText()+"' WHERE Id= '"+searhTextfield.getText()+"' " ;
				stmt.execute(query1);
				JOptionPane.showMessageDialog(this, "Succesfully Payment-take print");
			
			 }
			catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Wrong Selected");		
			}
		
			}
		else if(e.getSource()==homeBtn){
			
			JOptionPane.showMessageDialog(this, "Welcome to Home  Page");
		        new Typeofcontent();
                        this.setVisible(false);
		
			}
			
	}
	public static void main(String arg[]){
		new Payment();
	}
}