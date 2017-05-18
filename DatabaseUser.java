import java.util.ArrayList;
import java.util.List;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * class DatabaseUser berisi kumpulan method untuk mengatur database pelanggan ojek.
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
 * Modul 2 : Class DatabaseUser diubah instance variabel dan methodnya pada versi 0.2 (Modul 2)
 * Modul 3 : Mengubah semua instance dan method menjadi static
 * Modul 4 : Tidak ada perubahan
 * Modul 5 : Mengubah nilai instance id_ojek_terakhir dan id_pelanggan_terakhir menjadi default
 *           Mengubah tipe data instance ojek_database dan pelanggan_database menjadi tipe ArrayList
 *           Menambah method getOjekDatabase() dan getPelangganDatabase()
 * Modul 6 : Menambah instance user_database. Menghilangkan ojek_database & pelanggan_database
 *           Mengubah nilai default instance id_ojek_terakhir dan id_pelanggan_terakhir menjadi 1
 *           Mengubah seluruh method kecuali method getIDOjekTerakhir() & getIDPelangganTerakhir()
 * Modul 7 : Tidak ada perubahan
 * Modul 8 : Tidak ada perubahan
 */

public class DatabaseUser implements Serializable
{
    private static int id_ojek_terakhir = 1; // Diubah di modul 6
    private static int id_pelanggan_terakhir = 1; // Diubah di modul 6
    //private static ArrayList user_database = new ArrayList<>(); // Ditambah di modul 6
    private static ArrayList <User> user_database = new ArrayList<User>(); // Ditambah di modul 6
    //private static ArrayList <Ojek> ojek_database = new ArrayList<Ojek>(); // Diubah di modul 5
    //private static ArrayList <Pelanggan> pelanggan_database = new ArrayList<Pelanggan>(); // Diubah di modul 5

    /**
     * Constructor for objects of class DatabaseUser
     */
    public DatabaseUser()
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
    Pelanggan p_Rajab_2 = new Pelanggan(1,"Rajab","085854032720"); //membuat objek baru pada kelas Pelanggan
    Pelanggan p_Rajab_3 = new Pelanggan(2,"Muhammad","021-741-0552"); //membuat objek baru pada kelas Pelanggan
    Lokasi per_Rajab_awal = new Lokasi("Taman Menteng", 2, 4, "Bintaro"); //membuat objek baru pada kelas Lokasi
    Lokasi per_Rajab_akhir = new Lokasi("Taman Kota", 4, 4, "BSD"); //membuat objek baru pada kelas Lokasi
    Pesanan pes_Rajab = new Pesanan(p_Rajab, TipeLayanan.AntarBarang, per_Rajab_awal, per_Rajab_akhir, "Fakhri", "Ivan", 100000); //membuat objek baru pada kelas Pesanan
    Pesanan pes_Rajab_2 = new Pesanan(p_Rajab, TipeLayanan.BeliBarang, per_Rajab_akhir, per_Rajab_awal, "Ani", "Fatayati", 50000); //membuat objek baru pada kelas Pesanan
    addPelanggan(p_Rajab);
    addPelanggan(p_Rajab_2);
    addPelanggan(p_Rajab_3);
    }

    public static ArrayList<User> getOjekDatabase2()
    {
    //System.out.print(user_database);
    Ojek names[]=new Ojek[user_database.size()];
    user_database.toArray(names);
    System.out.println(names);
    System.out.println("Created Array content:");
    for(Ojek waw : names){
    System.out.println(waw);
    }
    return null;
    }
     */
    public static void save(String file) throws FileNotFoundException, IOException 
    {
        FileWriter writer = new FileWriter(file + ".txt");
        int size = getOjekDatabase().size();
        for (int i=0;i<size;i++) {
            String str = getOjekDatabase().get(i).toString();
            writer.write(str);
            if(i < size-1)//This prevent creating a blank like at the end of the file**
                writer.write("\n");
        }
        writer.close();
    }

    /**
     * Method untuk memasukkan ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addOjek yang merujuk ke class Ojek
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean addOjek(Ojek baru)
    {
        /*
        if(user_database.isEmpty())
        {
        //ojek_database.add(null);
        user_database.add(baru);
        System.out.println("Penambahan Ojek dalam Database Berhasil\n");
        return true;
        }
        else
        {
         */
        for (int i = 0; i < user_database.size(); i++)
        {
            //if(user_database.get(i).equals(baru) && user_database.get(i).getID() == baru.getID())
            if(user_database.get(i).equals(baru))
            {
                System.out.println("Data Ojek sudah terdaftar dalam Database\n");
                return false;
            }
        }
        //else
        user_database.add(baru);
        id_ojek_terakhir = id_ojek_terakhir+1;
        System.out.println("Penambahan Ojek dalam Database Berhasil\n");
        return true;
        //}
        /*
        if(ojek_database.isEmpty())
        {
        ojek_database.add(null);
        ojek_database.add(baru);
        System.out.println("Penambahan Ojek dalam Database Berhasil\n");
        return true;
        }
        else
        {
        for (int i = 1; i < ojek_database.size(); i++)
        {
        if(ojek_database.get(i).equals(baru))
        {
        System.out.println("Data sudah terdaftar dalam Database\n");
        return false;
        }
        }
        //else
        ojek_database.add(baru);
        //id_ojek_terakhir = ojek_database.size();
        System.out.println("Penambahan Ojek dalam Database Berhasil\n");
        return true;
        }
         */
    }

    /**
     * Method untuk memasukkan pelanggan dari ojek kedalam database pelanggan
     * 
     * @param baru Parameter dari method addPelanggan yang merujuk ke class Pelanggan
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean addPelanggan (Pelanggan baru)
    {   
        /*
        if(user_database.isEmpty())
        {
        //pelanggan_database.add(null);
        user_database.add(baru);
        System.out.println("Penambahan Pelanggan dalam Database Berhasil\n");
        return true;
        }
        else
        {
         */
        for (int i = 0; i < user_database.size(); i++)
        {
            //if(user_database.get(i).equals(baru) && user_database.get(i).getID() == baru.getID())
            if(user_database.get(i).equals(baru))
            {
                System.out.println("Data Pelanggan sudah terdaftar dalam Database\n");
                return false;
            }
        }
        //else
        user_database.add(baru);
        id_pelanggan_terakhir = id_pelanggan_terakhir+1;
        System.out.println("Penambahan Pelanggan dalam Database Berhasil\n");
        return true;
        //}
        /*
        if(pelanggan_database.isEmpty())
        {
        pelanggan_database.add(null);
        pelanggan_database.add(baru);
        System.out.println("Penambahan Pelanggan dalam Database Berhasil\n");
        return true;
        }
        else
        {
        for (int i = 1; i < pelanggan_database.size(); i++)
        {
        if(pelanggan_database.get(i).equals(baru))
        {
        System.out.println("Data sudah terdaftar dalam Database\n");
        return false;
        }
        }
        //else
        pelanggan_database.add(baru);
        System.out.println("Penambahan Pelanggan dalam Database Berhasil\n");
        return true;
        }
         */
    }

    /**
     * Method untuk menampilkan id ojek terakhir
     * 
     * @return id_ojek_terakhir Mengembalikan isi data dari instance variable id_ojek_terakhir
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }

    /**
     * Method untuk menampilkan id pelanggan terakhir
     * 
     * @return id_pelanggan_terakhir Mengembalikan isi data dari instance variable id_pelanggan_terakhir
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }

    /**
     * Method untuk menampilkan database ojek
     * Ditambah di modul 5
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static ArrayList<Ojek> getOjekDatabase() //Aslinya
    //public static ArrayList<User> getOjekDatabase()
    {
        ArrayList <Ojek> ojek_database = new ArrayList<Ojek>(); // Diubah di modul 5
        //ArrayList <? super User> ojek_database_2 = ojek_database; // Diubah di modul 5
        //ArrayList <User> ojek_database_2 = new ArrayList<User>(ojek_database); // Diubah di modul 5
        //ArrayList <ArrayList<User>> ojek_database = new ArrayList<ArrayList<User>>(); // Diubah di modul 5
        //ArrayList <User> ojek_database = new ArrayList<User>(); // Diubah di modul 5

        //int a = 0;
        /*
        if(ojek_database.isEmpty())
        {
        //ojek_database.add(null);
        System.out.println("Tidak ada ojek dalam database\n");
        return null;
        }
        else
        {
         */
        //System.out.println("=============================\n");
        //System.out.println("Daftar Ojek dalam database : \n");
        //System.out.println("=============================\n");

        for (int i = 0; i < user_database.size(); i++)
        {
            User s = user_database.get(i);
            //Ojek c = (Ojek)s;

            if(s.getStatusUser().equals(StatusUser.Ojek))
            {
                if(s instanceof Ojek)
                {
                    Ojek c = (Ojek)s;
                    ojek_database.add(new Ojek(s.getID(),s.getNama(),c.getPosisi()));

                }
                //ArrayList<User> lineNewY = new ArrayList<User>();
                //for( Ojek line : ojek_database )
                //    lineNewY.addAll( user_database );
                //System.out.print(lineNewY);

                //ArrayList<User> lineNewY = new ArrayList<User>();
                //user_database.forEach((xx) -> ojek_database.add(Ojek.valueOf(xx)));
                //ojek_database.add(user_database.get(i));
                //a = i+1;
                //return ojek_database;
            }
        }
        //user_database.add(ojek_database.get(i));
        //ojek_database.add(s);
        //System.out.print(ojek_database);
        //System.out.println("=============================\n");

        return ojek_database;
        //System.out.println(ojek_database);
        //return null;
        //}
    }

    /**
     * Method untuk menampilkan database pelanggan
     * Ditambah di modul 5
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static ArrayList<Pelanggan> getPelangganDatabase() //Aslinya
    //public static ArrayList<User> getPelangganDatabase()
    {
        //if (user_database.get(1) instanceof User)
        //{
        //    ArrayList <Pelanggan> pelanggan_database = (ArrayList <Pelanggan>) user_database;
        //}

        //ArrayList <User> pelanggan_database = new ArrayList<User>(); // Diubah di modul 5
        ArrayList <Pelanggan> pelanggan_database = new ArrayList<Pelanggan>(); // Diubah di modul 5
        //ArrayList pelanggan_database = new ArrayList<>(); // Diubah di modul 5
        //int a = 0;
        /*
        if(pelanggan_database.isEmpty())
        {
        System.out.println("Tidak ada pelanggan dalam database\n");
        return null;
        }
        else
        {
         */
        //System.out.println("==================================\n");
        //System.out.println("Daftar Pelanggan dalam database : \n");
        //System.out.println("==================================\n");

        for (int i = 0; i < user_database.size(); i++)
        {
            //Pelanggan a = new Pelanggan(user_database.get(i).getID(), user_database.get(i).getNama(), user_database.get(i).getTelepon());
            User s = user_database.get(i);
            //Object s = user_database.get(i);
            //Pelanggan b = (Pelanggan)s;
            //Ojek c = (Ojek)s;

            //if(user_database.get(i).equals(b))
            //if(user_database.get(i).contains(Ojek))
            //if(user_database.contains(b) && a == i && !user_database.contains(c.getNoPlat()))
            //if(b.getStatusUser().equals(StatusUser.Pelanggan) && a == i)
            if(s.getStatusUser().equals(StatusUser.Pelanggan))
            {
                //a = i+1;
                if(s instanceof Pelanggan)
                {
                    Pelanggan c = (Pelanggan)s;
                    pelanggan_database.add(c);
                }

            }
        }
        //System.out.print(pelanggan_database);
        //System.out.println("==================================\n");

        return pelanggan_database;
        //System.out.println(pelanggan_database);
        //return pelanggan_database;
        //return null;
        //}
    }

    /**
     * Method untuk menampilkan data pengemudi ojek
     * 
     * @return ojek_database Mengembalikan isi data dari instance variable ojek_database
     */
    public static Ojek getUserOjek(int id)
    //public static User getUserOjek(int id)
    {
        for (int i = 0; i < user_database.size(); i++)
        {
            User s = user_database.get(i);
            //Object s = user_database.get(i);
            //Ojek b = (Ojek)s;

            //if(id == user_database.get(i).getID())
            //if(user_database.contains(b.getNoPlat()) && a == i && id == b.getID())
            if(s.getStatusUser().equals(StatusUser.Ojek) && s.getID() == id)
            {
                //System.out.println(ojek_database.get(i));
                if(s instanceof Ojek)
                {
                    System.out.println("Ojek yang sesuai id ditemukan\n");
                    JOptionPane.showMessageDialog(null, "Ojek ditemukan");                    
                    Ojek c = (Ojek)s;
                    System.out.println(c);
                    return c;
                }
            }
        }
        System.out.println("Maaf, ojek yang dicari tidak ada dalam database");
        JOptionPane.showMessageDialog(null, "ID yang anda masukkan tidak terdaftar");                            
        return null;
        //return ojek_database;
        //return ojek_database.get(a);

        /*
        int a = 1;
        for (int i = 1; i < ojek_database.size(); i++)
        {
        if(id == ojek_database.get(i).getID())
        {
        a = i;
        System.out.println(ojek_database.get(i));
        //return ojek_database.get(i);
        }
        }
        //return ojek_database;
        return ojek_database.get(a);
         */
    }

    /**
     * Method untuk menampilkan data pelanggan ojek
     * 
     * @return pelanggan_database Mengembalikan isi data dari instance variable pelanggan_database
     */
    public static Pelanggan getUserPelanggan(int id)
    //public static User getUserPelanggan(int id)
    {
        //int a = 0;
        for (int i = 0; i < user_database.size(); i++)
        {
            User s = user_database.get(i);
            //Object s = user_database.get(i);
            //Pelanggan b = (Pelanggan)s;
            //Ojek c = (Ojek)s;

            //if(id == user_database.get(i).getID())
            //if(user_database.contains(b) &&  a == i && id == b.getID() && !user_database.contains(c.getNoPlat()))
            //if(user_database.get(i).getStatusUser().equals(StatusUser.Pelanggan) && user_database.get(i) == id)
            if(s.getStatusUser().equals(StatusUser.Pelanggan) && s.getID() == id)
            {
                //System.out.println(ojek_database.get(i));
                //a = i+1;
                if(s instanceof Pelanggan)
                {
                    System.out.println("Pelanggan yang sesuai id ditemukan\n");
                    JOptionPane.showMessageDialog(null, "Pelanggan ditemukan");
                    Pelanggan c = (Pelanggan)s;
                    System.out.println(c);
                    return c;
                }
            }
        }
        System.out.println("Maaf, pelanggan yang dicari tidak ada dalam database");        
        JOptionPane.showMessageDialog(null, "ID yang anda masukkan tidak terdaftar");                    
        return null;

        /*
        //return pelanggan_database;
        //return pelanggan_database.get(id_pelanggan_terakhir);
        int a = 1;
        for (int i = 1; i < pelanggan_database.size(); i++)
        {
        if(id == pelanggan_database.get(i).getID())
        {
        a = i;
        System.out.println(pelanggan_database.get(i));
        //return ojek_database.get(i);
        }
        }
        //return ojek_database;
        return pelanggan_database.get(a);
         */
    }

    /**
     * Method untuk menghapus ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean removeOjek (int id)
    {
        //int a = 0;
        //else
        //{
        for (int i = 0; i < user_database.size(); i++)
        {
            User s = user_database.get(i);
            //Object s = user_database.get(i);
            //Ojek b = (Ojek)s;

            //if(ojek_database.get(i).equals(id))
            //if(ojek_database.contains(id))
            //if(Integer.toString(id).equals(ojek_database.get(i).getID()))
            //if(user_database.contains(b.getNoPlat()) && a == i && id == s.getID())
            if(s instanceof Ojek)
            {
                Ojek c = (Ojek)s;

                //if(s.getStatusUser().equals(StatusUser.Ojek) && a == i && id == c.getID())
                if(s.getStatusUser().equals(StatusUser.Ojek) && id == c.getID())
                {
                    user_database.remove(i);
                    id_ojek_terakhir = id_ojek_terakhir-1;
                    //a = i+1;
                    System.out.println("Data ojek berhasil dihapus\n");
                    return true;
                }
            }
        }

        if(user_database.isEmpty())
        {
            System.out.println("Tidak ada ojek dalam database\n");
            //return false;
        }

        System.out.println("Ojek tidak berhasil dihapus\n");
        return false;
        //}
        /*
        if(ojek_database.isEmpty())
        {
        System.out.println("Tidak ada ojek dalam database\n");
        return false;
        }
        else
        {
        for (int i = 1; i < ojek_database.size(); i++)
        {
        //if(ojek_database.get(i).equals(id))
        //if(ojek_database.contains(id))
        //if(Integer.toString(id).equals(ojek_database.get(i).getID()))
        if(ojek_database.get(i).getID() == id)
        {
        ojek_database.remove(i);
        System.out.println("Data ojek berhasil dihapus\n");
        return true;
        }
        }
        System.out.println("Ojek tidak berhasil dihapus\n");
        return false;
        }
         */
    }

    /**
     * Method untuk menghapus pelanggan ojek dari database pelanggan
     * 
     * @param id Parameter dari method removePelanggan dalam bentuk int
     * @return true Mengembalikan isi data dari method ini dengan nilai true
     */
    public static boolean removePelanggan (int id)
    {
        //int a = 0;
        //else
        //{
        for (int i = 0; i < user_database.size(); i++)
        {
            User s = user_database.get(i);
            //Object s = user_database.get(i);
            //Pelanggan b = (Pelanggan)s;
            //Ojek c = (Ojek)s;
            if(s instanceof Pelanggan)
            {
                Pelanggan c = (Pelanggan)s;

                //if(pelanggan_database.get(i).equals(id))
                //if(user_database.contains(b) &&  a == i && id == b.getID() && !user_database.contains(c.getNoPlat()))
                //if(user_database.contains("Pelanggan") && a == i && id == s.getID())
                //if(s.getStatusUser().equals(StatusUser.Pelanggan) && a == i && id == c.getID())
                if(s.getStatusUser().equals(StatusUser.Pelanggan) && id == c.getID())
                {
                    user_database.remove(i);
                    id_pelanggan_terakhir = id_pelanggan_terakhir-1;
                    //a = a+1;
                    System.out.println("Data pelanggan berhasil dihapus\n");
                    return true;
                }
            }
        }
        if(user_database.isEmpty())
        {
            System.out.println("Tidak ada pelanggan dalam database\n");
            //return false;
        }

        System.out.println("Pelanggan tidak berhasil dihapus\n");
        return false;
        //}
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

/* Bekas Modul 1

instance variables - replace the example below with your own

private int x;
private String[] pelanggan_database;
private String[] ojek_database;
private int id_ojek_terakhir;
private int id_pelanggan_terakhir;

methods

Belum ada Class Pelanggan
public boolean addPelanggan (Pelanggan baru)
{
return false;
}

public boolean addPelanggan (String baru)
{
return false;
}

Belum ada Class Ojek
public boolean addOjek(Ojek baru)
{
return false;
}

Belum ada Class Ojek
public Ojek getUserOjek(int id)
{
return 0;
}

public String getUserOjek(int id)
{
return "";
}

Belum ada array di String
public String[] getOjekDatabase()
{

}

public String getOjekDatabase()
{
return "";
}

Belum ada class Pelanggan
public Pelanggan getUserPelanggan(int id)
{
return "";
}

public String getUserPelanggan(int id)
{
return "";
}

Belum ada array di String
public String[] getPelangganDatabase()
{

}

public String getPelangganDatabase()
{
return "";
}    

public boolean addPelanggan (Pelanggan baru)
{
//Pelanggan pelanggan_database = baru;
}

public boolean removePelanggan (int id)
{
//Pelanggan pelanggan_database = null;
}

public boolean addOjek(Ojek baru)
{
//Ojek ojek_database = baru;
}

public boolean removeOjek (int id)
{
//Ojek ojek_database = null;
}

Bekas Modul 5 :

instance variables :

//private static Pelanggan pelanggan_database;
//private static Ojek ojek_database;
//private static int id_ojek_terakhir = 1; //isi dari id_ojek_terakhir adalah 1
//private static int id_pelanggan_terakhir = 1; //isi dari id_pelanggan_terakhir adalah 1

methods :

 */
