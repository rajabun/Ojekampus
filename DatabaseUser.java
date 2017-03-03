
/**
 * class DatabaseUser berisi kumpulan method untuk mengatur database pelanggan ojek.
 * 
 * @author Muhammad Rajab(1206244415) 
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Class DatabaseUser diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 */

public class DatabaseUser
{
    
    private Pelanggan pelanggan_database;
    private Ojek ojek_database;
    private int id_ojek_terakhir = 1; //isi dari id_ojek_terakhir adalah 1
    private int id_pelanggan_terakhir = 1; //isi dari id_pelanggan_terakhir adalah 1
    
    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
    {
        // initialise instance variables
       
    }
    
    /**
     * Method untuk memasukkan pelanggan dari ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addPelanggan yang merujuk ke class Pelanggan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean addPelanggan (Pelanggan baru)
    {
        Pelanggan pelanggan_database = baru;
        System.out.println("Penambahan Pelanggan dalam Database Berhasil");
        return true;
    }
    
    /**
     * Method untuk menghapus pelanggan ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean removePelanggan (int id)
    {
        Pelanggan pelanggan_database = null;
        return true;
    }
    
    /**
     * Method untuk memasukkan ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addOjek yang merujuk ke class Ojek
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean addOjek(Ojek baru)
    {
        Ojek ojek_database = baru;
        System.out.println("Penambahan Ojek dalam Database Berhasil");
        return true;
    }
    
    /**
     * Method untuk menghapus ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean removeOjek (int id)
    {
        Ojek ojek_database = null;
        return true;
    }
    
    /**
     * Method untuk menampilkan id ojek terakhir
     * 
     * @return id_ojek_terakhir Mengembalikan isi data dari instance variable id_ojek_terakhir
     */
    public int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /**
     * Method untuk menampilkan id pelanggan terakhir
     * 
     * @return id_pelanggan_terakhir Mengembalikan isi data dari instance variable id_pelanggan_terakhir
     */
    public int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /**
     * Method untuk menampilkan data pengemudi ojek
     * 
     * @return ojek_database Mengembalikan isi data dari instance variable ojek_database
     */
    public Ojek getUserOjek()
    {
        return ojek_database;
    }
    
    /**
     * Method untuk menampilkan data pelanggan ojek
     * 
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public Pelanggan getUserPelanggan()
    {
        return pelanggan_database;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/* Bekas Modul 1
  
    instance variables - replace the example below with your own
    
    private int x;
    private String[] pelanggan_database;
    private String[] ojek_database;
    private int id_ojek_terakhir;
    private int id_pelanggan_terakhir;
    
    methods
    
    Belum ada Class Pelanggan
    public boolean addPelanggan (Pelanggan baru)
    {
        return false;
    }
   
    public boolean addPelanggan (String baru)
    {
        return false;
    }
    
    Belum ada Class Ojek
    public boolean addOjek(Ojek baru)
    {
        return false;
    }
    
    Belum ada Class Ojek
    public Ojek getUserOjek(int id)
    {
        return 0;
    }
    
   
    public String getUserOjek(int id)
    {
        return "";
    }
   
    Belum ada array di String
    public String[] getOjekDatabase()
    {
        
    }
     
    public String getOjekDatabase()
    {
        return "";
    }
    
    Belum ada class Pelanggan
    public Pelanggan getUserPelanggan(int id)
    {
        return "";
    }
    
    public String getUserPelanggan(int id)
    {
        return "";
    }
    
    Belum ada array di String
    public String[] getPelangganDatabase()
    {
        
    }
    
    public String getPelangganDatabase()
    {
        return "";
    }    
 */
