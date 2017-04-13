
/**
 * Write a description of class PesananTidakDitemukanException here.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.7, 13 April 2017
 * @version 0.6, 30 Maret 2017
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class PesananSudahAdaException ditambahkan pada versi 0.7 (Modul 7)
 */
public class PesananSudahAdaException
{
    // instance variables - replace the example below with your own
    private Pesanan pesanan_error;

    /**
     * Constructor for objects of class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        // initialise instance variables
        super("Pelanggan dengan nama");
        pesanan_input = pesanan_error;
    }

    /**
     * Method untuk menampilkan pesan exception
     * 
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan dengan tipe layanan " + pesanan_error.getTipeLayanan();
    }
    
}
