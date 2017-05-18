import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class User here.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.7, 13 April 2017
 * @version 0.6, 30 Maret 2017
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class User ditambahkan pada versi 0.6 (Modul 6)
 * Modul 7 : Tidak ada perubahan
 */
public class User
{
    // instance variables - replace the example below with your own
    protected Date dob;
    protected String email;
    protected int id;
    protected String nama;
    protected String telepon;
    protected StatusUser status_user; //tambah sendiri
    
    /**
     * Constructor for objects of class User
     * 
     * @param id Parameter dari constructor kelas ini dalam bentuk integer (numerik)
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    //public User(int id, String nama, StatusUser status_user)
    public User(int id, String nama)
    {
        // initialise instance variables
        //id = DatabaseUser.getIDPelangganTerakhir();
        setID(id);
        setNama(nama);
        //setStatusUser(status_user); //tambah sendiri
        //this.nama = nama;
    }
    
     /**
     * Method untuk memasukkan status user
     * (tambah sendiri)
     * @param status_user Parameter dari method setStatusUser yang merujuk ke class StatusUser
     */
    public void setStatusUser(StatusUser status_user)
    {
        this.status_user = status_user;
        if(status_user == StatusUser.Ojek)
        {
            status_user = StatusUser.Ojek;
        }
        
        else if(status_user == StatusUser.Pelanggan)
        {
            status_user = StatusUser.Pelanggan;
        }
    }
    
    /**
     * Method untuk menampilkan status user
     * (tambah sendiri)
     * @return status_user Mengembalikan isi data dari instance variable status_user
     */
    public StatusUser getStatusUser()
    {
        return status_user;
    }
    
    /**
     * Method untuk menampilkan dob pelanggan
     * 
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
     * Method untuk menampilkan email pelanggan
     * Ditambahkan saat modul 5 di class Pelanggan
     * @return email Mengembalikan isi data dari instance variable email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk menampilkan id pelanggan
     * 
     * @return id Mengembalikan isi data dari instance variable id
     */
    public int getID()
    {
        //id = DatabaseUser.getIDPelangganTerakhir();
        return id;
    }
    
    /**
     * Method untuk menampilkan nama pelanggan
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk menampilkan telepon pelanggan
     * Ditambahkan saat modul 5 di class Pelanggan
     * @return telepon Mengembalikan isi data dari instance variable telepon
     */
    public String getTelepon()
    {
        return telepon;
    }
    
    /**
     * Method untuk memasukkan dob pelanggan
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
     * Method untuk memasukkan email pelanggan
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
     * Method untuk memasukkan id pelanggan
     * 
     * @param id Parameter dari method setID dalam bentuk int
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk memasukkan nama pelanggan
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method untuk memasukkan telepon pelanggan
     * @param telepon Parameter dari method setTelepon dalam bentuk String
     */
    public boolean setTelepon(String telepon)
    {
        //untuk validasi nomer telepon dengan maksimal 12 digit dengan format "081234567890"
        // \ : Nothing, but quotes the following character
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n,m} : Matches at least n but not more than m times
        // \\d{7,12} berarti 7410000 atau 012345678901
        if (telepon.matches("\\d{7,12}")) 
        {
            this.telepon = telepon;
            System.out.println(telepon + " : " + telepon.matches("\\d{7,12}") + "\n");
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
        
        else if(telepon.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
        {
            this.telepon = telepon;
            System.out.println(telepon + " : " + telepon.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}") + "\n");
            return true;
        }
        
        //untuk validating nomer telepon dimana kode area menggunakan ()
        // \\( : Backslash character untuk (, gabisa langsung ( karena fungsinya akan bertabrakan dengan ()
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n} : Matches exactly n number of occurrences of the preceding expression.
        // \\) : Backslash character untuk ), gabisa langsung ) karena fungsinya akan bertabrakan dengan ()
        // - : untuk pemisah nomor telepon -
        // \\(\\d{3}\\)-\\d{3}-\\d{4} berarti (000)-111-2222
        
        else if(telepon.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
        {
            this.telepon = telepon;
            System.out.println(telepon + " : " + telepon.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}") + "\n");
            return true;
        }
        //return false jika tidak ada input yang sesuai (matches)
        else
        {
            System.out.println("Maaf format nomor telepon yang ada masukan salah\n");
            return false;
        }
    }
}
