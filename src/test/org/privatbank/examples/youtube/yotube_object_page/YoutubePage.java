package org.privatbank.examples.youtube.yotube_object_page;

import com.codeborne.selenide.Selenide;

public class YoutubePage {
    public String getTitle (){
        return Selenide.title();
    }
}
