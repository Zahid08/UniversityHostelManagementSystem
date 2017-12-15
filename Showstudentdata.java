import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Showstudentdata extends JFrame implements  ActionListener{   
	JTable detailsTable;
	JTextField deltsearch;
    Showstudentdata(){
deltsearch=new JTextField();
		Object rowData[][] =new Object[40][19];
		Object columnNames [] = { "Name", "Id","Phone_no","Email","Gender","Nation_Id","Fathername","Mothername","Seat_no","Building_no","Fllor_no","Amount"};
	//	 model=new DefaultTableModel(rowData,columnNames
		try {
            Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement","root","");
            Statement stmt = con.createStatement();
                                    
          //  String query = "SELECT Name,Id,Phone_no,Email,Gender,Nation_Id,FatherName,MotherName,SeatNo,buildingNo,FloorNo,Amount FROM studentregistration ";           
String query="select * from  StudentRegistration"    ;       
			ResultSet rs = stmt.executeQuery(query);             
            
            for(int i=0;rs.next();++i){
         
		 rowData[i][0] = rs.getString("Name");
         rowData[i][1] = rs.getString("Id");
        rowData[i][2] = rs.getString("Phone_no");
		rowData[i][3] = rs.getString("Email");
		rowData[i][4] = rs.getString("Gender");
		rowData[i][5] = rs.getString("National_Id");
		rowData[i][6] = rs.getString("FatherName");
		rowData[i][7] = rs.getString("Mothername");
				rowData[i][8] = rs.getString("SeatNo");
				rowData[i][9] = rs.getString("BuildinNo");
				rowData[i][10] = rs.getString("Floor");
				rowData[i][11] = rs.getString("Ammount");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ShowAll_Information");
        }
        
        detailsTable = new JTable(rowData, columnNames);
        JScrollPane pnl = new JScrollPane(detailsTable);
        this.getContentPane().setBackground(Color.gray);
	this.getContentPane().add(pnl);
	
	this.getContentPane().add(deltsearch);
	//this.getContentPane().add(delete);
        
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(900, 400);
        this.setVisible(true);
    }
	
	public void actionPerformed(ActionEvent e){
		//if(e.getSource()==regstudentBtn){
			
		//	}
	}
	

public static void main(String[] args){
		new Showstudentdata();
	}


}
