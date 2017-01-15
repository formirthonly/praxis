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
        HettOnePtTwentyEight sortingProblem = new HettOnePtTwentyEight();
        String[][] array = new String[][] {{"a","b","c"}, {"d","e"}, {"f","g","h"}, {"d","e"}, {"i","j","k","l"}, {"m","n"}, {"o"}};
        sortingProblem.lsort(array);
    }
}
