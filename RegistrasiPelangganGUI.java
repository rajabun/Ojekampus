import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Write a description of class RegistGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistrasiPelangganGUI extends JPanel implements ActionListener
{
    // instance variables - replace the example below with your own
    private JLabel jcomp1, jcomp3, jcomp5, jcomp7, jcomp9;
    private JMenuBar jcomp2;
    private JTextArea jcomp4, jcomp6, jcomp8, jcomp10;
    private JButton jcomp11;

    /**
     * Constructor for objects of class RegistGUI
     */
    public RegistrasiPelangganGUI()
    {
        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        //construct components
        jcomp1 = new JLabel ("Registrasi Pelanggan");
        jcomp2 = new JMenuBar();
        jcomp2.add (fileMenu);
        jcomp2.add (helpMenu);
        jcomp3 = new JLabel ("Nama      :");
        jcomp4 = new JTextArea (5, 5);
        jcomp5 = new JLabel ("Telepon   :");
        jcomp6 = new JTextArea (5, 5);
        jcomp7 = new JLabel ("Email       :");
        jcomp8 = new JTextArea (5, 5);
        jcomp9 = new JLabel ("DoB          :");
        jcomp10 = new JTextArea (5, 5);
       
        jcomp11 = new JButton ("Registrasi");

        //adjust size and set layout
        setPreferredSize (new Dimension (356, 280));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        
        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (145, 40, 150, 40);
        jcomp2.setBounds (0, 0, 375, 25);
        jcomp3.setBounds (20, 87, 70, 25);
        jcomp4.setBounds (85, 90, 250, 25);
        jcomp5.setBounds (19, 120, 70, 25);
        jcomp6.setBounds (85, 120, 250, 25);
        jcomp7.setBounds (19, 150, 70, 25);
        jcomp8.setBounds (85, 150, 250, 25);
        jcomp9.setBounds (19, 180, 70, 25);
        jcomp10.setBounds (85, 180, 250, 25);
        jcomp11.setBounds (235, 235, 100, 25);
    }

     public static void main (String[] args) {
        JFrame frame = new JFrame ("Registrasi Pelanggan");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new RegistrasiPelangganGUI());
        frame.pack();
        frame.setVisible (true);
    }
    
    // ActionEvent handler - Called back upon hitting "enter" key on TextField
    @Override
    public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      //int numberIn = Integer.parseInt(tfInput.getText());
      //sum += numberIn;      // Accumulate numbers entered into sum
      //tfInput.setText("");  // Clear input TextField
      //tfOutput.setText(sum + ""); // Display sum on the output TextField, convert int to String
      //tfOutput.setText("");
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
