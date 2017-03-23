package Rajab_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;

/**
 * class Array
 * 
 * @author Muhammad Rajab(1206244415)
 * @version 0.5, 23 Maret 2017 
 * @version 0.4, 19 Maret 2017
 * @version 0.3, 18 Maret 2017
 * @version 0.2, 02 Maret 2017 
 * @since 0.1, 23 Februari 2017
*/

/**
 * Class Array ditambahkan pada versi 0.5 (Modul 5)
 */
public class Array
{
    // instance variables - replace the example below with your own
    private int x;
    //List<Integer> listInt = new ArrayList<>(Arrays.asList(308,654,988,331,668,378,19,145,70,635));
    static ArrayList <Integer> listInt = new ArrayList<>();
    static int[] arrayInt = new int[1000];
    //int[] arrayInt = {9,5,4,1,4,5,7,9,4};
    
    //int listint = new ArrayList();
    //ArrayList al = new ArrayList();
    /**
     * Constructor for objects of class Array
     */
    public Array()
    {
        // initialise instance variables
        x = 0;
    }
    
    int[] sortArray(int[] arrayInt)
    {
        Arrays.sort(arrayInt);
       //Arrays.sort menggunakan algoritma quicksort
        /*
        for (int i = 0; i < arrayInt.length; i++) 
        {
            System.out.println(arrayInt[i]);
        }
        */
       for (int number : arrayInt)
       {
           System.out.println("Number = " + number);
       }
       return (arrayInt);
    }
    
    ArrayList<Integer> sortArrayList(ArrayList <Integer> listInt)
    {
       Collections.sort(listInt);
       //Arrays.sort menggunakan algoritma quicksort
        /*
        for (int i = 0; i < arrayInt.length; i++) 
        {
            System.out.println(arrayInt[i]);
        }
        */
       System.out.println("Number = " + listInt);
       return (listInt);
    }
    //public static List<String> readFileAsListOfStrings(String filename) throws Exception
    public static List<String> readFileAsListOfStrings(ArrayList <Integer> listInt) throws Exception
    {
        List<String> records = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("arraylistmodul5.txt"));
        //BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null)
        {
            records.add(line);
            //String[] isi = records.toArray(new String[records.size()]);
            //System.out.println("Number = " + line);
        }
        reader.close();
        return records;
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
