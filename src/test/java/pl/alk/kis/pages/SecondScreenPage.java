package pl.alk.kis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SecondScreenPage {

    public SelenideElement secondScreenIndicator() {
        return $x("//lightning-progress-step[@class='slds-progress__item slds-is-active']//button[@title='Second Step']");
    }
}