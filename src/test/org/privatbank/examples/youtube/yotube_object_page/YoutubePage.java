package org.privatbank.examples.youtube.yotube_object_page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YoutubePage {
    public String getTitle (){
        return Selenide.title();
    }
    public void searchFor(String text) {
        $(By.name("search_query")).val(text).pressEnter();
    }
}
