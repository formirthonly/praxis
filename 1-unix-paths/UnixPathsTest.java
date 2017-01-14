/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly.challenges;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhack
 */
public class UnixPathsTest {
    
    public UnixPathsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of paths method, of class UnixPaths.
     */
    @Test
    public void testPaths() {
        System.out.println("Beginning test for UnixPaths.testPaths(String, String) ");
        UnixPaths unixPath = new UnixPaths();

        System.out.println("--- Test 1 ---");
        String test1 = unixPath.paths("/home/root/", "./hello1/hello2");
        String expectedResult = "/home/root/hello1/hello2";
        System.out.println(test1);
        assertEquals(expectedResult, test1);
        
        System.out.println("--- Test 2 ---");
        String test2 = unixPath.paths("/home/root/", "./../hello1/hello2");
        String expectedResult2 = "/home/hello1/hello2";
        System.out.println(test2);
        assertEquals(expectedResult2, test2);
        
        System.out.println("--- Test 3 ---");
        String test3 = unixPath.paths("/home/root/", "../hello1/hello2");
        String expectedResult3 = "/home/hello1/hello2";
        System.out.println(test3);
        assertEquals(expectedResult3, test3);
        
        System.out.println("--- Test 4 ---");
        String test4 = unixPath.paths("/home/root/", "../../hello1/hello2");
        String expectedResult4 = "/hello1/hello2";
        System.out.println(test4);
        assertEquals(expectedResult4, test4);
    }
    
}
