
/**
 * Write a description of class DatabasePesanan here.
 * 
 * Muhammad Rajab(1206244415) 
 * 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 */

public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private int x;
    private String[] listPesanan;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        x = 0;
    }
    
    public boolean addPesanan(Pesanan pesan)
    {
        return false;
    }

    public boolean hapusPesanan(Pesanan pesan)
    {
        return false;
    }
    
    /*Belum ada Class Pelanggan, cannot find Symbol class Pelanggan
    public Pesanan getPesanan(Pelanggan pengguna)
    {
        
    }
    */

    public String getPesanan(String pengguna)
    {
        return "";
    }
    
    /* Belum ada array di String
    public String[] getDatabase()
    {
        
    }
    */
   
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
    */
    
    public String pesananDibatalkan(String pengguna)
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
