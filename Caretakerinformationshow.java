import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Caretakerinformationshow extends JFrame implements  ActionListener{   
	   JTable detailsTable;
	   JTextField deltsearch;
    Caretakerinformationshow(){
        deltsearch=new JTextField();
		Object rowData[][] =new Object[40][19];
		Object columnNames [] = { "Name", "Id","Phone_no","Address","Gender","Salary","Nationalid","permanetaddress","Admitdate"};
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement","root","");
            Statement stmt = con.createStatement();
            String query="select * from  caretaker"    ;       
			ResultSet rs = stmt.executeQuery(query);                    
            for(int i=0;rs.next();++i){
         	rowData[i][0] = rs.getString("Name");
        rowData[i][1] = rs.getString("Id");
        rowData[i][2] = rs.getString("phoneno");
		rowData[i][3] = rs.getString("address");
		rowData[i][4] = rs.getString("gender");
		rowData[i][5] = rs.getString("salary");
		rowData[i][6] = rs.getString("Nationalid");
		rowData[i][7] = rs.getString("permanentaddress");
		rowData[i][8] = rs.getString("admitdate");
	
            }           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ShowAll_Information");
        }
        
        detailsTable = new JTable(rowData, columnNames);
        JScrollPane pnl = new JScrollPane(detailsTable);
        this.getContentPane().setBackground(Color.gray);
	    this.getContentPane().add(pnl);	
	    this.getContentPane().add(deltsearch); 
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(900, 400);
        this.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e){
		
	}
public static void main(String[] args){
		new Caretakerinformationshow();
	}
}
