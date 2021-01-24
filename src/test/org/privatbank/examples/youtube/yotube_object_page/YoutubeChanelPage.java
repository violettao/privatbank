package org.privatbank.examples.youtube.yotube_object_page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YoutubeChanelPage {
    public SelenideElement getSubscribeButton() {
        return $("#buttons #subscribe-button");
    }
    public SelenideElement getSignInButton() {
        return $("ytd-popup-container ytd-modal-with-title-and-button-renderer ytd-button-renderer");
    }
}
