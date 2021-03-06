package co.pragra;

import co.pragra.learning.HomeApp;
import org.testng.annotations.*;

public class HomeTest {
    HomeApp app;

    @BeforeSuite
    public void setUp() {
        System.out.println("Setting up on Suite Level");
    }

    @BeforeTest
    public void setUp1() {
        System.out.println("Setting up on Test Level");
    }



    @BeforeClass
    public void setUp2() {
        System.out.println("Setting up on Class Level "+ getClass().getName());
    }


    @Test
    public void tc1(){
        System.out.println();
        System.out.println("Running Test Cases");
        System.out.println();
    }



    @AfterClass
    public void cleanUp3() {
        System.out.println("Removing Class Level Work" + getClass().getName());
    }


    @AfterSuite
    public void cleanUp() {
        System.out.println("Removing Suite Level Work");
    }


    @AfterTest
    public void cleanUp2() {
        System.out.println("Removing Test Level Work");
    }
}
