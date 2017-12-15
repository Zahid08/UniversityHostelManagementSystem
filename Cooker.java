import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Cooker extends JFrame  implements ActionListener{
		JLabel header,namelabel,iconlebel;
		JTextField nametext;
		JTextField[]  registrationJTextField;
		JCheckBox check;
		ButtonGroup bg;
		JRadioButton newJCheckBox1,newJCheckBox2;
		JRadioButton rtn;
		JLabel[] informationlabel;
		JComboBox releasedateJComboBox;
		JButton btn,Submitbtn,updatebtn,deletebtn,homebtn,showbtn;
	Cooker(){
		ImageIcon home = new ImageIcon("E:\\MumuProject\\Image\\Homepage.jpg");
		ImageIcon icone = new ImageIcon("E:\\MumuProject\\Image\\C1.jpg");
		
        header=new JLabel("-->>>>COOKER INFORMATION-->>>>");
	    Font myFont = new Font("Serif", Font.BOLD, 22);
        header.setFont(myFont);
        header.setBounds(150,20,440,50);
        this.add(header); 
	   
	    iconlebel=new JLabel(icone);
	    iconlebel.setBounds(460,340,300,250);
        this.add(iconlebel); 
	   
	    nametext=new JTextField("s");
	    nametext.setBounds(320,70,220,30);
        this.add(nametext);
	   
	    btn=new JButton("Search");
	    btn.setBounds(530,70,100,30);
        this.add(btn);
		
		Submitbtn=new JButton("Submit");
	    Submitbtn.setBounds(400,200,100,50);
        this.add(Submitbtn);
       
		updatebtn=new JButton("Update");
	    updatebtn.setBounds(400,270,100,50);
        this.add(updatebtn);
       
        deletebtn=new JButton("Delete");
	    deletebtn.setBounds(550,200,100,50);
        this.add(deletebtn);
		  
		showbtn=new JButton("Database");
	    showbtn.setBounds(550,270,100,50);
        this.add(showbtn);
	  
	    homebtn=new JButton(home);
	    homebtn.setBounds(02,01,100,50);
        this.add(homebtn);
	  
	  	homebtn.addActionListener(this);
	    deletebtn.addActionListener(this);
		updatebtn.addActionListener(this);
		Submitbtn.addActionListener(this);
		btn.addActionListener(this);
		showbtn.addActionListener(this);
       
       
	    registrationJTextField=new  JTextField[15]; 
		registrationJTextField[0]=new JTextField("p");
		registrationJTextField[1]=new JTextField("i");
		registrationJTextField[2]=new JTextField("s");
		registrationJTextField[3]=new JTextField("p");
	    // registrationJTextField[4]=new JTextField();
		registrationJTextField[5]=new JTextField("p");
		registrationJTextField[6]=new JTextField("o");
		registrationJTextField[7]=new JTextField("o");
		
		
		registrationJTextField[0].setBounds(50,70,200,30);
		this.add(registrationJTextField[0]);
		registrationJTextField[1].setBounds(50,120,200,30);
		this.add(registrationJTextField[1]);
		registrationJTextField[2].setBounds(50,170,200,30);
		this.add(registrationJTextField[2]);
		registrationJTextField[3].setBounds(50,220,200,30);
		this.add(registrationJTextField[3]);
		registrationJTextField[5].setBounds(50,320,200,30);
		this.add(registrationJTextField[5]);
		registrationJTextField[6].setBounds(50,370,200,30);
		this.add(registrationJTextField[6]);
		this.add(registrationJTextField[7]);
		registrationJTextField[7].setBounds(50,420,200,30);
		this.add(registrationJTextField[7]);
		
       
       
        informationlabel=new JLabel[20];
		informationlabel[0]=new JLabel(":Name");
		informationlabel[1]=new JLabel(":ID");
		informationlabel[2]=new JLabel(":Phone_no");
		informationlabel[3]=new JLabel(":Address:");
	    informationlabel[4]=new JLabel("Gender");
		informationlabel[5]=new JLabel(":Salary");
		informationlabel[6]=new JLabel(":National_id");
		informationlabel[7]=new JLabel(":Permanet location:");
		informationlabel[8]=new JLabel(":Admit Date:");
		
		informationlabel[0].setBounds(250,70,200,30);
		informationlabel[0].setFont(myFont);
		this.add(informationlabel[0]);
		informationlabel[1].setBounds(250,120,200,30);
		informationlabel[1].setFont(myFont);
		this.add(informationlabel[1]);
		informationlabel[2].setBounds(250,170,200,30);
		informationlabel[2].setFont(myFont);
		this.add(informationlabel[2]);
		informationlabel[3].setFont(myFont);
		informationlabel[3].setBounds(250,220,200,30);
		this.add(informationlabel[3]);
		this.add(informationlabel[4]);
		informationlabel[4].setFont(myFont);
		informationlabel[5].setFont(myFont);
		informationlabel[6].setFont(myFont);
		informationlabel[7].setFont(myFont);
		informationlabel[8].setFont(myFont);
		
		informationlabel[4].setBounds(250,270,200,30);
		this.add(informationlabel[2]);
		informationlabel[5].setBounds(250,320,200,30);
		this.add(informationlabel[5]);
		informationlabel[6].setBounds(250,370,200,30);
		this.add(informationlabel[6]);
		this.add(informationlabel[7]);
		informationlabel[7].setBounds(250,420,200,30);
		this.add(informationlabel[7]);
		informationlabel[8].setBounds(250,470,200,30);
		this.add(informationlabel[8]);
		
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
		releasedateJComboBox=new JComboBox();
		releasedateJComboBox.addItem(sd.format(date));
		releasedateJComboBox.setBounds(150,470,100,40);
		this.add(releasedateJComboBox);
		
		
		newJCheckBox1=new JRadioButton();
		newJCheckBox1.setBounds(50,270,60,30);
		//newJCheckBox1.setFont(myFont);
		newJCheckBox1.setText("Male");
		this.add(newJCheckBox1);
		
		newJCheckBox2=new JRadioButton();
		newJCheckBox2.setBounds(110,270,80,30);
		//newJCheckBox2.setFont(myFont);
		newJCheckBox2.setText("Female");
		this.add(newJCheckBox2);
		
		bg=new ButtonGroup();
		bg.add(newJCheckBox1);
		bg.add(newJCheckBox2);
		
        this.setSize(800,640);
        this.setLayout(null);
        this.setVisible(true);
	
		
	}
	
	public void actionPerformed(ActionEvent e){
		String gender = null;
		String  chkrelease= null;
		if(e.getSource()==Submitbtn){	
			if(newJCheckBox1.isSelected())
			{
				gender = "Male";
			}
			else if(newJCheckBox2.isSelected())
			{
				gender = "Female";
			}
			String n1 = registrationJTextField[0].getText();
			String n3 = registrationJTextField[2].getText();
			String n4 = registrationJTextField[3].getText();
			String n5 = registrationJTextField[5].getText();
			String  n6 =registrationJTextField[6].getText();
			String n7= registrationJTextField[7].getText();
			try{
				System.out.println("actionPerformed successfully");
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement","root","");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("INSERT INTO cooker(Name, Phone_no, Address, Gender, Salary, National_id, Permanent_Loacation, Admitdate) VALUES ('"+n1+"', '"+n3+"' , '"+n4+"','"+gender+"','"+n5+"','"+n6+"','"+n7+"','"+releasedateJComboBox.getSelectedItem().toString()+"')");
				JOptionPane.showMessageDialog(this,"Successfully inserted !");
				con.close();
			}
			catch(Exception exp){ JOptionPane.showMessageDialog(this, "Some Error Occured");}
			
		
		}	
		else if(e.getSource()==updatebtn){
			String query1="";
			String name= registrationJTextField[0].getText();
		    String Id=registrationJTextField[1].getText();
		    String phoneno=registrationJTextField[2].getText();
		    String address=registrationJTextField[3].getText();
	  //   String gender=   registrationJTextField[4].getText();
		    String salary=registrationJTextField[5].getText();
		   String nationaldate=registrationJTextField[6].getText();
		   String permanetadress=registrationJTextField[7].getText();
		//String seatno=registrationJTextField[8].getText();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement  stmt = con.createStatement();
				query1= "UPDATE cooker  SET Name='"+name+"',Id='"+Id+"',Phone_no='"+phoneno+"',Address='"+address+"',Salary='"+salary+"',National_id='"+nationaldate+"',Permanent_Loacation='"+permanetadress+"'  WHERE Id= '"+nametext.getText()+"' " ;  
				stmt.execute(query1);
				JOptionPane.showMessageDialog(this, "Succesfully updated2");	
			 }
			catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "ShowAll_Information");		
			}
			}
			else if(e.getSource()==btn){			
			try {
				Class.forName("com.mysql.jdbc.Driver");  //Driver setup
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", ""); //Driver conection
				Statement stmt = con.createStatement();  
				ResultSet    rs =  stmt.executeQuery("SELECT * FROM cooker WHERE  Id= '"+nametext.getText()+"'");    
				while(rs.next())
				{
					String name = rs.getString("Name");
					String id = rs.getString("Id");
					String Phoneno = rs.getString("Phone_no");
					String address = rs.getString("Address");
					String salary  = rs.getString("Salary");
					String nationalid = rs.getString("National_id");
					String permanetadress = rs.getString("Permanent_Loacation");
					String admitdate = rs.getString("Admitdate");
		
					registrationJTextField[0].setText(name);
					registrationJTextField[1].setText(id);
					registrationJTextField[2].setText(Phoneno);
					registrationJTextField[3].setText(address);
                     //registrationJTextField[4].setText(Salary);
					registrationJTextField[5].setText(salary);
					registrationJTextField[6].setText(nationalid);
					registrationJTextField[7].setText(permanetadress);					
				}
				con.close();
        }		
		catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Error ocure");
				}
			}
			
			else if(e.getSource()==deletebtn){
			String deleteName=nametext.getText();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement stmt = con.createStatement();
				String sql = "DELETE FROM  cooker  WHERE  Id='"+deleteName+"'";
				stmt.executeUpdate(sql);
				JOptionPane.showMessageDialog(this,"Deleted 1 Row Succesfully !");
				}
				catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "ShowAll_Information");}
		}
			else if(e.getSource()==homebtn){
			JOptionPane.showMessageDialog(this, "succes");
		new Typeofcontent();
                        this.setVisible(false);
			}
			else if(e.getSource()==showbtn){
		     new Cookerdetails();       	}
	}
	public static void main(String arg[]){
		new Cooker();
	}
}