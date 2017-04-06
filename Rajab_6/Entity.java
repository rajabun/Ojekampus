package Rajab_6;


/**
 * Write a description of class Entity here.
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
public abstract class Entity implements Wear
{
    // instance variables - replace the example below with your own
    protected String name;
    protected String weapon;
    protected String armor;
    protected int level;
    protected int health;
    protected int maxHP;
    protected int strength;
    protected double weaponDmg;
    protected double armorDef;
    protected double attack;
    protected double defense;
    protected boolean dead;
    protected Rank rank;
    
    /**
     * Constructor for objects of class Entity
     * 
     * @param name Parameter dari constructor Entity dalam bentuk String
     * @param level Parameter dari constructor Entity dalam bentuk numerik (int)
     * 
     */
    public Entity(String name, int level)
    {
        // initialise instance variables
        this.name = name;
        this.level = level;
        fullHP();
    }

    /**
     * Method untuk mengontrol level up
     * 
     */
    protected void levelUp()
    {
        // put your code here
        //return ;
        level = level + 1;
        fullHP();
    }
    
    /**
     * Method untuk memasukkan hp
     * 
     * @param diff Parameter dari method setHP dalam bentuk double
     */
    protected void setHP(double diff)
    {
        // put your code here
        //return ;
        maxHP = maxHP - health;
        if(maxHP == 0)
        {
            isDead();
        }
    }
    
    /**
     * Method untuk menampilkan damage
     * 
     * @param def Parameter dari method getDamage dalam bentuk double
     * @param opRank Parameter dari method getDamage dalam bentuk double
     * @return health Mengembalikan isi data dari instance variable health
     */
    protected int getDamage(double def, double opRank)
    {
        // put your code here
        int a = (int)attack;
        int d = (int)defense;
        health = (1+(((2*level/5)+2)*strength*(a/d)/50));
        return health;
    }
    
    /**
     * Method untuk memasukkan power
     * 
     */
    protected void setPower()
    {
        // put your code here
        //return ;
        attack = strength*(1+(weaponDmg/100));
        defense = strength*(1+(armorDef/100));
    }
    
    /**
     * Method untuk menampilkan nama
     * 
     * @return name Mengembalikan isi data dari instance variable name
     */
    protected String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * Method untuk menampilkan level
     * 
     * @return level Mengembalikan isi data dari instance variable level
     */
    protected int getLevel()
    {
        // put your code here
        return level;
    }
    
    /**
     * Method untuk menampilkan hp
     * 
     * @return maxHP Mengembalikan isi data dari instance variable maxHP
     */
    protected int getHP()
    {
        // put your code here
        return maxHP;
    }
    
    /**
     * Method untuk menampilkan status is Dead
     * 
     * @return true Mengembalikan isi method dalam bentuk true
     */
    protected boolean isDead()
    {
        // put your code here
        System.out.println("Your Character is Dead");
        return true;
    }
    
    /**
     * Method untuk memasukkan rank
     * 
     * @param rank Parameter dari method setRank dalam bentuk Rank (referensi dari class Rank)
     */
    protected void setRank(Rank rank)
    {
        // put your code here
        this.rank = rank;
    }
    
    /**
     * Method untuk menampilkan rank
     * 
     * @return rank Mengembalikan isi data dari instance variable rank
     */
    protected Rank getRank()
    {
        // put your code here
        return rank;
    }
    
    /**
     * Method untuk menampilkan attack
     * 
     * @return attack Mengembalikan isi data dari instance variable attack
     */
    protected double getAttack()
    {
        // put your code here
        return attack;
    }
    
    /**
     * Method untuk menampilkan defense
     * 
     * @return defense Mengembalikan isi data dari instance variable defense
     */
    protected double getDefense()
    {
        // put your code here
        return defense;
    }
    
    /**
     * Method untuk memasukkan weapon
     * 
     * @param name Parameter dari method setWeapon dalam bentuk String
     * @param dmg Parameter dari method setWeapon dalam bentuk double
     */
    public void setWeapon(String name, double dmg)
    {
        // put your code here
        //return ;
        weapon = name;
        weaponDmg = dmg;
        setPower();
    }
    
    /**
     * Method untuk menampilkan weapon
     * 
     * @return weapon Mengembalikan isi data dari instance variable weapon
     */
    public String getWeapon()
    {
        // put your code here
        return weapon;
    }
    
    /**
     * Method untuk memasukkan armor
     * 
     * @param name Parameter dari method setArmor dalam bentuk String
     * @param def Parameter dari method setArmor dalam bentuk double
     */
    public void setArmor(String name, double def)
    {
        // put your code here
        //return ;
        armor = name;
        armorDef = def;
        setPower();
    }
    
    /**
     * Method untuk menampilkan armor
     * 
     * @return armor Mengembalikan isi data dari instance variable armor
     */
    public String getArmor()
    {
        // put your code here
        return armor;
    }
    
    /**
     * Method untuk menampilkan weapon dmg
     * 
     * @return weaponDmg Mengembalikan isi data dari instance variable weaponDmg
     */
    public double getWeaponDmg()
    {
        // put your code here
        return weaponDmg;
    }
    
    /**
     * Method untuk menampilkan armor def
     * 
     * @return armorDef Mengembalikan isi data dari instance variable armorDef
     */
    public double getArmorDef()
    {
        // put your code here
        return armorDef;
    }
    
    /**
     * Method untuk membuat HP jadi full
     * abstract method
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public abstract void fullHP();
    
    /**
     * Method quote
     * abstract method
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public abstract void quote();
}
