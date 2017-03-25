import java.util.ArrayList;

/**
 * class DatabaseUser berisi kumpulan method untuk mengatur database pelanggan ojek.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Class DatabaseUser diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 * Modul 3 : Mengubah semua instance dan method menjadi static
 * Modul 4 : Tidak ada perubahan
 * Modul 5 : Mengubah nilai instance id_ojek_terakhir dan id_pelanggan_terakhir menjadi default
 *           Mengubah tipe data instance ojek_database dan pelanggan_database menjadi tipe ArrayList
 *           Menambah method getOjekDatabase() dan getPelangganDatabase()
 */

public class DatabaseUser
{
    private static int id_ojek_terakhir; // Diubah di modul 5
    private static int id_pelanggan_terakhir; // Diubah di modul 5
    private static ArrayList <Ojek> ojek_database = new ArrayList<Ojek>(); // Diubah di modul 5
    private static ArrayList <Pelanggan> pelanggan_database = new ArrayList<Pelanggan>(); // Diubah di modul 5
    
    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
    {
        // initialise instance variables
       
    }
    /*
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         *
        
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab","085854032720"); //membuat objek baru pada kelas Pelanggan
        Pelanggan p_Rajab_2 = new Pelanggan(1,"Rajab","085854032720"); //membuat objek baru pada kelas Pelanggan
        Pelanggan p_Rajab_3 = new Pelanggan(2,"Muhammad","021-741-0552"); //membuat objek baru pada kelas Pelanggan
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        Pesanan pes_Rajab_2 = new Pesanan(p_Rajab, TipeLayanan.BeliBarang, per_Rajab_akhir, per_Rajab_awal, "Ani", "Fatayati", 50000); //membuat objek baru pada kelas Pesanan
        addPelanggan(p_Rajab);
        addPelanggan(p_Rajab_2);
        addPelanggan(p_Rajab_3);
    }
    */
    /**
     * Method untuk memasukkan pelanggan dari ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addPelanggan yang merujuk ke class Pelanggan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean addPelanggan (Pelanggan baru)
    {
        //pelanggan_database = baru;
        //pelanggan_database.add(new Pelanggan(1, "Rajab", "085854032720"));
        //pelanggan_database.contains(baru);
        //if(baru.equals(baru))
        //Pelanggan p1 = baru;
        if(pelanggan_database.contains(baru))
        {
            if(baru.equals(baru))
            {
                System.out.println("Data sudah terdaftar dalam Database\n");
                //return false;
            }
        }
        else
        {
            pelanggan_database.add(baru);
            System.out.println("Penambahan Pelanggan dalam Database Berhasil\n");
            return true;
        }
        return false;
    }
    
    /**
     * Method untuk menghapus pelanggan ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean removePelanggan (int id)
    {
        //pelanggan_database = null;
        //System.out.println("Pelanggan Berhasil Dihapus dari Database\n");
        if(pelanggan_database.contains(id))
        {
                System.out.println("Pelanggan Berhasil Dihapus dari Database\n");
                //return false;
        }
        else
        {
            pelanggan_database = null;
            System.out.println("Data belum terdaftar dalam Database\n");
            return true;
        }
        return false;
    }
    
    /**
     * Method untuk memasukkan ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addOjek yang merujuk ke class Ojek
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean addOjek(Ojek baru)
    {
        //ojek_database = baru;
        //ojek_database.add(new Ojek(1, "Rajab", lokasi1));
        //ojek_database.add(baru);
        //System.out.println("Penambahan Ojek dalam Database Berhasil\n");
        //return true;
        if(ojek_database.contains(baru))
        {
            if(baru.equals(baru))
            {
                System.out.println("Data sudah terdaftar dalam Database\n");
                //return false;
            }
        }
        else
        {
            ojek_database.add(baru);
            System.out.println("Penambahan Ojek dalam Database Berhasil\n");
            return true;
        }
        return false;
    }
    
    /**
     * Method untuk menghapus ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean removeOjek (int id)
    {
        //ojek_database = null;
        //System.out.println("Ojek Berhasil Dihapus dari Database\n");
        //return true;
        if(ojek_database.contains(id))
        {
                System.out.println("Ojek Berhasil Dihapus dari Database\n");
                //return false;
        }
        else
        {
            ojek_database = null;
            System.out.println("Data belum terdaftar dalam Database\n");
            return true;
        }
        return false;
    }
    
    /**
     * Method untuk menampilkan id ojek terakhir
     * 
     * @return id_ojek_terakhir Mengembalikan isi data dari instance variable id_ojek_terakhir
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /**
     * Method untuk menampilkan id pelanggan terakhir
     * 
     * @return id_pelanggan_terakhir Mengembalikan isi data dari instance variable id_pelanggan_terakhir
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /**
     * Method untuk menampilkan data pengemudi ojek
     * 
     * @return ojek_database Mengembalikan isi data dari instance variable ojek_database
     */
    public static Ojek getUserOjek()
    {
        //return ojek_database;
        return ojek_database.get(id_ojek_terakhir);
    }
    
    /**
     * Method untuk menampilkan data pelanggan ojek
     * 
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static Pelanggan getUserPelanggan()
    {
        //return pelanggan_database;
        return pelanggan_database.get(id_pelanggan_terakhir);
    }
    
    /**
     * Method untuk menampilkan database ojek
     * Ditambah di modul 5
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static ArrayList<Ojek> getOjekDatabase()
    {
        return ojek_database;
    }
    
    /**
     * Method untuk menampilkan database pelanggan
     * Ditambah di modul 5
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static ArrayList<Pelanggan> getPelangganDatabase()
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
    
    public boolean addPelanggan (Pelanggan baru)
    {
        //Pelanggan pelanggan_database = baru;
    }
    
    public boolean removePelanggan (int id)
    {
        //Pelanggan pelanggan_database = null;
    }
    
    public boolean addOjek(Ojek baru)
    {
        //Ojek ojek_database = baru;
    }
    
    public boolean removeOjek (int id)
    {
        //Ojek ojek_database = null;
    }
    
    Bekas Modul 5 :
    
    instance variables :
    
    //private static Pelanggan pelanggan_database;
    //private static Ojek ojek_database;
    //private static int id_ojek_terakhir = 1; //isi dari id_ojek_terakhir adalah 1
    //private static int id_pelanggan_terakhir = 1; //isi dari id_pelanggan_terakhir adalah 1
    
    methods :
    
    
 */
