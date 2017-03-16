
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        x = 0;
    }

    public void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        Ojek ojek_Muhammad = new Ojek("Muhammad"); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        Pelanggan p_Rajab = new Pelanggan("Rajab"); //membuat objek baru pada kelas Pelanggan 
        Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
        Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
        TipeLayanan tipe1 = new TipeLayanan();
        Pesanan pes_Rajab = new Pesanan(p_Rajab, tipe1, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        pes_Rajab.getStatusDiproses();
        pes_Rajab.getStatusSelesai();
        pes_Rajab.getOjek();
        Administrasi admin = new Administrasi();
        admin.ojekAmbilPesanan(pes_Rajab, ojek_Muhammad);
    }
    
    public void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
        Ojek ojek_Muhammad = new Ojek("Muhammad"); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        ojek_Muhammad.setStatus("Menjemput");
        Administrasi admin1 = new Administrasi();
        Pesanan pes_Rajab = new Pesanan(p_Rajab, "Antar Donasi", per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        admin1.pesananDitugaskan(pes_Rajab, ojek_Muhammad);
    }
    
    public void ojekLepasPesanan(Ojek pelayan)
    {
        Ojek ojek_Muhammad = new Ojek("Muhammad"); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
        ojek_Muhammad.setStatus("Idle");
        Pesanan pes_Rajab = new Pesanan(p_Rajab, "Antar Donasi", per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        //setPesanan;
    }
    
    public void pesananDibatalkan(Ojek pelayan)
    {
        
    }
    
    public void pesananSelesai(Ojek pelayan)
    {
        
    }
    
    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
    
    public void pesananSelesai(Pesanan pesan)
    {
        
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
