
/**
 * class OjeKampus berisi method main yang berfungsi sebagai main program dari aplikasi OjeKampus.
 * 
 * @author Muhammad Rajab(1206244415) 
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Tidak ada perubahan
 */

public class OjeKampus
{
    // instance variables - replace the example below with your own

    /**
     * Method utama untuk menjalankan program OjeKampus
     */
    //public void main (String [] args)
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        Ojek ojek_Muhammad = new Ojek("Muhammad"); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan("Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, "Antar Donasi", per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        DatabaseUser dbaseu_rajab = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser
        dbaseu_rajab.addOjek(ojek_Muhammad); //menjalankan method addOjek() pada class DatabaseUser
        dbaseu_rajab.addPelanggan(p_Rajab); //menjalankan method addPelanggan() pada class DatabaseUser
        DatabasePesanan dbasep_rajab = new DatabasePesanan(); //membuat objek baru pada kelas DatabasePesanan
        dbasep_rajab.addPesanan(pes_Rajab); //menjalankan method addPesanan() pada kelas DatabasePesanan
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        ojek_Muhammad.setNama("Rajab"); //menjalankan method setNama() pada kelas Ojek
        p_Rajab.setNama("Muhammad"); //menjalankan method setNama() pada kelas Pelanggan
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
    }
    
    /**
     * Constructor for objects of class OjeKampus
     */
    public OjeKampus()
    {
        // initialise instance variables
    }
}
