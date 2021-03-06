import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Write a description of class PesananGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananGUI extends JPanel implements ActionListener
{
    // instance variables - replace the example below with your own
    private JLabel jcomp1, jcomp3, jcomp5, jcomp7, jcomp9, jcomp11, jcomp13, jcomp21;
    private JMenuBar jcomp2;
    private JTextField jcomp4, jcomp8, jcomp10, jcomp12, jcomp14, jcomp15, jcomp16, jcomp17, jcomp22, jcomp23, jcomp24, jcomp25, jcomp26, jcomp27;
    private JButton jcomp18, jcomp19;
    private JComboBox jcomp20;

    /**
     * Constructor for objects of class PesananGUI
     */
    public PesananGUI()
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
        //String[] jcomp20Items = {"Antar Orang", "Antar Barang", "Beli Barang"};
        final DefaultComboBoxModel jcomp20Items = new DefaultComboBoxModel();

        jcomp20Items.addElement("Antar Orang");
        jcomp20Items.addElement("Antar Barang");
        jcomp20Items.addElement("Beli Barang");

        //construct components
        jcomp1 = new JLabel ("Pemesanan Pelanggan");
        jcomp2 = new JMenuBar();
        jcomp2.add (fileMenu);
        jcomp2.add (helpMenu);
        jcomp3 = new JLabel ("ID                        :");
        jcomp4 = new JTextField ("Id", 5);
        jcomp5 = new JLabel ("Tipe Layanan   :");

        jcomp20 = new JComboBox (jcomp20Items);
        //jcomp20.setSelectedIndex(2);

        //jcomp6 = new JTextArea (5, 5);
        jcomp7 = new JLabel ("Lokasi Awal     :");
        //jcomp8 = new JTextField (5);
        jcomp9 = new JLabel ("Lokasi Akhir     :");
        //jcomp10 = new JTextField (5);
        jcomp11 = new JLabel ("NP Awal             :");
        jcomp12 = new JTextField ("Nama Pengguna Awal", 5);
        jcomp13 = new JLabel ("NP Akhir            :");
        jcomp27 = new JTextField ("Nama Pengguna Akhir", 5);
        jcomp21 = new JLabel ("Biaya               :");
        jcomp22 = new JTextField ("Biaya", 5);

        jcomp14 = new JTextField ("x", 5);
        jcomp15 = new JTextField ("x", 5);
        jcomp16 = new JTextField ("Nama Lokasi", 5);
        jcomp17 = new JTextField ("Nama Lokasi", 5);
        jcomp23 = new JTextField ("y", 5);
        jcomp24 = new JTextField ("y", 5);
        jcomp25 = new JTextField ("Keterangan", 5);
        jcomp26 = new JTextField ("Keterangan", 5);

        jcomp18 = new JButton ("Pesan");
        jcomp19 = new JButton ("Enter");

        //adjust size and set layout
        setPreferredSize (new Dimension (490, 420));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        //add (jcomp6);
        add (jcomp7);
        //add (jcomp8);
        add (jcomp9);
        //add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);

        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);

        add (jcomp18);
        add (jcomp19);
        add (jcomp20);
        add (jcomp21);
        add (jcomp22);
        add (jcomp23);
        add (jcomp24);
        add (jcomp25);
        add (jcomp26);
        add (jcomp27);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (145, 40, 180, 40);
        jcomp2.setBounds (0, 0, 490, 25);
        jcomp3.setBounds (20, 87, 100, 25);
        jcomp4.setBounds (115, 90, 250, 25);
        jcomp5.setBounds (19, 120, 100, 25);
        //jcomp6.setBounds (85, 120, 250, 25);
        jcomp20.setBounds (115, 120, 250, 25);
        jcomp7.setBounds (19, 150, 100, 25);
        //jcomp8.setBounds (115, 150, 250, 25);
        jcomp9.setBounds (19, 180, 100, 25);
        //jcomp10.setBounds (115, 180, 250, 25);
        jcomp11.setBounds (19, 210, 100, 25);
        jcomp12.setBounds (115, 210, 250, 25);
        jcomp13.setBounds (19, 240, 100, 25);
        jcomp27.setBounds (115, 240, 250, 25);
        jcomp21.setBounds (19, 270, 100, 25);
        jcomp22.setBounds (115, 270, 250, 25);

        jcomp14.setBounds (115, 150, 45, 25);
        jcomp15.setBounds (115, 180, 45, 25);
        jcomp23.setBounds (170, 150, 45, 25);
        jcomp24.setBounds (170, 180, 45, 25);

        jcomp16.setBounds (225, 150, 110, 25);
        jcomp17.setBounds (225, 180, 110, 25);
        jcomp25.setBounds (345, 150, 110, 25);
        jcomp26.setBounds (345, 180, 110, 25);

        jcomp18.setBounds (375, 330, 100, 25);
        jcomp19.setBounds (375, 90, 100, 25);

        jcomp18.addActionListener(this);
        jcomp19.addActionListener(this);

    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("Pemesanan Pelanggan");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new PesananGUI());
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
        if (b == jcomp19) //tombol enter
        {
            //PesananGUI p = new PesananGUI();
            //p.main(new String[0]);
            int k = Integer.parseInt(jcomp4.getText());
            DatabaseUser.getUserPelanggan(k);            
        }
        else //tombol pesan
        {
            int i = Integer.parseInt(jcomp4.getText());
            double x1 = Double.parseDouble(jcomp14.getText());
            double y1 = Double.parseDouble(jcomp23.getText());
            Lokasi l1 = new Lokasi(jcomp16.getText(), x1, y1, jcomp25.getText()); //lokasi awal
            double x2 = Double.parseDouble(jcomp15.getText());
            double y2 = Double.parseDouble(jcomp24.getText());
            Lokasi l2 = new Lokasi(jcomp17.getText(), x1, y1, jcomp26.getText()); //lokasi akhir
            double rupiah = Double.parseDouble(jcomp22.getText());
            
            String TL = (String)jcomp20.getSelectedItem();
            TipeLayanan V = null;
            if(TL == "Antar Barang")
            {
                V = TipeLayanan.AntarBarang;
            }
            
            else if(TL == "Antar Orang")
            {
                V = TipeLayanan.AntarOrang;
            }
            
            else if(TL == "Beli Barang")
            {
                V = TipeLayanan.BeliBarang;
            }
            
            Pesanan p = new Pesanan(DatabaseUser.getUserPelanggan(i), V, l1, l2, jcomp12.getText(), jcomp27.getText(), rupiah);
            try
            {
                DatabasePesanan.addPesanan(p);
                //System.out.println(DatabasePesanan.getDatabase());                
                System.out.println(p);                
                //rp.main(new String[0]);
            }
            catch(PesananSudahAdaException e)
            {
                e.getMessage();
            }
            //String value = jcomp20.getSelectedItem().toString();
        }        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
