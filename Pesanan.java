
/**
 * class Pesanan berisi kumpulan method yang mengatur pesanan.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 1 : Jika terdapat method lain yang memerlukan nilai return selain numerik, string dan boolean, diganti
 * menjadi tipe method String dengan nilai return value-nya String kosong.
 * Modul 2 : Class Pesanan diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 * Modul 3 : Menambah 2 constructor, beberapa method (getPelayan(), getStatusDiproses() dan getTipeLayanan()) dan mengubah isi method printData()
 */

public class Pesanan
{
    // instance variables - replace the example below with your own
    
    private Ojek pelayan = null; //isi dari pelayan adalah null
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private TipeLayanan layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses = false; //isi dari diproses adalah false
    private boolean selesai = false;
    

    /**
     * Constructor for objects of class Pesanan
     * 
     * @param pengguna Parameter dari constructor kelas ini yang merujuk ke class Pelanggan
     * @param layanan Parameter dari constructor kelas ini dalam bentuk String
     * @param lokasi_awal Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param lokasi_akhir Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param pelanggan_awal Parameter dari constructor kelas ini dalam bentuk String
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal)
    {
        // initialise instance variables
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;   
    }
    
    /**
     * Constructor for objects of class Pesanan
     * (Ditambah saat modul 3)
     * 
     * @param pengguna Parameter dari constructor kelas ini yang merujuk ke class Pelanggan
     * @param layanan Parameter dari constructor kelas ini dalam bentuk String
     * @param lokasi_awal Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param lokasi_akhir Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param pelanggan_awal Parameter dari constructor kelas ini dalam bentuk String
     * @param pelanggan_akhir Parameter dari constructor kelas ini dalam bentuk String
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir)
    {
        // initialise instance variables
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
    }
    
    /**
     * Constructor for objects of class Pesanan
     * (Ditambah saat modul 3)
     * 
     * @param pengguna Parameter dari constructor kelas ini yang merujuk ke class Pelanggan
     * @param layanan Parameter dari constructor kelas ini dalam bentuk String
     * @param lokasi_awal Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param lokasi_akhir Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     * @param pelanggan_awal Parameter dari constructor kelas ini dalam bentuk String
     * @param pelanggan_akhir Parameter dari constructor kelas ini dalam bentuk String
     * @param biaya Parameter dari constructor kelas ini dalam bentuk double (numerik)
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        // initialise instance variables
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
        this.biaya = biaya;
    }
    
    /**
     * Method untuk menampilkan pelayan dari ojek
     * (Ditambah saat modul 3)
     * @return pelayan Mengembalikan isi data dari instance variable pelayan
     */
    public Ojek getPelayan()
    {
        return pelayan;
    }
    
    /**
     * Method untuk menampilkan status pesanan diproses dari ojek
     * (Ditambah saat modul 3)
     * @return diproses Mengembalikan isi data dari method ini dengan isi nilai diproses
     */
    public boolean getStatusDiproses()
    {
        return diproses;
    }
    
    /**
     * Method untuk menampilkan status pesanan selesai dari ojek
     * 
     * @return selesai Mengembalikan isi data dari method ini dengan nilai selesai
     */
    public boolean getStatusSelesai()
    {
        return selesai;
    }
    
    /**
     * Method untuk menampilkan pelanggan dari ojek
     * 
     * @return pengguna Mengembalikan isi data dari instance variable pengguna
     */
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /**
     * Method untuk menampilkan lokasi awal dari ojek
     * 
     * @return lokasi_awal Mengembalikan isi data dari instance variable lokasi_awal
     */
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /**
     * Method untuk menampilkan lokasi terakhir dari ojek
     * 
     * @return lokasi_akhir Mengembalikan isi data dari instance variable lokasi_akhir
     */
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    /**
     * Method untuk menampilkan tipe layanan dari ojek
     * (String diubah menjadi TipeLayanan pada modul 3)
     * @return layanan Mengembalikan isi data dari instance variable layanan
     */
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }
    
    /**
     * Method untuk menampilkan pengguna awal dari ojek
     * 
     * @return pelanggan_awal Mengembalikan isi data dari instance variable pelanggan_awal
     */
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /**
     * Method untuk menampilkan pengguna terakhir dari ojek
     * 
     * @return pelanggan_akhir Mengembalikan isi data dari instance variable pelanggan_akhir
     */
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    /**
     * Method untuk menampilkan biaya ojek
     * 
     * @return biaya Mengembalikan isi data dari instance variable biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
   
    /**
     * Method untuk memasukkan nama pelayan (ojek)
     * 
     * @param pelayan Parameter dari method setPelayan yang merujuk ke class Ojek
     */
    public void setPelayan(Ojek pelayan)
    {
        this.pelayan = pelayan;
    }
    
    /**
     * Method untuk memasukkan nama pelanggan
     * 
     * @param pengguna Parameter dari method setPelanggan yang merujuk ke class Pelanggan
     */
    public void setPelanggan(Pelanggan pengguna)
    {
        this.pengguna = pengguna;
    }
    
    /**
     * Method untuk memasukkan nama pelanggan awal
     * 
     * @param pelanggan_awal Parameter dari method setPenggunaAwal dalam bentuk String
     */
    public void setPenggunaAwal(String pelanggan_awal)
    {
        this.pelanggan_awal = pelanggan_awal;
    }
    
    /**
     * Method untuk memasukkan nama pelanggan akhir
     * 
     * @param pelanggan_akhir Parameter dari method setPenggunaAkhir dalam bentuk String
     */
    public void setPenggunaAkhir(String pelanggan_akhir)
    {
        this.pelanggan_akhir = pelanggan_akhir;
    }
    
    /**
     * Method untuk memasukkan biaya
     * 
     * @param biaya Parameter dari method setBiaya dalam bentuk double
     */
    public void setBiaya(Double biaya)
    {
        this.biaya = biaya;
    }
    
    /**
     * Method untuk memasukkan tipe layanan
     * 
     * @param layanan Parameter dari method setTipeLayanan yang merujuk ke class TipeLayanan
     */
    public void setTipeLayanan(TipeLayanan layanan)
    {
        this.layanan = layanan;
    }
    
    /**
     * Method untuk memasukkan lokasi awal
     * 
     * @param lokasi_awal Parameter dari method setLokasiAwal yang merujuk ke class Lokasi
     */
    public void setLokasiAwal(Lokasi lokasi_awal)
    {
        this.lokasi_awal = lokasi_awal;
    }
    
    /**
     * Method untuk memasukkan lokasi akhir
     * 
     * @param lokasi_akhir Parameter dari method setLokasiAkhir yang merujuk ke class Lokasi
     */
    public void setLokasiAkhir(Lokasi lokasi_akhir)
    {
        this.lokasi_akhir = lokasi_akhir;
    }
    
    /**
     * Method untuk memasukkan status diproses
     * 
     * @param diproses Parameter dari method setStatusDiproses dalam bentuk boolean
     */
    public void setStatusDiproses(boolean diproses)
    {
        this.diproses = diproses;
    }
    
    /**
     * Method untuk memasukkan status selesai
     * 
     * @param diproses Parameter dari method setStatusSelesai dalam bentuk boolean
     */
    public void setStatusSelesai(boolean selesai)
    {
        this.selesai = selesai;
    }
    
    /**
     * Method untuk Menampilkan hasil (isi data) dari method getStatusSelesai(), getStatusDiproses(),
     * instance lokasi_awal, lokasi_akhir, pelanggan_awal, pelanggan_akhir dan layanan dalam bentuk string
     * 
     * Diubah di Modul 3
     */
    public void printData()
    {
        System.out.println("Nama Pelanggan Awal :" + " " + pelanggan_awal);
        System.out.println("Lokasi Awal :" + " " + lokasi_awal);
        System.out.println("Nama Pelanggan Akhir :" + " " + pelanggan_akhir);
        System.out.println("Lokasi Akhir :" + " " + lokasi_akhir);
        System.out.println("Layanan yang Dipilih :" + " " + layanan);
        System.out.println("Status selesai :" + " " + getStatusSelesai());
        System.out.println("Status diproses :" + " " + getStatusDiproses() + "\n\n");
    }
    
    /**
     * Method untuk mengimplementasikan toString, belum digunakan saat ini
     */
    public String toString()
    {
        return "";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}

/*Bekas Modul 1
   instance variables
   
    private Ojek pelayan; //Belum ada class Ojek
    //private Pelanggan pengguna; Belum ada class Pelanggan
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    //private TipeLayanan layanan; Belum ada class TipeLayanan
    //private Lokasi lokasi_awal; Belum ada class Lokasi
    //private Lokasi lokasi_akhir; Belum ada class Lokasi
    private boolean diproses;
    private boolean dibatalkan;
    
    methods
    
    public String pesananDiambil()
    {
        return "";
    }
   
    /* Belum ada class Ojek
    public void pesananDiambil(Ojek pelayan)
    {
        
    }
    */
   
   /* Modul 1
    public String getPelanggan()
    {
        return "";
    }
    */
   
   /* Modul 1
    public String getOjek()
    {
        return "";
    }
    */
   
    /*
    public void pesananDibatalkan()
    {
        
    }
    */
    
    /*
    public String getLokasiAkhir()
    {
        return "";
    }
    */
    
    /* Belum ada TipeLayanan
    public TipeLayanan getTipeLayanan()
    {
        
    }
    
    /*Modul 1
    public String getLokasiAwal()
    {
        return "";
    }
    */
   
   /* Bekas Modul 2
   
    instance variables
   
    
    Method
    
    /**
     * Method untuk menampilkan status pesanan dari ojek
     * Bekas Modul 2
     * @return false Mengembalikan isi data dari method ini dengan nilai false
    
    public boolean getStatusPesanan()
    {
        return false;
    }
    */
    
   /*
    /**
     * Method untuk menampilkan ojek
     * Bekas Modul 2
     * @return pelayan Mengembalikan isi data dari instance variable pelayan
     
    public Ojek getOjek()
    {
        return pelayan;
    }
    */
    
   /*
    /**
     * Method untuk Menampilkan hasil (isi data) dari instance lokasi_awal, lokasi_akhir dan layanan dalam bentuk string
     * Bekas Modul 2
    public void printData()
    {
        System.out.println("Lokasi Pelanggan Awal :" + " " + lokasi_awal);
        System.out.println("Lokasi Pelanggan Akhir :" + " " + lokasi_akhir);
        System.out.println("Layanan yang Dipilih :" + " " + layanan);
    }
    */
    
   /* Bekas Modul 3
       
      instance variables
      //private String layanan;
      //private boolean dibatalkan = false;
    
   
      Isi dalam Method
      
      public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal)
    {
        // initialise instance variables
        
        //this.pelanggan_akhir = pelanggan_akhir;
        //this.biaya = biaya;
    }
    
      public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir)
    {
        // initialise instance variables
        
        //this.biaya = biaya;
    }
    
    public void printData()
    {
        //System.out.println("Layanan yang Dipilih :" + " " + TipeLayanan.BeliBarang.toString());
        //System.out.println("Status selesai :" + " " + selesai + "\n\n");
        //System.out.println("Status diproses :" + " " + diproses);
    }
    
    
    */