import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

class Attend extends JInternalFrame implements ActionListener
{
 JLabel l1,l2,l3,l4;
 JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34;
 JTextField t1,t2;

   Connection cn;
   Statement st;
   PreparedStatement pst;
   ResultSet rs,rs1;

  JComboBox jc,jcb;

 Attend()
{
   setTitle("Attend Shit");
   setSize(650,600);
   setResizable(false);
   setLocation(480,0);
   setLayout(null);
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     l1=new JLabel("        Attend Ship");
     l1.setFont(new Font("Arabic Typesetting",Font.PLAIN,30));
     l1.setForeground(new Color(255,0,0));
     l1.setBounds(170,20,500,50);
    
      l2=new JLabel("Select Month");
      l3=new JLabel("Select Month");
      t1=new JTextField(20); 
      
      l2.setBounds(50,280,150,30);      
    
     

      l3=new JLabel("Employee id:");
      t2=new JTextField(20);
      t2.setBounds(170,340,150,30);  
      l3.setBounds(50,340,150,30);      
          
         
    b1=new JButton("1");
    b2=new JButton("2");
   
   b0=new JButton("View Attends"); 
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    b10=new JButton("10");
    b11=new JButton("11");
    b12=new JButton("12");
    b13=new JButton("13");
    b14=new JButton("14");
    b15=new JButton("15");
    b16=new JButton("16");
    b17=new JButton("17");
    b18=new JButton("18");
    b19=new JButton("19");
    b20=new JButton("20");
    b21=new JButton("21");
    b22=new JButton("22");
    b23=new JButton("23");
    b24=new JButton("24");
    b25=new JButton("25");
    b26=new JButton("26");
    b27=new JButton("27");
    b28=new JButton("28");
    b29=new JButton("29");
    b30=new JButton("30");
    b31=new JButton("31");   
    b32=new JButton("Exit",new ImageIcon(ClassLoader.getSystemResource("Images/cancel.png")));

    b33=new JButton("ok");
    b34=new JButton("save");
    
/*    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);
    b9.setEnabled(false);
    b10.setEnabled(false);
    b11.setEnabled(false);
    b12.setEnabled(false);
    b13.setEnabled(false);
    b14.setEnabled(false);
    b15.setEnabled(false);
    b16.setEnabled(false);
    b17.setEnabled(false);
    b18.setEnabled(false);
    b19.setEnabled(false);
    b20.setEnabled(false);
    b21.setEnabled(false);
    b22.setEnabled(false);
    b23.setEnabled(false);
    b24.setEnabled(false);
    b25.setEnabled(false);
    b26.setEnabled(false);
    b27.setEnabled(false);
    b28.setEnabled(false);
    b29.setEnabled(false);
    b30.setEnabled(false);
    b31.setEnabled(false);
*/    
    b0.setBounds(440,410,150,30);

    b1.setBounds(50,90,50,30);
    b2.setBounds(105,90,50,30);
    b3.setBounds(160,90,50,30);
    b4.setBounds(215,90,50,30);
    b5.setBounds(270,90,50,30);
    b6.setBounds(325,90,50,30);
    b7.setBounds(380,90,50,30);
    b8.setBounds(435,90,50,30);
    b9.setBounds(490,90,50,30);
    b10.setBounds(545,90,50,30);


    b11.setBounds(50,130,50,30);
    b12.setBounds(105,130,50,30);
    b13.setBounds(160,130,50,30);
    b14.setBounds(215,130,50,30);
    b15.setBounds(270,130,50,30);
    b16.setBounds(325,130,50,30);
    b17.setBounds(380,130,50,30);
    b18.setBounds(435,130,50,30);
    b19.setBounds(490,130,50,30);
    b20.setBounds(545,130,50,30);
 
    b21.setBounds(50,170,50,30);
    b22.setBounds(105,170,50,30);
    b23.setBounds(160,170,50,30);
    b24.setBounds(215,170,50,30);
    b25.setBounds(270,170,50,30);
    b26.setBounds(325,170,50,30);
    b27.setBounds(380,170,50,30);
    b28.setBounds(435,170,50,30);
    b29.setBounds(490,170,50,30);
    b30.setBounds(545,170,50,30);

    b31.setBounds(50,210,50,30);


    b32.setBounds(300,410,100,30);

    b33.setBounds(350,340,80,30);  
   
      b34.setBounds(170,410,100,30);  
       
      b0.addActionListener(this);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);


      b11.addActionListener(this);
      b12.addActionListener(this);
      b13.addActionListener(this);
      b14.addActionListener(this);
      b15.addActionListener(this);
      b16.addActionListener(this);
      b17.addActionListener(this);
      b18.addActionListener(this);
      b19.addActionListener(this);
      b20.addActionListener(this);


      b21.addActionListener(this);
      b22.addActionListener(this);
      b23.addActionListener(this);
      b24.addActionListener(this);
      b25.addActionListener(this);
      b26.addActionListener(this);
      b27.addActionListener(this);
      b28.addActionListener(this);
      b29.addActionListener(this);
      b30.addActionListener(this);
      b31.addActionListener(this);

      b32.addActionListener(this);
      b33.addActionListener(this);
      b34.addActionListener(this);



      jc= new JComboBox();
      jcb= new JComboBox();
      

      jc.addItem("Present");
      jc.addItem("Absent");
      jc.addItem("Holiday");
      jc.addItem("Duty leave");
      jc.addItem("Medical leave");
      jc.addItem("leave");

     jcb.addItem("January");     jcb.addItem("February");   
     jcb.addItem("March");    jcb.addItem("April");   
     jcb.addItem("May");    jcb.addItem("June");   
     jcb.addItem("July");     jcb.addItem("August");   
     jcb.addItem("September");    jcb.addItem("Octomber");   
     jcb.addItem("November");   jcb.addItem("December"); 
    

     jc.addActionListener(this);
      
       jc.setBounds(440,280,150,30);
       jcb.setBounds(170,280,150,30);
    
     
      l4=new JLabel("Set value");
      l4.setBounds(340,280,100,30);    
    
     add(b0);  
    add(b1);
    add(b2);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b10);
    add(b11);
    add(b12);
    add(b13);
    add(b14);
    add(b15);
    add(b16);
    add(b17);
    add(b18);
    add(b19);
    add(b20);
    add(b21);
    add(b22);
    add(b23);
    add(b24);
    add(b25);
    add(b26);
    add(b27);
    add(b28);
    add(b29);
    add(b30);
    add(b31);
    add(b32);
    add(b33);
    add(b34);
    add(l1);
 

    add(l2);
    add(t1);
    add(l3);
    add(t2);
   
    add(jc); 
    add(l4);
    
    add(jcb);  
   
  
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
     if(ae.getSource()==b33)
    {
     rs=st.executeQuery("select dayofmonth(curdate()),monthname(curdate())");
if(rs.next())

         
	{
                        if(rs.getInt(1)==1)
                     
          {
                          b1.setEnabled(true);
                           if(rs.getString(2).equals("jcb.getSelectedIndex()"))
                         {
                              System.out.println("Month is available");  
                        }
                       /* else
                     {

                    pst=cn.prepareStatement("insert into attend(empid,month) values(?,?)");
                    pst.setInt(1,Integer.parseInt(t2.getText())); 
                    pst.setString(2,jcb.getSelectedItem().toString());
                    pst.execute();
                  }*/
              }


                      else if(rs.getInt(1)==2)
          {
                          b2.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==3)
          {
                          b3.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==4)
          {
                          b4.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==5)
          {
                          b5.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==6)
          {
                          b6.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==7)
          {
                          b7.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==8)
          {
                          b8.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==9)
          {
                          b9.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==10)
          {
                          b10.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==11)
          {
                          b11.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==12)
          {
                          b12.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==13)
          {
                          b13.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==14)
          {
                          b14.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==15)
          {
                          b15.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==16)
          {
                          b16.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==17)
          {
                          b17.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==18)
          {
                          b18.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==19)
          {
                          b19.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==20)
          {
                          b20.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==21)
          {
                          b21.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==22)
          {
                          b22.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==23)
          {
                          b23.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==24)
          {
                          b24.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==25)
          {
                          b25.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==26)
          {
                          b26.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==27)
          {
                          b27.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==28)
          {
                          b28.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==29)
          {
                          b29.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   

                      else if(rs.getInt(1)==30)
          {
                          b30.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
   
                      else if(rs.getInt(1)==31)
          {
                          b31.setEnabled(true);
                      //JOptionPane.showMessageDialog(this,"Date is"+rs.getString(1));
   
               }
          }
   
           rs=st.executeQuery("select month(curdate())");
         if(rs.next())
	{

              jcb.setSelectedIndex(rs.getInt(1)-1);


       }

           rs=st.executeQuery("select * from attend where month=(select monthname(curdate())) and empid="+Integer.parseInt(t2.getText().trim()));
          if(rs.next())
      {
	b1.setBackground(Color.white);
	b2.setBackground(Color.white);
	b3.setBackground(Color.white);
	b4.setBackground(Color.white);
	b5.setBackground(Color.white);
	b6.setBackground(Color.white);
	b7.setBackground(Color.white);
	b8.setBackground(Color.white);
	b9.setBackground(Color.white);
	b10.setBackground(Color.white);
                 
	b21.setBackground(Color.white);
	b22.setBackground(Color.white);
	b23.setBackground(Color.white);
	b24.setBackground(Color.white);
	b25.setBackground(Color.white);
	b26.setBackground(Color.white);
	b27.setBackground(Color.white);
	b28.setBackground(Color.white);
	b29.setBackground(Color.white);
	b30.setBackground(Color.white);
                 
	b11.setBackground(Color.white);
	b12.setBackground(Color.white);
	b13.setBackground(Color.white);
	b14.setBackground(Color.white);
	b15.setBackground(Color.white);
	b16.setBackground(Color.white);
	b17.setBackground(Color.white);
	b18.setBackground(Color.white);
	b19.setBackground(Color.white);
	b20.setBackground(Color.white);
                 
                 b31.setBackground(Color.white);
                 
           if(rs.getString(3).equals("p"))
           {
                  b1.setBackground(Color.green);
           }

           if(rs.getString(3).equals("a"))
           {
                  b1.setBackground(Color.red);
           }

           if(rs.getString(3).equals("h"))
           {
                  b1.setBackground(Color.yellow);
           }

           if(rs.getString(3).equals("dl"))
           {
                  b1.setBackground(Color.orange);
           }

           if(rs.getString(3).equals("ml"))
           {
                  b1.setBackground(Color.pink);
           }

           if(rs.getString(3).equals("l"))
           {
                  b1.setBackground(Color.gray);
           }


           if(rs.getString(4).equals("p"))
           {
                  b2.setBackground(Color.green);
           }

           if(rs.getString(4).equals("a"))
           {
                  b2.setBackground(Color.red);
           }

           if(rs.getString(4).equals("h"))
           {
                  b2.setBackground(Color.yellow);
           }

           if(rs.getString(4).equals("dl"))
           {
                  b2.setBackground(Color.orange);
           }

           if(rs.getString(4).equals("ml"))
           {
                  b2.setBackground(Color.pink);
           }

           if(rs.getString(4).equals("l"))
           {
                  b2.setBackground(Color.gray);
           }

             if(rs.getString(5).equals("p"))
           {
                  b3.setBackground(Color.green);
           }

           if(rs.getString(5).equals("a"))
           {
                  b3.setBackground(Color.red);
           }

           if(rs.getString(5).equals("h"))
           {
                  b3.setBackground(Color.yellow);
           }

           if(rs.getString(5).equals("dl"))
           {
                  b3.setBackground(Color.orange);
           }

           if(rs.getString(5).equals("ml"))
           {
                  b3.setBackground(Color.pink);
           }

           if(rs.getString(5).equals("l"))
           {
                  b3.setBackground(Color.gray);
           }
           if(rs.getString(6).equals("p"))
           {
                  b4.setBackground(Color.green);
           }

           if(rs.getString(6).equals("a"))
           {
                  b4.setBackground(Color.red);
           }

           if(rs.getString(6).equals("h"))
           {
                  b4.setBackground(Color.yellow);
           }

           if(rs.getString(6).equals("dl"))
           {
                  b4.setBackground(Color.orange);
           }

           if(rs.getString(6).equals("ml"))
           {
                  b4.setBackground(Color.pink);
           }

           if(rs.getString(6).equals("l"))
           {
                  b4.setBackground(Color.gray);
           }

           if(rs.getString(7).equals("p"))
           {
                  b5.setBackground(Color.green);
           }

           if(rs.getString(7).equals("a"))
           {
                  b5.setBackground(Color.red);
           }

           if(rs.getString(7).equals("h"))
           {
                  b5.setBackground(Color.yellow);
           }

           if(rs.getString(7).equals("dl"))
           {
                  b5.setBackground(Color.orange);
           }

           if(rs.getString(7).equals("ml"))
           {
                  b5.setBackground(Color.pink);
           }

           if(rs.getString(7).equals("l"))
           {
                  b5.setBackground(Color.gray);
           }


           if(rs.getString(8).equals("p"))
           {
                  b6.setBackground(Color.green);
           }

           if(rs.getString(8).equals("a"))
           {
                  b6.setBackground(Color.red);
           }

           if(rs.getString(8).equals("h"))
           {
                  b6.setBackground(Color.yellow);
           }

           if(rs.getString(8).equals("dl"))
           {
                  b6.setBackground(Color.orange);
           }

           if(rs.getString(8).equals("ml"))
           {
                  b6.setBackground(Color.pink);
           }

           if(rs.getString(8).equals("l"))
           {
                  b6.setBackground(Color.gray);
           }

           if(rs.getString(9).equals("p"))
           {
                  b7.setBackground(Color.green);
           }

           if(rs.getString(9).equals("a"))
           {
                  b7.setBackground(Color.red);
           }

           if(rs.getString(9).equals("h"))
           {
                  b7.setBackground(Color.yellow);
           }

           if(rs.getString(9).equals("dl"))
           {
                  b7.setBackground(Color.orange);
           }

           if(rs.getString(9).equals("ml"))
           {
                  b7.setBackground(Color.pink);
           }

           if(rs.getString(9).equals("l"))
           {
                  b7.setBackground(Color.gray);
           }
           if(rs.getString(10).equals("p"))
           {
                  b8.setBackground(Color.green);
           }

           if(rs.getString(10).equals("a"))
           {
                  b8.setBackground(Color.red);
           }

           if(rs.getString(10).equals("h"))
           {
                  b8.setBackground(Color.yellow);
           }

           if(rs.getString(10).equals("dl"))
           {
                  b8.setBackground(Color.orange);
           }

           if(rs.getString(10).equals("ml"))
           {
                  b8.setBackground(Color.pink);
           }

           if(rs.getString(10).equals("l"))
           {
                  b8.setBackground(Color.gray);
           }

           if(rs.getString(11).equals("p"))
           {
                  b9.setBackground(Color.green);
           }

           if(rs.getString(11).equals("a"))
           {
                  b9.setBackground(Color.red);
           }

           if(rs.getString(11).equals("h"))
           {
                  b9.setBackground(Color.yellow);
           }

           if(rs.getString(11).equals("dl"))
           {
                  b9.setBackground(Color.orange);
           }

           if(rs.getString(11).equals("ml"))
           {
                  b9.setBackground(Color.pink);
           }

           if(rs.getString(11).equals("l"))
           {
                  b9.setBackground(Color.gray);
           }

           if(rs.getString(12).equals("p"))
           {
                  b10.setBackground(Color.green);
           }

           if(rs.getString(12).equals("a"))
           {
                  b10.setBackground(Color.red);
           }

           if(rs.getString(12).equals("h"))
           {
                  b10.setBackground(Color.yellow);
           }

           if(rs.getString(12).equals("dl"))
           {
                  b10.setBackground(Color.orange);
           }

           if(rs.getString(12).equals("ml"))
           {
                  b10.setBackground(Color.pink);
           }

           if(rs.getString(12).equals("l"))
           {
                  b10.setBackground(Color.gray);
           }



           if(rs.getString(13).equals("p"))
           {
                  b11.setBackground(Color.green);
           }

           if(rs.getString(13).equals("a"))
           {
                  b11.setBackground(Color.red);
           }

           if(rs.getString(13).equals("h"))
           {
                  b11.setBackground(Color.yellow);
           }

           if(rs.getString(13).equals("dl"))
           {
                  b11.setBackground(Color.orange);
           }

           if(rs.getString(13).equals("ml"))
           {
                  b11.setBackground(Color.pink);
           }

           if(rs.getString(13).equals("l"))
           {
                  b11.setBackground(Color.gray);
           }


           if(rs.getString(14).equals("p"))
           {
                  b12.setBackground(Color.green);
           }

           if(rs.getString(14).equals("a"))
           {
                  b12.setBackground(Color.red);
           }

           if(rs.getString(14).equals("h"))
           {
                  b12.setBackground(Color.yellow);
           }

           if(rs.getString(14).equals("dl"))
           {
                  b12.setBackground(Color.orange);
           }

           if(rs.getString(14).equals("ml"))
           {
                  b12.setBackground(Color.pink);
           }

           if(rs.getString(14).equals("l"))
           {
                  b12.setBackground(Color.gray);
           }

             if(rs.getString(15).equals("p"))
           {
                  b13.setBackground(Color.green);
           }

           if(rs.getString(15).equals("a"))
           {
                  b13.setBackground(Color.red);
           }

           if(rs.getString(15).equals("h"))
           {
                  b13.setBackground(Color.yellow);
           }

           if(rs.getString(15).equals("dl"))
           {
                  b13.setBackground(Color.orange);
           }

           if(rs.getString(15).equals("ml"))
           {
                  b13.setBackground(Color.pink);
           }

           if(rs.getString(15).equals("l"))
           {
                  b13.setBackground(Color.gray);
           }
           if(rs.getString(16).equals("p"))
           {
                  b14.setBackground(Color.green);
           }

           if(rs.getString(16).equals("a"))
           {
                  b14.setBackground(Color.red);
           }

           if(rs.getString(16).equals("h"))
           {
                  b14.setBackground(Color.yellow);
           }

           if(rs.getString(16).equals("dl"))
           {
                  b14.setBackground(Color.orange);
           }

           if(rs.getString(16).equals("ml"))
           {
                  b14.setBackground(Color.pink);
           }

           if(rs.getString(16).equals("l"))
           {
                  b14.setBackground(Color.gray);
           }

           if(rs.getString(17).equals("p"))
           {
                  b15.setBackground(Color.green);
           }

           if(rs.getString(17).equals("a"))
           {
                  b15.setBackground(Color.red);
           }

           if(rs.getString(17).equals("h"))
           {
                  b15.setBackground(Color.yellow);
           }

           if(rs.getString(17).equals("dl"))
           {
                  b15.setBackground(Color.orange);
           }

           if(rs.getString(17).equals("ml"))
           {
                  b15.setBackground(Color.pink);
           }

           if(rs.getString(17).equals("l"))
           {
                  b15.setBackground(Color.gray);
           }


           if(rs.getString(18).equals("p"))
           {
                  b16.setBackground(Color.green);
           }

           if(rs.getString(18).equals("a"))
           {
                  b16.setBackground(Color.red);
           }

           if(rs.getString(18).equals("h"))
           {
                  b16.setBackground(Color.yellow);
           }

           if(rs.getString(18).equals("dl"))
           {
                  b16.setBackground(Color.orange);
           }

           if(rs.getString(18).equals("ml"))
           {
                  b16.setBackground(Color.pink);
           }

           if(rs.getString(18).equals("l"))
           {
                  b16.setBackground(Color.gray);
           }

           if(rs.getString(19).equals("p"))
           {
                  b17.setBackground(Color.green);
           }

           if(rs.getString(19).equals("a"))
           {
                  b17.setBackground(Color.red);
           }

           if(rs.getString(19).equals("h"))
           {
                  b17.setBackground(Color.yellow);
           }

           if(rs.getString(19).equals("dl"))
           {
                  b17.setBackground(Color.orange);
           }

           if(rs.getString(19).equals("ml"))
           {
                  b17.setBackground(Color.pink);
           }

           if(rs.getString(19).equals("l"))
           {
                  b17.setBackground(Color.gray);
           }

           if(rs.getString(20).equals("p"))
           {
                  b18.setBackground(Color.green);
           }

           if(rs.getString(20).equals("a"))
           {
                  b18.setBackground(Color.red);
           }

           if(rs.getString(10).equals("h"))
           {
                  b8.setBackground(Color.yellow);
           }

           if(rs.getString(20).equals("dl"))
           {
                  b18.setBackground(Color.orange);
           }

           if(rs.getString(20).equals("ml"))
           {
                  b18.setBackground(Color.pink);
           }

           if(rs.getString(20).equals("l"))
           {
                  b18.setBackground(Color.gray);
           }

           if(rs.getString(21).equals("p"))
           {
                  b19.setBackground(Color.green);
           }

           if(rs.getString(21).equals("a"))
           {
                  b19.setBackground(Color.red);
           }

           if(rs.getString(21).equals("h"))
           {
                  b19.setBackground(Color.yellow);
           }

           if(rs.getString(21).equals("dl"))
           {
                  b19.setBackground(Color.orange);
           }

           if(rs.getString(21).equals("ml"))
           {
                  b19.setBackground(Color.pink);
           }

           if(rs.getString(21).equals("l"))
           {
                  b19.setBackground(Color.gray);
           }

           if(rs.getString(22).equals("p"))
           {
                  b20.setBackground(Color.green);
           }

           if(rs.getString(22).equals("a"))
           {
                  b20.setBackground(Color.red);
           }

           if(rs.getString(22).equals("h"))
           {
                  b20.setBackground(Color.yellow);
           }

           if(rs.getString(22).equals("dl"))
           {
                  b20.setBackground(Color.orange);
           }

           if(rs.getString(22).equals("ml"))
           {
                  b20.setBackground(Color.pink);
           }

           if(rs.getString(22).equals("l"))
           {
                  b20.setBackground(Color.gray);
           }

           if(rs.getString(23).equals("p"))
           {
                  b21.setBackground(Color.green);
           }

           if(rs.getString(23).equals("a"))
           {
                  b21.setBackground(Color.red);
           }

           if(rs.getString(23).equals("h"))
           {
                  b21.setBackground(Color.yellow);
           }

           if(rs.getString(23).equals("dl"))
           {
                  b21.setBackground(Color.orange);
           }

           if(rs.getString(23).equals("ml"))
           {
                  b21.setBackground(Color.pink);
           }

           if(rs.getString(23).equals("l"))
           {
                  b21.setBackground(Color.gray);
           }


           if(rs.getString(24).equals("p"))
           {
                  b22.setBackground(Color.green);
           }

           if(rs.getString(24).equals("a"))
           {
                  b22.setBackground(Color.red);
           }

           if(rs.getString(24).equals("h"))
           {
                  b22.setBackground(Color.yellow);
           }

           if(rs.getString(24).equals("dl"))
           {
                  b22.setBackground(Color.orange);
           }

           if(rs.getString(24).equals("ml"))
           {
                  b22.setBackground(Color.pink);
           }

           if(rs.getString(24).equals("l"))
           {
                  b22.setBackground(Color.gray);
           }

             if(rs.getString(25).equals("p"))
           {
                  b23.setBackground(Color.green);
           }

           if(rs.getString(25).equals("a"))
           {
                  b23.setBackground(Color.red);
           }

           if(rs.getString(25).equals("h"))
           {
                  b23.setBackground(Color.yellow);
           }

           if(rs.getString(25).equals("dl"))
           {
                  b23.setBackground(Color.orange);
           }

           if(rs.getString(25).equals("ml"))
           {
                  b23.setBackground(Color.pink);
           }

           if(rs.getString(25).equals("l"))
           {
                  b23.setBackground(Color.gray);
           }
           if(rs.getString(26).equals("p"))
           {
                  b24.setBackground(Color.green);
           }

           if(rs.getString(26).equals("a"))
           {
                  b24.setBackground(Color.red);
           }

           if(rs.getString(26).equals("h"))
           {
                  b24.setBackground(Color.yellow);
           }

           if(rs.getString(26).equals("dl"))
           {
                  b24.setBackground(Color.orange);
           }

           if(rs.getString(26).equals("ml"))
           {
                  b24.setBackground(Color.pink);
           }

           if(rs.getString(26).equals("l"))
           {
                  b24.setBackground(Color.gray);
           }

           if(rs.getString(27).equals("p"))
           {
                  b25.setBackground(Color.green);
           }

           if(rs.getString(27).equals("a"))
           {
                  b25.setBackground(Color.red);
           }

           if(rs.getString(27).equals("h"))
           {
                  b25.setBackground(Color.yellow);
           }

           if(rs.getString(27).equals("dl"))
           {
                  b25.setBackground(Color.orange);
           }

           if(rs.getString(27).equals("ml"))
           {
                  b25.setBackground(Color.pink);
           }

           if(rs.getString(27).equals("l"))
           {
                  b25.setBackground(Color.gray);
           }


           if(rs.getString(28).equals("p"))
           {
                  b26.setBackground(Color.green);
           }

           if(rs.getString(28).equals("a"))
           {
                  b26.setBackground(Color.red);
           }

           if(rs.getString(28).equals("h"))
           {
                  b26.setBackground(Color.yellow);
           }

           if(rs.getString(28).equals("dl"))
           {
                  b26.setBackground(Color.orange);
           }

           if(rs.getString(28).equals("ml"))
           {
                  b26.setBackground(Color.pink);
           }

           if(rs.getString(28).equals("l"))
           {
                  b26.setBackground(Color.gray);
           }

           if(rs.getString(29).equals("p"))
           {
                  b27.setBackground(Color.green);
           }

           if(rs.getString(29).equals("a"))
           {
                  b27.setBackground(Color.red);
           }

           if(rs.getString(29).equals("h"))
           {
                  b27.setBackground(Color.yellow);
           }

           if(rs.getString(29).equals("dl"))
           {
                  b27.setBackground(Color.orange);
           }

           if(rs.getString(29).equals("ml"))
           {
                  b27.setBackground(Color.pink);
           }

           if(rs.getString(29).equals("l"))
           {
                  b27.setBackground(Color.gray);
           }

           if(rs.getString(30).equals("p"))
           {
                  b28.setBackground(Color.green);
           }

           if(rs.getString(30).equals("a"))
           {
                  b28.setBackground(Color.red);
           }

           if(rs.getString(30).equals("h"))
           {
                  b28.setBackground(Color.yellow);
           }

           if(rs.getString(30).equals("dl"))
           {
                  b28.setBackground(Color.orange);
           }

           if(rs.getString(30).equals("ml"))
           {
                  b28.setBackground(Color.pink);
           }

           if(rs.getString(30).equals("l"))
           {
                  b28.setBackground(Color.gray);
           }

           if(rs.getString(31).equals("p"))
           {
                  b29.setBackground(Color.green);
           }

           if(rs.getString(31).equals("a"))
           {
                  b29.setBackground(Color.red);
           }

           if(rs.getString(31).equals("h"))
           {
                  b29.setBackground(Color.yellow);
           }

           if(rs.getString(31).equals("dl"))
           {
                  b29.setBackground(Color.orange);
           }

           if(rs.getString(31).equals("ml"))
           {
                  b29.setBackground(Color.pink);
           }

           if(rs.getString(31).equals("l"))
           {
                  b29.setBackground(Color.gray);
           }

           if(rs.getString(32).equals("p"))
           {
                  b30.setBackground(Color.green);
           }

           if(rs.getString(32).equals("a"))
           {
                  b30.setBackground(Color.red);
           }

           if(rs.getString(32).equals("h"))
           {
                  b30.setBackground(Color.yellow);
           }

           if(rs.getString(32).equals("dl"))
           {
                  b30.setBackground(Color.orange);
           }

           if(rs.getString(32).equals("ml"))
           {
                  b30.setBackground(Color.pink);
           }

           if(rs.getString(32).equals("l"))
           {
                  b30.setBackground(Color.gray);
           }

           if(rs.getString(33).equals("p"))
           {
                  b31.setBackground(Color.green);
           }

           if(rs.getString(33).equals("a"))
           {
                  b31.setBackground(Color.red);
           }

           if(rs.getString(33).equals("h"))
           {
                  b31.setBackground(Color.yellow);
           }

           if(rs.getString(33).equals("dl"))
           {
                  b31.setBackground(Color.orange);
           }

           if(rs.getString(33).equals("ml"))
           {
                  b31.setBackground(Color.pink);
           }

           if(rs.getString(33).equals("l"))
           {
                  b31.setBackground(Color.gray);
           }
            

  }
   }
     else if(ae.getSource()==b1)
   {
        rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
     pst=cn.prepareStatement("update attend SET a=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
        
           if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
         
       }
 
         pst=cn.prepareStatement("update attend SET a=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
        if(jc.getSelectedIndex()==0)
      {
          b1.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b1.setBackground(Color.red);
           pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 

 
       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b1.setBackground(Color.yellow);
           
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
       else if(jc.getSelectedIndex()==3)
      {
                   
          b1.setBackground(Color.orange);
         
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");


       }
       else if(jc.getSelectedIndex()==4)
      {
                   
          b1.setBackground(Color.pink);
                pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");


       }
       else if(jc.getSelectedIndex()==5)
      {
                   
           b1.setBackground(Color.gray);
         
           pst.setString(2,jcb.getSelectedItem().toString());
         pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");


       }
      }
}
     else if(ae.getSource()==b2)
   {
        rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET b=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
       if(jc.getSelectedIndex()==-1)
        {

          JOptionPane.showMessageDialog(this,"Please Select Value");
     } 

         
       else if(jc.getSelectedIndex()==0)
      {
       

          b2.setBackground(Color.green);
        

          pst.setString(1,"p");
         pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       
       }
       else if(jc.getSelectedIndex()==1)
      {
          b2.setBackground(Color.red);
          pst.setString(1,"a");
         pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
       }
  
       else if(jc.getSelectedIndex()==2)
      {
        b2.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
       else if(jc.getSelectedIndex()==3)
      {
        b2.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
 
       else if(jc.getSelectedIndex()==4)
      {
                   
           b2.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");


       }
       else if(jc.getSelectedIndex()==5)
      {
                   
        b2.setBackground(Color.gray);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");


       }


 }

 
}
     else if(ae.getSource()==b3)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET c=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }

       else if(jc.getSelectedIndex()==0)
      {
          b3.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b3.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b3.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b3.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==4)
      {
          b3.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b3.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }   
}
     else
 if(ae.getSource()==b4)
   {
       rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET d=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b4.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b4.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b4.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b4.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
     else if(jc.getSelectedIndex()==4)
      {
          b4.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b4.setBackground(Color.gray);

        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
}   

         else if(ae.getSource()==b5)
   {
         rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET e=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b5.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b5.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b5.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b5.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
     else if(jc.getSelectedIndex()==4)
      {
          b5.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b5.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
 
}

        else   if(ae.getSource()==b6)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET f=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b6.setBackground(Color.green);
           pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b6.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b6.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b6.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

      }
         else if(jc.getSelectedIndex()==4)
      {
          b6.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b6.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
         

       }
  }
      

       else if(ae.getSource()==b7)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET g=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b7.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b7.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b7.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b7.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b7.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b7.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
   }  
}  

       
         else if(ae.getSource()==b8)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET h=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b8.setBackground(Color.green);
        pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b8.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b8.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b8.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b8.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b8.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  
} 
}

      else if(ae.getSource()==b9)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET i=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b9.setBackground(Color.green);
        pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b9.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b9.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b9.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b9.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b9.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
    }  
   }
      else if(ae.getSource()==b10)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET j=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b10.setBackground(Color.green);
        pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b10.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b10.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b10.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
     else if(jc.getSelectedIndex()==4)
      {
          b10.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b10.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
    }  
   }


    if(ae.getSource()==b11)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET k=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b11.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b11.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b11.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
       else if(jc.getSelectedIndex()==3)
      {
          b11.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b11.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b11.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  
   }
}
     else if(ae.getSource()==b12)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET l=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b12.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b12.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b12.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b12.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b12.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b12.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
  
}
     else if(ae.getSource()==b13)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET m=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
    if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b13.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b13.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b13.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b13.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b13.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b13.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
   
}
     else if(ae.getSource()==b14)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET n=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
 
      if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b14.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b14.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b14.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b14.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b14.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b14.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
}   

         else if(ae.getSource()==b15)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET o=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b15.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b15.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b15.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b15.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b15.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b15.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
   }  
 
}

        else   if(ae.getSource()==b16)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET p=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b16.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b16.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b16.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b16.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b16.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b16.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
   }  
  }
      

       else if(ae.getSource()==b17)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET q=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
 
      if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b17.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b17.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b17.setBackground(Color.yellow);
         
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");

       }
       else if(jc.getSelectedIndex()==3)
      {
          b17.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b17.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b17.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
}  

       
         else if(ae.getSource()==b18)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET r=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b18.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b18.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b18.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b18.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b18.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b18.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
 
}

      else if(ae.getSource()==b19)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET s=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b19.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b19.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b19.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b19.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b19.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b19.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
   }  
 }
      else if(ae.getSource()==b20)
     {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET t=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
    
    if(jc.getSelectedIndex()==-1)
         {
            JOptionPane.showMessageDialog(this,"Please Select Value");
        }
        else if(jc.getSelectedIndex()==0)
       {
          b20.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b20.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b20.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b20.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
     else if(jc.getSelectedIndex()==4)
      {
          b20.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b20.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
   }  
   }

   else if(ae.getSource()==b21)
   {
               rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET u=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
   
    if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b21.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b21.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b21.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
       else if(jc.getSelectedIndex()==3)
      {
          b21.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b21.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b21.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  

}
     else if(ae.getSource()==b22)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET v=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b22.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b22.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b22.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b22.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b22.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b22.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  
}  
}
     else if(ae.getSource()==b23)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET w=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
 
      if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b23.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b23.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b23.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b23.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b23.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b23.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
   
}
     else if(ae.getSource()==b24)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET x=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
 
      if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b24.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b24.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b24.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b24.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b24.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b24.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
}   

         else if(ae.getSource()==b25)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET y=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b25.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b25.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b25.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b25.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b25.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b25.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  
  } 
}

        else   if(ae.getSource()==b26)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET z=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b26.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b26.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b26.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b26.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b26.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b26.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
    }  
  }
      

       else if(ae.getSource()==b27)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET aa=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b27.setBackground(Color.green);
          pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
       else if(jc.getSelectedIndex()==1)
      {
          b27.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b27.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b27.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b27.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b27.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
  }  
}  

       
         else if(ae.getSource()==b28)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET bb=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
  
     if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b28.setBackground(Color.green);
        pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b28.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b28.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b28.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b28.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b28.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
}  
 
}

      else if(ae.getSource()==b29)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET cc=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b29.setBackground(Color.green);
      pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b29.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b29.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b29.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
     else if(jc.getSelectedIndex()==4)
      {
          b29.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b29.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
}  
   }
      else if(ae.getSource()==b30)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET dd=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));

       if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b30.setBackground(Color.green);
 pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b30.setBackground(Color.red);
           pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b30.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b30.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
     else if(jc.getSelectedIndex()==4)
      {
          b30.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b30.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
    }
    }
      else if(ae.getSource()==b31)
   {
          rs=st.executeQuery("select * from attend");
          if(rs.next())
     {
    
     pst=cn.prepareStatement("update attend SET ee=? where month=? and empid="+Integer.parseInt(t2.getText().trim()));
    
   if(jc.getSelectedIndex()==-1)
        {
          JOptionPane.showMessageDialog(this,"Please Select Value");
       }
       else if(jc.getSelectedIndex()==0)
      {
          b31.setBackground(Color.green);
 pst.setString(1,"p");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         
       }
       else if(jc.getSelectedIndex()==1)
      {
          b31.setBackground(Color.red);
          pst.setString(1,"a");
           pst.setString(2,jcb.getSelectedItem().toString());
          pst.execute();
         JOptionPane.showMessageDialog(this,"Update Succesfull"); 
         

       }
  
       else if(jc.getSelectedIndex()==2)
      {
          b31.setBackground(Color.yellow);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"h");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         

       }
       else if(jc.getSelectedIndex()==3)
      {
          b31.setBackground(Color.orange);
         pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"dl");
        pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
       }
     else if(jc.getSelectedIndex()==4)
      {
          b31.setBackground(Color.pink);
            pst.setString(2,jcb.getSelectedItem().toString());
           pst.setString(1,"ml");
           pst.execute();
          JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
       else if(jc.getSelectedIndex()==5)
      {
          b31.setBackground(Color.gray);
        pst.setString(2,jcb.getSelectedItem().toString());
        pst.setString(1,"l");
         pst.execute();
        JOptionPane.showMessageDialog(this,"Update Succesfull");
         
      }
    }  
   }

    else if(ae.getSource()==b32)
   {
      this.dispose();
   }
     else if(ae.getSource()==b0)
   {
      new View1();
   }
 }
    catch(Exception e)
    {

                // JOptionPane.showMessageDialog(this,"Error is"+e);

   }
   
}
 public static void main(String args[])
{
  new Attend();
}
}
