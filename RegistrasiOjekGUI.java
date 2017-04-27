import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class RegistrasiOjekGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegistrasiOjekGUI extends Frame implements ActionListener
{
    // instance variables - replace the example below with your own
    private Button btn1, btn2;
    private TextField tfInput;  // Declare input TextField
    private TextField tfOutput; // Declare output TextField
    private Label lblInput;     // Declare input Label
    private Label lblOutput;    // Declare output Label
    /**
     * Constructor for objects of class RegistrasiOjekGUI
     */
    public RegistrasiOjekGUI()
    {
        // initialise instance variables
        //JLabel jlbHelloWorld = new JLabel("Hello World");
        //add(jlbHelloWorld);
        setTitle("Registrasi Ojek GUI"); // "super" Frame sets title
        setSize(280, 150); // "super" Frame sets initial size
        setVisible(true); // "super" Frame shows
        // pack();
        /*
        setLayout(new FlowLayout());
         // "super" Frame sets layout to FlowLayout, which arranges the components
         // from left-to-right, and flow from top-to-bottom.
         */
        setLayout(new GridLayout(3, 2, 3, 3));
         // "super" Frame sets layout to 3x2 GridLayout, horizontal and verical gaps of 3 pixels
         
        lblInput = new Label("Enter an Integer: "); // Construct Label
        add(lblInput);               // "super" Frame container adds Label component
 
        tfInput = new TextField(10); // Construct TextField
        add(tfInput);                // "super" Frame adds TextField 
        
        tfInput.addActionListener(this);
         // "tfInput" is the source object that fires an ActionEvent upon entered.
         // The source add "this" instance as an ActionEvent listener, which provides
         //  an ActionEvent handler called actionPerformed().
         // Hitting "enter" on tfInput invokes actionPerformed().
 
        lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
        add(lblOutput);               // "super" Frame adds Label
 
        tfOutput = new TextField(10); // allocate TextField
        tfOutput.setEditable(false);  // read-only
        add(tfOutput);
        
        btn1 = new Button("Button 1");
        add(btn1);
        setVisible(true); // "super" Frame shows
        btn2 = new Button("This is Button 2");
        add(btn2);
        setVisible(true); // "super" Frame shows
        
    }

    public static void main(String args[]) {
        new RegistrasiOjekGUI();
    }
    
    // ActionEvent handler - Called back upon hitting "enter" key on TextField
    @Override
    public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(tfInput.getText());
      //sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      //tfOutput.setText(sum + ""); // Display sum on the output TextField, convert int to String
      tfOutput.setText("");
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
