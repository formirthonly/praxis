/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jhack
 */
public class WeeklyChallenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnixPaths unixPath = new UnixPaths();
        unixPath.paths("/home/root/", "./hello1/hello2");
        unixPath.paths("/home/root/", "./../hello1/hello2");
        unixPath.paths("/home/root/", "../hello1/hello2");
        unixPath.paths("/home/root/", "../../hello1/hello2");
        
    }
}
