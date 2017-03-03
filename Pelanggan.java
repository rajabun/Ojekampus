
/**
 * class Pelanggan berisi kumpulan method untuk mengatur data pelanggan.
 * 
 * Muhammad Rajab(1206244415) 
 * 0.1, 23 Februari 2017
 * 0.2, 02 Maret 2017
 */

/**
 * Modul 2 : Class User diganti namanya menjadi class Pelanggan (0.2)
 */
public class Pelanggan
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;

    /**
     * Constructor for objects of class Pelanggan
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    //public Pelanggan(int id, String nama) saat ini dicomment karena tidak perlu menginput id, cukup menginput nama
    public Pelanggan(String nama)
    {
        // initialise instance variables
        DatabaseUser id_pelanggan = new DatabaseUser();
        id = id_pelanggan.getIDPelangganTerakhir();
        this.nama = nama;
    }
    
    /**
     * Method untuk menampilkan id pelanggan
     * 
     * @return id Mengembalikan isi data dari instance variable id
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk menampilkan nama pelanggan
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * this.id ditambahkan saat modul 2
     * 
     * Method untuk memasukkan id pelanggan
     * 
     * @param id Parameter dari method setID dalam bentuk int
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * this.nama ditambahkan saat modul 2
     * 
     * Method untuk memasukkan nama pelanggan
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method ini ditambahkan saat Modul 2
     * 
     * Method untuk Menampilkan hasil (isi data) dari instance nama dan id dalam bentuk string
     */
    
    public void printData()
    {
        System.out.println("Nama :" + " " + nama);
        System.out.println("ID Pelanggan :" + " " + id);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/*  Bekas Modul 1
   
   instance variables :
 
    protected int id;
    protected String nama;

    methods :  
 
    public Pelanggan(String nama, int id)
    {
        // initialise instance variables
    }
    
    public Pelanggan(int id, String nama)
    {
        // initialise instance variables     
    }
    
    Bekas Modul 2
    
    instance variables :
    
    this.id = id;
        
   */
  