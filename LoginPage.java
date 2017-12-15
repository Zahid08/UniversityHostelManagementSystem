import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*; 
import java.sql.*;
 //package

class LoginPage extends JFrame implements ActionListener{  //inheritence
	JLabel name;
	JLabel headline;
	ButtonGroup bg;
	JLabel username,password;
	JTextField usernameTextfield;
	JPasswordField passwordTextfield;
	JButton  loginButn;
	JRadioButton  adminradiobtn,userrediobtn;
	LoginPage(){    //constructor
		
		//image
		ImageIcon logo = new ImageIcon("E:\\MumuProject\\Image\\Logo.jpg");
       JLabel logolebel = new JLabel(logo);
		logolebel.setBounds(750,02,200,200);
       this.add(logolebel);
		
		adminradiobtn=new JRadioButton("Admin");
		adminradiobtn.setBounds(810,320,70,30);
		this.add(adminradiobtn);
		
		userrediobtn=new JRadioButton("User");
		userrediobtn.setBounds(890,320,70,30);
		this.add(userrediobtn);
		
		name=new JLabel("-->>***Welcome To University Hostel Management System***>>--");
		Font myFont = new Font("Serif", Font.BOLD, 22);
		name.setBounds(70,05,600,50); //(x,y,weidth,hight)
		name.setForeground(Color.white); //color
		name.setFont(myFont);
        this.add(name);
		
		//login headline
		headline=new JLabel("Sign in with your valid ID:--");
		headline.setBounds(710,160,300,50);
		headline.setForeground(Color.white); //color
		headline.setFont(myFont);
		this.add(headline);
		
		//name
			Font F1 = new Font("Serif", Font.BOLD, 17);
		username=new JLabel("User Name:"); 
		username.setBounds(710,220,90,50);
		username.setFont(F1);
		this.add(username);
		
		//nametext
		usernameTextfield=new JTextField();
		usernameTextfield.setBounds(800,230,170,25);
		 usernameTextfield.setToolTipText("Enter your Name"); 
		this.add(usernameTextfield);
		
		//password
			
		password=new JLabel("Password:");
		password.setBounds(710,255,90,50);
		 password.setToolTipText("Enter your Password"); 
		password.setFont(F1);
		this.add(password);
		
		//passwordtext
		passwordTextfield=new JPasswordField();
		passwordTextfield.setBounds(800,270,170,25);
		this.add(passwordTextfield);
		
		//login button
		  loginButn=new JButton("Login");
		loginButn.setBounds(880,400,70,30);
		loginButn.addActionListener(this);
		this.add(loginButn);
		
		//image
		ImageIcon image = new ImageIcon("E:\\MumuProject\\Image\\Hotel.jpg");
       JLabel imagelabel = new JLabel(image);
		imagelabel.setBounds(5,60,700,400);
       this.add(imagelabel);
	   
	   	bg=new ButtonGroup();
		bg.add(adminradiobtn);
		bg.add(userrediobtn);
	
	this.getContentPane().setBackground(Color.gray);
        this.setSize(1020,520);
        this.setLayout(null);
        this.setVisible(true);
        
	}
	public void actionPerformed(ActionEvent e){
		String get = null;
		String get1=null;
		if(e.getSource()==loginButn){
		
			if(adminradiobtn.isSelected())
			{
				get = "Admin";
			}
			else if(userrediobtn.isSelected())
			{
				get1 = "User";
			}
			
			String u1=usernameTextfield.getText();
			String u2=passwordTextfield.getText();
			String u3=get;
				String u4=get1;
			 
		try{
			System.out.println("actionPerformed successfully");
			Class.forName("com.mysql.jdbc.Driver");//use to register driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement","root","");//conction  estabilished to database
			Statement stmt = con.createStatement();//conection interface
			String query="SELECT username,password,type FROM user ";
			ResultSet rs=stmt.executeQuery(query);
			
			int flag=0;
			while(rs.next()){
				if(rs.getString(1).equals(u1) && rs.getString(2).equals(u2) && rs.getString(3).equals(u3)) {
		
					flag=0;
				JOptionPane.showMessageDialog(this,"Successfully Login!");
				new Adminpage();
				this.setVisible(false);
				break;
				}
				else if(rs.getString(1).equals(u1) && rs.getString(2).equals(u2) && rs.getString(3).equals(u4)) { 
					JOptionPane.showMessageDialog(null,"Succesfully log in");
				new Typeofcontent();
                 this.setVisible(false);
				}
				
				}
				con.close();//interface close


			}
			catch(Exception exp){};}
	}
	public static void main(String arg[]){
		new LoginPage();
	}
}
