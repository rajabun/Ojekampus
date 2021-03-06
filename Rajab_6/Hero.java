package Rajab_6;


/**
 * Write a description of class Hero here.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.6 06 April 2017
 * @version 0.5, 23 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */
public class Hero extends Entity
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Hero
     * 
     * @param name Parameter dari constructor kelas ini dalam bentuk string
     * @param level Parameter dari constructor kelas ini dalam bentuk numerik (int)
     * 
     */
    public Hero(String name, int level)
    {
        // initialise instance variables
        super(name, level);
    }

    /**
     * Method quote
     * 
     */
    public void quote()
    {
        // put your code here
        //return 0;
        System.out.println("Kuat Banget");
    }
    
    /**
     * Method untuk membuat HP jadi full
     * 
     */
    public void fullHP()
    {
        // put your code here
        //return 0;
        maxHP = (15*level+5)/4;
        strength = (15*level+5)/8;
    }
    
}
