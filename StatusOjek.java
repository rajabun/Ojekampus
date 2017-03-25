
/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
 */

/**
 * Class StatusOjek ditambahkan pada versi 0.3 (Modul 3)
 * Class ini merupakan enum
 * Modul 4 : Tidak ada perubahan
 * Modul 5 : Tidak ada perubahan
 */
public enum StatusOjek
{
    Antar("Mengantar"), Idle("Idle"), Jemput("Menjemput");
    
    private String deskripsi;
    
    StatusOjek(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
    public String toString()
    {
        return deskripsi;
    }
}
