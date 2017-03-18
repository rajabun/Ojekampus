
/**
 * class Ojek berisi kumpulan method untuk mengatur ojek yang dipesan.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 2 : Class Ojek ditambahkan pada versi 0.2
 * Modul 3 : Menambah beberapa method (setTelefon(), setEmail(), setDOB(), setNoPlat()) 
 *           Menambah beberapa method (getTelefon(), getEmail(), getDOB(), getNoPlat(), getStatus())
 *           Mengubah isi method printData()
 *           Menambah instance variables private StatusOjek status = StatusOjek.Idle
 *           Menambah instance variables private String telefon, email, no_plat, dob 
 *           
 */

public class Ojek
{
    // instance variables - replace the example below with your own

    private StatusOjek status = StatusOjek.Idle; //Ditambahkan saat modul 3
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null; //isi dari pesanan_sekarang adalah null
    private int id;
    private String nama;
    private String telefon, email, no_plat; //Ditambahkan saat modul 3
    private String dob; //Ditambahkan saat modul 3
        


    /**
     * Constructor for objects of class Ojek
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang) 
    {
        // initialise instance variables
        this.nama = nama; //this digunakan karena nama instance variable sama dengan dengan parameter method ini
        Lokasi lokasi1 = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
        posisi_sekarang = lokasi1;
    }
    
    /**
     * Method untuk memasukkan id ojek
     * 
     * @param id Parameter dari method setID dalam bentuk int
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk memasukkan nama ojek
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method untuk memasukkan telepon ojek
     * Ditambahkan saat modul 3
     * @param telefon Parameter dari method setTelefon dalam bentuk String
     */
    public boolean setTelefon(String telefon)
    {
        this.telefon = telefon;
        return false;
    }
    
    /**
     * Method untuk memasukkan email ojek
     * Ditambahkan saat modul 3
     * @param email Parameter dari method setEmail dalam bentuk String
     */
    public boolean setEmail(String email)
    {
        this.email = email;
        return false;
    }
    
    /**
     * Method untuk memasukkan dob ojek
     * Ditambahkan saat modul 3
     * @param dob Parameter dari method setDOB dalam bentuk String
     */
    public void setDOB(String dob)
    {
        this.dob = dob;        
    }
    
    /**
     * Method untuk memasukkan nomer plat ojek
     * Ditambahkan saat modul 3
     * @param no_plat Parameter dari method setNoPlat dalam bentuk String
     */
    public void setNoPlat(String no_plat)
    {
        this.no_plat = no_plat;        
    }

    /**
     * Method untuk memesan ojek
     * 
     * @param pesan Parameter dari method setPesanan yang merujuk ke class Pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
    /**
     * Method untuk memasukkan posisi ojek
     * 
     * @param sekarang Parameter dari method setPosisi yang merujuk ke class Lokasi
     */
    public void setPosisi(Lokasi sekarang)
    {
       posisi_sekarang = sekarang; 
    }
    
    /**
     * Method untuk memasukkan status ojek
     * Ditambahkan saat modul 3
     * @param status Parameter dari method setStatus yang merujuk ke class StatusOjek
     */ 
    public void setStatus(StatusOjek status)
    {
        this.status = status;        
    }
    
    /**
     * Method untuk menampilkan id ojek
     * 
     * @return id Mengembalikan isi data dari instance variable id
     */
    public int getID()
    {
        DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
        id = id_ojek.getIDOjekTerakhir();
        return id;
    }
    
    /**
     * Method untuk menampilkan nama ojek
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk menampilkan telefon ojek
     * Ditambahkan saat modul 3
     * @return telefon Mengembalikan isi data dari instance variable telefon
     */
    public String getTelefon()
    {
        return telefon;
    }
    
    /**
     * Method untuk menampilkan email ojek
     * Ditambahkan saat modul 3
     * @return email Mengembalikan isi data dari instance variable email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk menampilkan dob ojek
     * Ditambahkan saat modul 3
     * @return dob Mengembalikan isi data dari instance variable dob
     */
    public String getDOB()
    {
        return dob;
    }
    
    /**
     * Method untuk menampilkan nomer plat ojek
     * Ditambahkan saat modul 3
     * @return no_plat Mengembalikan isi data dari instance variable no_plat
     */
    public String getNoPlat()
    {
        return no_plat;
    }
    
    /**
     * Method untuk menampilkan isi pesanan
     * 
     * @return pesanan_sekarang Mengembalikan isi data dari instance variable pesanan_sekarang
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Method untuk menampilkan posisi ojek
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /**
     * Method untuk menampilkan status ojek
     * Ditambahkan saat modul 3
     * @return status Mengembalikan isi data dari instance variable status
     */ 
    public StatusOjek getStatus()
    {
        return status;        
    }
    
    /**
     * Method untuk Menampilkan hasil (isi data) dari instance nama, id dan status dalam bentuk string
     */
    public void printData()
    {
        System.out.println("Nama Ojek:" + " " + nama);
        System.out.println("ID Ojek :" + " " + getID());
        System.out.println("Status Ojek :" + " " + status + "\n");
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/*
 * Bekas Modul 2
 * 
 * instance variables :
 * 
 * private Lokasi posisiSekarang;
 * 
 * instance variables pada constructor :
 * 
 * this.id = id;     
 * posisiSekarang = lokasi1;
 * posisi_sekarang = posisiSekarang;
 * Lokasi posisiSekarang = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
 * posisi_sekarang = posisiSekarang;
 * this.posisiSekarang = posisiSekarang;
 */

/*
 * Bekas Modul 3
 * 
 * instance variables :
 * 
 * //private String status = "Idle"; //isi dari status adalah idle dalam bentuk string
 * //Lokasi lokasi1 = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
 * //private Lokasi posisi_sekarang = lokasi1;
 * //DatabaseUser id_ojek = new DatabaseUser();
 * //private int id = id_ojek.getIDOjekTerakhir();
 * 
 * method :
 * 
 * //public Ojek(String nama) //saat ini dicomment karena tidak perlu menginput id dan posisi_sekarang, cukup menginput nama
 * {
 *     //DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
 *     //id = id_ojek.getIDOjekTerakhir(); //mengambil isi data id dari method getIDOjekTerakhir() dari kelas DatabaseUser.    
 * }
 * 
 *  public void setPesanan(Pesanan pesan)
 *  {
 *      //pesanan_sekarang = null;
 *  }
 *  
 *  /*
    /**
     * Method untuk menampilkan status ojek
     * 
     * @return status Mengembalikan isi data dari instance variable status
     
    public String getStatus()
    {
        return status;
    }
 *  
 *  public void setPesanan(Pesanan pesan)
    {
        //pesanan_sekarang = null;
    }
 *  /*
    /**
     * Method untuk memasukkan status ojek
     * 
     * @param status Parameter dari method setStatus dalam bentuk String
     *
    public void setStatus(String status)
    {
        this.status = status;
    }
    
 *
 *  public void printData()
 *  {
 *    //System.out.println("ID Ojek :" + " " + id);
 *  }
 *  
 */