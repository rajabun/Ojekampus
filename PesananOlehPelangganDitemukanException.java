/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.8, 20 April 2017
 * @version 0.7, 13 April 2017
 * @version 0.6, 30 Maret 2017
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class PesananOlehPelangganDitemukanException ditambahkan pada versi 0.7 (Modul 7)
 * Modul 8 : Tidak ada perubahan
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pelanggan pelanggan_error;

    /**
     * Constructor for objects of class PesananOlehPelangganException
     */
    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        // initialise instance variables
        super("Pesanan oleh");
        pelanggan_input = pelanggan_error;
    }

    /**
     * Method untuk menampilkan pesan exception
     * 
     * @return println Mengembalikan isi data dari println dalam bentuk string
     */
    @Override
    public String getMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }
    
}
