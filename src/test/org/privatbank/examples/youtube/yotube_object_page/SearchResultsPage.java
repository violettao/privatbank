package org.privatbank.examples.youtube.yotube_object_page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public ElementsCollection getResults() {
        return $$("#contents ytd-video-renderer");
    }
    public SelenideElement getResult(int index) {
        return $("#contents ytd-video-renderer", index);
    }
}
