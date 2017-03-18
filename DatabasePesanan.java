
/**
 * class DatabasePesanan berisi kumpulan method untuk mengatur database pesanan ojek.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Class DatabasePesanan diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 * Modul 3 : Tidak ada perubahan 
 */

public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    
    private Pesanan list_pesanan;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        
    }
    
    /**
     * Method untuk memasukkan pesanan dari ojek kedalam database pesanan
     * 
     * @param pesan Parameter dari method addPesanan yang merujuk ke class Pesanan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean addPesanan(Pesanan pesan)
    {
        //Pesanan list_pesanan = pesan;
        list_pesanan = pesan;
        System.out.println("Pesanan Berhasil Dilakukan\n");
        return true;
    }

    /**
     * Method untuk menghapus pesanan ojek dari database pesanan
     * 
     * @param pesan Parameter dari method hapusPesanan yang merujuk ke class Pesanan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public boolean hapusPesanan(Pesanan pesan)
    {
        //Pesanan list_pesanan = null;
        list_pesanan = null;
        return true;
    }
    
    /**
     * Method untuk menampilkan pesanan ojek
     * 
     * @return list_pesanan Mengembalikan isi data dari instance variable list_pesanan
     */
    public Pesanan getPesanan()
    {
        return list_pesanan;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/*Bekas Modul 1
    / Belum ada array di String
    
    //private Pesanan listPesanan;
    
    public String[] getDatabase()
    {
        
    }
    
   
    public String getDatabase()
    {
        return "";
    }
    
    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
    
    /* Belum ada Class Pelanggan, cannot find Symbol class Pelanggan
    public void pesananDibatalkan(Pelanggan pengguna)
    {
        
    }
    
    
    public String pesananDibatalkan(String pengguna)
    {
        return "";
    }
    /*
    
    Belum ada Class Pelanggan, cannot find Symbol class Pelanggan
    public Pesanan getPesanan(Pelanggan pengguna)
    {
        
    }
    

    public Pesanan getPesanan(Pesanan pengguna)
    {
        return list_pesanan;
    }
    
   
     */
    