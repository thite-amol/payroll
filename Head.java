import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Head extends JInternalFrame implements ActionListener  
{
//  Declarations
	
		JLabel lno,imgl,lname,contact,address,state,startdate,howmany;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8;
		JButton add,ok,b1,b2,b3,b4,b5,b6,b7,b8,b9;
                                  JTextArea taddress;
		JPanel f1= new JPanel();
		ImageIcon img;
		JScrollPane scrpn;
	 Connection cn;
              ResultSet rs;
               Statement st;
Head()
{		
      setTitle("Head Office");
     setLocation(440,80);
     f1.setLayout(null);


    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenHeight = screenSize.height-30;
    //int screenWidth = screenSize.width;

    setSize(800, 738);
    //System.out.println(screenHeight);

     setResizable(false);







//     setSize(800,800);
   		
    lno=new JLabel  ("Head office Number :");
    lname=new JLabel("              Name :");
    contact=new JLabel("           Contact :");
    address=new JLabel("           Address :");
    state=new JLabel("             State :");
    startdate=new JLabel("        Start Date :");
    howmany=new JLabel(" Total Employee :");
			
     t1= new JTextField(10);
     t2= new JTextField(10);
     t3= new JTextField(10);
     t4= new JTextField(10);
     t5= new JTextField(10);
     t6= new JTextField(10);
     t7= new JTextField(10);

    add=new JButton(" Add");
    ok=new JButton("OK");
						
     ok.addActionListener(this);
     add.addActionListener(this);		

     taddress=new JTextArea(15,20);
		    
     scrpn= new JScrollPane(taddress);
			
	f1.add(lno);
        f1.add(t1);
        f1.add(lname);
        f1.add(t2);
        f1.add(contact);
	f1.add(t3);
	f1.add(t4);
	f1.add(add);
	f1.add(t5);
	f1.add(address);
	f1.add(scrpn);
	f1.add(state);
	f1.add(t6);
	f1.add(t7);
	f1.add(howmany);
	f1.add(startdate);
	
      
	

  
    b6=new JButton("Exit");//, new ImageIcon(ClassLoader.getSystemResource("Images/update.png")));
    b7=new JButton("View");  
   b6.setBounds(180,370,100,30);
   b7.setBounds(50,370,100,30);
   add(b6);
   add(b7);
  b6.addActionListener(this);
  b7.addActionListener(this);

	lno.setBounds(10,25,150,25);
	t1.setBounds(150,23,125,25);
	
        lname.setBounds(10,67,150,25);
	t2.setBounds(150,67,150,25);
	
        contact.setBounds(10,110,150,25);
	t3.setBounds(150,110,125,25);
	
        state.setBounds(10,153,150,25); 
        t4.setBounds(150,153,125,25);
        

	startdate.setBounds(10, 196, 150, 25);
        t5.setBounds(150,196,125,25);
	
        address.setBounds(10,239,150,25);
	t7.setBounds(150,239,250,25);
	//scrpn.setBounds(150,239,200,50);
        howmany.setBounds(10, 310, 150, 25);
	t6.setBounds(150, 310, 125, 25);
	
       ok.setBounds(190,420,90,25);
	setSize(445,500);
  add(f1,BorderLayout.CENTER);
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
    JOptionPane.showMessageDialog(this,"Error is"+e); 
  }

       		    
}  		
public void actionPerformed(ActionEvent ae)
{

    try
{
    if(ae.getSource()==b7)
   {
 
        rs=st.executeQuery("select count(*) from employeemaster");
       if(rs.next())
       {         
            t6.setText(rs.getString(1));
       
        }
  
       rs=st.executeQuery("select * from Head");
       if(rs.next())
       {
             t1.setText(rs.getString(1));           
             t2.setText(rs.getString(2));           
             t7.setText(rs.getString(3));           
             t4.setText(rs.getString(4));           
             t5.setText(rs.getString(5));           
            t3.setText(rs.getString(6));           
        }
    } 

    else if(ae.getSource()==b6)
  {
     dispose();
   }
     
  }
 catch(Exception e)
  {
       JOptionPane.showMessageDialog(this,"Error is"+e);
  }
}	

public static void main(String args[])
{
   new Head();
  }


}

