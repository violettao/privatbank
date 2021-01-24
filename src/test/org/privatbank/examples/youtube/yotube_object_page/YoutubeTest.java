package org.privatbank.examples.youtube.yotube_object_page;


import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class YoutubeTest {
    @Test
    public void tabNameContainsYoutube (){
        open("https://youtube.com");
        String title = new YoutubePage().getTitle();
        Assert.assertEquals(title, "YouTube");
    }

}
