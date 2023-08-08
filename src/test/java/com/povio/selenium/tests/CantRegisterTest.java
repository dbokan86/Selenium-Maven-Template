package com.povio.selenium.tests;

import org.junit.Test;
import com.povio.selenium.page_objects.Register;

public class CantRegisterTest extends BaseTest {

    public Register register;

    @Test
    public void registerlogin(){
        Register register = new Register(driver);
        register.basePage();
        register.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
        register.signout();
        register.signupagain();
        register.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
        register.signinulazak();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        register.signIn("dragoslav@gmail.com", "milenkovic");
        register.deleteacc();
        driver.switchTo().alert().accept();
    }
}