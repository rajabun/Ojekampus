
/**
 * class Ojek berisi kumpulan method untuk mengatur ojek yang dipesan.
 * 
 * @author Muhammad Rajab(1206244415) 
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 2 : Class Ojek ditambahkan pada versi 0.2
 */

public class Ojek
{
    // instance variables - replace the example below with your own

    private String status = "Idle"; //isi dari status adalah idle dalam bentuk string
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null; //isi dari pesanan_sekarang adalah null
    private int id;
    private String nama;


    /**
     * Constructor for objects of class Ojek
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    //public Ojek(int id, String nama, Lokasi posisi_sekarang) saat ini dicomment karena tidak perlu menginput id dan posisi_sekarang, cukup menginput nama
    public Ojek(String nama)
    {
        // initialise instance variables
        DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
        id = id_ojek.getIDOjekTerakhir(); //mengambil isi data id dari method getIDOjekTerakhir() dari kelas DatabaseUser.   
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
     * Method untuk memesan ojek
     * 
     * @param pesan Parameter dari method setPesanan yang merujuk ke class Pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = null;
    }
    
    /**
     * Method untuk memasukkan posisi ojek
     * 
     * @param sekarang Parameter dari method setPosisi yang merujuk ke class Lokasi
     */
    public void setPosisi(Lokasi sekarang)
    {
       this.posisi_sekarang = posisi_sekarang; 
    }
    
    /**
     * Method untuk memasukkan status ojek
     * 
     * @param status Parameter dari method setStatus dalam bentuk String
     */
    public void setStatus(String status)
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
     * 
     * @return status Mengembalikan isi data dari instance variable status
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * Method untuk Menampilkan hasil (isi data) dari instance nama, id dan status dalam bentuk string
     */
    public void printData()
    {
        System.out.println("Nama :" + " " + nama);
        System.out.println("ID Pelanggan :" + " " + id);
        System.out.println("Status Ojek :" + " " + status);
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