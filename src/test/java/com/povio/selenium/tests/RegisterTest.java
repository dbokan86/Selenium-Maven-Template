package com.povio.selenium.tests;

import org.junit.Test;
import com.povio.selenium.page_objects.Register;

public class RegisterTest extends BaseTest {

    public Register register;

    @Test
    public void registerlogin() {
        Register register = new Register(driver);
        register.basePage();
        register.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
        register.deleteacc();
        driver.switchTo( ).alert( ).accept();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}