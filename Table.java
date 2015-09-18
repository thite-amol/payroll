import java.io.*;
import java.sql.*;
class Table
{
    Connection cn;
   Statement st;
   ResultSet rs;
   
  Table()
  {
     try
{   
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/payroll","root","root");
     System.out.println("Connection Successfull");
     st=cn.createStatement();

      st.execute("create table login(uid int,username varchar(20),password varchar(20))");
     System.out.println("Login table create successfully");

     st.executeUpdate("create table head(rid int primary key,name varchar(50),address varchar(50),state varchar(20),startdate date,contact bigint)");
        System.out.println("Head table create successfully");


   st.executeUpdate("create table employeemaster(empid int auto_increment primary key,name varchar(100),dob date,qualification varchar(20),experience int,joindate date,gender varchar(10))");
     System.out.println("Employeemaster table create successfully");
    
     st.executeUpdate("create table employeedetails(empid int,foreign key(empid) references employeemaster(empid),name varchar(20),dob date,qualification varchar(20),experience int,joindate date,gender varchar(10),designation varchar(20),salary decimal(10,2),contactno bigint)");
         System.out.println("Employeedetails table create successfully");
       

     st.executeUpdate("create table attend(empid int,foreign key(empid) references employeemaster(empid),month varchar(10),a varchar(10),b varchar(10),c varchar(10),d varchar(10),e varchar(10),f varchar(10),g varchar(10),h varchar(10),i varchar(10),j varchar(10),k varchar(10),l varchar(10),m varchar(10),n varchar(10),o varchar(10),p varchar(10),q varchar(10),r varchar(10),s varchar(10),t varchar(10),u varchar(10),v varchar(10),w varchar(10),x varchar(10),y varchar(10),z varchar(10),aa varchar(10),bb varchar(10),cc varchar(10),dd varchar(10),ee varchar(10),year int)");
        System.out.println("Attend table create successfully");


     st.executeUpdate("create table payslip(srno int auto_increment primary key,empid int,foreign key(empid) references employeemaster(empid),paydate date not null,salarymonth varchar(10),workingdays int,absend int,holidays int,basicsalary decimal(10,2),pf decimal(10,2),pt decimal(10,2),allowance decimal(10,2),totalincome decimal(10,2),deduction decimal(10,2),netsalary decimal(10,2))");
         System.out.println("PaySlip table create successfully");

      System.out.println("All Table created Successfully");
          
}
    catch(Exception e)
   {
     System.out.println("Error is"+e);
   }
   
}

  public static void main(String args[])
{
  new Table();
}
}