
/**
 * class Pelanggan berisi kumpulan method untuk mengatur data pelanggan.
 * 
 * @author Muhammad Rajab(1206244415) 
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 2 : Class User diganti namanya menjadi class Pelanggan (0.2)
 * Modul 3 : Menambah beberapa method (setTelefon(), setEmail(), setDOB())
 *           Menambah isi Constructor, menambah method getDOB(), mengubah isi method printData() dan getID()
 */
public class Pelanggan
{
    private int id;
    private String nama;
    private String telefon, email; //Ditambahkan saat modul 3
    private String dob; //Ditambahkan saat modul 3

    /**
     * Constructor for objects of class Pelanggan
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    public Pelanggan(int id, String nama) 
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
        DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
        id = id_ojek.getIDPelangganTerakhir();
        return id;
    }
    
    /**
     * Method untuk menampilkan dob pelanggan
     * Ditambahkan saat modul 3
     * @return dob Mengembalikan isi data dari instance variable dob
     */
    public String getDOB()
    {
        return dob;
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
     * Method untuk memasukkan telepon pelanggan
     * Ditambahkan saat modul 3
     * @param telefon Parameter dari method setTelefon dalam bentuk String
     */
    public boolean setTelefon(String telefon)
    {
        this.telefon = telefon;
        return false;
    }
    
    /**
     * Method untuk memasukkan email pelanggan
     * Ditambahkan saat modul 3
     * @param email Parameter dari method setEmail dalam bentuk String
     */
    public boolean setEmail(String email)
    {
        this.email = email;
        return false;
    }
    
    /**
     * Method untuk memasukkan dob pelanggan
     * Ditambahkan saat modul 3
     * @param dob Parameter dari method setDOB dalam bentuk String
     */
    public void setDOB(String dob)
    {
        this.dob = dob;        
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
        System.out.println("Nama Pelanggan :" + " " + nama);
        System.out.println("ID Pelanggan :" + " " + getID() + "\n");
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
    
    Bekas Modul 3
    
    instance variables :
    
    // instance variables - replace the example below with your own
    //DatabaseUser id_pelanggan = new DatabaseUser();
    //private int id = id_pelanggan.getIDPelangganTerakhir();;
    
    method :
    
    //public Pelanggan(String nama) //saat ini dicomment karena tidak perlu menginput id, cukup menginput nama
    {
        
    }
    
    public void printData()
    {
        //System.out.println("ID Pelanggan :" + " " + id + "\n");
    }
    
   */
  