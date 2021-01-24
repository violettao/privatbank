package org.privatbank.examples.youtube.yotube_object_page;


import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class YoutubeTest {
    @Test
    public void tabNameContainsYoutube (){
        open("https://youtube.com");
        String title = new YoutubePage().getTitle();
        Assert.assertEquals(title, "YouTube");
    }
    @Test
    public void userCanSearch() {
        open("https://youtube.com");
        new YoutubePage().searchFor("privatbank");

        SearchResultsPage results = new SearchResultsPage();
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Кредитний ліміт на картці можна змінювати в Приват24"));
    }

}
