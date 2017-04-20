package Rajab_8;

/**
 * Write a description of class LombaHitung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LombaHitung implements Runnable {
   private Thread t;
   private String threadName;
   private int nomor;
   
   LombaHitung(String name, int num) {
      setName(name);
      nomor = num;
      System.out.println(threadName + " hadir");
   }
   
   public final void setName(String name){
       threadName = name;
    }
   
   public final String getName(){
       return threadName;
    }
    
   public void run() {
      System.out.println(threadName + " mulai menghitung");
      try {
         for(int i = 0; i < 24; i++) {
            System.out.println("Kontestan " + threadName + " menghitung" + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(75);
         }
      }catch (InterruptedException e) {
         System.out.println("Kontestan " +  threadName + " interrupted.");
      }
      System.out.println("Kontestan " +  threadName + " selesai menghitung.");
   }
   
   public void start () {
      System.out.println(threadName + " bersiap" );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}