package Rajab_8;

import java.util.*;
import java.lang.*;


/**
 * Write a description of class Tes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tes
{
    // instance variables - replace the example below with your own
    public Random rand = new Random();
    public static int tomo, toma, tomi;
    public int num;
    
   public int random()
   {
        //int r = ThreadLocalRandom.current().nextInt(4, 77);
        /*
        Random rand = new Random();
        rand.nextDouble() = a;
        rand.Next(0, 500) = b;
        */
       // nextInt is normally exclusive of the top value,
       // so add 1 to make it inclusive
       //int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
       int angka = 0;
       angka = rand.nextInt(100);
       return angka + 1;
   }
   
   public void main(String args[]) {
      tomo = random();
      toma = random();
      tomi = random();
      
      do{
          tomo = random();
          do{
              tomi = random();
            }while(tomi <= tomo);
        }while (tomo <= toma);
      
      LombaHitung R1 = new LombaHitung( "Tomi", tomi);
      R1.start();
      
      LombaHitung R2 = new LombaHitung( "Tomo", tomo);
      R2.start();
      
      LombaHitung R3 = new LombaHitung( "Toma", toma);
      R3.start();
      
   }   
}
