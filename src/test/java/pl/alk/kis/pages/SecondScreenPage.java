package pl.alk.kis.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SecondScreenPage {

    public final SelenideElement secondScreenIndicator = $x("//lightning-progress-step[@class='slds-progress__item slds-is-active']//button[@title='Second Step']");
    public final SelenideElement notAlumniRadioOption = $x("//div[@part='options']/span[1]");
    public final SelenideElement alumniRadioOption = $x("//div[@part='options']/span[2]");
    public final SelenideElement howProspectFindOutTextArea = $x("//*[@name='whereProspectFindOut']");
    public final SelenideElement nextButton = $x("//lightning-button/button[@class='slds-button slds-button_brand']");
}
