import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

/**
 * Write a description of class CustomerGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerGUI extends JPanel implements ActionListener
{
    // instance variables - replace the example below with your own
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp5;
    private JLabel jcomp3;
    private JMenuBar jcomp4;

    /**
     * Constructor for objects of class CustomerGUI
     */
    public CustomerGUI()
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
        //jcomp1 = new JButton ( new AbstractAction("Registrasi") 
        jcomp3 = new JLabel ("Menu Pelanggan");
        jcomp1 = new JButton ("Registrasi");
        jcomp2 = new JButton ("Pemesanan");
        jcomp5 = new JButton ("Menunggu");
        jcomp4 = new JMenuBar();
        jcomp4.add (fileMenu);
        jcomp4.add (helpMenu);

        //adjust size and set layout
        setPreferredSize (new Dimension (267, 235));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (90, 105, 100, 20);
        jcomp2.setBounds (80, 150, 120, 20);
        jcomp5.setBounds (90, 195, 100, 20);
        jcomp3.setBounds (95, 55, 100, 25);
        jcomp4.setBounds (0, 0, 270, 25);

        //jcomp1.addActionListener(this);
        jcomp1.addActionListener(this);
        jcomp2.addActionListener(this);
        jcomp5.addActionListener(this);
        // "jcomp1" is the source object that fires an ActionEvent when clicked.
        // The source add "this" instance as an ActionEvent listener, which provides
        //   an ActionEvent handler called actionPerformed().
        // Clicking "btnCount" invokes actionPerformed().
    }
    // Constructor to setup GUI components and event handlers

    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        JButton b = (JButton) evt.getSource();
        if (b == jcomp1)
        {
            RegistrasiPelangganGUI rp = new RegistrasiPelangganGUI();
            rp.main(new String[0]);
                
            /*
            try
            {
                throw new FileNotFoundException();
                
            }
            catch (FileNotFoundException f)
            {
                f.getMessage();
                f.printStackTrace();
                //throw f;
            }
            */
        }

        else if (b ==jcomp2)
        {
            PesananGUI p = new PesananGUI();
            p.main(new String[0]);
        }
        else
        {
            TungguGUI t = new TungguGUI();
            t.main(new String[0]);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Menu Pelanggan");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new CustomerGUI());
        frame.pack();
        frame.setVisible (true);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
