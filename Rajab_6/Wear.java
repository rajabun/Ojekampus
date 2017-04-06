package Rajab_6;


/**
 * Write a description of interface Wear here.
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

public interface Wear
{
    /**
     * Method untuk memasukkan weapon
     * 
     * @param name Parameter dari method setWeapon dalam bentuk String
     * @param dmg Parameter dari method setWeapon dalam bentuk double
     */
    public void setWeapon(String name, double dmg);
    
    /**
     * Method untuk menampilkan weapon
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public String getWeapon();
    
    /**
     * Method untuk memasukkan armor
     * 
     * @param name Parameter dari method setArmor dalam bentuk String
     * @param def Parameter dari method setArmor dalam bentuk double
     */
    public void setArmor(String name, double def);
    
    /**
     * Method untuk menampilkan armor
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public String getArmor();
    
    /**
     * Method untuk menampilkan weapon dmg
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public double getWeaponDmg();
    
     /**
     * Method untuk menampilkan armor def
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public double getArmorDef();
}
