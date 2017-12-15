import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Typeofcontent extends JFrame  implements ActionListener {
	
	JButton newJButton,oldJButton,regstudentBtn,paymentBtn,Logout;
	JLabel selcteventJLabel;
	
	public Typeofcontent(){
	   
	   JLabel name=new JLabel("-->>***PLEASE CHOICE YOUR SECTION***>>--");
		Font F1 = new Font("Serif", Font.BOLD, 22);
		name.setBounds(70,05,600,50); //(x,y,weidth,hight)
		name.setForeground(Color.gray); //color
		name.setFont(F1);
        this.add(name);
	   
	     Logout=new JButton("Logout");
	   Logout.setBounds(700,20,100,40);
	   this.add(Logout);
		 Logout.addActionListener(this);
		
	   //image
		ImageIcon logo = new ImageIcon("E:\\MumuProject\\Image\\Back.jpg");
       JLabel logolebel = new JLabel(logo);
		logolebel.setBounds(25,60,700,400);
         this.add(logolebel);
	   
	   
	   ImageIcon studentLogo = new ImageIcon("E:\\MumuProject\\Image\\11.jpg");
           ImageIcon Registrationlogo = new ImageIcon("E:\\MumuProject\\Image\\12.jpg");
		 ImageIcon Paymentlogo = new ImageIcon("E:\\MumuProject\\Image\\payment.jpg");
           ImageIcon Cokkerlogo = new ImageIcon("E:\\MumuProject\\Image\\cokker.jpg");
		
	   Font myFont = new Font("Serif", Font.BOLD, 20);
		newJButton=new JButton(studentLogo);//create instance of JButton
		oldJButton=new JButton(Cokkerlogo);
		regstudentBtn=new JButton(Registrationlogo);//create instance of JButton
		paymentBtn=new JButton(Paymentlogo);
		newJButton.setFont(myFont);
		oldJButton.setFont(myFont);
		regstudentBtn.setFont(myFont);
		paymentBtn.setFont(myFont);
		selcteventJLabel=new JLabel();

		//setBounds seting  x,y,width,height;
		selcteventJLabel.setBounds(130,100,250,30);
		newJButton.setBounds(60,90,220,120);
		oldJButton.setBounds(60,250,220,120);
		regstudentBtn.setBounds(390,90,330,110);
		paymentBtn.setBounds(400,250,220,120);
	
		selcteventJLabel.setText("SELECT THE EVENT FOR EACH CATAGORY ");
	
		this.add(selcteventJLabel);
		this.add(newJButton);	
		this.add(oldJButton);
		this.add(regstudentBtn);	
		this.add(paymentBtn);
	
		//Actionlistener 
		newJButton.addActionListener(this);
		oldJButton.addActionListener(this);
		regstudentBtn.addActionListener(this);
		paymentBtn.addActionListener(this);
		
		//window set width height,visibility making
		this.setTitle("Catagory Each Patient");
		
		this.setSize(800,520);
        this.setLayout(null);
        this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==regstudentBtn){
			
			JOptionPane.showMessageDialog(this, "Welcome to Registration page");
		new Registration();
                        this.setVisible(false);
			}
		else if(e.getSource()==newJButton){
			
			JOptionPane.showMessageDialog(this, "Welcome to Student Page");
		new Oldstudent();
                        this.setVisible(false);
			}
			
			else if(e.getSource()==oldJButton){
			
			JOptionPane.showMessageDialog(this, "Welcome to Cooker Page");
		new Cooker();
                        this.setVisible(false);
			}
			else if(e.getSource()==paymentBtn){
			
			JOptionPane.showMessageDialog(this, "Welcome to Payment Page");
		     new Payment();
             this.setVisible(false);
			}
			else if(e.getSource()==Logout){
			
			JOptionPane.showMessageDialog(this, "Go to Login page");
		      new LoginPage();
		this.setVisible(false);
                        //this.setVisible(false);
			}
			
	}
	
	public static void main(String[] args){
		new Typeofcontent();
		}
	
}