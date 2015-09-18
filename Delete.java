import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.sql.*;
import java.io.*;
public class Delete extends JInternalFrame implements ActionListener
{
  JLabel l1;
  JTextField t1;
  JButton b1,b2;

      Connection cn;
      Statement st;
      ResultSet rs;
      PreparedStatement pst,pst1,pst2,pst3,pst4;
     Delete()
    {
      setSize(350,280);
      setLocation(500,80);
      setResizable(false);
      setTitle("Delete Employee Information");
      l1=new JLabel("Delete Employee By empid");
     		
     t1=new JTextField(20);
     	
     b1=new JButton("Delete");
     b2=new JButton("Cancel");
     	
      t1.setToolTipText("Enter Employee-ID");
      b1.setToolTipText("Press to Delete Employee");
      b2.setToolTipText("Press to Cancel");
		
	
      b1.addActionListener(this);
      b2.addActionListener(this);

    JPanel  jp=new JPanel();
      jp.setLayout(null);
     
      jp.add(l1);
      jp.add(t1);
      jp.add(b1);
      jp.add(b2);

      l1.setBounds(40,15,200,50);
      t1.setBounds(70,80,150,30);
      b1.setBounds(40,175,140,25);
      b2.setBounds(190,175,120,25);
  //    add(jp);
      add(jp,BorderLayout.CENTER);
      setVisible(true); 
        try
           {
               Class.forName("com.mysql.jdbc.Driver");
               System.out.println("Driver Loaded succesfull");      
               cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/payroll","root","root");
               System.out.println("Connection succesfull");      
               st=cn.createStatement();
           }
          catch(Exception ex)
             {
              JOptionPane.showMessageDialog(this,"Error In Database Connection");
             } 
         }

public void actionPerformed(ActionEvent ae)
{

    if(ae.getSource()==b1)
	{
	   if(t1.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Employee-ID");
	   t1.requestFocus();
	    return;
	} 
                 try
                      {

                    pst1=cn.prepareStatement("delete from payslip where empid="+Integer.parseInt(t1.getText()));
                    pst2=cn.prepareStatement("delete from attend where empid="+Integer.parseInt(t1.getText()));
                    pst3=cn.prepareStatement("delete from employeedetails where empid="+Integer.parseInt(t1.getText()));
                    pst4=cn.prepareStatement("delete from employeemaster where empid="+Integer.parseInt(t1.getText()));
                    pst1.execute();
                    pst2.execute();
                    pst3.execute();
                    pst4.execute();
                      JOptionPane.showMessageDialog(this,"Deleted Succefully");
                      }
                       catch(SQLException ex)
                        {
                         JOptionPane.showMessageDialog(this,"Error is"+ex);           
                        }
}
else if(ae.getSource()==b2)
{
   dispose();
 }


    }
         public static void main(String args[])
     {
          new Delete();
     }
}
