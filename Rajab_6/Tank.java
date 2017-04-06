package Rajab_6;


/**
 * Write a description of class Tank here.
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

public class Tank implements Rank
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank;
    
    /**
     * Constructor for objects of class Tank
     * 
     * @param name Parameter dari constructor Tank dalam bentuk String
     * @param power Parameter dari constructor Tank dalam bentuk numerik (int)
     */
    public Tank(String name, int power)
    {
        // initialise instance variables
    }

    /**
     * Method untuk memasukkan nama serangan
     * 
     * @param name Parameter dari method setAttackName dalam bentuk String
     */
    public void setAttackName(String name)
    {
        this.attackName = name;
    }
    
    /**
     * Method untuk menampilkan nama serangan
     */
    public String getAttackName()
    {
        return attackName;
    }

    /**
     * Method untuk memasukkan kekuatan serangan
     * 
     * @param power Parameter dari method setAttackPower dalam bentuk numerik (int)
     */
    public void setAttackPower(int power)
    {
        this.attackPower = power;
    }
    
    /**
     * Method untuk menampilkan kekuatan serangan
     */
    public int getAttackPower()
    {
        return attackPower;
    }
    
    /**
     * Method untuk menampilkan nama rank
     */
    public double getRank()
    {
        rank = 0.8;
        return rank;
    }
}
