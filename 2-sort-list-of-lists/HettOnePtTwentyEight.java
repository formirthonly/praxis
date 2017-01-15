package weekly.challenges;


import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhack
 * 
 * Link to challenge:
 * https://programmingpraxis.com/2011/08/09/hetts-problem-128/
 * 
 * Notes:
 * 
 */
public class HettOnePtTwentyEight {
    public static String[][] lsort(String[][] list) {
        Arrays.sort(list, LENGTH);
        return list;
    }

    public static Comparator<String[]> LENGTH = new Comparator<String[]>() {
      @Override
      public int compare(String[] array1, String[] array2) {
         return Integer.valueOf(array2.length).compareTo(array1.length);
      }
   };
}
