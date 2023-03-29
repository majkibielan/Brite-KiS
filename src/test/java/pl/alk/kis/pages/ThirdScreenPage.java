package pl.alk.kis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ThirdScreenPage {

    public final SelenideElement thirdScreenIndicator = $x("//lightning-progress-step[@class='slds-progress__item slds-is-active']//button[@title='Third Step']");
}
