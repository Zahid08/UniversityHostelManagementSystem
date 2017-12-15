import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Adminpage extends JFrame  implements ActionListener {
	    JButton newJButton,regcartk,Logout;
	    JLabel selcteventJLabel;	
	public Adminpage(){
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
		ImageIcon logo = new ImageIcon("E:\\MumuProject\\Image\\admin.jpg");
        JLabel logolebel = new JLabel(logo);
		logolebel.setBounds(25,60,700,400);
        this.add(logolebel);
	   
	   
	    ImageIcon studentLogo = new ImageIcon("E:\\MumuProject\\Image\\11.jpg");
        ImageIcon Registrationlogo = new ImageIcon("E:\\MumuProject\\Image\\CR.jpg");
		ImageIcon Paymentlogo = new ImageIcon("E:\\MumuProject\\Image\\payment.jpg");
        ImageIcon Cokkerlogo = new ImageIcon("E:\\MumuProject\\Image\\cokker.jpg");
		
	    Font myFont = new Font("Serif", Font.BOLD, 20);
		newJButton=new JButton(studentLogo);//create instance of JButton
		regcartk=new JButton(Registrationlogo);//create instance of JButton
		
		newJButton.setFont(myFont);
		regcartk.setFont(myFont);
		selcteventJLabel=new JLabel();

		//setBounds seting  x,y,width,height;
		selcteventJLabel.setBounds(130,100,250,30);
		newJButton.setBounds(60,160,220,120);
		regcartk.setBounds(390,160,280,110);
		
	
		selcteventJLabel.setText("SELECT THE EVENT FOR EACH CATAGORY ");
		this.add(selcteventJLabel);
		this.add(newJButton);	
		this.add(regcartk);	
		//Actionlistener 
		newJButton.addActionListener(this);
		regcartk.addActionListener(this);
		//window set width height,visibility making
		this.setTitle("Caretaker ");
		this.setSize(800,520);
        this.setLayout(null);
        this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==regcartk){	
			  JOptionPane.showMessageDialog(this, "Welcome to Registration page");
		new Caretaker();
              this.setVisible(false);
			}
		else if(e.getSource()==newJButton){
			
			   JOptionPane.showMessageDialog(this, "Welcome to Student Page");
		       new Showstudentdata();
                    //this.setVisible(false);
	}
			
		else if(e.getSource()==Logout){
			
			      JOptionPane.showMessageDialog(this, "Go to Login page");
		           new LoginPage();
                   this.setVisible(false);
			}
			
			
			
	}
	
	public static void main(String[] args){
		new Adminpage();
		}
	
}