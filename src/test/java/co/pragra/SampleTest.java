package co.pragra;

import org.testng.Assert;
import org.testng.annotations.Test;

// Sanity, Smoke, Feature, Regression
//
public class SampleTest {
    static int a = 0;
    @Test(groups = {"smoke","regression"}, dependsOnGroups = {"sanity"}, enabled = false)
    public void tc1() {
        System.out.println("TC1");
    }

    @Test(groups = {"regression"},  dependsOnGroups = {"sanity"}, enabled = false)
    public void tc2() {
        System.out.println("TC2");
    }

    @Test(groups = {"regression"},  dependsOnGroups = {"sanity"}, enabled = false)
    public void tc3() {
        System.out.println("TC3");
    }

    @Test(groups = {"smoke","regression"},  dependsOnGroups = {"sanity"},enabled = false)
    public void tc4() {
        System.out.println("TC4");
    }

    @Test(groups = {"sanity","regression"}, enabled = false)
    public void tc5() {
        System.out.println("TC5");
        Assert.assertTrue(false);
    }


    @Test(timeOut = 500,enabled = false)
    public void dependsOnTest() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }
        System.out.println("DEPENDS ON METHOD");
    }

    @Test(enabled = false, expectedExceptions = {ArithmeticException.class, NullPointerException.class}, expectedExceptionsMessageRegExp = "/ by zero")
    public void invocationTest() {
        System.out.println(2/0);

    }


    @Test(priority = 1)
    public void ntc1(){
        System.out.println("NTC1");
    }
    @Test(priority = 20)
    public void ntc2(){
        System.out.println("NTC2");
    }
    @Test()
    public void ntc3(){
        System.out.println("NTC3");
    }
    @Test(priority = 20)
    public void ntc4(){
        System.out.println("NTC4");
    }
}
