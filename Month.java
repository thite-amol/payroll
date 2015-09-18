   import javax.swing.*;
import java.awt.*;
import java.sql.*;

class Month extends JFrame
{
  JTable jt;
Connection cn;
ResultSet rs1,rs2;
Statement st1,st2;
Container cp=getContentPane();
Month(String s)
  {

String ss=s;
    setSize(1367,766);
  //cp.setBackground(new Color(145,185,211));
cp.setBackground(new Color(145,185,211));
    setTitle("Data in Pay -Slip");
    setLocation(0,0);
    //b1=new JButton("jjjjj");
//b1.setBounds(10,10,100,30);
//cp.add(b1);    
  try
    {
      Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
   cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/payroll","root","root");
   System.out.println("Connection Successfull");
  Statement st1=cn.createStatement();
       Statement st2=cn.createStatement();
       ResultSet rs1=st1.executeQuery("select count(*) from payslip");
       rs1.next();
       int r=Integer.parseInt(rs1.getString(1));
//int ip=Integer.parseInt(ss);
       ResultSet rs2=st1.executeQuery("select * from payslip where salarymonth='"+ss+"'");
       ResultSetMetaData rsm=rs2.getMetaData();
       int c=rsm.getColumnCount();
       String head[]=new String[c];
       for(int i=0;i<c;i++)
       head[i]=rsm.getColumnLabel(i+1);
       String data[][]=new String[r][c];
       int k=0;
       while(rs2.next())
       {
         for(int i=0;i<c;i++)
         {
            data[k][i]=rs2.getString(i+1);
         }
         k++;
       }
 jt=new JTable(data,head);
//jt.setBounds(0,100,1366,767);
jt.setBackground(Color.pink);
      int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
       int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
       JScrollPane jsp=new JScrollPane(jt,v,h);
       cp.add(jsp);

       validate();

    }
    catch(Exception e)
    {
      System.out.println(e);
    }
setVisible(true);
    
  }
  public static void main(String args[])
   {

   String s="1";
  new Month(s);
  }
}
