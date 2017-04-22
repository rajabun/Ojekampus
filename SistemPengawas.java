
/**
 * Write a description of class SistemPengawas here.
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
 * Class SistemPengawas ditambahkan pada versi 0.8 (Modul 8)
 */
public class SistemPengawas implements Runnable
{
    // instance variables - replace the example below with your own
    private Thread t;
    private String threadName;
    private boolean program_run;
    private int waktu_cek;

    /**
     * Constructor for objects of class SistemPengawas
     */
    public SistemPengawas(String name, int waktu_cek)
    {
        // initialise instance variables
        threadName = name;
        this.waktu_cek = waktu_cek;
        program_run = true;
        System.out.println("Creating " + threadName);
    }

    /**
     * Method yang mengakses method run() di thread, untuk menjalankan thread
     * 
     */
    public void run()
    {
        System.out.println("Running " + threadName);
        try
        {
            while(program_run == true)
            {
                Administrasi.jalankanSistemPenugas();
                // Let the thread sleep for a while.
                Thread.sleep(75);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
    
    /**
     * Method yang mengakses method start() di thread, untuk memulai thread
     * 
     */
    public void start()
    {
        System.out.println("Starting " + threadName);
        if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
        }
    }
    
    /**
     * Method yang mengakses method join() di thread, untuk menghentikan sementara thread
     * sekarang sampai thread t diterminasi
     * 
     */
    public void join()
    {
        try
        {
            t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread " + threadName + " interrupted");
        }
    }
    
    /**
     * Method untuk menghentikan thread
     * 
     */
    public void exit()
    {
        program_run = false;
    }
}
