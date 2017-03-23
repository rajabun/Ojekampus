import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 * class Ojek berisi kumpulan method untuk mengatur ojek yang dipesan.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 2 : Class Ojek ditambahkan pada versi 0.2
 * Modul 3 : Menambah beberapa method (setTelefon(), setEmail(), setDOB(), setNoPlat()) 
 *           Menambah beberapa method (getTelefon(), getEmail(), getDOB(), getNoPlat(), getStatus())
 *           Mengubah isi method printData()
 *           Menambah instance variables private StatusOjek status = StatusOjek.Idle
 *           Menambah instance variables private String telefon, email, no_plat, dob
 * Modul 4 : Mengimpor class Pattern, Matcher dan Date
 *           Mengubah instance variables private String dob; menjadi private Date dob;
 *           Mengubah method setEmail(String email), setTelefon (String telefon), setDOB(Date dob), setNoPlat(String no_plat)
 *           Mengubah method getEmail(), getTelefon (), getDOB(), getNoPlat()
 *           Mengganti method printData() dengan toString()
 * Modul 5 :
 *           
 */

public class Ojek
{
    // instance variables - replace the example below with your own

    private StatusOjek status = StatusOjek.Idle; //Ditambahkan saat modul 3
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null; //isi dari pesanan_sekarang adalah null
    private int id;
    private String nama;
    private String telefon, email, no_plat; //Ditambahkan saat modul 3
    private Date dob; //Ditambahkan saat modul 3
    
    /**
     * Constructor for objects of class Ojek
     *
     * @param id Parameter dari constructor kelas ini dalam bentuk integer (numerik)
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     * @param posisi_sekarang Parameter dari constructor kelas ini yang merujuk ke class Lokasi
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang) 
    {
        // initialise instance variables
        id = DatabaseUser.getIDOjekTerakhir();
        this.nama = nama; //this digunakan karena nama instance variable sama dengan dengan parameter method ini
        Lokasi lokasi1 = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
        posisi_sekarang = lokasi1;
    }
    
    /**
     * Method untuk memasukkan id ojek
     * 
     * @param id Parameter dari method setID dalam bentuk int
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk memasukkan nama ojek
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method untuk memasukkan telepon ojek
     * Ditambahkan saat modul 3
     * @param telefon Parameter dari method setTelefon dalam bentuk String
     */
    public boolean setTelefon(String telefon)
    {
        //untuk validasi nomer telepon dengan maksimal 12 digit dengan format "081234567890"
        // \ : Nothing, but quotes the following character
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n,m} : Matches at least n but not more than m times
        // \\d{7,12} berarti 012345678901
        if (telefon.matches("\\d{7,12}")) 
        {
            this.telefon = telefon;
            System.out.println(telefon + " : " + telefon.matches("\\d{7,12}") + "\n");
            return true;
        }
        
        //untuk validasi nomer telepon dengan -, . atau spasi
        // \ : Nothing, but quotes the following character
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n} : Matches exactly n number of occurrences of the preceding expression.
        // \s : A whitespace character: [ \t\n\x0B\f\r] -> untuk validasi spasi (Bukan \s karena \s merupakan special escape sequences for String untuk spasi)
        // [re] : Grouping
        // - : untuk pemisah nomor telepon -
        // \\. : Backslash character (untuk .), gabisa langsung . karena kalo . itu,
        // . : Matches any single character except newline. Using m option allows it to match the newline as well
        // \\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4} berarti 000-111-2222 atau 000.111.2222 atau 000 111 2222
        
        else if(telefon.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
        {
            this.telefon = telefon;
            System.out.println(telefon + " : " + telefon.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}") + "\n");
            return true;
        }
        
        //untuk validating nomer telepon dimana kode area menggunakan ()
        // \\( : Backslash character untuk (, gabisa langsung ( karena fungsinya akan bertabrakan dengan ()
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n} : Matches exactly n number of occurrences of the preceding expression.
        // \\) : Backslash character untuk ), gabisa langsung ) karena fungsinya akan bertabrakan dengan ()
        // - : untuk pemisah nomor telepon -
        // \\(\\d{3}\\)-\\d{3}-\\d{4} berarti (000)-111-2222
        
        else if(telefon.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
        {
            this.telefon = telefon;
            System.out.println(telefon + " : " + telefon.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}") + "\n");
            return true;
        }
        //return false jika tidak ada input yang sesuai (matches)
        else
        {
            System.out.println("Maaf format nomer telefon yang ada masukan salah\n");
            return false;
        }
          
    }
    
    /**
     * Method untuk memasukkan email ojek
     * Ditambahkan saat modul 3
     * Diubah di modul 4
     * @param email Parameter dari method setEmail dalam bentuk String
     */
    public boolean setEmail(String email)
    {
        // ^ : Matches the beginning of the line
        // (re) : Grouping
        // . : Any character (may or may not match line terminators)
        // re+ : Matches 1 or more of the previous thing
        // @ : untuk @ dalam format email
        // $ : Matches the end of the line
        // ^(.+)@(.+)$ berarti abcde,123@abcde.com
        
        String regex = "^(.+)@(.+)$"; //membuat string yang akan digunakan pada class Pattern
        
        //A regular expression, specified as a string, must first be compiled into an instance of this class
        Pattern pattern = Pattern.compile(regex); 
        //The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.
        Matcher matcher = pattern.matcher((CharSequence) email);
        
        if(matcher.matches() == true)
        {
            this.email = email;
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
        
        else if(matcher.matches() == false)
        {
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println("Maaf format email yang anda masukan salah" + " : "+ matcher.matches() + "\n");
        }
        return matcher.matches(); //mengembalikan hasil validasi apakah true atau false
    }
    
    /**
     * Method untuk memasukkan dob ojek
     * Ditambahkan saat modul 3
     * Diubah di modul 4
     * @param day Parameter dari method setDOB dalam bentuk integer (numerik)
     * @param month Parameter dari method setDOB dalam bentuk integer (numerik)
     * @param year Parameter dari method setDOB dalam bentuk integer (numerik)
     */
    public void setDOB(int day, int month, int year)
    {
      //Membuat objek Date
      Date trialTime = new Date();
      
      //Membuat objek GregorianCalendar(int year, int month, int dayofmonth)
      //month bernilai 0 untuk januari hingga 11 untuk desember, sehingga jika menginput 1 (bulan januari) harus dikurangi 1 sehingga menghasilkan bulan januari (01)
      //Sisa dokumentasi tentang GregorianCalendar ada di https://docs.oracle.com/javase/8/docs/api/java/util/GregorianCalendar.html
      Date tanggal = new GregorianCalendar(year, month-1, day).getTime();
      
      //getInstance() : Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time:
      // getTime() : Returns a Date object representing this Calendar's time value (millisecond offset from the Epoch").
      Date waktu = Calendar.getInstance().getTime();
      
      //Membuat objek SimpleDateFormat. Ini diperlukan untuk membuat format dd-mm-yyyy untuk tanggal dan h:mm a untuk waktu
      //dd-MM-yyyy = day-month-year
      //h:mm a = hour:minute:Am/pm marker
      
      //Month: If the number of pattern letters (M) is 3 or more, the month is interpreted as text; otherwise, it is interpreted as a number.
      //Sisa dokumentasi tentang SimpleDateFormat ada di http://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
      SimpleDateFormat sdf = new SimpleDateFormat("dd MMMMMMMM yyyy");
      SimpleDateFormat df = new SimpleDateFormat("h:mm a");
      
      // SimpleDateFormat.format(Date date) : Formats the given Date into a date/time string and appends the result to the given StringBuffer.
      System.out.printf("Date of Birth : " + sdf.format(tanggal) + "\n" + "Waktu input : " + df.format(waktu) + "\n\n");
      
      //Mengembalikan nilai objek tanggal ke instance variable dob
      this.dob = tanggal;
    }
    
    /**
     * Method untuk memasukkan nomer plat ojek
     * Ditambahkan saat modul 3
     * @param no_plat Parameter dari method setNoPlat dalam bentuk String
     */
    public boolean setNoPlat(String no_plat)
    {
        // ^ : Matches the beginning of the line
        // [A-Z] : A through Z, inclusive (range), harus huruf gede dari A-Z
        // re{n,m} : Matches at least n but not more than m times
        // [re] : Grouping
        // \s : A whitespace character: [ \t\n\x0B\f\r] -> untuk validasi spasi (Bukan \s karena \s merupakan special escape sequences for String untuk spasi)
        // \S : A non-whitespace character: [ \^\s] -> untuk validasi non spasi (Bukan \S karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        
        // $ : Matches the end of the line
        // ^[A-Z]{1,2}[\\s\\S]\\d{1,4}[\\s\\S][A-Z]{1,3}$ berarti B1234ABC atau B 1234 ABC
        
        String regex = "^[A-Z]{1,2}[\\s\\S]\\d{1,4}[\\s\\S][A-Z]{1,3}$"; //membuat string yang akan digunakan pada class Pattern
        
        //A regular expression, specified as a string, must first be compiled into an instance of this class
        Pattern pattern = Pattern.compile(regex); 
        //The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.
        Matcher matcher = pattern.matcher((CharSequence) no_plat);
        //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
        if(matcher.matches() == true)
        {
            this.no_plat = no_plat;
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println("Nomor Plat : " + no_plat + " : " + matcher.matches() + "\n");
        }
        
        else if(matcher.matches() == false)
        {
            //All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern.
            System.out.println("Maaf format nomor plat yang anda masukan salah" + " : "+ matcher.matches() + "\n");
        }
        return matcher.matches(); //mengembalikan hasil validasi apakah true atau false
    }

    /**
     * Method untuk memesan ojek
     * 
     * @param pesan Parameter dari method setPesanan yang merujuk ke class Pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
    /**
     * Method untuk memasukkan posisi ojek
     * 
     * @param sekarang Parameter dari method setPosisi yang merujuk ke class Lokasi
     */
    public void setPosisi(Lokasi sekarang)
    {
       posisi_sekarang = sekarang; 
    }
    
    /**
     * Method untuk memasukkan status ojek
     * Ditambahkan saat modul 3
     * @param status Parameter dari method setStatus yang merujuk ke class StatusOjek
     */ 
    public void setStatus(StatusOjek status)
    {
        this.status = status;        
    }
    
    /**
     * Method untuk menampilkan id ojek
     * 
     * @return id Mengembalikan isi data dari instance variable id
     */
    public int getID()
    {
        //DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
        //id = id_ojek.getIDOjekTerakhir();
        id = DatabaseUser.getIDOjekTerakhir();
        return id;
    }
    
    /**
     * Method untuk menampilkan nama ojek
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk menampilkan telefon ojek
     * Ditambahkan saat modul 3
     * @return telefon Mengembalikan isi data dari instance variable telefon
     */
    public String getTelefon()
    {
        return telefon;
    }
    
    /**
     * Method untuk menampilkan email ojek
     * Ditambahkan saat modul 3
     * @return email Mengembalikan isi data dari instance variable email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk menampilkan dob ojek
     * Ditambahkan saat modul 3
     * @return dob Mengembalikan isi data dari instance variable dob
     */
    public Date getDOB()
    {
        //Month: If the number of pattern letters (M) is 3 or more, the month is interpreted as text; otherwise, it is interpreted as a number.
        //Sisa dokumentasi tentang SimpleDateFormat ada di http://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("h:mm a");
      
        // SimpleDateFormat.format(Date date) : Formats the given Date into a date/time string and appends the result to the given StringBuffer.
        System.out.printf("Date of Birth : " + sdf.format(dob) + "\n\n");
      
        return dob;
    }
    
    /**
     * Method untuk menampilkan nomer plat ojek
     * Ditambahkan saat modul 3
     * @return no_plat Mengembalikan isi data dari instance variable no_plat
     */
    public String getNoPlat()
    {
        System.out.println("Nomor Plat : " + no_plat + "\n");
        return no_plat;
    }
    
    /**
     * Method untuk menampilkan isi pesanan
     * 
     * @return pesanan_sekarang Mengembalikan isi data dari instance variable pesanan_sekarang
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Method untuk menampilkan posisi ojek
     * 
     * @return posisi_sekarang Mengembalikan isi data dari instance variable posisi_sekarang
     */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /**
     * Method untuk menampilkan status ojek
     * Ditambahkan saat modul 3
     * @return status Mengembalikan isi data dari instance variable status
     */ 
    public StatusOjek getStatus()
    {
        return status;        
    }
    
    /**
     * Method untuk mengimplementasikan toString, belum digunakan saat ini
     */
    public String toString()
    {
        if(pesanan_sekarang == null)
        {
            System.out.println("Nama Ojek:" + " " + nama);
            System.out.println("ID Ojek :" + " " + getID());
            System.out.println("Status Ojek :" + " " + status + "\n");
            getNama();
            getID();
            getStatus();
        }
        
        else if(pesanan_sekarang != null)
        {
            System.out.println("Nama Ojek:" + " " + nama);
            System.out.println("ID Ojek :" + " " + getID());
            System.out.println("Status Ojek :" + " " + status);
            getNama();
            getID();
            getStatus();
            //System.out.println("Nama Pelanggan :" + " " + pes_Rajab.getPelanggan().getNama() + "\n");
            System.out.println("Nama Pelanggan :" + " " + getPesanan().getPelanggan().getNama() + "\n");
        }
        return "";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/*
 * Bekas Modul 2
 * 
 * instance variables :
 * 
 * private Lokasi posisiSekarang;
 * 
 * instance variables pada constructor :
 * 
 * this.id = id;     
 * posisiSekarang = lokasi1;
 * posisi_sekarang = posisiSekarang;
 * Lokasi posisiSekarang = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
 * posisi_sekarang = posisiSekarang;
 * this.posisiSekarang = posisiSekarang;
 */

/*
 * Bekas Modul 3
 * 
 * instance variables :
 * 
 * //private String status = "Idle"; //isi dari status adalah idle dalam bentuk string
 * //Lokasi lokasi1 = new Lokasi("Cafe Earhouse", 12, 06, "Pamulang");
 * //private Lokasi posisi_sekarang = lokasi1;
 * //DatabaseUser id_ojek = new DatabaseUser();
 * //private int id = id_ojek.getIDOjekTerakhir();
 * 
 * method :
 * 
 * //public Ojek(String nama) //saat ini dicomment karena tidak perlu menginput id dan posisi_sekarang, cukup menginput nama
 * {
 *     //DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
 *     //id = id_ojek.getIDOjekTerakhir(); //mengambil isi data id dari method getIDOjekTerakhir() dari kelas DatabaseUser.    
 * }
 * 
 *  public void setPesanan(Pesanan pesan)
 *  {
 *      //pesanan_sekarang = null;
 *  }
 *  
 *  /*
    /**
     * Method untuk menampilkan status ojek
     * 
     * @return status Mengembalikan isi data dari instance variable status
     
    public String getStatus()
    {
        return status;
    }
 *  
 *  public void setPesanan(Pesanan pesan)
    {
        //pesanan_sekarang = null;
    }
 *  /*
    /**
     * Method untuk memasukkan status ojek
     * 
     * @param status Parameter dari method setStatus dalam bentuk String
     *
    public void setStatus(String status)
    {
        this.status = status;
    }
    
 *
 *  public void printData()
 *  {
 *    //System.out.println("ID Ojek :" + " " + id);
 *  }
 *  
 *  Bekas Modul 4 :
 *  
 *  method :
 *  
 *   public boolean setTelefon(String telefon)
    {
        //this.telefon = telefon;
        //validate phone numbers of format "1234567890"
        //validating phone number with extension length from 3 to 5
        
        else if(telefon.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
        {
            return true;
        }
        //return false;
    }
    
    /*
    /**
     * Method untuk memasukkan dob ojek
     * Ditambahkan saat modul 3
     * @param dob Parameter dari method setDOB dalam bentuk String
     
    public void setDOB(String dob)
    {
        this.dob = dob;        
    }
    *
    
     public boolean setEmail(String email)
    {
        //this.email = email;
        //return false;
        
        /*
        //cara 1
        //cara 2
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = "user@domain.com";
        Boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: "+email1+" :Valid = " + b);
        *
    }
    
    public boolean setNoPlat(String no_plat)
    {
        this.no_plat = no_plat;
        return false;
    }
    //Modul 4 tidak ada method printData()
    /*
    /**
     * Method untuk Menampilkan hasil (isi data) dari instance nama, id dan status dalam bentuk string
     *
    public void printData()
    {
        System.out.println("Nama Ojek:" + " " + nama);
        System.out.println("ID Ojek :" + " " + getID());
        System.out.println("Status Ojek :" + " " + status + "\n");
    }
    
    public void setDOB(int day, int month, int year)
    {
      //this.dob = dob;
      //String hari = Integer.toString(day);
      //String bulan = Integer.toString(month);
      //String tahun = Integer.toString(year);
      //Date date = new Date();
      //DateFormat df = new DateFormat();
      //DateFormat formatter = DateFormat.getInstance(); // Date and time
      //String dateStr = formatter.format(date);
      //DateFormatter df = new DateFormatter(sdf);
      //ubahtanggal = new JFormattedTextField(df);
      //date.getTime();
      //GregorianCalendar g = new GregorianCalendar(year, month, day);
      //year = year;
      Date trialTime = new Date();
      Calendar calendar = new GregorianCalendar(year, month, day);
      this.dob = trialTime;
      //calendar.clear();
      //calendar.set(day, month, year);
      //calendar.set(9, 12, 1994);
      Calendar cal = Calendar.getInstance();
      //calendar.getGregorianChange();
      //Date tahun = calendar.get(year);
      //calendar.setWeekDate();
      //calendar.get(year);
      //System.out.println("YEAR: " + calendar);
      //System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
      //g.setGregorianChange(date);
      //date.getTime()
      //g.set(day, month, year);
      //date.Parse(day, month, year);
      //calendar.setTime(trialTime);
      Date waktu = cal.getTime();
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      SimpleDateFormat df = new SimpleDateFormat("h:mm a");
      
      System.out.printf("Date of Birth : " + sdf.format(trialTime) + "\n" + "Waktu : " + df.format(waktu));
      dob = trialTime;
      //sdf.format(trialTime)
      //dob = sdf.format(trialTime);
       //System.out.printf("Date of Birth : " + sdf.format(g.getGregorianChange()) + "\n");
      //System.out.printf("Date of Birth : " + (new GregorianCalendar(year, month, day).getTime());
      //SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
      //System.out.printf("Date of Birth :", format);
      
      //Date date = new Date();dob
      //System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }
    
 */