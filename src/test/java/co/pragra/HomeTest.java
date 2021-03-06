package co.pragra;

import co.pragra.learning.HomeApp;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomeTest {
    HomeApp app;




    @BeforeClass
    public void setUp2() {
        System.out.println("Setting up on Class Level "+ getClass().getName());
        app = new HomeApp();
    }


    @Test
    public void addNameTC() {
        app.addName("Atin");
        Assert.assertTrue(app.getNames().contains("Atin"));
    }

    @Test
    public void tc1(){
        System.out.println();
        System.out.println("Running Test Cases");
        System.out.println();
    }



}
