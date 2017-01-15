/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly.challenges;

import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jhack
 */
public class HettOnePtTwentyEightTest {

    public HettOnePtTwentyEightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of lsort method, of class HettOnePtTwentyEight.
     */
    @Test
    public void testLsort() {
        System.out.println("Beginning Hett 1.28 Test...");
        String[][] list = new String[][]{{"a", "b", "c"}, {"d", "e"}, {"f", "g", "h"}, {"d", "e"}, {"i", "j", "k", "l"}, {"m", "n"}, {"o"}};

        String[][] expectedResult = new String[][]{{"i", "j", "k", "l"}, {"a", "b", "c"}, {"f", "g", "h"}, {"d", "e"}, {"d", "e"}, {"m", "n"}, {"o"}};
        HettOnePtTwentyEight sortingProblem = new HettOnePtTwentyEight();
        String[][] test = sortingProblem.lsort(list);
        assertEquals(expectedResult, test);
    }

}
