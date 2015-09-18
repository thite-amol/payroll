import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.event.*;
import java.io.*;
import java.io.*;

public class Home extends JFrame 
 {
  EmployeeInfo a;
  Head of;
  Report or;
  Attend ad;
  Report1 p;
  Newpass np;
   Delete dr;
  Help h;
  JLabel welcome1,author;
  JToolBar toolBar;
  JDesktopPane desktop;
  JButton bnew,bopen,bdelete,bnewpass,blogout,bhelp,bcredit,bview,btotal;
  String rpl;

Action newCon,newPass,logoutAction,helpAction,viewAction,openframeAction,creatorAction,deleteAction,totalAction;

public Home()
{
//it sets dimension of screen	
		
Toolkit kit = Toolkit.getDefaultToolkit();
Dimension screenSize = kit.getScreenSize();
int screenHeight = screenSize.height-30;
int screenWidth = screenSize.width;
		
		
setSize(screenWidth, screenHeight);

		
Image img = kit.getImage("icons\\india.jpg");
this.setIconImage(img);
		
		
setTitle("Welcome to Employee Enrollment");
		
		
     setResizable(false);
		
		
    desktop = new JDesktopPane();
    add(desktop, BorderLayout.CENTER);
		

    bnew = new JButton((new ImageIcon ("icons\\add.png")));

    bview= new JButton("Exit",new ImageIcon(ClassLoader.getSystemResource("Images/cancel.png")));


    bopen = new JButton ();

    bnewpass = new JButton();

    blogout = new JButton ();

    bdelete = new JButton ();

    bhelp = new JButton ();

    btotal=new JButton();

    bcredit = new JButton ();
		
		
//statusBar = new JPanel ();

toolBar = new JToolBar ();
toolBar.setBackground(Color.black);
			
// Adding Buttons on ToolBar
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add (bnew);
		
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add(bopen);
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add(bview);
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add(btotal);
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add (bdelete);

toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add (bcredit);
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.add (bhelp);
			
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
toolBar.addSeparator ();
			
			
			
			toolBar.addSeparator ();
			toolBar.addSeparator ();
			toolBar.addSeparator ();
			toolBar.addSeparator ();
			toolBar.addSeparator ();
			toolBar.add (bnewpass);
			
			toolBar.addSeparator ();
			toolBar.addSeparator ();
			toolBar.add (blogout);

newCon = new AbstractAction("Add", new ImageIcon ("icons\\add.jpg")) 
{
//   private static final long serialVersionUID = 1L;
     public void actionPerformed(ActionEvent e) 
{

   a= new EmployeeInfo();
   a.setClosable(true);
   a.setResizable(false);
   a.setMaximizable(false);
   a.setIconifiable(true);
   a.setVisible(true);
   desktop.add(a);
    
  }
};



openframeAction = new AbstractAction("Head", new ImageIcon ("icons\\view.jpg")) 
{
       public void actionPerformed(ActionEvent e) 
{
       of=new Head();
       of.setClosable(true);
       of.setResizable(false);
       of.setMaximizable(false);
       of.setIconifiable(true);
       of.setVisible(true);
       desktop.add(of);
   }
};


viewAction = new AbstractAction("Attendes", new ImageIcon ("icons\\view.jpg")) 
{
public void actionPerformed(ActionEvent e) 
{
  ad=new Attend();
  ad.setClosable(true);
  ad.setResizable(false);
  ad.setMaximizable(false);
  ad.setIconifiable(true);
  ad.setVisible(true);
  desktop.add(ad);
  }
 };
				
totalAction = new AbstractAction("Payment", new ImageIcon ("icons\\total.jpg")) 
{
public void actionPerformed(ActionEvent e) 
{
  p=new Report1 ();
  p.setClosable(true);
  p.setResizable(false);
  p.setMaximizable(false);
  p.setIconifiable(true);
  p.setVisible(true);
  desktop.add(p);
  }
};
		
deleteAction = new AbstractAction("Delete", new ImageIcon ("icons\\delete.jpg")) 
{
public void actionPerformed(ActionEvent e) 
{
  dr=new Delete();
  dr.setClosable(true);
  dr.setResizable(false);
  dr.setMaximizable(false);
  dr.setIconifiable(true);
  dr.setVisible(true);
  desktop.add(dr);
  }
};


					
creatorAction = new AbstractAction("Report", new ImageIcon ("icons\\credit.jpg")) 
{
  public void actionPerformed(ActionEvent e)
 {
    or=new Report();
     or.setClosable(true);
     or.setResizable(false);
     or.setMaximizable(false);
     or.setIconifiable(true);
     or.setVisible(true);
     desktop.add(or);
  }
};



				
newPass = new AbstractAction("", new ImageIcon ("icons\\lock.jpg")) 
{
public void actionPerformed(ActionEvent e) 
{
  np = new Newpass();
  np.setClosable(true);
  np.setResizable(false);
  np.setMaximizable(false);
  np.setIconifiable(true);
  np.setVisible(true);
  desktop.add(np);
  }
 };
			
helpAction = new AbstractAction("Help", new ImageIcon ("icons\\help.jpg")) 
{
public void actionPerformed(ActionEvent e) 
{
  h = new Help();
  h.setClosable(true);
  h.setResizable(false);
  h.setMaximizable(false);
  h.setIconifiable(true);
  h.setVisible(true);
  h.setSize(700,600);
  desktop.add(h);
   }
 };

//Action performed

logoutAction = new AbstractAction("", new ImageIcon ("icons\\exit.jpg")) 
{

public void actionPerformed(ActionEvent e) 
{
  try 
{
  int reply = JOptionPane.showInternalConfirmDialog(desktop, "Are you really want to exit\nFrom Employee Enrollment?", "Employee Enrollment - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
if (reply == JOptionPane.YES_OPTION) 
{
  setVisible (false);		//Hide the Frame.
  dispose();            	//Free the System Resources.
  System.exit (0);		 //Close the Application.
}
  else if (reply == JOptionPane.NO_OPTION) 
{
  setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

 }
} 
 catch (Exception ae) 
{
    
  }
 }
};

// this sets action to Buttons like AddActionListener
			
			bnew.setAction(newCon);
			bopen.setAction(openframeAction);
			bnewpass.setAction(newPass);
			blogout.setAction(logoutAction);
			bhelp.setAction(helpAction);
			bview.setAction(viewAction);
			bdelete.setAction(deleteAction);
			btotal.setAction(totalAction);
			bcredit.setAction(creatorAction);
			
// Adding ToolBar
			
			getContentPane().add (toolBar, BorderLayout.NORTH);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			getContentPane().add (toolBar, BorderLayout.NORTH);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	
			// it sets ToolTip 
			
			bnew.setToolTipText("Add New Employee");
			bopen.setToolTipText("Head Office Details");
			bdelete.setToolTipText("Delete employee");
			bhelp.setToolTipText("Help");
			bcredit.setToolTipText("Report");
			bnewpass.setToolTipText("Change Password");
			blogout.setToolTipText("Log Out");
			bview.setToolTipText("Open Attendas");
			btotal.setToolTipText("View toatl Payment");
				
			
			
 }
public static void main(String args[])
 {
  new Home();
}

  }
