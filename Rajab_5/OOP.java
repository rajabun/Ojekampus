package Rajab_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * class OOP
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class OOP ditambahkan pada versi 0.5 (Modul 5)
 */
public class OOP
{
    // instance variables - replace the example below with your own
    private int x;
    ArrayList <Mahasiswa> siswa = new ArrayList<Mahasiswa>();
    Scanner sc = new Scanner(System.in);
        
    /**
     * Constructor for objects of class OOP
     */
    public OOP()
    {
        // initialise instance variables
        x = 0;
    
        ArrayList <Mahasiswa> siswa = new ArrayList<Mahasiswa>();
        Scanner input = new Scanner(System.in); 
        /*
        System.out.println("===========================");
        System.out.printf("Masukan jumlah input :");
        int jumlah = input.nextInt();
        System.out.printf("Masukan nama mahasiswa :");
        String nama_mahasiswa = input.next();
        System.out.printf("Masukan nilai mahasiswa :");
        int nilai_mahasiswa = input.nextInt();
        System.out.println("===========================\n");
        
        while (x<jumlah)
        {
            siswa.add(new Mahasiswa(nama_mahasiswa, nilai_mahasiswa));
            x++;
        }
        */
            
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
