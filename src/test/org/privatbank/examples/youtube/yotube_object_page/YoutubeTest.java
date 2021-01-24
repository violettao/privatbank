package org.privatbank.examples.youtube.yotube_object_page;


import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class YoutubeTest {
    private String baseUrl = "https://youtube.com";
    @Before
    public void setBrowser(){
        Configuration.startMaximized=true;
    }

    @Test
    public void tabNameShouldBeYoutube (){
        //Given
        String expected = "YouTube";
        open(baseUrl);

        //When
        String actual = new YoutubePage().getTitle();

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void userCanSearch() {
        //Given
        open(baseUrl);

        //When
        new YoutubePage().searchFor("privatbank");
        SearchResultsPage results = new SearchResultsPage();

        //Then
        results.getResults().shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Кредитний ліміт на картці можна змінювати в Приват24"));
    }

}
