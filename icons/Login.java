import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;
import java.io.*;
class Login extends JFrame implements ActionListener
 {
     JLabel l1,l2,l3,msg;
     JTextField t1;
     JPasswordField t2;
     JButton b1,b2;
    
     ImageIcon img;

     Connection cn;
     Statement st;
     ResultSet rs;
     Login()
       {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
         setSize(500,500);
         setTitle("Login");
         setLayout(new FlowLayout());

         l1=new JLabel("Username");    

         l2=new JLabel("Password");

         t1=new JTextField(20);

         t2=new JPasswordField(20);
/*
         b1=new JButton("Login");  
         b1.setBorder(new LineBorder(Color.BLACK,1));
         b1.setForeground(new Color(218,165,32));
         b1.setBackground(new Color(70,100,70));
  */       
       b1=new JButton("Login");
       b1.setBounds(550,200,90,30);
       b1.setBackground(new Color(70,100,70));
       b1.setBorder(new LineBorder(Color.BLACK,1));
       b1.setForeground(new Color(218,165,32));
       b1.addActionListener(this);

           b2=new JButton("Exit");
          b2.setForeground(new Color(218,165,32));
          b2.setBackground(new Color(255,0,0));

         b1.addActionListener(this);
         b2.addActionListener(this);
         JPanel p1=new JPanel();
         JPanel p2=new JPanel();

         msg=new JLabel();
         msg.setFont(new Font("Arial",Font.BOLD,15));
         msg.setForeground(new Color(255,0,0));
         
          img=new ImageIcon("icons\\lock1.gif");
          l3=new JLabel("",img,JLabel.RIGHT);

          p1.setLayout(new GridLayout(4,2,5,5));
          p1.add(l1);  
          p1.add(t1); 
          p1.add(l2); 
          p1.add(t2);
          p1.add(b1);
          p1.add(b2); 
         add(l3);
          
          p2.add(msg);        

          add(p1);
          add(p2);
          try
           {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               System.out.println("Driver Loaded succesfull");      
             cn=DriverManager.getConnection("jdbc:odbc:mydsn","amol","amol");
               System.out.println("Connection succesfull");      
             st=cn.createStatement();
           }
          catch(Exception ex)
             {
         JOptionPane.showMessageDialog(this,"Error is" +ex);
             } 
   }
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
         JOptionPane.showMessageDialog(this,"Welcome");
          b1.setEnabled(false);             
       }
       else                
       {
         //JOptionPane.showMessageDialog(this,"Invalid Password");   
          msg.setText("Incorrect  Username  and  Password Try  Again....");
          //continue;
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