import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Registration extends JFrame implements ActionListener{
	JLabel[]   registrationlJLabel;        
	ButtonGroup bg;
	JRadioButton registrationJRadioButton,registrationJRadioButton1;       
	JButton[] registrationJButton; 
	JTextField[] registrationJTextField; 
	JTextField     registrationJPasswordField,Seattext ;
	JComboBox BuildigNumberCombobox,FloorCombobox;
	JLabel BldgNumber,floorNumber;
	JTextField amount;
	
	public Registration(){		
		
		//image
		ImageIcon image = new ImageIcon("E:\\MumuProject\\Image\\Homepage.jpg");
		ImageIcon Showfllor = new ImageIcon("E:\\MumuProject\\Image\\Show.jpg");
		ImageIcon s1 = new ImageIcon("E:\\MumuProject\\Image\\submit.jpg");
		Font myFont = new Font("Serif", Font.BOLD, 22);
	   
		registrationlJLabel=new JLabel[15];
		registrationJTextField=new JTextField[10];
		registrationJButton=new JButton[10];
		
		Seattext=new JTextField();
		Seattext.setBounds(150,400,200,30);
		this.add(Seattext);
		
	
		amount=new JTextField();
		amount.setBounds(150,450,200,30);
		this.add(amount);
		
		BuildigNumberCombobox=new JComboBox();
		BuildigNumberCombobox.addItem("Building1");
			BuildigNumberCombobox.addItem("Building2");
				BuildigNumberCombobox.addItem("Building3");
					BuildigNumberCombobox.addItem("Building4");
		BuildigNumberCombobox.setBounds(360,120,150,30);
		this.add(BuildigNumberCombobox);
		
		FloorCombobox=new JComboBox();
		FloorCombobox.setBounds(520,120,150,30);
			FloorCombobox.addItem("Floor1");
				FloorCombobox.addItem("Floor2");
					FloorCombobox.addItem("Floor3");
						FloorCombobox.addItem("Floor5");
							FloorCombobox.addItem("Floor6");
		this.add(FloorCombobox);
		
		BldgNumber=new JLabel("Building_No");
		BldgNumber.setBounds(360,80,150,30);
		BldgNumber.setForeground(Color.gray); //color
		BldgNumber.setFont(myFont);
		this.add(BldgNumber);
		
		floorNumber=new JLabel("Floor_No");
		floorNumber.setBounds(520,80,150,30);
		floorNumber.setForeground(Color.gray); //color
		floorNumber.setFont(myFont);
		this.add(floorNumber);
		
		registrationlJLabel[0]=new JLabel("Please Fill Up The Registration Form :");
		registrationlJLabel[1]=new JLabel("FIRST NAME : ");
		registrationlJLabel[2]=new JLabel("ID : ");
		registrationlJLabel[3]=new JLabel("PHONE NO: ");
		registrationlJLabel[4]=new JLabel("EMAIL: ");
		registrationlJLabel[5]=new JLabel("Gender : ");
		registrationlJLabel[6]=new JLabel("NATIONAL ID : " );
		registrationlJLabel[7]=new JLabel("FATHER NAME: ");
		registrationlJLabel[8]=new JLabel("MOTHER NAME:");
		registrationlJLabel[9]=new JLabel("SEAT_NO:");
		registrationlJLabel[10]=new JLabel("Amount:");
		
		registrationJTextField[0]=new JTextField();
		registrationJTextField[1]=new JTextField();
		registrationJTextField[2]=new JTextField();
		registrationJTextField[3]=new JTextField();
	        registrationJTextField[4]=new JTextField();
		registrationJTextField[5]=new JTextField();
		registrationJPasswordField=new JTextField();
		
		registrationJButton[0]=new JButton(s1);
		registrationJButton[1]=new JButton("Reset");
		registrationJButton[2]=new JButton(image);
		registrationJButton[3]=new JButton(Showfllor);
		registrationJButton[3].addActionListener(this);
		registrationJRadioButton=new JRadioButton();
		registrationJRadioButton1=new JRadioButton();
		registrationlJLabel[0].setBounds(135,20,400,30);
		registrationlJLabel[0].setForeground(Color.white); //color
		registrationlJLabel[0].setFont(myFont);
		this.add(registrationlJLabel[0]);
		registrationlJLabel[1].setBounds(50,80,90,30);
		this.add(registrationlJLabel[1]);
		registrationlJLabel[2].setBounds(105,120,70,30);
		this.add(registrationlJLabel[2]);
		registrationlJLabel[3].setBounds(60,160,70,30);
		this.add(registrationlJLabel[3]);
		registrationlJLabel[4].setBounds(80,200,70,30);
		this.add(registrationlJLabel[4]);
		registrationlJLabel[5].setBounds(70,240,70,30);
		this.add(registrationlJLabel[5]);
		this.add(registrationlJLabel[4]);
		registrationlJLabel[6].setBounds(30,280,110,30);
		this.add(registrationlJLabel[6]);
		registrationlJLabel[7].setBounds(30,320,90,30);
		this.add(registrationlJLabel[7]);
		registrationlJLabel[8].setBounds(15,360,130,30);
		this.add(registrationlJLabel[8]);
		registrationlJLabel[9].setBounds(50,400,130,30);
		this.add(registrationlJLabel[9]);
		registrationlJLabel[10].setBounds(50,450,130,30);
		this.add(registrationlJLabel[10]);
		
		
		registrationJTextField[0].setBounds(150,80,200,30);
		this.add(registrationJTextField[0]);
		registrationJTextField[1].setBounds(150,120,200,30);
		this.add(registrationJTextField[1]);
		registrationJTextField[2].setBounds(150,160,200,30);
		this.add(registrationJTextField[2]);
		registrationJTextField[3].setBounds(150,200,200,30);
		this.add(registrationJTextField[3]);
		
		registrationJRadioButton.setBounds(150,240,70,30);
		registrationJRadioButton.addActionListener(this);
		registrationJRadioButton.setText("Male");
		this.add(registrationJRadioButton);
		
		registrationJRadioButton1.setBounds(220,240,70,30);
		registrationJRadioButton1.setText("Female");
		registrationJRadioButton1.addActionListener(this);
		this.add(registrationJRadioButton1);
		
		registrationJTextField[4].setBounds(150,280,200,30);
		this.add(registrationJTextField[4]);
		registrationJTextField[5].setBounds(150,320,200,30);
		this.add(registrationJTextField[5]);
		registrationJPasswordField.setBounds(150,360,200,30);
		this.add(registrationJPasswordField);
		
		registrationJButton[0].setBounds(390,250,100,60);
		registrationJButton[0].addActionListener(this);
		this.add(registrationJButton[0]);
		
		registrationJButton[3].setBounds(520,250,100,60);
		//registrationJButton[3].addActionListener(this);
		this.add(registrationJButton[3]);
		
		registrationJButton[1].setBounds(400,450,80,30);
		registrationJButton[1].addActionListener(this);
		this.add(registrationJButton[1]);
		registrationJButton[2].setBounds(02,02,100,60);
	        registrationJButton[2].addActionListener(this);
		this.add(registrationJButton[2]);
		
		this.getContentPane().setBackground(Color.lightGray);
		this.setTitle("Registration");
		this.setLayout(null);
		this.setSize(700,540);
		this.setVisible(true);
		
		bg=new ButtonGroup();
		bg.add(registrationJRadioButton);
		bg.add(registrationJRadioButton1);
	}
	public void actionPerformed(ActionEvent e)
	{
		String gender = null;
		if(e.getSource() ==registrationJButton[0])
		{
			if(registrationJRadioButton.isSelected())
			{
				gender = "Male";
			}
			else if(registrationJRadioButton1.isSelected())
			{
				gender = "Female";
			}
			
			//JOptionPane.showMessageDialog(this,gender);
		
			String name= registrationJTextField[0].getText();
			String n2 = registrationJTextField[1].getText();
			String Phone_no = registrationJTextField[2].getText();
			String Email = registrationJTextField[3].getText();
			String National_Id = registrationJTextField[4].getText();
			String FatherName = registrationJTextField[5].getText();
			String  Mothername =registrationJPasswordField.getText();
			String SeatNo=Seattext.getText();
			String Ammount=amount.getText();
                        String releasing=null;
			//for insert information
			
			try{
				System.out.println("actionPerformed successfully");
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement","root","");
				
				Statement stmt = con.createStatement();
				//stmt.executeUpdate("INSERT INTO Reg where 
				stmt.executeUpdate("INSERT INTO StudentRegistration(Name, Phone_no, Email, Gender, National_Id, FatherName, Mothername, SeatNo, BuildinNo,Floor,Ammount,releasing) VALUES ('"+name+"', '"+Phone_no+"' , '"+Email+"','"+gender+"','"+National_Id+"','"+FatherName+"','"+Mothername+"','"+SeatNo+"','"+BuildigNumberCombobox.getSelectedItem().toString()+"','"+FloorCombobox.getSelectedItem().toString()+"','"+Ammount+"','"+releasing+"')");
				JOptionPane.showMessageDialog(this,"Successfully inserted !");
				con.close();
			}
			catch(Exception exp){ JOptionPane.showMessageDialog(this, "Some Error Occured");}
			
		
		}
		
		else if(e.getSource() == registrationJButton[1] )
		{	
			registrationJTextField[0].setText(null);
			registrationJTextField[1].setText(null);
			registrationJTextField[2].setText(null);
			registrationJTextField[3].setText(null);
			registrationJTextField[4].setText(null);
			registrationJTextField[5].setText(null);
			registrationJPasswordField.setText(null);
			Seattext.setText(null);
			amount.setText(null);
			//gender.setText(null);
			///BuildigNumberCombobox.setText(null);
			//FloorCombobox.setText(null);
		}
		else if(e.getSource()==registrationJButton[2]){
			new Typeofcontent();
		this.setVisible(false);
		}
		
		else if(e.getSource()==registrationJButton[3]){
			new Showstudentdata();
		//this.setVisible(false);
		}
			
	}
	public static void main(String[] args){
		new Registration();
	}
}