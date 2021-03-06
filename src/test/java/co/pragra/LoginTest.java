package co.pragra;

import org.testng.annotations.*;

public class LoginTest {

    @BeforeClass
    public void setUp2() {
        System.out.println("Setting up on Class Level " + getClass().getName());
    }

    @BeforeMethod
    public void setupBeforeMethod() {
        System.out.println();
        System.out.println("----------BEFORE METHOD FROM "+ getClass().getName());
    }
    @AfterMethod
    public void setupBeforeMethod2() {
        System.out.println();
        System.out.println("----------AFTER METHOD FROM "+ getClass().getName());
    }

    @Test
    public void loginTc() {
        System.out.println("Login TC");
    }

    @Test
    public void loginTc1() {
        System.out.println("Login TC1");
    }

    @Test
    public void loginTc2() {
        System.out.println("Login TC2");
    }

    @Test
    public void loginTc3() {
        System.out.println("Login TC3");
    }

    @Test
    public void loginTc4() {
        System.out.println("Login TC4");
    }


    @AfterClass
    public void cleanUp3() {
        System.out.println("Removing Class Level Work " + getClass().getName());
    }

}
