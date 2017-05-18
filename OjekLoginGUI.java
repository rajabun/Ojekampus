import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Write a description of class OjekLoginGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OjekLoginGUI extends JPanel implements ActionListener
{
    // instance variables - replace the example below with your own
    private JButton jcomp1;
    private JLabel jcomp2;
    private JTextField jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JTextField jcomp6;
    private JLabel jcomp7;
    private JTextArea jcomp8;
    private JButton jcomp9;
    private JButton jcomp11;
    private JMenuBar jcomp12;

    /**
     * Constructor for objects of class OjekLoginGUI
     */
    public OjekLoginGUI()
    {
        // initialise instance variables

        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        //construct components
        jcomp1 = new JButton ("Enter");
        jcomp2 = new JLabel ("Ojek Menunggu");
        jcomp3 = new JTextField ("No ID", 5);
        jcomp4 = new JLabel ("ID     :");
        jcomp5 = new JLabel ("Status     :");
        jcomp6 = new JTextField (5);
        jcomp6.setEditable(false);
        jcomp7 = new JLabel ("Informasi Pesanan");
        jcomp8 = new JTextArea (5, 5);

        //
        // By default the JTextAread is editable, calling
        // setEditable(false) produce uneditable JTextArea.
        //
        jcomp8.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(jcomp8);

        this.add(scrollPane, BorderLayout.CENTER);

        jcomp9 = new JButton ("Accept");
        jcomp11 = new JButton ("Decline");
        jcomp12 = new JMenuBar();
        jcomp12.add (fileMenu);
        jcomp12.add (helpMenu);

        //adjust size and set layout
        setPreferredSize (new Dimension (578, 448));
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
        add (jcomp11);
        add (jcomp12);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (195, 80, 75, 25);
        jcomp2.setBounds (240, 35, 130, 25);
        jcomp3.setBounds (80, 80, 100, 25);
        jcomp4.setBounds (35, 80, 40, 25);
        jcomp5.setBounds (305, 80, 100, 25);
        jcomp6.setBounds (380, 80, 150, 25);
        jcomp7.setBounds (245, 130, 110, 25);
        jcomp8.setBounds (80, 170, 450, 230);
        jcomp9.setBounds (115, 405, 100, 25);
        jcomp11.setBounds (395, 405, 100, 25);
        jcomp12.setBounds (0, 0, 580, 25);

        jcomp1.addActionListener(this);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Login Ojek");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new OjekLoginGUI());
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        // Get the String entered into the TextField tfInput, convert to int
        //int numberIn = Integer.parseInt(tfInput.getText());
        //sum += numberIn;      // Accumulate numbers entered into sum
        //tfInput.setText("");  // Clear input TextField
        //tfOutput.setText(sum + ""); // Display sum on the output TextField, convert int to String
        //tfOutput.setText("");

        JButton b = (JButton) evt.getSource();
        int k = Integer.parseInt(jcomp3.getText());

        if (b == jcomp1) //tombol pesan
        {
            //Pelanggan p = DatabaseUser.getUserPelanggan(k);
            Ojek o = DatabaseUser.getUserOjek(k);
            //Pesanan d = DatabasePesanan.getPesanan(p);
            //d.setPelayan(o);
            //String s = d.toString();
            //jcomp8.setText(p.toString());
        }

        else if (b == jcomp11) //tombol pesan
        {
            //Pelanggan p = DatabaseUser.getUserPelanggan(k);
            Ojek o = DatabaseUser.getUserOjek(k);
            //Pesanan d = DatabasePesanan.getPesanan(p);
            //d.setPelayan(o);
            //String s = d.toString();
            //jcomp8.setText(p.toString());
        }
    }
}
/*
public class OjekLoginGUI extends JPanel
{   
// instance variables - replace the example below with your own
private JLabel jcomp1;
private JMenuBar jcomp2;
private JLabel jcomp3;
private JTextField jcomp4;
private JButton jcomp5;
private JLabel jcomp6;
private JTextField jcomp7;
private JButton jcomp8;
private JButton jcomp9;

/**
 * Constructor for objects of class OjekLoginGUI
 *
public OjekLoginGUI()
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
jcomp1 = new JLabel ("Login Ojek");
jcomp2 = new JMenuBar();
jcomp2.add (fileMenu);
jcomp2.add (helpMenu);
jcomp3 = new JLabel ("ID      :");
jcomp4 = new JTextField ("No ID", 5);
jcomp5 = new JButton ("Enter");
jcomp6 = new JLabel ("Informasi Pesanan");
jcomp7 = new JTextField ("Status", 5);
jcomp8 = new JButton ("Accept");
jcomp9 = new JButton ("Decline");

//adjust size and set layout
setPreferredSize (new Dimension (356, 302));
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

//set component bounds (only needed by Absolute Positioning)
jcomp1.setBounds (145, 40, 75, 40);
jcomp2.setBounds (0, 0, 375, 25);
jcomp3.setBounds (50, 88, 70, 25);
jcomp4.setBounds (95, 90, 150, 25);
jcomp5.setBounds (255, 90, 75, 25);
jcomp6.setBounds (120, 150, 120, 20);
jcomp7.setBounds (130, 190, 100, 25);
jcomp8.setBounds (80, 240, 85, 25);
jcomp9.setBounds (195, 240, 85, 25);
}

/**
 * An example of a method - replace this comment with your own
 * 
 * @param  y   a sample parameter for a method
 * @return     the sum of x and y 
 *
public static void main (String[] args) {
JFrame frame = new JFrame ("Login Ojek");
frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add (new OjekLoginGUI());
frame.pack();
frame.setVisible (true);
}
}
/*

 */