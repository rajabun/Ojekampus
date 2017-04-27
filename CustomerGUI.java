import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;

/**
 * Write a description of class CustomerGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerGUI extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JLabel lblCount;    // Declare a Label component 
    private JTextField tfCount; // Declare a TextField component 
    private JButton btnCount;   // Declare a Button component
    private int count = 0;     // Counter's value
    private JPanel listPane;
 
    /**
     * Constructor for objects of class CustomerGUI
     */
    public CustomerGUI()
    {
        // initialise instance variables
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
        */
        
        setLayout(new FlowLayout());
        // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
        // the components from left-to-right, and flow to next row from top-to-bottom.
        
        /*
        setLayout(new GridLayout(3, 2, 3, 3));
         // "super" Frame sets layout to 3x2 GridLayout, horizontal and verical gaps of 3 pixels
        */
        lblCount = new JLabel("Customer");  // construct the Label component
        add(lblCount);                    // "super" Frame container adds Label component
        //listPane.add(Box.createRigidArea(new Dimension(0,5)));

        tfCount = new JTextField("0", 10); // construct the TextField component
        setSize(160, 160);        // "super" Frame sets its initial window size
        tfCount.setEditable(false);       // set to read-only
        add(tfCount);                     // "super" Frame container adds TextField component
 
        btnCount = new JButton("Registrasi");   // construct the Button component
        //setSize(160, 160);        // "super" Frame sets its initial window size
        //btnCount.setPreferredSize(new Dimension(40, 40));
        //btnCount.setMaximumSize(new Dimension(40, 40));
        add(btnCount);                    // "super" Frame container adds Button component
        
        btnCount.addActionListener(this);
        // "btnCount" is the source object that fires an ActionEvent when clicked.
        // The source add "this" instance as an ActionEvent listener, which provides
        //   an ActionEvent handler called actionPerformed().
        // Clicking "btnCount" invokes actionPerformed().
        
        btnCount = new JButton("Pemesanan");   // construct the Button component
        add(btnCount);                    // "super" Frame container adds Button component
        
        btnCount.addActionListener(this);
        
        setTitle("Customer GUI");  // "super" Frame sets its title
        setSize(480, 360);        // "super" Frame sets its initial window size
 
        // For inspecting the Container/Components objects
        // System.out.println(this);
        // System.out.println(lblCount);
        // System.out.println(tfCount);
        // System.out.println(btnCount);
 
        setVisible(true);         // "super" Frame shows
 
        // System.out.println(this);
        // System.out.println(lblCount);
        // System.out.println(tfCount);
        // System.out.println(btnCount);
        
        
 
    }
    // Constructor to setup GUI components and event handlers
   
    // The entry main() method
    public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an instance
      CustomerGUI app = new CustomerGUI();
         // or simply "new AWTCounter();" for an anonymous instance
    }
 
    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt) {
      ++count; // Increase the counter value
      // Display the counter value on the TextField tfCount
      tfCount.setText(count + ""); // Convert int to String
    }
   
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
