
/**
 * class OjeKampus berisi method main yang berfungsi sebagai main program dari aplikasi OjeKampus.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Tidak ada perubahan
 * Modul 3 : Mengubah method main sesuai case study modul 3
 */

public class OjeKampus
{
    // instance variables - replace the example below with your own
    /*

    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 2
     *
    public void main (String [] args)
    //public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         *
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        //Pesanan pes_Rajab = new Pesanan(p_Rajab, "Antar Donasi", per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan //Bekas Modul 2
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
    */
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 3
     */
    public void main (String [] args)
    //public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        DatabaseUser dbaseu_rajab = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser
        dbaseu_rajab.addOjek(ojek_Muhammad); //menjalankan method addOjek() pada class DatabaseUser
        dbaseu_rajab.addPelanggan(p_Rajab); //menjalankan method addPelanggan() pada class DatabaseUser
        DatabasePesanan dbasep_rajab = new DatabasePesanan(); //membuat objek baru pada kelas DatabasePesanan
        dbasep_rajab.addPesanan(pes_Rajab); //menjalankan method addPesanan() pada kelas DatabasePesanan
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        Administrasi admin = new Administrasi(); //membuat objek baru pada kelas Administrasi
        admin.pesananDitugaskan(pes_Rajab, ojek_Muhammad); //menjalankan method pesananDitugaskan(Pesanan pesan, Ojek pelayan) pada kelas Administrasi
        admin.pesananDibatalkan(ojek_Muhammad); //menjalankan method pesananDibatalkan(Ojek pelayan) pada kelas Administrasi
        admin.pesananSelesai(ojek_Muhammad); //menjalankan method pesananSelesai(Ojek pelayan) pada kelas Administrasi
        admin.pesananDibatalkan(pes_Rajab); //menjalankan method pesananDibatalkan(Pesanan pesan) pada kelas Administrasi
        admin.pesananSelesai(pes_Rajab); //menjalankan method pesananSelesai(Pesanan pesan) pada kelas Administrasi
        
    }
    
    /**
     * Constructor for objects of class OjeKampus
     */
    public OjeKampus()
    {
        // initialise instance variables
    }
}
