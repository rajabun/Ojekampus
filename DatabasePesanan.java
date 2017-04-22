import java.util.ArrayList;

/**
 * class DatabasePesanan berisi kumpulan method untuk mengatur database pesanan ojek.
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
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Class DatabasePesanan diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 * Modul 3 : Mengubah semua instance dan method menjadi static
 * Modul 4 : Tidak ada perubahan
 * Modul 5 : Mengubah tipe data instance list_pesanan menjadi tipe ArrayList
 *           Menambah method hapusPesanan(Pelanggan pengguna) dan getDatabase()
 * Modul 6 : Menambah local variable Pelanggan pengguna pada method getPesanan()
 * Modul 7 : Mengubah method addPesanan, hapusPesanan(Pesanan) dan hapusPesanan(Pelanggan)
 * Modul 8 : Tidak ada perubahan
 */

public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    
    //private static Pesanan list_pesanan;
    private static ArrayList<Pesanan> list_pesanan = new ArrayList<Pesanan>(); // Diubah di modul 5
    

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        
    }
    /*
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         *
        
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab","085854032720"); //membuat objek baru pada kelas Pelanggan
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        Pesanan pes_Rajab_2 = new Pesanan(p_Rajab, TipeLayanan.BeliBarang, per_Rajab_akhir, per_Rajab_awal, "Ani", "Fatayati", 50000); //membuat objek baru pada kelas Pesanan
        addPesanan(pes_Rajab);
        addPesanan(pes_Rajab_2);
    }
    */
    /**
     * Method untuk memasukkan pesanan dari ojek kedalam database pesanan
     * 
     * @param pesan Parameter dari method addPesanan yang merujuk ke class Pesanan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean addPesanan(Pesanan pesan)
    {
        if(pesan.getPelanggan() == pesan.getPelanggan())
        {
            try
            {
                System.out.println("Pesanan Gagal Dilakukan\n");
            }
            catch(PesananSudahAdaException pesanan_input)
            {
                PesananSudahAdaException.getMessage();
            }
            return false;
        }
        
        if(pesan.getPelanggan() != pesan.getPelanggan())
        {
            list_pesanan.add(pesan);
            //list_pesanan = pesan;
            System.out.println("Pesanan Berhasil Dilakukan\n");
            return true;
        }
        //return false;
    }

    /**
     * Method untuk menampilkan database pesanan
     * Ditambah di modul 5
     * @return list_pesanan Mengembalikan isi data dari instance variable list_pesanan
     */
    public static ArrayList<Pesanan> getDatabase()
    {
        return list_pesanan;
    }

    /**
     * Method untuk menampilkan pesanan ojek
     * 
     * @return list_pesanan Mengembalikan isi data dari instance variable list_pesanan
     */
    //public static Pesanan getPesanan(Pelanggan pengguna)
    public static Pesanan getPesanan()
    {
        if(list_pesanan.contains(list_pesanan))
        {
            ArrayList<Pesanan> list_pesanan;   
        }
        //return list_pesanan;
        //return ArrayList<Pesanan> list_pesanan;
        return null;
    }
    
    /**
     * Method untuk menghapus pesanan ojek dari database pesanan
     * Ditambah di modul 5
     * @param pengguna Parameter dari method hapusPesanan yang merujuk ke class Pelanggan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean hapusPesanan(Pelanggan pengguna)
    {
        if(list_pesanan.contains(pengguna))
        {
            list_pesanan = null;
            System.out.println("Pesanan Berhasil Dihapus\n");
            return true;
        }
        else
        {
            try
            {
                System.out.println("Pesanan tidak berhasil dihapus\n");
            }
            catch(PesananOlehPelangganDitemukan pelanggan_input)
            {
                PesananOlehPelangganDitemukan.getMessage();
            }
            return false;
        }
    }
    
    /**
     * Method untuk menghapus pesanan ojek dari database pesanan
     * 
     * @param pesan Parameter dari method hapusPesanan yang merujuk ke class Pesanan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean hapusPesanan(Pesanan pesan)
    {
        //list_pesanan = null;
        //System.out.println("Pesanan Berhasil Dihapus\n");
        //return true;
        if(list_pesanan.contains(pesan.getPelayan()))
        {
            list_pesanan = null;
            System.out.println("Pesanan Berhasil Dihapus\n");
            return true;
        }
        else
        {
            try
            {
                System.out.println("Pesanan tidak berhasil dihapus\n");
            }
            catch(PesananTidakDitemukan pesanan_input)
            {
                PesananTidakDitemukan.getMessage();
            }
            return false;
        }
        //return false;
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
    
   public boolean addPesanan(Pesanan pesan)
    {
        //Pesanan list_pesanan = pesan;
    }
    
    public boolean hapusPesanan(Pesanan pesan)
    {
        //Pesanan list_pesanan = null;
    }
    
     */
    