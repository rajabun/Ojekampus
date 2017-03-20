import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class Pelanggan berisi kumpulan method untuk mengatur data pelanggan.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017
 * @since 0.1, 23 Februari 2017
 */

/**
 * Modul 2 : Class User diganti namanya menjadi class Pelanggan (0.2)
 * Modul 3 : Menambah beberapa method (setTelefon(), setEmail(), setDOB())
 *           Menambah isi Constructor, menambah method getDOB(), mengubah isi method printData() dan getID()
 * Modul 4 : Mengimpor class Pattern, Matcher dan Date
 *           Mengubah instance variables private String dob; menjadi private Date dob;
 *           Mengubah method setEmail(String email)
 *           
 */
public class Pelanggan
{
    private int id;
    private String nama;
    private String telefon, email; //Ditambahkan saat modul 3
    private Date dob; //Ditambahkan saat modul 4
    
    /**
     * Constructor for objects of class Pelanggan
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     */
    public Pelanggan(int id, String nama) 
    {
        // initialise instance variables
        DatabaseUser id_pelanggan = new DatabaseUser();
        id = id_pelanggan.getIDPelangganTerakhir();
        this.nama = nama;
    }
    
    /**
     * Method untuk menampilkan id pelanggan
     * 
     * @return id Mengembalikan isi data dari instance variable id
     */
    public int getID()
    {
        DatabaseUser id_ojek = new DatabaseUser(); //membuat objek baru pada kelas DatabaseUser dengan nama id_ojek
        id = id_ojek.getIDPelangganTerakhir();
        return id;
    }
    
    /**
     * Method untuk menampilkan dob pelanggan
     * Ditambahkan saat modul 3
     * Diubah di modul 4
     * @return dob Mengembalikan isi data dari instance variable dob
     */
    public Date getDOB()
    {
        return dob;
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
     * Method untuk memasukkan telepon pelanggan
     * Ditambahkan saat modul 3
     * @param telefon Parameter dari method setTelefon dalam bentuk String
     */
    public boolean setTelefon(String telefon)
    {
        //untuk validasi nomer telepon dengan maksimal 12 digit dengan format "081234567890"
        // \ : Nothing, but quotes the following character
        // \d : Matches the digits. Equivalent to [0-9]. (Bukan \d karena \ merupakan special escape sequences for String, bertabrakan fungsinya)
        // re{n,m} : Matches at least n but not more than m times
		// \\d{7,12} berarti 7410000 atau 012345678901
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
		    System.out.println("Maaf format nonor telepon yang ada masukan salah\n");
		    return false;
		}
    }
    
    /**
     * Method untuk memasukkan email pelanggan
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
     * Method untuk memasukkan dob pelanggan
     * Ditambahkan saat modul 3
     * Diubah di modul 4
     * @param day Parameter dari method setDOB dalam bentuk integer (numerik)
     * @param month Parameter dari method setDOB dalam bentuk integer (numerik)
     * @param year Parameter dari method setDOB dalam bentuk integer (numerik)
     */
    public void setDOB(int day, int month, int year)
    {
        this.dob = dob;        
    }
    
    /**
     * this.id ditambahkan saat modul 2
     * 
     * Method untuk memasukkan id pelanggan
     * 
     * @param id Parameter dari method setID dalam bentuk int
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * this.nama ditambahkan saat modul 2
     * 
     * Method untuk memasukkan nama pelanggan
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method ini ditambahkan saat modul 4
     */
    public String toString()
    {
        Pesanan pemesanan;
        DatabasePesanan dbasep = new DatabasePesanan();
        pemesanan = dbasep.getPesanan();
        
        if(pemesanan == null)
        {
            System.out.println("Nama Pelanggan:" + " " + nama);
            System.out.println("ID Pelanggan :" + " " + getID());
            System.out.println("Nomor Telefon :" + " " + telefon + "\n");
            getNama();
            getID();
            return telefon;
        }
        //logic belum berjalan dengan baik
        else if(pemesanan != null)
        {
            Lokasi kang_ojek = new Lokasi("Taman Kota 2", 3, 2, "BSD");
            Ojek ojek_Muhammad = new Ojek(1,"Muhammad",kang_ojek); //membuat objek baru pada kelas Ojek dengan nama ojek_muhammad. Ojek("Muhammad") merupakan implementasi dari constructor Ojek(String nama)
            Pelanggan p_Rajab = new Pelanggan(1,"Rajab"); //membuat objek baru pada kelas Pelanggan
            Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
            Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
            Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
        
            System.out.println("Nama Pelanggan:" + " " + nama);
            System.out.println("ID Pelanggan :" + " " + getID());
            System.out.println("Nomor Telefon :" + " " + telefon);
            //System.out.println("Nama Pengirim:" + " " + dbasep.getPesanan().getPelanggan().getNama() + "\n");
            System.out.println("Nama Pengirim : " + pes_Rajab.getPelanggan().getNama() + "\n");
            //pes_Rajab.getPenggunaAwal();
            getNama();
            getID();
            pes_Rajab.getPelanggan();
            //dbasep.getPesanan().getPelanggan();
            return telefon;
            //System.out.println("Nama Pelanggan Pengirim Pesanan:" + " " + pes_Rajab.getPelanggan().getNama() + "\n");
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

/*  Bekas Modul 1
   
   instance variables :
 
    protected int id;
    protected String nama;

    methods :  
 
    public Pelanggan(String nama, int id)
    {
        // initialise instance variables
    }
    
    public Pelanggan(int id, String nama)
    {
        // initialise instance variables     
    }
    
    Bekas Modul 2
    
    instance variables :
    
    this.id = id;
    
    Bekas Modul 3
    
    instance variables :
    
    // instance variables - replace the example below with your own
    //DatabaseUser id_pelanggan = new DatabaseUser();
    //private int id = id_pelanggan.getIDPelangganTerakhir();;
    
    method :
    
    //public Pelanggan(String nama) //saat ini dicomment karena tidak perlu menginput id, cukup menginput nama
    {
        
    }
    
    public void printData()
    {
        //System.out.println("ID Pelanggan :" + " " + id + "\n");
    }
    
    Bekas Modul 4 :
   
    instance variables :
    
    //private String dob; //Ditambahkan saat modul 3
    
    method :
   
    /*
    /**
     * Method untuk menampilkan dob pelanggan
     * Ditambahkan saat modul 3
     * @return dob Mengembalikan isi data dari instance variable dob
     
    public String getDOB()
    {
        return dob;
    }
    
    public boolean setTelefon(String telefon)
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
    
    /*
    /**
     * Method untuk memasukkan dob pelanggan
     * Ditambahkan saat modul 3
     * @param dob Parameter dari method setDOB dalam bentuk String
     
    public void setDOB(String dob)
    {
        this.dob = dob;        
    }
    
    /*
    /**
     * Method ini ditambahkan saat Modul 2
     * 
     * Method untuk Menampilkan hasil (isi data) dari instance nama dan id dalam bentuk string
     *
    
    public void printData()
    {
        System.out.println("Nama Pelanggan :" + " " + nama);
        System.out.println("ID Pelanggan :" + " " + getID() + "\n");
    }
    
   */