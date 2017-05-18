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
public class TungguGUI extends JPanel implements ActionListener
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
    private JButton jcomp10;
    private JButton jcomp11;
    private JMenuBar jcomp12;

    /**
     * Constructor for objects of class TungguGUI
     */
    public TungguGUI()
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
        jcomp2 = new JLabel ("Pelanggan Menunggu");
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
        jcomp10 = new JButton ("Delete");
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
        add (jcomp10);
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
        jcomp10.setBounds (395, 405, 100, 25);
        jcomp11.setBounds (255, 405, 100, 25);
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
        JFrame frame = new JFrame ("Pelanggan Menunggu");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new TungguGUI());
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

        JButton b = (JButton) evt.getSource();
        int k = Integer.parseInt(jcomp3.getText());
            
        if (b == jcomp1) //tombol pesan
        {
            Pelanggan p = DatabaseUser.getUserPelanggan(k);
            ////Ojek o = DatabaseUser.getUserOjek(k);
            //Pesanan d = DatabasePesanan.getPesanan(p);
            //d.setPelayan(o);
            //String s = d.toString();
            //jcomp8.setText(p.toString());
        }
        
        else if (b == jcomp10) //tombol pesan
        {
            Pelanggan p = DatabaseUser.getUserPelanggan(k);
            ////Ojek o = DatabaseUser.getUserOjek(k);
            //Pesanan d = DatabasePesanan.getPesanan(p);
            //d.setPelayan(o);
            //String s = d.toString();
            //jcomp8.setText(p.toString());
        }

    }
}
