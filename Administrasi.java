
/**
 * class Administrasi berisi kumpulan method untuk mengatur tugas ojek (koordinasi ojek dan pelanggan).
 * 
 * @author Muhammad Rajab(1206244415) 
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 3 : Class Administrasi dibuat
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
    Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
    Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
    Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
    Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
    Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
    
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }
    
    /**
     * Method untuk menugaskan pesanan ke ojek
     * 
     * @param pesan Parameter dari method pesananDitugaskan yang merujuk ke class Pesanan
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(true);
        pes_Rajab.setPelayan(ojek_Muhammad);
        /*
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        ojekAmbilPesanan(pes_Rajab, ojek_Muhammad);
        
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        */
    }
    
    /**
     * Method untuk menugaskan pesanan ke ojek untuk diambil
     * 
     * @param pesan Parameter dari method pesananDitugaskan yang merujuk ke class Pesanan
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
        ojek_Muhammad.setStatus(StatusOjek.Jemput);
        ojek_Muhammad.setPesanan(pes_Rajab);
    }
    
    /**
     * Method untuk melepas pesanan dari ojek
     * 
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public void ojekLepasPesanan(Ojek pelayan)
    {
        ojek_Muhammad.setStatus(StatusOjek.Idle);
        ojek_Muhammad.setPesanan(null);
    }
    
    /**
     * Method untuk membatalkan pesanan dari ojek
     * 
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public void pesananDibatalkan(Ojek pelayan)
    {
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(false);
        ojek_Muhammad.setPesanan(null);
        ojekLepasPesanan(ojek_Muhammad);
        /*
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        */
    }
    
    /**
     * Method untuk menyatakan pesanan selesai dari ojek
     * 
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public void pesananSelesai(Ojek pelayan)
    {
        pes_Rajab.setStatusSelesai(true);
        pes_Rajab.setStatusDiproses(false);
        ojek_Muhammad.setPesanan(null);
        ojekLepasPesanan(ojek_Muhammad);
        /*
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        */
    }
    
    /**
     * Method untuk membatalkan pesanan dari class pesanan (pelanggan)
     * 
     * @param pesan Parameter dari method pesananDitugaskan yang merujuk ke class Pesanan
     * 
     */
    public void pesananDibatalkan(Pesanan pesan)
    {
        ojekLepasPesanan(ojek_Muhammad);
        pes_Rajab.setStatusSelesai(false);
        pes_Rajab.setStatusDiproses(false);
        pes_Rajab.setPelayan(null);
        /*
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        */
    }
    
    /**
     * Method untuk menyatakan pesanan selesai dari class pesanan (pelanggan)
     * 
     * @param pesan Parameter dari method pesananDitugaskan yang merujuk ke class Pesanan
     * 
     */
    public void pesananSelesai(Pesanan pesan)
    {
        ojekLepasPesanan(ojek_Muhammad);
        pes_Rajab.setStatusSelesai(true);
        pes_Rajab.setStatusDiproses(false);
        pes_Rajab.setPelayan(null);
        /*
        ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
        p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
        pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
        */
    }
    
}

/*
 * Bekas Modul 3
 * 
 * public void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan 
    }
 * 
 * public void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
        //ojek_Muhammad.getPesanan();
    }
 * 
 * public void ojekLepasPesanan(Ojek pelayan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        
        //ojek_Muhammad.setPesanan(pes_Rajab);
    }
 * 
 * public void pesananDibatalkan(Ojek pelayan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
        //pes_Rajab.getPelayan();
     }
 * 
 * public void pesananSelesai(Ojek pelayan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
        //pes_Rajab.getPelayan();
    }
 * 
 * public void pesananDibatalkan(Pesanan pesan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
        //pes_Rajab.getPelayan();
    }
 * 
 * public void pesananSelesai(Pesanan pesan)
    {
        Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
        Ojek ojek_Muhammad = new Ojek(1, "Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan(1, "Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
        //pes_Rajab.getPelayan();
    }
 *
 *
 */