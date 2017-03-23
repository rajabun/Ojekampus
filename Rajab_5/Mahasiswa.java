package Rajab_5;

/**
 * class Mahasiswa berisi kumpulan method untuk mengatur mahasiswa.
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class Mahasiswa ditambahkan pada versi 0.5 (Modul 5)
 */

class Mahasiswa implements Comparable<Mahasiswa>
{
    // instance variables - replace the example below with your own
    private int x;
    private String nama;
    private int nilai;
    /**
     * Constructor for objects of class Ojek
     * 
     * @param nama Parameter dari constructor kelas ini dalam bentuk String
     * @param nilai Parameter dari method setNama dalam bentuk integer (numerik)
     */
    public Mahasiswa(String nama, int nilai)
    {
        // initialise instance variables
        x = 0;
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Mahasiswa s)
    {
        return this.nilai - s.nilai;     //Sorts the objects in ascending order
         
        // return s.nilai - this.nilai;    //Sorts the objects in descending order
    }
    
    @Override
    public String toString()
    {
        return "Nama : " + nama + "\n" + "Nilai : "+ nilai + "\n";
    }
    
    /**
     * Method untuk memasukkan nama mahasiswa
     * 
     * @param nama Parameter dari method setNama dalam bentuk String
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Method untuk memasukkan nilai mahasiswa
     * 
     * @param nilai Parameter dari method setNama dalam bentuk integer (numerik)
     */
    public void setNilai(int nilai)
    {
        this.nilai = nilai;
    }
    
    /**
     * Method untuk menampilkan nama mahasiswa
     * 
     * @return nama Mengembalikan isi data dari instance variable nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk menampilkan nilai mahasiswa
     * 
     * @return nilai Mengembalikan isi data dari instance variable nilai
     */
    public int getNilai()
    {
        return nilai;
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
