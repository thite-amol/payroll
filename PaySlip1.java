import java.io.*;
import java.awt.Font.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.*;
class PaySlip1 extends JFrame implements ActionListener
{
 JLabel l1,l2,l3,l5,l6,l7,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l22,l23,l24,l25,l30;
 JTextField t1,t2,t4,t6,t7,t8,t9,t10,t11,t12,t13,t14,t17,t18,t19,t30;

 JButton b1,b2,b3,b4,b5,b6,b7;
JComboBox jcb=new JComboBox();
 Container c=getContentPane();

Connection cn;
 ResultSet rs,rs1,rs2;
 Statement st;
 PreparedStatement pst,pst1;
 PaySlip1()
 {
 
  setSize(700,700);
 // setResizable(false);
  setTitle("Pay slip");
  setLayout(null);
  setLocation(460,0);
  c.setBackground(new Color(145,185,214));
 // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    l1=new JLabel("Employee Information");
    l1.setBounds(0,0,400,60);
    l1.setFont(new Font("Algerian",Font.BOLD,20));
    l1.setForeground(new Color(200,100,0)); 
    
    l2=new JLabel("Sr No");
    l2.setBounds(10,20,130,90);
    l2.setFont(new Font("Arial",Font.BOLD,15));
    t1=new JTextField(20);
    t1.setBounds(120,55,150,25);
    t1.setBorder(new LineBorder(new Color(90,90,90)));   
    
    l3=new JLabel("Employee ID");
    l3.setBounds(10,50,130,90);
    l3.setFont(new Font("Arial",Font.BOLD,15));
    t2=new JTextField(20);
    t2.setBounds(120,85,150,25);
    t2.setBorder(new LineBorder(new Color(90,90,90)));
    
    l5=new JLabel("Income");
    l5.setBounds(400,0,400,60);
    l5.setFont(new Font("Algerian",Font.BOLD,20));
    l5.setForeground(new Color(200,100,0)); 
   
    l6=new JLabel("Basic");
    l6.setBounds(320,20,130,90);
    l6.setFont(new Font("Arial",Font.BOLD,15));
    t4=new JTextField(20);
    t4.setBounds(475,55,150,25);
    t4.setBorder(new LineBorder(new Color(90,90,90)));
   
    l7=new JLabel("Allowance");
    l7.setBounds(320,50,130,90);
    l7.setFont(new Font("Arial",Font.BOLD,15));
    t9=new JTextField(20);
    t9.setBounds(475,85,150,25);   

    l9=new JLabel("Total Income");
    l9.setBounds(320,110,130,90);
    l9.setFont(new Font("Arial",Font.BOLD,15));
   
   t6=new JTextField(20);
    t6.setBounds(475,145,150,25);
    t6.setBorder(new LineBorder(new Color(90,90,90)));
    
    l12=new JLabel("Work");
    l12.setBounds(0,180,400,60);
    l12.setFont(new Font("Algerian",Font.BOLD,20));
    l12.setForeground(new Color(200,100,0)); 
  
    l13=new JLabel("Pay-Date");
    l13.setBounds(10,195,130,90);
    l13.setFont(new Font("Arial",Font.BOLD,15));
     //JComboBox jcb=new JComboBox();
     
     jcb.addItem("January");     jcb.addItem("February");   
     jcb.addItem("March");    jcb.addItem("April");   
     jcb.addItem("May");    jcb.addItem("June");   
     jcb.addItem("July");     jcb.addItem("August");   
     jcb.addItem("September");    jcb.addItem("Octomber");   
     jcb.addItem("November");   jcb.addItem("December"); 
     jcb.setBounds(120,265,150,25);
      jcb.setBorder(new LineBorder(new Color(90,90,90)));
     jcb.addActionListener(this);
   
    l14=new JLabel("Salary Month");
    l14.setBounds(10,230,130,90);
    l14.setFont(new Font("Arial",Font.BOLD,15));
    t10=new JTextField(20);
    t10.setBounds(120,230,150,25);
    t10.setBorder(new LineBorder(new Color(90,90,90)));  
    
    l15=new JLabel("Absent	");
    l15.setBounds(10,265,130,90);
    l15.setFont(new Font("Arial",Font.BOLD,15));
    t11=new JTextField(20);
    t11.setBounds(120,300,150,25);
    t11.setBorder(new LineBorder(new Color(90,90,90)));
   
    l16=new JLabel("Working day's");
    l16.setBounds(10,295,130,90);
    l16.setFont(new Font("Arial",Font.BOLD,15));
    t12=new JTextField(20); 
    t12.setBounds(120,330,150,25);
    t12.setBorder(new LineBorder(new Color(90,90,90)));  
    
     l10=new JLabel("Without Pay");
    l24=new JLabel("    Leaves");
    l24.setFont(new Font("Arial",Font.BOLD,15));
    l24.setBounds(10,345,150,90);
    
    l10.setBounds(10,330,150,90);
    l10.setFont(new Font("Arial",Font.BOLD,15));
    t7=new JTextField(20);
    t7.setBounds(120,365,150,25);
     t7.setBorder(new LineBorder(new Color(90,90,90)));
    
    l11=new JLabel("Sanction");
    l11.setBounds(10,365,150,90);
    l11.setFont(new Font("Arial",Font.BOLD,15));
   
    l25=new JLabel(" Leaves");
    l25.setBounds(10,378,150,90);
    l25.setFont(new Font("Arial",Font.BOLD,15));
    t8=new JTextField(20);
    t8.setBounds(120,400,150,25);
    t8.setBorder(new LineBorder(new Color(90,90,90)));
    



    l17=new JLabel("Deduction");
    l17.setBounds(400,200,400,60);
    l17.setFont(new Font("Algerian",Font.BOLD,20));
    l17.setForeground(new Color(200,100,0)); 
    
    l18=new JLabel("P.F");
    l18.setBounds(320,215,130,90);
    l18.setFont(new Font("Arial",Font.BOLD,15));
    t13=new JTextField(20);
    t13.setBounds(475,250,150,25);  
    t13.setBorder(new LineBorder(new Color(90,90,90)));
    
    l19=new JLabel("P.T");
    l19.setBounds(320,250,130,90);
    l19.setFont(new Font("Arial",Font.BOLD,15));
    t14=new JTextField(20);
    t14.setBounds(475,285,150,25);
    t14.setBorder(new LineBorder(new Color(90,90,90)));
    
    l30=new JLabel("Absent");
    l30.setBounds(320,285,130,90);
    l30.setFont(new Font("Arial",Font.BOLD,15));
    t30=new JTextField(20);
    t30.setBounds(475,320,150,25);
    t30.setBorder(new LineBorder(new Color(90,90,90)));
    
    l22=new JLabel("Total Deduction");
    l22.setBounds(320,360,130,90);
    l22.setFont(new Font("Arial",Font.BOLD,15));
    t17=new JTextField(20);
    t17.setBounds(475,395,150,25);
    t17.setBorder(new LineBorder(new Color(90,90,90)));
    

    l23=new JLabel("Net Salary =");
    l23.setBounds(280,410 ,150,90);
    l23.setFont(new Font("Arial",Font.BOLD,20));
    l23.setForeground(new Color(200,100,0)); 
    t18=new JTextField(20);
    t18.setBounds(400,440,150,25);
   t18.setBorder(new LineBorder(new Color(90,90,90)));
   

   //  b1=new JButton("Calculate", new ImageIcon(ClassLoader.getSystemResource("Images/calc.png")));
  
    //b1.setBounds(100,440,150,30); 
      // b1 .setBorder(new LineBorder(new Color(90,90,90)));
   
          
 b2=new JButton("New", new ImageIcon(ClassLoader.getSystemResource("Images/newreg.png")));
 
    b2.setBounds(30,495,100,30); 
b2.setBorder(new LineBorder(new Color(90,90,90)));
  
 
 b3=new JButton("Save", new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));

    b3.setBounds(135,495,100,30); 
b3.setBorder(new LineBorder(new Color(90,90,90)));
  

 b4=new JButton("View", new ImageIcon(ClassLoader.getSystemResource("Images/update.png")));
       b4.setBounds(245,495,100,30); 
b4.setBorder(new LineBorder(new Color(90,90,90)));
  

// b5=new JButton("Delete", new ImageIcon(ClassLoader.getSystemResource("Images/delusr.png")));
   // b5.addActionListener(this);
    //b5.setBounds(355,495,100,30); 
//b5.setBorder(new LineBorder(new Color(90,90,90)));
  

 b6=new JButton("Print", new ImageIcon(ClassLoader.getSystemResource("Images/print.png")));
   
    b6.setBounds(465,495,100,30); 
b6.setBorder(new LineBorder(new Color(90,90,90)));
  

    b7=new JButton("Exit", new ImageIcon(ClassLoader.getSystemResource("Images/cancel.png")));
    b7.setBounds(570,495,100,30); 
    b7.setBorder(new LineBorder(new Color(90,90,90)));
  
  //b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
//  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);

   c.add(l1);c.add(l2);  c.add(t1);
   c.add(l3);c.add(t2);  
   c.add(l5);c.add(l6);  c.add(t4);
   c.add(jcb); c.add(l9);
   c.add(t6);c.add(l10);  c.add(t7);c.add(l11);
   c.add(t8);c.add(l13); 
   c.add(l12);c.add(l14);  c.add(t10);c.add(l15);
   c.add(t11);c.add(l16);  c.add(t12);c.add(l17);
   c.add(l18);c.add(t13);   c.add(l19);c.add(t14);
   
   c.add(l22);c.add(t17);   c.add(l23);c.add(t18);
  // c.add(b1);
c.add(b2);c.add(b3);c.add(b4);
   c.add(b6);c.add(b7);c.add(l24);
   c.add(l25); 
   c.add(l7); 
   c.add(t9);  c.add(t30);  c.add(l30); 
  setVisible(true);

try
{
       
   Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
   cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/payroll","root","root");
   System.out.println("Connection Successfull");
   st=cn.createStatement();
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(this,"Error in connection"+e);
}
  }
   public void actionPerformed(ActionEvent ae)
  {
      try
   {
          
        if(ae.getSource()==b7)
      {

          this.dispose();
    }
   else if(ae.getSource()==b4)
  {
     if(t2.getText().trim().length()==0)
    {
      JOptionPane.showMessageDialog(this,"Please provide Employee id");
      return;
    }
       
     rs=st.executeQuery("select count(srno) from payslip");
       
         while(rs.next())
    {
        int a=Integer.parseInt(rs.getString(1));
        a=a+1;
       t1.setText(""+a);
       t1.setEditable(false);  
     }  
 
  rs=st.executeQuery("select salary from employeedetails where empid="+Integer.parseInt(t2.getText().trim()));
       while(rs.next())
    {
        
       t4.setText(rs.getString(1));
       t4.setEditable(false);  
     }  
  

     rs=st.executeQuery("select curdate()");
         while(rs.next())
    {
        
       t10.setText(rs.getString(1));
       t10.setEditable(false);  
     }  

 int a=Integer.parseInt(t2.getText());
       String b=jcb.getSelectedItem().toString();
 
st=cn.createStatement();
int ab=0,pr=0,h=0,l=0,dl=0,ml=0;
rs=st.executeQuery("select * from attend where month='"+b+"'" +"and empid="+a );
 if(rs.next())
{
      for(int i=3;i<=33;i++)
     {
          if(rs.getString(i).equals("p"))
         {
              
                  pr++;
           }   
         else  if(rs.getString(i).equals("a"))
         {
              //System.out.println(rs.getString(i)); 
                  ab++;
           }   
         else  if(rs.getString(i).equals("h"))
         {
              //System.out.println(rs.getString(i)); 
                  h++;
           }   
         else  if(rs.getString(i).equals("l"))
         {
            //  System.out.println(rs.getString(i)); 
                  l++;
           }   
         else  if(rs.getString(i).equals("ml"))
         {
              //System.out.println(rs.getString(i)); 
                  ml++;
           }   
     
            else  if(rs.getString(i).equals("dl"))
         {
              //System.out.println(rs.getString(i)); 
                  dl++;
           }   
  }//for
}//if
    
       
       t11.setText(""+ab);
       t12.setText(""+(h+pr+dl+ml));
       t8.setText(""+(ml+dl));
       if(l<=2)
    {
       t8.setText(""+(ml+dl+l));
       t12.setText(""+(h+pr+dl+ml));
    }
  else
  {
       t7.setText(""+l);
   }
  Double x=Double.parseDouble(t4.getText());
  Double z=x*0.06;
  t9.setText(""+z);
 Double y=Double.parseDouble(t9.getText());
  t6.setText(""+(x+y));
  Double w=(x+y)*0.04;
  t13.setText(""+w);
  Double u=(x+y)*0.02;
  t14.setText(""+u);

   Double v=(x+y)/(ab+pr+dl+ml+l+h);
  
   int s=Integer.parseInt(t12.getText());
  Double t=v*s;
  
  int r=(ab+pr+dl+ml+l+h)-(Integer.parseInt(t12.getText()));
  Double q=r*v;
  t30.setText(""+q);
   Double p=q+w+u;
  t17.setText(""+p);
  Double o=(x+y)-p;
  t18.setText(""+o);	
}

else if(ae.getSource()==b3)
{
      pst=cn.prepareStatement("insert into payslip values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

      pst.setInt(1,Integer.parseInt(t1.getText()));

      pst.setInt(2,Integer.parseInt(t2.getText()));

      pst.setString(3,t10.getText());

      pst.setString(4,jcb.getSelectedItem().toString());

      pst.setInt(5,Integer.parseInt(t12.getText()));

      pst.setInt(6,Integer.parseInt(t11.getText()));

      pst.setInt(7,Integer.parseInt(t11.getText()));

      pst.setDouble(8,Double.parseDouble(t4.getText()));
      pst.setDouble(9,Double.parseDouble(t13.getText()));
      pst.setDouble(10,Double.parseDouble(t14.getText()));
      pst.setDouble(11,Double.parseDouble(t9.getText()));
      pst.setDouble(12,Double.parseDouble(t6.getText()));
      pst.setDouble(13,Double.parseDouble(t17.getText()));
      pst.setDouble(14,Double.parseDouble(t18.getText()));
      pst.setDouble(15,Double.parseDouble(t30.getText()));
      System.out.println("after all");
      pst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Save succesfully");
  }
else if(ae.getSource()==b2)
{
    t2.setText(""); 
    //t3.setText(""); 
    t4.setText(""); 
    t9.setText(""); 
    t6.setText(""); 
    t10.setText(""); 
    t11.setText(""); 
    t12.setText(""); 
    t7.setText(""); 
    t8.setText(""); 
    t13.setText(""); 
    t14.setText(""); 
    t17.setText(""); 
    t18.setText(""); 
    t30.setText(""); 

     rs=st.executeQuery("select count(srno) from payslip");
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
usePrinter useprinter = new usePrinter();
  class usePrinter extends Frame
{
	usePrinter()
  {
		PrintJob printjob = getToolkit().getPrintJob(this, "Print graphics", null);
		Graphics g = printjob.getGraphics();
		g.drawRect(2, 2, 100, 100);
		g.drawLine(2, 2, 100, 100);
		g.dispose();
		printjob.end();
		System.exit(0);
	}
}
 }
}
catch(Exception e)
{
  JOptionPane.showMessageDialog(this,"Error is"+e);
}     
  }
  public static void main(String args[])
  {
   new PaySlip1();
   
  }
}