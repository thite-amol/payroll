import java.io.*;
import java.awt.Font.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
class EmployeeInfo extends JInternalFrame implements ActionListener
{
 JLabel l, l1,l2,l3,l4,l4l,l5,l6,l7,l8,l10,l11;
 JTextField t1,t2,t3,t4,t5,t6,t7,t8,t10,t11;
 JTextArea t12;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
 JScrollPane scrpn;
 Container c=getContentPane();
 JComboBox jcb=new JComboBox();
  JComboBox jc=new JComboBox();
 

    Connection cn;
    PreparedStatement pst,pst1,pst2;
    ResultSet rs;
    Statement st;
 

  EmployeeInfo()
 {
  
  setSize(700,600);
  setLocation(400,0);
  setResizable(false);
  setTitle("Employee Information");
  setLayout(null);
  c.setBackground(new Color(145,185,214));
  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    l=new JLabel("EMPLOYEE INFORMATION");
    l.setBounds(100,10,1500,60);
    l.setFont(new Font("Algerian",Font.BOLD,40));
    l.setForeground(new Color(200,100,0)); 

    l1=new JLabel("Employee No");
    l1.setBounds(40,40,130,90);
    l1.setFont(new Font("Arial",Font.BOLD,15));
    t1=new JTextField(20);
    t1.setBounds(170,75,120,20);
    t1.setToolTipText("Enter Employee ID");
    
     l2=new JLabel("Employee Name");
    l2.setBounds(40,75,130,90);
    l2.setFont(new Font("Arial",Font.BOLD,15));
    t2=new JTextField(20);
    t2.setBounds(170,110,150,30);
    t2.setToolTipText("Enter Employee Name");    

    l3=new JLabel("D.O.B");
    l3.setBounds(40,110,130,90);
    l3.setFont(new Font("Arial",Font.BOLD,15));
    t3=new JTextField(20);
    t3.setBounds(170,145,120,20);
   t3.setToolTipText("Enter DOB [ yyyy-mm-dd ]");   
    l4=new JLabel("Gender");
    l4.setBounds(40,140,130,90);
    l4.setFont(new Font("Arial",Font.BOLD,15));

   
     jcb.addItem("Male");
     jcb.addItem("Female");   
     jcb.setBounds(170,175,90,20);
     jcb.addActionListener(this);
   
     l5=new JLabel("Qualification");
     l5.setBounds(40,170,130,90);
     l5.setFont(new Font("Arial",Font.BOLD,15));
     t5=new JTextField(20);
     t5.setBounds(170,205,150,20);
     t5.setToolTipText("Enter Qualification");    
 
    l6=new JLabel("Mobile no");
    l6.setBounds(40,205,130,90);
    l6.setFont(new Font("Arial",Font.BOLD,15));
    t6=new JTextField(20);
    t6.setBounds(170,240,150,20);

    l7=new JLabel("Designation");
    l7.setBounds(40,240,130,90);
    l7.setFont(new Font("Arial",Font.BOLD,15));
   // t7=new JTextField(20);
  
     jc.addItem("Manager");
     jc.addItem("Assistant Manager");
     jc.addItem("Technical assistant");
     jc.addItem("Clerk");
     jc.addItem("worker");
     jc.addActionListener(this);
     jc.setBounds(170,275,150,20);
    

//    t7.setBounds(170,275,150,20);

    l8=new JLabel("Salary");
    l8.setBounds(40,270,130,90);
    l8.setFont(new Font("Arial",Font.BOLD,15));
    t8=new JTextField(20);
    t8.setBounds(170,310,150,20);
    

    l10=new JLabel("Experiance");
    l10.setBounds(40,330,130,90);
    l10.setFont(new Font("Arial",Font.BOLD,15));
      t7=new JTextField(30);
      t7.setBounds(170,365,150,20);
  /* JComboBox jcb1=new JComboBox();
    
     jcb1.addItem("0-Year");
     jcb1.addItem("1-Year");     jcb1.addItem("2-Year");
     jcb1.addItem("3-Year");     jcb1.addItem("4-Year");
     jcb1.addItem("5-Year");     jcb1.addItem("6-Year");
     jcb1.addItem("7-Year");     jcb1.addItem("8-Year");
     jcb1.addItem("9-Year");     jcb1.addItem("10-Year");
     jcb1.addItem("11-Year");     jcb1.addItem("12-Year");
     jcb1.addItem("13-Year");     jcb1.addItem("14-Year");
     jcb1.addItem("15-Year");     jcb1.addItem("16-Year");
     jcb1.addItem("17-Year");     jcb1.addItem("18-Year");
     jcb1.addItem("19-Year");     jcb1.addItem("20-Year");
     jcb1.addItem("21-Year");     jcb1.addItem("22-Year");
     jcb1.addItem("23-Year");     jcb1.addItem("24-Year");
     jcb1.addItem("25-Year");   
     jcb1.setBounds(170,365,150,20);
   */

//    t10=new JTextField(20);
  //  t10.setBounds(170,365,150,20); 
   
   
    l11=new JLabel("Join Date");
    l11.setBounds(40,360,130,90);
    l11.setFont(new Font("Arial",Font.BOLD,15));
    t11=new JTextField(20);
    t11.setBounds(170,395,150,20);

    
   // t12=new JTextArea(15,20);
   // t12.setBounds(340,120,340,150);
   // t12.setBorder(new LineBorder(new Color(90,90,90)));
    //scrpn= new JScrollPane(t12);    
 
    //int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    //int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
   //JScrollPane jsp=new JScrollPane(t12,v,h);
    // c.add(jsp);
    
    
  
     

    b5=new JButton("New", new ImageIcon(ClassLoader.getSystemResource("Images/newreg.png")));
    b6=new JButton("Modify", new ImageIcon(ClassLoader.getSystemResource("Images/update.png")));
    b7=new JButton("Save", new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));
    b8=new JButton("view");//, new ImageIcon(ClassLoader.getSystemResource("Images/delusr.png")));
    b9=new JButton("Exit", new ImageIcon(ClassLoader.getSystemResource("Images/cancel.png")));
    b10=new JButton("View All Employee");


  
   b5.setBounds(50,470,100,30);
   b6.setBounds(150,470,100,30);
   b7.setBounds(280,470,100,30);
   b8.setBounds(380,470,100,30);

   b9.setBounds(210,510,100,30);
   b10.setBounds(450,380,150,30);

    c.add(l);
    c.add(l1);      c.add(l2);    c.add(t1);
    c.add(l3);      c.add(t2);    c.add(l4);
    c.add(t3);
    c.add(l5);  
    c.add(jcb);
    c.add(l6);   
      c.add(t5);
    c.add(l7);    
   c.add(t6);

   c.add(l8);    c.add(jc);
    c.add(b10);
        c.add(t8);
 c.add(t7);
    c.add(l10);   
    c.add(l11);   //c.add(t10);
      c.add(t11);
    //c.add(b1);  // c.add(b2);
  //  c.add(b3);    //c.add(b4);
    c.add(b5);     c.add(b6); 
    c.add(b7);     c.add(b8);
    c.add(b9);      //c.add(t12);
    
   


    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
 
    setVisible(true);
    try
{
        Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded Succesfull");
       cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/payroll","root","root");
          System.out.println("Connection Succesfull");
       st=cn.createStatement();
    }
  catch(Exception e)
{
    JOptionPane.showMessageDialog(this,"Error in Connection "+e);
}

}
  public void actionPerformed(ActionEvent ae)
{
   try
{
     if(ae.getSource()==b7)
	{
	  
	   if(t2.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Fullname");
	   t2.requestFocus();
	    return;
	   }
                   if(t3.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Date of Birth");
	   t3.requestFocus();
	    return;
	   }
                   if(t5.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Qalification");
	   t5.requestFocus();
	    return;
	   }
                   if(t6.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter contact no");
	   t6.requestFocus();
	    return;
	   }
                   if(t8.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Salary");
	   t8.requestFocus();
	    return;
	   }
                   if(t11.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter join date");
	   t11.requestFocus();
	    return;
	   }
                   if(t7.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter experiance");
	   t7.requestFocus();
	    return;
	   }
                         rs=st.executeQuery("select monthname(curdate())");
                        if(rs.next())
{
                       pst=cn.prepareStatement("insert into employeemaster values(?,?,?,?,?,?,?)");
                       pst2=cn.prepareStatement("insert into attend(empid,month) values(?,?)");
                       pst2.setInt(1,Integer.parseInt(t1.getText()));
                       pst2.setString(2,rs.getString(1));
                                        
                       pst.setInt(1,Integer.parseInt(t1.getText()));
                      // pst.setInt(2,12256);
                       pst.setString(2,t2.getText());
                       pst.setString(3,t3.getText());
                       pst.setString(4,t5.getText());
                       pst.setInt(5,Integer.parseInt(t7.getText()));
                       pst.setString(6,t11.getText());

                       if(jcb.getSelectedIndex()==0)
                     {
                         pst.setString(7,"M");
                         pst.execute();
                         pst2.execute();
                        
                         JOptionPane.showMessageDialog(this,"Save succesfully");
                     }
                        
                       if(jcb.getSelectedIndex()==1)
                     {
                         pst.setString(8,"F");
                         pst.execute();
                         pst2.execute();
                        // st.executeUpdate("update employeedetails set empid="+Integer.parseInt(t1.getText()));
                         JOptionPane.showMessageDialog(this,"Save succesfully");
                     }
}
                       pst1=cn.prepareStatement("insert into employeedetails values(?,?,?,?,?,?,?,?,?,?)");                        
                       pst1.setInt(1,Integer.parseInt(t1.getText()));
                       pst1.setString(2,t2.getText());
                       pst1.setString(3,t3.getText());
                       pst1.setString(4,t5.getText());
                       pst1.setInt(5,Integer.parseInt(t7.getText()));
                       pst1.setString(6,t11.getText());
               if(jcb.getSelectedIndex()==0)
                     {
                         pst1.setString(7,"M");
                        
                     }
                        
                       if(jcb.getSelectedIndex()==1)
                     {
                         pst1.setString(7,"F");
                      }

                       if(jc.getSelectedIndex()==0)
                     {
                         pst1.setString(8,"Manager");
                      }

                       if(jc.getSelectedIndex()==1)
                     {
                         pst1.setString(8,"Assistant Manager");
                      }

                       if(jc.getSelectedIndex()==2)
                     {
                         pst1.setString(8,"Tech Manager");
                      }

                       if(jc.getSelectedIndex()==3)
                     {
                         pst1.setString(8,"Clerk");
                      }

                       if(jc.getSelectedIndex()==4)
                     {
                         pst1.setString(8,"Worker");
                      }
                       pst1.setInt(9,Integer.parseInt(t8.getText()));
                       pst1.setDouble(10,Double.parseDouble(t6.getText()));
                       pst1.execute();
                       JOptionPane.showMessageDialog(this,"Update Succesfull");

       }

else if(ae.getSource()==b5)
{
t1.setText("");
t2.setText("");    
t3.setText("");    
t5.setText("");    
t7.setText("");    
t11.setText("");    
t8.setText("");    
t6.setText("");    
t2.requestFocus();
     

         rs=st.executeQuery("select count(empid) from employeemaster");
         System.out.println("query executed");
         while(rs.next())
    {
        int a=Integer.parseInt(rs.getString(1));
        a=a+1;
       t1.setText(""+a);
       t1.setEditable(false);  
     }
     
  }
    


else if(ae.getSource()==b6)
  {





      t1.setEditable(true);
      if(t1.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Employee id");
	   t1.requestFocus();
	    return;
	   }
/*          rs=st.executeQuery("select * from employeedetails where empid="+Integer.parseInt(t1.getText()));
     if(rs.next())
       {
                       t2.setText(rs.getString(2));
                       t3.setText(rs.getString(3));
                       t5.setText(rs.getString(4));
                       t7.setText(rs.getString(5));
                       t11.setText(rs.getString(6));
                       t6.setText(rs.getString(10));
                       t8.setText(""+rs.getInt(9));
    }*/


 if(t2.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Fullname");
	   t2.requestFocus();
	    return;
	   }
                   if(t3.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Date of Birth");
	   t3.requestFocus();
	    return;
	   }
                   if(t5.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Qalification");
	   t5.requestFocus();
	    return;
	   }
                   if(t6.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter contact no");
	   t6.requestFocus();
	    return;
	   }
                   if(t8.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Salary");
	   t8.requestFocus();
	    return;
	   }
                   if(t11.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter join date");
	   t11.requestFocus();
	    return;
	   }
                   if(t7.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter experiance");
	   t7.requestFocus();
	    return;
	   }
                    
                        pst=cn.prepareStatement("update employeemaster set name=?,dob=?,qualification=?,experience=?,joindate=?,gender=? where empid="+t1.getText().trim());
                     
                       pst.setString(1,t2.getText());
                       pst.setString(2,t3.getText());
                       pst.setString(3,t5.getText());
                       pst.setInt(4,Integer.parseInt(t7.getText()));
                       pst.setString(5,t11.getText());
                       
                       

                       if(jcb.getSelectedIndex()==0)
                     {
                         pst.setString(6,"M");
                         pst.execute();
                        
                         JOptionPane.showMessageDialog(this,"Save succesfully");
                     }
                        
                       if(jcb.getSelectedIndex()==1)
                     {
                         pst.setString(6,"F");
                         pst.execute();
                        
                         JOptionPane.showMessageDialog(this,"Save succesfully");
                     }
                       pst1=cn.prepareStatement("update employeedetails set name=?,dob=?,qualification=?,experience=?,joindate=?,gender=?,designation=?,salary=?,contactno=? where empid="+t1.getText().trim());                        
                       
                       pst1.setString(1,t2.getText());
                       pst1.setString(2,t3.getText());
                       pst1.setString(3,t5.getText());
                       pst1.setInt(4,Integer.parseInt(t7.getText()));
                       pst1.setString(5,t11.getText());
               if(jcb.getSelectedIndex()==0)
                     {
                         pst1.setString(6,"M");
                        
                     }
                        
                       if(jcb.getSelectedIndex()==1)
                     {
                        pst1.setString(6,"F");
                      }

                       if(jc.getSelectedIndex()==0)
                     {
                         pst1.setString(7,"Manager");
                      }

                       if(jc.getSelectedIndex()==1)
                     {
                         pst1.setString(7,"Assistant Manager");
                      }

                       if(jc.getSelectedIndex()==2)
                     {
                         pst1.setString(7,"Tech Manager");
                      }

                       if(jc.getSelectedIndex()==3)
                     {
                         pst1.setString(7,"Clerk");
                      }

                       if(jc.getSelectedIndex()==4)
                     {
                         pst1.setString(7,"Worker");
                      }
                       pst1.setInt(8,Integer.parseInt(t8.getText()));
                       pst1.setDouble(9,Double.parseDouble(t6.getText()));
                       pst1.execute();
                       JOptionPane.showMessageDialog(this,"Update Succesfull");







    
   }
else if(ae.getSource()==b8)
{  
t2.setText("");    
t3.setText("");    
t5.setText("");    
t7.setText("");    
t11.setText("");    
t8.setText("");    
t6.setText("");    
  
       t1.setEditable(true);
      if(t1.getText().trim().length()==0)
	   {
	   JOptionPane.showMessageDialog(this,"Enter Employee id");
	   t1.requestFocus();
	    return;
	   }
             rs=st.executeQuery("select * from employeedetails where empid="+Integer.parseInt(t1.getText()));
     if(rs.next())
       {
                       t2.setText(rs.getString(2));
                       t3.setText(rs.getString(3));
                       t5.setText(rs.getString(4));
                       t7.setText(rs.getString(5));
                       t11.setText(rs.getString(6));
                       t6.setText(rs.getString(10));
                       t8.setText(""+rs.getInt(9));
    }



}

else if(ae.getSource()==b9)
{

 this.dispose();
  }
 else if(ae.getSource()==b10)
 {
  new View();
 }
}
catch(Exception e)
{
     JOptionPane.showMessageDialog(this,"Error in Database"+e);	
}

}
public static void main(String args[])
{
new EmployeeInfo();
}
}