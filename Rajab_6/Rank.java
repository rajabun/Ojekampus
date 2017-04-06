package Rajab_6;


/**
 * Write a description of interface Rank here.
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
public interface Rank
{
    /**
     * Method untuk memasukkan nama serangan
     * 
     * @param name Parameter dari method setAttackName dalam bentuk String
     */
    public void setAttackName(String name);
    
    /**
     * Method untuk menampilkan nama serangan
     */
    public String getAttackName();
    
    /**
     * Method untuk memasukkan kekuatan serangan
     * 
     * @param power Parameter dari method setAttack dalam bentuk numerik (int)
     */
    public void setAttackPower(int power);
    
    /**
     * Method untuk menampilkan kekuatan serangan
     */
    public int getAttackPower();
    
    /**
     * Method untuk menampilkan nama rank
     */
    public double getRank();
    
}
