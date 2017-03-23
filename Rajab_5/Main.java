package Rajab_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.util.Collections;

/**
 * class OjeKampus berisi method main yang berfungsi sebagai main program dari aplikasi OjeKampus.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */


public class Main
{
    /**
     * Method utama untuk menjalankan program OjeKampus
     * Modul 5
     */
    //public void main (String [] args)
    public static void main (String [] args)
    {
        /*
         * Untuk membuat objek baru -> nama_class nama_objek = new nama_class();
         * Pastikan isi dari () pada nama_class sesuai dengan parameter constructor pada class tersebut
         * 
         * Untuk memanggil method dari class lain kedalam method ini -> nama_objek_pada_class_yang_ingin_dipanggil_methodnya.nama_method
         */
        Array a = new Array();
        
        a.arrayInt[0] = 283;
        a.arrayInt[1] = 157;
        a.arrayInt[2] = 634;
        a.arrayInt[3] = 766;
        a.arrayInt[4] = 763;
        a.arrayInt[5] = 896;
        a.arrayInt[6] = 460;
        a.arrayInt[7] = 726;
        a.arrayInt[8] = 392;
        a.arrayInt[9] = 182;
        
        a.listInt.add(308);
        a.listInt.add(654);
        a.listInt.add(988);
        a.listInt.add(331);
        a.listInt.add(668);
        a.listInt.add(378);
        a.listInt.add(19);
        a.listInt.add(145);
        a.listInt.add(70);
        a.listInt.add(635);
        
        a.sortArray(Array.arrayInt);
        a.sortArrayList(Array.listInt);
        
        ArrayList <Mahasiswa> siswa = new ArrayList<Mahasiswa>();
        Scanner input = new Scanner(System.in); 
            
        siswa.add(new Mahasiswa("Randy Sanjaya",100));
        siswa.add(new Mahasiswa("Aldwin Hermanuddin",80));
        siswa.add(new Mahasiswa("Tomi",90));
        siswa.add(new Mahasiswa("Taufiq Bahruddin",75));
        
        System.out.println("===========================");
        System.out.println("Program by Muhammad Rajab");
        System.out.println("===========================\n");
        System.out.println(siswa);
        System.out.println("\n");
        Collections.sort(siswa);
        System.out.println(siswa);
        
        /*
        try
        {
            Array.readFileAsListOfStrings(Array.listInt);
            a.sortArrayList(Array.listInt);
        }
        catch (Exception e)
        {
        }
        */
        //int[] arrayInt = new int[10];
        //ArrayList <Integer> listInt = new ArrayList<>();
        //List<Integer> listInt = new ArrayList<>(Arrays.asList(308,654,988,331,668,378,19,145,70,635));
        
        //int[] arrayInt = {9,5,4,1,4,5,7,9,4};
        //ArrayList<String> arraylistmodul5 = new ArrayList<String>();
         
        //String content = new String(Files.readAllBytes(Paths.get("arraylistmodul5.txt")));
        //Scanner content = new Scanner(new File("/stasiun/priok_jakarta.txt")).useDelimiter(",\\s*");
        //int[] arrayInt = content;
    }
    //*/
    /**
     * Constructor for objects of class OjeKampus
     */
    public Main()
    {
        // initialise instance variables
    }
}
