import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String.*;
class Report extends JInternalFrame implements ActionListener
{
JComboBox cmb,cmb1;
JTextField t1;
JButton b1,b2;
 //cmb1=new JComboBox();

Container c=getContentPane();
Report()
 {

   setTitle("......Final Report......");
   setSize(480,460);
   setResizable(false);
     setLayout(null);
      setLocation(300,80);
      c.setBackground(new Color (145,185,211));
     // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cmb=new JComboBox();

       cmb.addItem(" Month");
        cmb.setSelectedIndex(0);
           cmb.setBounds(80,80,120,30);
       
       cmb.addItem(" Month");
       cmb1=new JComboBox();
     cmb1.addItem("January");     cmb1.addItem("February");   
     cmb1.addItem("March");    cmb1.addItem("April");   
     cmb1.addItem("May");    cmb1.addItem("June");   
     cmb1.addItem("July");     cmb1.addItem("August");   
     cmb1.addItem("September");    cmb1.addItem("Octomber");   
     cmb1.addItem("November");   cmb1.addItem("December"); 
    
    cmb1.setBounds(240,80,120,30);
    b1=new JButton("View",new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));
    b2=new JButton("Back",new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));

    b1.setBounds(100,200,100,30);
    b2.setBounds(230,200,100,30);
c.add(cmb);
c.add(cmb1);
c.add(b1);
c.add(b2);
b1.addActionListener(this);

  
  b2.addActionListener(this);

  
setVisible(true);
}




public void actionPerformed(ActionEvent ae)
   {
   if(ae.getSource()==b1)
     {
       if(cmb.getSelectedIndex()==0)
          {

           String s=cmb1.getSelectedItem().toString();
           new Month(s);
          }
    } 
 else 
      if(ae.getSource()==b2)
 {
   this.dispose();
 }
}

public static void main(String args[])
{
new Report();
}
}