package com.povio.selenium.tests;

import org.junit.Test;
import com.povio.selenium.page_objects.Campaign;

public class CampaignEditTest extends BaseTest{
    
    public Campaign campaign;

    @Test
    public void campaign() {
        Campaign campaign = new Campaign(driver);
        campaign.basePage();
        campaign.newuser("dragoslav", "dragoslav@gmail.com", "milenkovic", "milenkovic");
        campaign.campentry();
        campaign.addnewcamp();
        campaign.formularcampanja("Povio", "Zadatak");
        campaign.editcamp();
        campaign.editformular("povio1", "zadatak1");
        campaign.deleteacc();
        driver.switchTo( ).alert( ).accept();
    }
}