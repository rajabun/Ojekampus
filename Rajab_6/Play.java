package Rajab_6;


/**
 * Write a description of class Play here.
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
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    //private Random rand;
    private int enemyCount;
    
    /**
     * Constructor for objects of class Play
     */
    private Play()
    {
        // initialise instance variables
        initialize();
        System.out.println("War start!" + "\nHero = " + player.getName() 
        + ", level = " + player.getLevel() + "\nEnemy = " + enemy.getName() 
        + ", level = " + player.getLevel());
        for (int i = 1; !player.isDead(); i++)
        {
            //print(i);
            // kode anda
            if (enemy.isDead())
            {
                System.out.println("Enemy died! Spawning new enemy!");
                // kode anda
                System.out.println("Player level up! Level = " + player.getLevel());
            }
        }
        System.out.println("Hero mati pada level " + player.getLevel());
    }   
    
    /**
     * Method untuk inisialisasi
     * 
     */
    private void initialize()
    {
        //Random r = new Random();
        Hero h = new Hero("Rajab",1);
        h.setRank(setAttackPower(100));
    }
    
    /**
     * Method untuk inisialisasi musuh
     * 
     */
    private void initializeEnemy()
    {
        
    }
    
    /**
     * Method untuk mencetak
     * 
     * @param i Parameter dari method setAttackName dalam bentuk numerik (int)
     */
    private void Print(int i)
    {
        System.out.println("\nRound = " + i +
        "\nKill count = " + (enemyCount - 1) +
        "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
        // kode anda
    }
    
    /**
     * Method untuk memasukkan rank
     * 
     * @param name Parameter dari method setRank dalam bentuk String
     * @param power Parameter dari method setRank dalam bentuk numerik (int)
     */
    private Rank setRank(String name, int power)
    {
        
    }
    
    /**
     * Method untuk memasukkan rank
     * 
     * @param attacker Parameter dari method attackTurn yang mengacu pada kelas Entity
     * @param defender Parameter dari method attackTurn yang mengacu pada kelas Entity
     */
    private void attackTurn(Entity attacker, Entity defender)
    {
        
    }
    
    /**
     * Method main program ini
     * 
     */
    public static void main(String[] args)
    {
        Play();
    }
}
