
/**
 * class Lokasi berisi kumpulan method untuk mengatur lokasi tujuan pelanggan.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class Lokasi ditambahkan pada versi 0.2 (Modul 2)
 * Dari modul 2 sampai modul 4 tidak ada perubahan
 */

public class Lokasi
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;
    
    /**
     * Constructor for objects of class Lokasi
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     * @param x Parameter dari constructor kelas ini dalam bentuk double (numerik)
     * @param y Parameter dari constructor kelas ini dalam bentuk double (numerik)
     * @param keterangan_lokasi Parameter dari constructor kelas ini dalam bentuk String
     */
    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        // initialise instance variables
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
   /**
     * Method untuk menampilkan X
     * 
     * @return x Mengembalikan isi data dari instance variable x
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Method untuk menampilkan Y
     * 
     * @return y Mengembalikan isi data dari instance variable Y
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Method untuk menampilkan nama lokasi
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama_lokasi;
    }
    
    /**
     * Method untuk menampilkan keterangan lokasi
     * 
     * @return keterangan_lokasi Mengembalikan isi data dari instance variable keterangan_lokasi
     */
    public String getKeteranganLokasi()
    {
        return keterangan_lokasi;
    }
    
    /**
     * Method untuk memasukkan X
     * 
     * @param x Parameter dari method setX dalam bentuk double
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Method untuk memasukkan Y
     * 
     * @param y Parameter dari method setY dalam bentuk double
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * Method untuk memasukkan nama lokasi
     * 
     * @param nama_lokasi Parameter dari method setNama dalam bentuk String
     */
    public void setNama(String nama_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
    }
    
    /**
     * Method untuk memasukkan keterangan lokasi
     * 
     * @param keterangan_lokasi Parameter dari method setNama dalam bentuk String
     */
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */    
}
