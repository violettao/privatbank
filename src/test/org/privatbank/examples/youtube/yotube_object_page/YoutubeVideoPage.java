package org.privatbank.examples.youtube.yotube_object_page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YoutubeVideoPage {
    public SelenideElement getAvatar() {
        return $("ytd-video-owner-renderer #avatar");
    }
}
