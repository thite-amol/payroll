import java.awt.*;
import java.awt.event.*;
public class Print
{
 public static void main(String arg[])

 {
  usePrinter useprinter = new usePrinter();
 }
}
class usePrinter extends Frame{
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


