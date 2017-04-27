import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class PesananGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananGUI
{
    // instance variables - replace the example below with your own
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    /**
     * Constructor for objects of class PesananGUI
     */
    public PesananGUI()
    {
        // initialise instance variables
        prepareGUI();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args){
     PesananGUI pesangui = new PesananGUI();     
     pesangui.showMenuDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Pesanan");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent windowEvent)
         {
            System.exit(0);
         }        
      }
      );    
      
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showMenuDemo(){
      //create a menu bar
      final MenuBar menuBar = new MenuBar();

      //create menus
      Menu fileMenu = new Menu("File");
      Menu editMenu = new Menu("Edit"); 
      final Menu aboutMenu = new Menu("About");

      //create menu items
      MenuItem newMenuItem = 
         new MenuItem("New",new MenuShortcut(KeyEvent.VK_N));
      newMenuItem.setActionCommand("New");

      MenuItem openMenuItem = new MenuItem("Open");
      openMenuItem.setActionCommand("Open");

      MenuItem saveMenuItem = new MenuItem("Save");
      saveMenuItem.setActionCommand("Save");

      MenuItem exitMenuItem = new MenuItem("Exit");
      exitMenuItem.setActionCommand("Exit");

      MenuItem cutMenuItem = new MenuItem("Cut");
      cutMenuItem.setActionCommand("Cut");

      MenuItem copyMenuItem = new MenuItem("Copy");
      copyMenuItem.setActionCommand("Copy");

      MenuItem pasteMenuItem = new MenuItem("Paste");
      pasteMenuItem.setActionCommand("Paste");
   
      MenuItemListener menuItemListener = new MenuItemListener();

      newMenuItem.addActionListener(menuItemListener);
      openMenuItem.addActionListener(menuItemListener);
      saveMenuItem.addActionListener(menuItemListener);
      exitMenuItem.addActionListener(menuItemListener);
      cutMenuItem.addActionListener(menuItemListener);
      copyMenuItem.addActionListener(menuItemListener);
      pasteMenuItem.addActionListener(menuItemListener);

      final CheckboxMenuItem showWindowMenu = 
         new CheckboxMenuItem("Show About", true);
      showWindowMenu.addItemListener(new ItemListener()
      {
          public void itemStateChanged(ItemEvent e)
          {
              if(showWindowMenu.getState())
              {
                  menuBar.add(aboutMenu);
              }
              else
              {
                  menuBar.remove(aboutMenu);
              }
         }
      }
      );

      //add menu items to menus
      fileMenu.add(newMenuItem);
      fileMenu.add(openMenuItem);
      fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(showWindowMenu);
      fileMenu.addSeparator();
      fileMenu.add(exitMenuItem);

      editMenu.add(cutMenuItem);
      editMenu.add(copyMenuItem);
      editMenu.add(pasteMenuItem);

      //add menu to menubar
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(aboutMenu);

      //add menubar to the frame
      mainFrame.setMenuBar(menuBar);
      mainFrame.setVisible(true);  
   }

   class MenuItemListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {            
         statusLabel.setText(e.getActionCommand() 
            + " MenuItem clicked.");
      }    
   }
}
