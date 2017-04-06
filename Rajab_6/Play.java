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
        System.out.println("War start!");
        System.out.println("\nHero = " + player.getName() + ", level = " + player.getLevel());
        System.out.println("\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());
        for (int i = 1; !player.isDead(); i++)
        {
            Print(i);
            // kode anda
            attackTurn(player, enemy);
            if (enemy.isDead())
            {
                System.out.println("Enemy died! Spawning new enemy!");
                // kode anda
                System.out.println("Player level up! Level = " + player.getLevel());
                enemyCount++;
                initializeEnemy();
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
        setRank("Sword Slash",100);
        h.setWeapon("Katana", 50);
        h.setArmor("Best Armor", 50);
        enemyCount = 1;
        initializeEnemy();
    }
    
    /**
     * Method untuk inisialisasi musuh
     * 
     */
    private void initializeEnemy()
    {
        Monster m = new Monster("Dragon", enemyCount);
        //m.setRank(Tank t = new Tank());
        setRank("Dragon Tail",50);
        m.setWeapon("Fang", 15);
        m.setArmor("Dragon Skin", 10);
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
        int stage = 1;
        
        if(stage == 1)
        {
            
            stage++;
        }
        if(stage == 2)
        {
            
            stage--;
        }
        
    }
    
    /**
     * Method untuk memasukkan rank
     * 
     * @param name Parameter dari method setRank dalam bentuk String
     * @param power Parameter dari method setRank dalam bentuk numerik (int)
     */
    private Rank setRank(String name, int power)
    {
        if(1<player.level+3<<100)
        {
            Normal n = new Normal("Punch",5);
            Rank rank = n;
        }
        
        if(2<player.level+3<<100)
        {
            Tank t = new Tank("Steel Body",7);
            Rank rank = t;
        }
        
        if(3<player.level+3<<100)
        {
            Damager d = new Damager("Big Punch",9);
            Rank rank = d;
        }
        /*
        for(player.level = 3 ; player.level<100 ; player.level = player.level+3)
        {
            Damager d = new Damager("Big Punch",9);
            Rank rank = d;
        }
        
        if(player.level == 2)
        {
            //Rank rank = Normal;
        }
        
        if(player.level == 3)
        {
            //Rank rank = Normal;
        }
        */
       return player.getRank(); 
    }
    
    /**
     * Method untuk memasukkan rank
     * 
     * @param attacker Parameter dari method attackTurn yang mengacu pada kelas Entity
     * @param defender Parameter dari method attackTurn yang mengacu pada kelas Entity
     */
    private void attackTurn(Entity attacker, Entity defender)
    {
        defender.setHP(10);
        System.out.println("Damage = " + player.getDamage(10,5));
    }
    
    /**
     * Method main program ini
     * 
     */
    public static void main(String[] args)
    {
        Play p = new Play();
    }
}
