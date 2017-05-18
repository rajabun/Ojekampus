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
    public static boolean addPesanan(Pesanan pesan) throws PesananSudahAdaException
    {
        if(list_pesanan.isEmpty())
        {
            list_pesanan.add(pesan);
            //list_pesanan = pesan;
            System.out.println("Pesanan Berhasil Dilakukan\n");
            return true;
        }

        //if(pesan.getPelanggan() != pesan.getPelanggan())
        else
        {
            for (int i = 0; i < list_pesanan.size(); i++)
            {
                //if(list_pesanan.get(i).getPelanggan().equals(pesan))
                try
                {
                    if(pesan.getPelanggan().equals(list_pesanan.get(i).getPelanggan()))
                    {
                        //System.out.println("Pesanan Gagal Dilakukan\n");                        
                        //return false;
                        throw new PesananSudahAdaException(pesan);
                    }                    
                }
                catch(PesananSudahAdaException pesanan_input)
                {
                    pesanan_input.getMessage();
                    throw pesanan_input;
                }
                //throw new PesananSudahAdaException(pesan);
            }
            list_pesanan.add(pesan);
            //list_pesanan = pesan;
            System.out.println("Pesanan Berhasil Dilakukan\n");
            return true;
        }
    }

    /**
     * Method untuk menampilkan database pesanan
     * Ditambah di modul 5
     * @return list_pesanan Mengembalikan isi data dari instance variable list_pesanan
     */
    public static ArrayList<Pesanan> getDatabase()
    {
        //if(list_pesanan.isEmpty())
        //{
            //System.out.println("Tidak ada pesanan yang sedang berjalan\n");
            //return null;
        //}
        //else
        //{
            //System.out.println(list_pesanan);
            return list_pesanan;
        //}
    }

    /**
     * Method untuk menampilkan pesanan ojek
     * 
     * @return list_pesanan Mengembalikan isi data dari instance variable list_pesanan
     */
    public static Pesanan getPesanan(Pelanggan pengguna)
    //public static Pesanan getPesanan()
    {
        //int a = 0;
        if(list_pesanan.isEmpty())
        {
            System.out.println("Tidak ada pesanan yang sedang berjalan\n");
            return null;
        }
        else
        {
            System.out.println("Ada pesanan yang sedang berjalan\n");
            for (int i = 0; i < list_pesanan.size(); i++)
            {
                Pesanan p = list_pesanan.get(i);
                if(p.getPelanggan().equals(pengguna))
                {
                    //a = i;
                    //System.out.println(list_pesanan.get(i));
                    //return list_pesanan.get(i);
                    System.out.println(p);
                    return p;
                }
            }
        }
        System.out.println("Maaf, pesanan yang dicari tidak ada dalam database");
        return null;
        /*
        Iterator itr = list_pesanan.iterator();
        while(itr.hasNext()) 
        {
        Object element = itr.next();
        System.out.print(element + " ");
        }
        System.out.println();
         */
        //return list_pesanan.get(a);
        //return list_pesanan;
        //return null;
    }

    /**
     * Method untuk menghapus pesanan ojek dari database pesanan
     * Ditambah di modul 5
     * @param pengguna Parameter dari method hapusPesanan yang merujuk ke class Pelanggan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException
    {
        //list_pesanan = null;
        //System.out.println("Pesanan Berhasil Dihapus\n");
        //return true;
        if(list_pesanan.isEmpty())
        {
            System.out.println("Tidak ada pesanan yang sedang berjalan\n");
            return false;
        }
        else
        {
            for (int i = 0; i < list_pesanan.size(); i++)
            {
                //if(list_pesanan.get(i).equals(pesan) && list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.get(i).getPelanggan().equals(pengguna)) //ASLINYA
                if(list_pesanan.get(i).getPelanggan().equals(pengguna) && list_pesanan.get(i).getPelayan() != null)
                //if(list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.get(i).equals(pesan) && list_pesanan.get(i).equals(pesan.getPelayan()))
                //if(list_pesanan.contains(pesan) && list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.equals(pesan.getPelayan()))
                {
                    //list_pesanan.removeAll(list_pesanan);
                    //list_pesanan.clear();
                    list_pesanan.remove(i);
                    //list_pesanan.remove(list_pesanan.get(i));
                    System.out.println("Pesanan selesai, berhasil dihapus\n");
                    return true;
                }
            }
            //System.out.println("Pesanan tidak berhasil dihapus\n");
            //return false;
            try
            {
                throw new PesananOlehPelangganDitemukanException(pengguna);
                //System.out.println("Pesanan tidak berhasil dihapus\n");
                //return false;
            }
            catch(PesananOlehPelangganDitemukanException pelanggan_input)
            {
                pelanggan_input.getMessage();
                throw pelanggan_input;
            }            
        }        
    }

    /**
     * Method untuk menghapus pesanan ojek dari database pesanan
     * (Pesanan bisa dihapus jika pesanan sudah memiliki Ojek yang mengantar)
     * @param pesan Parameter dari method hapusPesanan yang merujuk ke class Pesanan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        //list_pesanan = null;
        //System.out.println("Pesanan Berhasil Dihapus\n");
        //return true;
        if(list_pesanan.isEmpty())
        {
            System.out.println("Tidak ada pesanan yang sedang berjalan\n");
            return false;
        }
        else
        {
            for (int i = 0; i < list_pesanan.size(); i++)
            {
                //if(list_pesanan.get(i).equals(pesan) && list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.get(i).equals(pesan)) //ASLINYA
                if(list_pesanan.get(i).equals(pesan) && list_pesanan.get(i).getPelayan() != null)
                //if(list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.get(i).equals(pesan) && list_pesanan.get(i).equals(pesan.getPelayan()))
                //if(list_pesanan.contains(pesan) && list_pesanan.contains(pesan.getPelayan()))
                //if(list_pesanan.equals(pesan.getPelayan()))
                {
                    //list_pesanan.removeAll(list_pesanan);
                    //list_pesanan.clear();
                    list_pesanan.remove(i);
                    //list_pesanan.remove(list_pesanan.get(i));
                    System.out.println("Pesanan selesai, berhasil dihapus\n");
                    return true;
                }
            }

            try
            {
                throw new PesananTidakDitemukanException(pesan);
                //System.out.println("Pesanan tidak berhasil dihapus\n");
                //return false;
            }
            catch(PesananTidakDitemukanException pesanan_input)
            {
                pesanan_input.getMessage();
                throw pesanan_input;
            }
        }

        /**
         * An example of a method - replace this comment with your own
         * 
         * @param  y   a sample parameter for a method
         * @return     the sum of x and y 
         */
    }
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
