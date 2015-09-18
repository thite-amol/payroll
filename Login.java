import java.awt.*;
//import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
 JLabel l1,l2,l3;
   JTextField t1;
   JButton b1,b2;
   JPasswordField t2;
   ImageIcon img;
   
 Connection cn;
     Statement st;
     ResultSet rs;

    Login()
{

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   JDesktopPane jdp=new JDesktopPane();
	
Toolkit kit = Toolkit.getDefaultToolkit();
Dimension screenSize = kit.getScreenSize();	
		
setSize(380,200);
setLocation(screenSize.width/3,screenSize.height/3);
setLayout(null);
setResizable(false);

		
l1=new JLabel("User Name :");
l2=new JLabel("Password :");
		
t1= new JTextField(20);
		
t2= new JPasswordField();
		
b1=new JButton("Login");		
b2=new JButton("Exit");


// it adds ToolTip to Button and TextField
		
t2.setToolTipText("Type Password");
b1.setToolTipText("Press to Login");
b2.setToolTipText("Exit");

b1.addActionListener(this);		
b2.addActionListener(this);		

	
    add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(b1);
     add(b2);

       img=new ImageIcon("icons\\lock1.gif");
       l3=new JLabel("",img,JLabel.RIGHT);
		    
        l1.setBounds(20,25,82,25);
        t1.setBounds(120,25,145,25);
       
         l2.setBounds(20,80,82,25); 
        t2.setBounds(120,80,145,25);
       
         b1.setBounds(80,125,80,35);
       
        b2.setBounds(180,125,80,35);
        l3.setBounds(278,20,99,99);
		
      add(l3);
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
         JOptionPane.showMessageDialog(this,"Error is" +ex);
             } 
 }//constructor
public void actionPerformed(ActionEvent ae)
 {
   try
   {
    if(ae.getSource()==b1)
    { 
     if(t1.getText().trim().length()==0)
     {
        JOptionPane.showMessageDialog(this,"Enter Username");
        t1.requestFocus();
        return;
     }
     if(t2.getText().trim().length()==0)
     {
       JOptionPane.showMessageDialog(this,"Enter Password");
        t2.requestFocus();
       return;
      }
              rs=st.executeQuery("select password from login where username='"+t1.getText().trim()+"'");
         // System.out.println("User name taken");
    if(rs.next())
    {
       if(rs.getString(1).equals(t2.getText()))
       {
         //JOptionPane.showMessageDialog(this,"Welcome");
          
            b1.setEnabled(false);
            this.setVisible(false);
             new Home();             
       }
       else                
       {
         	JOptionPane.showMessageDialog(this,"Invalid Password");   
          
     }
    }
    else
    {
       JOptionPane.showMessageDialog(this,"Invalid username");
    }
          }        
        else
         if(ae.getSource()==b2)
          {
           if(rs!=null) rs.close();
           if(st!=null) st.close();
           if(cn!=null) cn.close();
           dispose();
          }
       }
      catch(SQLException ex)
     {
      JOptionPane.showMessageDialog(this,"Error is"+ex);
     }
}
public static void main(String ...args)
 { 
   Login al=new Login();
  }
}
