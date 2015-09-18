import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.sql.*;
import java.io.*;


public class Newpass extends JInternalFrame implements ActionListener
{
   JLabel l1,l2,l3,l4;
   JPasswordField ps1,ps2,ps3;
   JTextField t1;
   JButton b1,b2;
   JPanel jp=new JPanel();

      Connection cn;
      Statement st;
      ResultSet rs;

   Newpass ()
{
     setSize(350,280);
     setLocation(500,80);
    setResizable(false);
      setTitle("Change Password");


     l1=new JLabel ("UserName");
     l2=new JLabel("Enter Old password");
     l3=new JLabel ("Enter new password");
     l4=new JLabel ("Confirm the password");
     		
     t1=new JTextField(20);
     ps1=new JPasswordField(20);
     ps2=new JPasswordField(20);
     ps3=new JPasswordField(20);
	
     b1=new JButton("Change Password");
     b2=new JButton("Cancel");
     	
      t1.setToolTipText("Enter UserName");
      ps1.setToolTipText("Enter Old Password");
      ps2.setToolTipText("Enter new password");
      ps3.setToolTipText("Confirm the password");
      b1.setToolTipText("Press to change Password");
      b2.setToolTipText("Press to cancle");
		
	
      b1.addActionListener(this);
      b2.addActionListener(this);

      jp=new JPanel();
      jp.setLayout(null);
     
      jp.add(l1);
      jp.add(t1);
      jp.add(l2);
      jp.add(ps1);
      jp.add(l3);
      jp.add(ps2);
      jp.add(l4);
      jp.add(ps3);
      jp.add(b1);
      jp.add(b2);

      l1.setBounds(30,15,130,30);
      l2.setBounds(30,60,130,30);
      l3.setBounds(30,105,130,30);
      l4.setBounds(30,150,130,30);
         
      t1.setBounds(180,15,130,25);
      ps1.setBounds(180,60,130,25);
      ps2.setBounds(180,105,130,25);
      ps3.setBounds(180,150,130,25);
      b1.setBounds(40,200,140,25);
      b2.setBounds(190,200 ,120,25);
     
      System.out.println("Main");    
	
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
              JOptionPane.showMessageDialog(this,"Enter user name");
               t1.requestFocus();
               return;
            }
            if(ps1.getText().trim().length()==0)
           {
              JOptionPane.showMessageDialog(this,"Enter current password");
               ps1.requestFocus();               return;
            }
            if(ps2.getText().trim().length()==0)
           {
              JOptionPane.showMessageDialog(this,"Enter new  password");
                           ps2.requestFocus();   return;
            }
            if(ps3.getText().trim().length()==0)
           {
              JOptionPane.showMessageDialog(this,"Enter new password");
                           ps3.requestFocus();   return;
            }
           try
           {
          cn.setAutoCommit(false);
         Statement st=cn.createStatement();
     ResultSet rs=st.executeQuery("Select password from Login where username='"+t1.getText()+"'");
      if(rs.next())
      {
        if(rs.getString(1).equals(ps1.getText()))
          { 

             if(ps2.getText().equals(ps3.getText()))
             {
                    Statement st1=cn.createStatement();           
                     int t=st1.executeUpdate("update Login set password='"+ps2.getText()+"' where username='"+t1.getText()+"'");
      int k=JOptionPane.showConfirmDialog(this,"Do you want to save changes?","Confirmation",JOptionPane.YES_NO_OPTION);
           if(k==0)
           {
            cn.commit();
          
            JOptionPane.showMessageDialog(this,"Password is updated");}
            else
             cn.rollback();
              }
              else
          JOptionPane.showMessageDialog(this,"New Password should be same");
        }        
           
           else
         JOptionPane.showMessageDialog(this,"Invalid Password");
      }
      else
       JOptionPane.showMessageDialog(this,"Invalid username");
      }    
   
   
            catch(Exception e)
           {
              JOptionPane.showMessageDialog(this,""+e);  
           }
        }
        else
        if(ae.getSource()==b2)
       {
         dispose();
        }

  }
  public static void main(String args[])
 {
   new Newpass();
 }
}