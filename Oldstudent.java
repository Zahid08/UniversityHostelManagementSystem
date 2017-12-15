import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class Oldstudent extends JFrame implements ActionListener {//inherit Jframe actionlstener which is interface and action event class
		JLabel[] releaseJLabel;
	    JLabel[] informationlabel;
		JButton releaseButton,serchidButton,Updatebtn;   //insatnce veriable
		JComboBox releasedateJComboBox;
		JCheckBox newJCheckBox1,newJCheckBox2;
		ButtonGroup bg1;
		JLabel ageJLabel;
		JLabel wordnoJLabel,nameJLabel,p1;
		JTextField srchidJTextfield;
	    JButton homebtn,Deletebtn,showbtn;
		JTextField[] registrationJTextField; 
	public Oldstudent() {
		ImageIcon image = new ImageIcon("E:\\MumuProject\\Image\\search.jpg");
		ImageIcon R1 = new ImageIcon("E:\\MumuProject\\Image\\release.jpg");
		ImageIcon U1 = new ImageIcon("E:\\MumuProject\\Image\\update.jpg");
		ImageIcon home = new ImageIcon("E:\\MumuProject\\Image\\Homepage.jpg");
		ImageIcon D1 = new ImageIcon("E:\\MumuProject\\Image\\delete.jpg");
		ImageIcon S1 = new ImageIcon("E:\\MumuProject\\Image\\show1.jpg");
		Font myFont = new Font("Serif", Font.BOLD, 22);
		
		registrationJTextField=new  JTextField[15]; 
		registrationJTextField[0]=new JTextField();
		registrationJTextField[1]=new JTextField();
		registrationJTextField[2]=new JTextField();
		registrationJTextField[3]=new JTextField();
	    registrationJTextField[4]=new JTextField();
		registrationJTextField[5]=new JTextField();
		registrationJTextField[6]=new JTextField();
		registrationJTextField[7]=new JTextField();
		registrationJTextField[8]=new JTextField();
		
		registrationJTextField[0].setBounds(350,70,200,30);
		this.add(registrationJTextField[0]);
		registrationJTextField[1].setBounds(350,120,200,30);
		this.add(registrationJTextField[1]);
		registrationJTextField[2].setBounds(350,170,200,30);
		this.add(registrationJTextField[2]);
		registrationJTextField[3].setBounds(350,220,200,30);
		this.add(registrationJTextField[3]);
		this.add(registrationJTextField[4]);
		registrationJTextField[4].setBounds(350,270,200,30);
		this.add(registrationJTextField[2]);
		registrationJTextField[5].setBounds(350,320,200,30);
		this.add(registrationJTextField[5]);
		registrationJTextField[6].setBounds(350,370,200,30);
		this.add(registrationJTextField[6]);
		this.add(registrationJTextField[7]);
		registrationJTextField[7].setBounds(350,420,200,30);
		this.add(registrationJTextField[7]);
		registrationJTextField[8].setBounds(350,470,200,30);
		this.add(registrationJTextField[8]);
		
		
		informationlabel=new JLabel[20];
		informationlabel[0]=new JLabel(":Name");
		informationlabel[1]=new JLabel(":ID");
		informationlabel[2]=new JLabel(":Phone_no");
		informationlabel[3]=new JLabel(":Email");
	    informationlabel[4]=new JLabel("Gender");
		informationlabel[5]=new JLabel(":National_id");
		informationlabel[6]=new JLabel(":Father name");
		informationlabel[7]=new JLabel(":Mother name");
		informationlabel[8]=new JLabel(":Seat no");
		
		informationlabel[0].setBounds(550,70,200,30);
		informationlabel[0].setFont(myFont);
		this.add(informationlabel[0]);
		informationlabel[1].setBounds(550,120,200,30);
		informationlabel[1].setFont(myFont);
		this.add(informationlabel[1]);
		informationlabel[2].setBounds(550,170,200,30);
		informationlabel[2].setFont(myFont);
		this.add(informationlabel[2]);
		informationlabel[3].setFont(myFont);
		informationlabel[3].setBounds(550,220,200,30);
		this.add(informationlabel[3]);
		this.add(informationlabel[4]);
		informationlabel[4].setFont(myFont);
		informationlabel[5].setFont(myFont);
		informationlabel[6].setFont(myFont);
		informationlabel[7].setFont(myFont);
		informationlabel[8].setFont(myFont);
		informationlabel[4].setBounds(550,270,200,30);
		this.add(informationlabel[2]);
		informationlabel[5].setBounds(550,320,200,30);
		this.add(informationlabel[5]);
		informationlabel[6].setBounds(550,370,200,30);
		this.add(informationlabel[6]);
		this.add(informationlabel[7]);
		informationlabel[7].setBounds(550,420,200,30);
		this.add(informationlabel[7]);
		informationlabel[8].setBounds(550,470,200,30);
		this.add(informationlabel[8]);
        
		//header lebel
		JLabel header=new JLabel("**Update Information::Input Student_Id  >>>");
		header.setForeground(Color.blue);
                header.setFont(myFont);		
		header.setBounds(360,30,400,20);
		this.add(header);
		
		//seach textbox
		srchidJTextfield=new JTextField();
		srchidJTextfield.setBounds(120,30,150,30);
		this.add(srchidJTextfield);
		
		serchidButton=new JButton(image);
		serchidButton.setBounds(260,30,90,30);
		serchidButton.addActionListener(this);
		this.add(serchidButton);
		
		//checking relese or not 
		JLabel isreleasechk=new JLabel("Releasing : ");
		isreleasechk.setBounds(35,390,90,30);
		this.add(isreleasechk);
		ageJLabel=new JLabel();
	  	ageJLabel.setBorder(new LineBorder(new Color(0,0,0),1)); //colouring line border thickness 1 and colour code
		ageJLabel.setBounds(120,220,150,25);
		this.add(ageJLabel);
		
		JLabel relsdate=new JLabel("Gender: ");
		relsdate.setBounds(55,220,100,20);
		this.add(relsdate);
		
		newJCheckBox1=new JCheckBox();
		newJCheckBox1.setBounds(110,390,70,30);
		newJCheckBox1.setText("Yes");
		this.add(newJCheckBox1);
		
		newJCheckBox2=new JCheckBox();
		newJCheckBox2.setBounds(180,390,90,30);
		newJCheckBox2.setText("No");
		this.add(newJCheckBox2);
		
		//grouping
		bg1=new ButtonGroup();
		bg1.add(newJCheckBox1);
		bg1.add(newJCheckBox2);
		
		//label on patient information
		releaseJLabel=new JLabel[10];
		releaseJLabel[1]=new JLabel("Name :");
		releaseJLabel[2]=new JLabel("Student_Id :");
		releaseJLabel[3]=new JLabel("Release:");
		releaseJLabel[4]=new JLabel("Release_Date:");
		releaseJLabel[5]=new JLabel("Release_date:");
		releaseJLabel[5].setBounds(20,270,90,30);
		this.add(releaseJLabel[5]);
		 
		releaseJLabel[6]=new JLabel();
		releaseJLabel[6].setBounds(120,270,100,20);
		releaseJLabel[6].setBorder(new LineBorder(new Color(0,0,0),1)); //colouring line border thickness 1 and colour code
		this.add(releaseJLabel[6]);
		
		//auto date generate
		Date date=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
		releasedateJComboBox=new JComboBox();
		releasedateJComboBox.addItem(sd.format(date));
		releasedateJComboBox.setBounds(150,340,100,20);
		this.add(releasedateJComboBox);
		releaseJLabel[1].setBounds(55,70,70,20);
		releaseJLabel[2].setBounds(35,120,100,20);
		releaseJLabel[3].setBounds(25,180,100,20);
		releaseJLabel[4].setBounds(25,340,100,20);
		this.add(releaseJLabel[1]);
		this.add(releaseJLabel[2]);
		this.add(releaseJLabel[3]);
		this.add(releaseJLabel[4]);
		
		nameJLabel=new JLabel();
		nameJLabel.setBorder(new LineBorder(new Color(0,0,0),1));
		p1=new JLabel(); 
		p1.setBorder(new LineBorder(new Color(0,0,0),1)); 
		wordnoJLabel=new JLabel(); 
		wordnoJLabel.setBorder(new LineBorder(new Color(0,0,0),1));
		nameJLabel.setBounds(120,70,150,25);
		p1.setBounds(120,120,150,25);
		wordnoJLabel.setBounds(120,170,150,25);
		this.add( nameJLabel);
		this.add( p1);
		this.add( wordnoJLabel);
		
		releaseButton=new JButton(R1);
		releaseButton.setBounds(150,470,90,70);
		releaseButton.addActionListener(this);
		this.add(releaseButton);
		
		homebtn=new JButton(home);
		homebtn.setBounds(02,05,90,50);
		homebtn.addActionListener(this);
		this.add(homebtn);
		
		Updatebtn=new JButton(U1);
		Updatebtn.setBounds(700,150,90,70);
		Updatebtn.addActionListener(this);
		this.add(Updatebtn);
		
		Deletebtn=new JButton(D1);
		Deletebtn.setBounds(810,150,90,70);
		Deletebtn.addActionListener(this);
		this.add(Deletebtn);
		
		showbtn=new JButton(S1);
		showbtn.setBounds(700,250,90,50);
		showbtn.addActionListener(this);
		this.add(showbtn);
	
	//window size & title     
        this.setTitle("Releasing_Window");
        this.setLayout(null);
        this.setSize(1000, 610);//width and height 
        this.setVisible(true);
    }

   public void actionPerformed(ActionEvent e)
	{
		String  chkrelease= null;
		String StudentId= srchidJTextfield.getText(); //geting serch textbox value and store in patient no
		if(e.getSource() ==serchidButton)
		{
		 try {
				Class.forName("com.mysql.jdbc.Driver");  //Driver setup
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", ""); //Driver conection
				Statement stmt = con.createStatement();  
				ResultSet    rs =  stmt.executeQuery("SELECT * FROM studentregistration WHERE  Id= '"+StudentId+"'");    
				while(rs.next())
				{
					String pName = rs.getString("Name");
					String pNo = rs.getString("Id");
					String relesing = rs.getString("releasing");
					String page = rs.getString("Gender");
					String phoneno = rs.getString("Phone_no");
		            String email = rs.getString("Email");
	
		            String nationalid = rs.getString("National_Id");
					String fathername = rs.getString("FatherName");
					String mothernanme = rs.getString("Mothername");
					String seatno = rs.getString("SeatNo");
			
					nameJLabel.setText(pName);
					p1.setText(pNo);
					wordnoJLabel.setText(relesing);
					ageJLabel.setText(page);
	
					registrationJTextField[0].setText(pName);
					registrationJTextField[1].setText(pNo);
					registrationJTextField[2].setText(phoneno);
					registrationJTextField[3].setText(email);
					registrationJTextField[4].setText(page);
					registrationJTextField[5].setText(nationalid);
					registrationJTextField[6].setText(fathername);
					registrationJTextField[7].setText(mothernanme);
					registrationJTextField[8].setText(seatno);		
				}
				con.close();     
            
        }		 catch (Exception ex) {
					JOptionPane.showMessageDialog(this, "Error ocure");
				}
			
		}
		       else if(e.getSource() == homebtn){   //U
			JOptionPane.showMessageDialog(this, "Welcome to Home  Page");
		        new Typeofcontent();
                this.setVisible(false);
			}
			 else if(e.getSource() == releaseButton){   //U
			String relese=null;
			 String query1="";
			if(newJCheckBox1.isSelected())  //checking    selected checkbox
			{
				relese = "Yes";
			}
			else if(newJCheckBox2.isSelected())
			{
				relese = "No";
			}	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement  stmt = con.createStatement();
				 query1= "UPDATE studentregistration  SET Releasing='"+relese+"'  WHERE Id= '"+srchidJTextfield.getText()+"' " ;
				stmt.execute(query1);
				JOptionPane.showMessageDialog(this, "Succesfully updated release date and Is_release");
			 }
			catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "ShowAll_Information");		
			}
			
	}
			
			 else if(e.getSource() == Updatebtn){   //U
			 String query1="";
			String name= registrationJTextField[0].getText();
			String Id=registrationJTextField[1].getText();
			String phoneno=registrationJTextField[2].getText();
			String Email=registrationJTextField[3].getText();
			String gender=   registrationJTextField[4].getText();
			String nationalId=registrationJTextField[5].getText();
			String fathername=registrationJTextField[6].getText();
			String mothername=registrationJTextField[7].getText();
			String seatno=registrationJTextField[8].getText();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement  stmt = con.createStatement();
				 query1= "UPDATE studentregistration  SET Name='"+name+"',Id='"+Id+"',Phone_no='"+phoneno+"',Email='"+Email+"',Gender='"+gender+"',National_Id='"+nationalId+"',FatherName='"+fathername+"',Mothername='"+mothername+"',SeatNo='"+seatno+"'  WHERE Id= '"+srchidJTextfield.getText()+"' " ;
				stmt.execute(query1);
				JOptionPane.showMessageDialog(this, "Succesfully updated2");
	
			 }
			catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "ShowAll_Information");		
			}
			
			}
			
			else if(e.getSource() == Deletebtn){ 
				String deleteName=srchidJTextfield.getText();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "");
				Statement stmt = con.createStatement();
				String sql = "DELETE FROM  studentregistration  WHERE  Id='"+deleteName+"'";
				stmt.executeUpdate(sql);
			
				JOptionPane.showMessageDialog(this,"Deleted 1 Row Succesfully !");
				}
			
				catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "ShowAll_Information");}
		}
				else if(e.getSource() == showbtn){ 
				new Showstudentdata();
				}
			
}
    
    public static void main(String args[]) {
        new Oldstudent();
    }
}
