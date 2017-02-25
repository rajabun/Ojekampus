
/**
 * Write a description of class DatabaseUser here.
 * 
 * Muhammad Rajab(1206244415) 
 * 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 */

public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private int x;
    private String[] pelanggan_database;
    private String[] ojek_database;
    private int id_ojek_terakhir;
    private int id_pelanggan_terakhir;
    
    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
    {
        // initialise instance variables
        x = 0;
    }
    
    /* Belum ada Class Pelanggan
    public boolean addPelanggan (Pelanggan baru)
    {
        return false;
    }
    
    */
   
    public boolean addPelanggan (String baru)
    {
        return false;
    }
    
    public boolean removePelanggan (int id)
    {
        return false;
    }
    
    /* Belum ada Class Ojek
    public boolean addOjek(Ojek baru)
    {
        return false;
    }
    */
    
    public boolean addOjek(String baru)
    {
        return false;
    } 
   
    public boolean removeOjek (int id)
    {
        return false;
    }
    
    public int getIDOjekTerakhir()
    {
        return 0;
    }
    
    public int getIDPelangganTerakhir()
    {
        return 0;
    }
    
    /* Belum ada Class Ojek
    public Ojek getUserOjek(int id)
    {
        return 0;
    }
    */
   
    public String getUserOjek(int id)
    {
        return "";
    }
   
    /* Belum ada array di String
    public String[] getOjekDatabase()
    {
        
    }
    */
   
    public String getOjekDatabase()
    {
        return "";
    }
    
    /* Belum ada class Pelanggan
    public Pelanggan getUserPelanggan(int id)
    {
        return "";
    }
    */
   
    public String getUserPelanggan(int id)
    {
        return "";
    }
    
    /* Belum ada array di String
    public String[] getPelangganDatabase()
    {
        
    }
    */
   
    public String getPelangganDatabase()
    {
        return "";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
