/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jhack
 * 
 * Link to challenge:
 * https://programmingpraxis.com/2013/08/13/unix-paths/
 * 
 * 
 * Notes:
 * A better implementation would be to use an ArrayList instead. 
 */
public class UnixPaths {

    public static void paths(String cd, String tp) {
        String[] targetPath = tp.split("/");
        String[] newCd = cd.split("/");
        List<String> directories = new ArrayList<String>();
        String newCdString = String.join("/", newCd);
        for (String path : targetPath) {
            if (path.equals("..")) {
                newCd = Arrays.copyOf(newCd, newCd.length - 1);
                newCdString = String.join("/", newCd);
            } else if (path.equals(".")) {
            } else {
               directories.add(path);
            }
        }
        System.out.println(newCdString + "/"  + String.join("/", directories));
    }
}
