import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Floor extends JFrame implements  ActionListener{   
	JTable detailsTable;
	JTextField deltsearch;
    Floor(){
         deltsearch=new JTextField();
		Object rowData[][] =new Object[40][9];
		Object columnNames [] = { "Floor1", "Floor2","Floor3","Floor4","Floor5","Floor6","Floor7","Floor8"};
	
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectfinal", "root", "");
            Statement stmt = con.createStatement();
                                    
            String query = "SELECT Name,patient_no,Word_no,Admitdate,Release_Date,Is_Release,Age,gender FROM patient_word ";           
            ResultSet rs = stmt.executeQuery(query);             
            
            for(int i=0;rs.next();++i){
         
			rowData[i][0] = rs.getString("Floor1");
			rowData[i][1] = rs.getString("Floor2");
			rowData[i][2] = rs.getString("Floor3");
			rowData[i][3] = rs.getString("Floor4");
			rowData[i][4] = rs.getString("Floor5");
			rowData[i][5] = rs.getString("Floor6");
			rowData[i][6] = rs.getString("Fllor7");
			rowData[i][7] = rs.getString("Floor8");
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
			this.setSize(600, 400);
			this.setVisible(true);
    }
	public void actionPerformed(ActionEvent e){
	}
public static void main(String[] args){
		new Floor();
	}


}
