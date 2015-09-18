import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

  class Help extends javax.swing.JInternalFrame
  {

   JEditorPane ep;
    JScrollPane sp;
    JButton b; 
    URL urls[],temp[];
    JPanel p;
    Help()
    {
    	
      super("Help - Employee Payrollment");
      setLocation(300,20);
      ep=new JEditorPane();
      ep.setEditable(false);
      
      ep.addHyperlinkListener(new HyperlinkListener()
      {
      public void hyperlinkUpdate(HyperlinkEvent he)
      {
        if(he.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
        {
          try
          {
          openpage(he.getURL());
          }
          catch(Exception e){} 
        }
        }});
      sp=new JScrollPane(ep,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
      b=new JButton("OK");
      b.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent ae)
          {
             setVisible(false);
          }
       });
      p=new JPanel(new FlowLayout());
      p.add(b);
      getContentPane().setLayout(new BorderLayout());
      getContentPane().add(p,BorderLayout.SOUTH);
      getContentPane().add(sp,BorderLayout.CENTER);
      String url1 = "file:" + System.getProperty("user.dir") +
             System.getProperty("file.separator") +
             "icons\\Help.htm";
      try
      { 
        ep.setPage(url1);
      }
      catch(Exception e)
      {
        JOptionPane.showMessageDialog((Container)null,"Unable to locate the help file!!","Village Council info",JOptionPane.OK_OPTION);         
      }
    } 
    
    public void openpage(URL url)
    {
     try
     {
       ep.setPage(url);
     }
     catch(IOException ex2){
     JOptionPane.showMessageDialog((Container)null,"Unable to locate the help file!!","Village Council info",JOptionPane.OK_OPTION);         
     }
    }
  public static void main(String args[])
{
   new Help();
}
  }//end of class help