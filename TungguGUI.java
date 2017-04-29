import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Write a description of class TungguGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TungguGUI extends JPanel
{
    // instance variables - replace the example below with your own
    private JLabel jcomp1;
    private JMenuBar jcomp2;
    private JLabel jcomp3;
    private JTextArea jcomp4;
    private JButton jcomp5;
    private JLabel jcomp6;
    private JTextField jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;

    /**
     * Constructor for objects of class TungguGUI
     */
    public TungguGUI()
    {
        // initialise instance variables
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
        jcomp1 = new JLabel ("Pelanggan Menunggu");
        jcomp2 = new JMenuBar();
        jcomp2.add (fileMenu);
        jcomp2.add (helpMenu);
        jcomp3 = new JLabel ("ID      :");
        jcomp4 = new JTextArea (5, 5);
        jcomp5 = new JButton ("Enter");
        jcomp6 = new JLabel ("Informasi Pesanan");
        jcomp7 = new JTextField (5);
        jcomp8 = new JButton ("Accept");
        jcomp9 = new JButton ("Decline");
        jcomp10 = new JButton ("Delete");

        //adjust size and set layout
        setPreferredSize (new Dimension (356, 320));
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

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (120, 40, 150, 40);
        jcomp2.setBounds (0, 0, 375, 25);
        jcomp3.setBounds (50, 88, 70, 25);
        jcomp4.setBounds (95, 90, 150, 25);
        jcomp5.setBounds (255, 90, 75, 25);
        jcomp6.setBounds (120, 150, 120, 20);
        jcomp7.setBounds (130, 190, 100, 25);
        jcomp8.setBounds (80, 240, 85, 25);
        jcomp9.setBounds (195, 240, 85, 25);
        jcomp10.setBounds (130, 280, 100, 25);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Pelanggan Menunggu");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new TungguGUI());
        frame.pack();
        frame.setVisible (true);
    }
}
