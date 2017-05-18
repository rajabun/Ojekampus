
/**
 * Enumeration class StatusUser - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusUser
{
    Pelanggan("Pelanggan"), Ojek("Ojek");
    
    private String deskripsi;
    
    StatusUser(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }
    
     public String toString()
    {
        return deskripsi;
    }
}
