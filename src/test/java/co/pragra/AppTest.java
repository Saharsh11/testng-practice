package co.pragra;

import co.pragra.learning.HomeApp;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AppTest {

    /*
        What is testing ?
        Requirement / Implementation -- Finding variance
        // comparaion of actual v/s expected
     */

    HomeApp app;
    @BeforeClass
    public void setUp(){
        app = new HomeApp();
        app.addName("Atin");
        app.addName("Vivek");
        app.addName("Joel");
    }

    @Test
    public void sampleTest() {
        // What is assertion ?
      Assert.assertTrue(app.checkNameStartingwithA(), "There is not match with A");
    }

    @Test()
    public void nameTest() {

        Assert.assertEquals( app.getNames().get(0),"Atin");
    }

//    @Test
//    public void doubleTest() {
//        Assert.assertEquals(app.sumDouble(10,10), 20,0);
//        Assert.assertTrue(true);
//        Assert.assertFalse(false);
//        Assert.assertNotEquals(10,10);
//    }

    //
}
