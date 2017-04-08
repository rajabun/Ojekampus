import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class OjeKampus berisi method main yang berfungsi sebagai main program dari aplikasi OjeKampus.
 * 
 * @author Muhammad Rajab(1206244415)
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
 * Modul 2 : Tidak ada perubahan (Mengubah method main sesuai case study modul 2)
 * Modul 3 : Mengubah method main sesuai case study modul 3
 * Modul 4 : Mengubah method main sesuai case study modul 4
 * Modul 5 : Mengubah method main sesuai case study modul 5
 *           Menambah method antarBarang(), antarOrang(), ojekMembatalkan(), ojekMengubahStatus(), pembelianBarang()
 *           Menambah method penggunaMembatalkan(), penggunaMenghapusPesanan(), penggunaMenyelesaikanPesanan()
 *           Menambah method registrasiOjek(), registrasiPengguna()
 * Modul 6 : Tidak ada perubahan
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
    /*
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 3
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
    */
    /*
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 4
     *
    //public void main (String [] args)
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
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab"); //membuat objek baru pada kelas Pelanggan
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        DatabasePesanan dbasep = new DatabasePesanan();
        /*
        //tugas 1
        ojek_Muhammad.setEmail("hai kamu");
        ojek_Muhammad.setEmail("muhammad_rajab@gmail.com");
        */
        
        /*
        //tugas 2
        p_Rajab.setDOB(9,8,1994);
        p_Rajab.getDOB();
        ojek_Muhammad.setDOB(31,12,1994);
        ojek_Muhammad.getDOB();
        */
       
        /*
        //tugas 3
        ojek_Muhammad.setPesanan(null);
        System.out.println(ojek_Muhammad);
        //ojek_Muhammad.toString();
        ojek_Muhammad.setPesanan(pes_Rajab);
        System.out.println(ojek_Muhammad);
        //ojek_Muhammad.toString();
        
        dbasep.addPesanan(pes_Rajab);
        System.out.println(p_Rajab);
        //p_Rajab.toString();
        dbasep.hapusPesanan(pes_Rajab);
        System.out.println(p_Rajab);
        //p_Rajab.toString();
        */ 
        /*
        pes_Rajab.setPelayan(null);
        
        pes_Rajab.setStatusSelesai(true);
        pes_Rajab.setStatusDiproses(false);
        
        pes_Rajab.setPenggunaAkhir("Yoman");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(true);
        
        pes_Rajab.setPenggunaAkhir("Yoman");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(false);
        
        pes_Rajab.setPenggunaAkhir("Yoman");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        *
        pes_Rajab.setPelayan(ojek_Muhammad);
        
        pes_Rajab.setStatusSelesai(true);
        pes_Rajab.setStatusDiproses(false);
        
        pes_Rajab.setPenggunaAkhir("Jabun");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(true);
        
        pes_Rajab.setPenggunaAkhir("Jabun");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(false);
        
        pes_Rajab.setPenggunaAkhir("Jabun");
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        pes_Rajab.setPenggunaAkhir(null);
        System.out.println(pes_Rajab);
        //pes_Rajab.toString();
        *
        
        //*
        //tugas 4
        ojek_Muhammad.setTelefon("11111");
        ojek_Muhammad.setTelefon("021-741-0552");
        ojek_Muhammad.setTelefon("085854032720");
        ojek_Muhammad.setNoPlat("b6118wdi");
        ojek_Muhammad.setNoPlat("B6118WDI");
        ojek_Muhammad.setNoPlat("AB 6118 WDI");
        System.out.println("=========================================");
        Ojek ojek_Rajab = new Ojek(1, "Muhammad", kang_ojek);
        ojek_Rajab.setDOB(9,12,1994);
        ojek_Rajab.getDOB();
        ojek_Rajab.setNoPlat("B124UA");
        ojek_Rajab.getNoPlat();
        System.out.println(ojek_Rajab);
        //ojek_Rajab.toString();
        Pelanggan user = new Pelanggan(1,"Rajab");
        user.setTelefon("085854032720");
        System.out.println(user);
        //user.toString();
        //*
       
        //pes_Rajab.setPelanggan(p_Rajab);
        //ojek_Muhammad.toString();
        //pes_Rajab.toString(); //menjalankan method toString() pada kelas Pesanan
        //ojek_Muhammad.setPesanan(pes_Rajab); 
    }
    /*/
    /*
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 5 Pertama
     *
    //public void main (String [] args)
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         *
        Array a = new Array();
        int[] arrayInt = new int[10];
        //ArrayList <Integer> listInt = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>(Arrays.asList(308,654,988,331,668,378,19,145,70,635));
        
        arrayInt[0] = 283;
        arrayInt[1] = 157;
        arrayInt[2] = 634;
        arrayInt[3] = 766;
        arrayInt[4] = 763;
        arrayInt[5] = 896;
        arrayInt[6] = 460;
        arrayInt[7] = 726;
        arrayInt[8] = 392;
        arrayInt[9] = 182;
        
        //int[] arrayInt = {9,5,4,1,4,5,7,9,4};
        //ArrayList<String> arraylistmodul5 = new ArrayList<String>();
         
        //String content = new String(Files.readAllBytes(Paths.get("arraylistmodul5.txt")));
        //Scanner content = new Scanner(new File("/stasiun/priok_jakarta.txt")).useDelimiter(",\\s*");
        //int[] arrayInt = content;
        a.sortArray(arrayInt);
        //a.sortArrayList(listInt);
    }
    */
    
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 5 Kedua
     */
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1,"Rajab","085854032720"); //membuat objek baru pada kelas Pelanggan
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        Pesanan pes_Rajab_2 = new Pesanan(p_Rajab, TipeLayanan.BeliBarang, per_Rajab_akhir, per_Rajab_awal, "Jabun", "Shion", 50000); //membuat objek baru pada kelas Pesanan
        DatabasePesanan.addPesanan(pes_Rajab);
        
    }
    
    /**
     * Method untuk mengantar barang
     * 
     */
    public static void antarBarang()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method yang memesan ojek untuk mengantar orang
     * 
     */
    public static void antarOrang()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk membatalkan pesanan dari akun ojek
     * 
     */
    public static void ojekMembatalkan()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk mengubah status ojek
     * 
     */
    public static void ojekMengubahStatus()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method yang memesan ojek untuk membeli barang
     * 
     */
    public static void pembelianBarang()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk membatalkan pesanan dari akun pengguna
     * 
     */
    public static void penggunaMembatalkan()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk menghapus pesanan dari akun pengguna
     * 
     */
    public static void penggunaMenghapusPesanan()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk menyelesaikan pesanan dari akun pengguna
     * 
     */
    public static void penggunaMenyelesaikanPesanan()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk registrasi ojek
     * 
     */
    public static void registrasiOjek()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Method untuk registrasi pengguna (pelanggan)
     * 
     */
    public static void registrasiPengguna()
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        
    }
    
    /**
     * Constructor for objects of class OjeKampus
     */
    public OjeKampus()
    {
        // initialise instance variables
    }
}
