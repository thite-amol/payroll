import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String.*;
class Report1 extends JInternalFrame implements ActionListener
{
   JComboBox cmb;
   JTextField t1;
   JButton b1,b2;
   Container c=getContentPane(); 
   Report1()
 {
   setTitle(" Generate Payment......");
   setSize(480,460);
   setResizable(false);
     setLayout(null);
      setLocation(300,80);
      c.setBackground(new Color (145,185,211));
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cmb=new JComboBox();
      cmb= new JComboBox();
      cmb.addItem("One by one");
      cmb.addItem("All at once");
      cmb.setSelectedIndex(0);
      cmb.setBounds(80,80,120,30);
    t1=new JTextField(20);
    t1.setBounds(240,80,120,30);
    b1=new JButton("View",new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));
    b2=new JButton("Back",new ImageIcon(ClassLoader.getSystemResource("Images/save.png")));

    b1.setBounds(100,200,100,30);
    b2.setBounds(230,200,100,30);
c.add(cmb);
c.add(t1);
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
         System.out.println("In index 1");
            new PaySlip();
          }
       if(cmb.getSelectedIndex()==1)
          {
           new PaySlip1();
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
    new Report1();
  }
}