
/**
 * class Administrasi berisi kumpulan method untuk mengatur tugas ojek (koordinasi ojek dan pelanggan).
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
 * Modul 3 : Class Administrasi dibuat
 * Modul 4 : Tidak ada perubahan
 * Modul 5 : Menambah method pesananDibatalkan(Pelanggan pengguna), pesananSelesai(Pelanggan pengguna)
 *           Menambah method cariPesananIdle(), jalankanSistemPenugas(), temukanOjekTerdekat (Pesanan pesan)
 *           Menambah method printAllDatabase(), printOjekDatabase(), printPelangganDatabase(), printPesananDatabase()
 * Modul 6 : Mengubah method cariPesananIdle() dan temukanOjekTerdekat() menjadi private
 * Modul 7 : Tidak ada perubahan
 * Modul 8 : Tidak ada perubahan
 */
public class Administrasi
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables

    }

    /**
     * Method untuk mencari pesanan yang memiliki status idle
     * diubah menjadi private di modul 6 
     */
    private static Pesanan cariPesananIdle()
    {
        for (int i = 0; i < DatabasePesanan.getDatabase().size(); i++)
        {

            if(DatabasePesanan.getPesanan(DatabasePesanan.getDatabase().get(i).getPelanggan()).getStatusDiproses() == false && DatabasePesanan.getPesanan(DatabasePesanan.getDatabase().get(i).getPelanggan()).getStatusSelesai() == false)
            {
                return DatabasePesanan.getPesanan(DatabasePesanan.getDatabase().get(i).getPelanggan());
            }
            else
            {
                System.out.println("Tidak ada pesanan idle");
                return null;
            }
        }
        return null;
    }

    /**
     * Method untuk menjalankan sistem penugas
     * 
     */
    public static void jalankanSistemPenugas()
    {
        //DatabaseUser.getUserOjek();
        DatabaseUser.getUserOjek(0);
        for (int i = 0; i < DatabasePesanan.getDatabase().size(); i++)
        {
            DatabasePesanan.getPesanan(DatabasePesanan.getDatabase().get(i).getPelanggan());
        }
        cariPesananIdle();
        temukanOjekTerdekat(cariPesananIdle());
    }

    /**
     * Method untuk menugaskan pesanan ke ojek untuk diambil
     * 
     * @param pesan Parameter dari method ojekAmbilPesanan yang merujuk ke class Pesanan
     * @param pelayan Parameter dari method ojekAmbilPesanan yang merujuk ke class Ojek
     * 
     */
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(pesan);
    }

    /**
     * Method untuk melepas pesanan dari ojek
     * 
     * @param pelayan Parameter dari method OjekLepasPesanann yang merujuk ke class Ojek
     * 
     */
    public static void ojekLepasPesanan(Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
    }

    /**
     * Method untuk membatalkan pesanan dari ojek
     * 
     * @param pelayan Parameter dari method pesananDibatalkan yang merujuk ke class Ojek
     * 
     */
    public static void pesananDibatalkan(Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(false);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.setPesanan(null);
        ojekLepasPesanan(pelayan);
    }

    /**
     * Method untuk membatalkan pesanan dari pelanggan
     * 
     * @param pelayan Parameter dari method pesananDibatalkan yang merujuk ke class Pelanggan
     * 
     */
    public static void pesananDibatalkan(Pelanggan pengguna)
    {
        //pelayan.getPesanan().setStatusSelesai(false);
        //pelayan.getPesanan().setStatusDiproses(false);
        //ojekLepasPesanan(pelayan);
        //Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        //Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        //Pesanan message = new Pesanan(pengguna, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000);
        Pesanan p = DatabasePesanan.getPesanan(pengguna);
        //if(p.getPelanggan().equals(pengguna))
        //{
        ojekLepasPesanan(p.getPelayan());
        p.setStatusSelesai(false);
        p.setStatusDiproses(false);
        p.setPelanggan(null);
        //}
    }

    /**
     * Method untuk membatalkan pesanan dari class pesanan (pelanggan)
     * 
     * @param pesan Parameter dari method pesananDibatalkan yang merujuk ke class Pesanan
     * 
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
    }

    /**
     * Method untuk menugaskan pesanan ke ojek
     * 
     * @param pesan Parameter dari method pesananDitugaskan yang merujuk ke class Pesanan
     * @param pelayan Parameter dari method pesananDitugaskan yang merujuk ke class Ojek
     * 
     */
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan, pelayan);
    }

    /**
     * Method untuk menyatakan pesanan selesai dari ojek
     * 
     * @param pelayan Parameter dari method pesananSelesai yang merujuk ke class Ojek
     * 
     */
    public static void pesananSelesai(Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(true);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.setPesanan(null);
        ojekLepasPesanan(pelayan);
    }

    /**
     * Method untuk menyatakan pesanan selesai dari pelanggan
     * 
     * @param pengguna Parameter dari method pesananSelesai yang merujuk ke class Pelanggan
     * 
     */
    public static void pesananSelesai(Pelanggan pengguna)
    {
        //pelayan.getPesanan().setStatusSelesai(true);
        //pelayan.getPesanan().setStatusDiproses(false);
        //ojekLepasPesanan(pelayan);
        //Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        //Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        //Pesanan message = new Pesanan(pengguna, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000);
        Pesanan p = DatabasePesanan.getPesanan(pengguna);
        //if(p.getPelanggan().equals(pengguna))
        //{
        ojekLepasPesanan(p.getPelayan());
        p.setStatusSelesai(true);
        p.setStatusDiproses(false);
        p.setPelanggan(null);
        //}
    }

    /**
     * Method untuk menyatakan pesanan selesai dari class pesanan (pelanggan)
     * 
     * @param pesan Parameter dari method pesananSelesai yang merujuk ke class Pesanan
     * 
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
    }

    /**
     * Method untuk mencetak semua database
     * 
     */
    public static void printAllDatabase()
    {
        System.out.println("=====================");
        System.out.println("Database Ojek");
        System.out.println("=====================");
        System.out.println(DatabaseUser.getOjekDatabase());
        System.out.println("\n\n\n");
        System.out.println("=====================");
        System.out.println("Database Pelanggan");
        System.out.println("=====================");
        System.out.println(DatabaseUser.getPelangganDatabase());
        System.out.println("\n\n\n");
        System.out.println("=====================");
        System.out.println("Database Pesanan");
        System.out.println("=====================");
        System.out.println(DatabasePesanan.getDatabase());
        System.out.println("\n\n\n");
    }

    /**
     * Method untuk mencetak database ojek
     * 
     */
    public static void printOjekDatabase()
    {
        System.out.println("=====================");
        System.out.println("Database Ojek");
        System.out.println("=====================");
        System.out.println(DatabaseUser.getOjekDatabase());
        System.out.println("\n\n\n"); 
    }

    /**
     * Method untuk mencetak database pelanggan
     * 
     */
    public static void printPelangganDatabase()
    {
        System.out.println("=====================");
        System.out.println("Database Pelanggan");
        System.out.println("=====================");
        System.out.println(DatabaseUser.getPelangganDatabase()); 
        System.out.println("\n\n\n");
    }

    /**
     * Method untuk mencetak database pesanan
     * 
     */
    public static void printPesananDatabase()
    {
        System.out.println("=====================");
        System.out.println("Database Pesanan");
        System.out.println("=====================");
        System.out.println(DatabasePesanan.getDatabase());
        System.out.println("\n\n\n");
    }

    /**
     * Method untuk menemukan ojek terdekat
     * 
     * @param pesan Parameter dari method pesananSelesai yang merujuk ke class Pesanan
     * diubah menjadi private di modul 6
     */
    private static Ojek temukanOjekTerdekat(Pesanan pesan)
    {
        double a = pesan.getLokasiAwal().getX();
        double b = pesan.getLokasiAwal().getY();
        double c = Math.pow(a,2);
        double d = Math.pow(b,2);
        double jarak_awal = Math.sqrt(c + d);
        double e = pesan.getLokasiAkhir().getX();
        double f = pesan.getLokasiAkhir().getY();
        double g = Math.pow(e,2);
        double h = Math.pow(f,2);
        double i = Math.pow((a+e),2);
        double j = Math.pow((b+f),2);
        double jarak_pesan = Math.sqrt(i + j);

        //int x = (int)(pesan.getPelayan().getPosisi().getX() + 0.5d);
        //int y = (int)(pesan.getPelayan().getPosisi().getY() + 0.5d);

        double l = DatabaseUser.getUserOjek(pesan.getPelayan().getID()).getPosisi().getX();
        double m = DatabaseUser.getUserOjek(pesan.getPelayan().getID()).getPosisi().getY();
        double n = Math.pow(l,2);
        double o = Math.pow(m,2);
        double jarak_ojek = Math.sqrt(n + o);
        
        if(DatabasePesanan.getPesanan(DatabasePesanan.getDatabase().get(1).getPelanggan()).getPelayan().getStatus() == StatusOjek.Idle && pesan.getPelayan() == null)
        {
            if(jarak_awal >= jarak_ojek)
            {
                pesan.setPelayan(DatabaseUser.getUserOjek(pesan.getPelayan().getID()));
            }
        }
        //return DatabaseUser.getUserOjek(pesan.getPelayan().getID());
        return null;
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

/*
ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
ojekAmbilPesanan(pes_Rajab, ojek_Muhammad);

ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
 *
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
/*
ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
 *
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
/*
ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
 *
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
/*
ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
 *
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
/*
ojek_Muhammad.printData(); //menjalankan method printData() pada kelas Ojek
p_Rajab.printData(); //menjalankan method printData() pada kelas Pelanggan
pes_Rajab.printData(); //menjalankan method printData() pada kelas Pesanan
 *
}
 *
 *
 */