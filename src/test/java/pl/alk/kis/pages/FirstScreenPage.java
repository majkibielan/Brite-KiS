package pl.alk.kis.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class FirstScreenPage {

    public final SelenideElement firstScreenIndicator = $x("//lightning-progress-step[@class='slds-progress__item slds-is-active']//button[@title='First Step']");
    public final SelenideElement courseSelectList = $x("//button[@name='courseSelect']");
    public final SelenideElement courseOfferingSelectList = $x("//button[@name='courseOfferingSelect']");
    public final SelenideElement surnameInput = $x("//input[@name='lastName']");
    public final SelenideElement firstNameInput = $x("//input[@name='firstName']");
    public final SelenideElement middleNameInput = $x("//input[@name='middleName']");
    public final SelenideElement emailInput = $x("//input[@name='email']");
    public final SelenideElement phoneInput = $x("//input[@name='phone']");
    public final SelenideElement noPeselCheckbox = $x("//*[@for='checkbox-750']//span[@class='slds-checkbox_faux']");
    public final SelenideElement peselInput = $x("//input[@name=PESEL]");
    public final SelenideElement dateOfBirthInput = $x("//input[@name='dateOfBirth']");
    public final SelenideElement countryOfBirthList = $x("//button[@name='countryOfBirth']");
    public final SelenideElement voivodeshipOfBirthLookup = $x("//c-as_city-search-component//input[not(@disabled)]");
    public final SelenideElement cityofBirthLookup = $x("//c-as_city-search-component//input[not(contains(@class, 'has-custom-border'))]");
    public final SelenideElement cityOfBirthInput = $x("//input[@name='cityOfBirth']");
    public final SelenideElement noPolishAddressCheckbox = $$x("//c-application-address//span[@class='slds-checkbox_faux']").first();
    public final SelenideElement polishPostalCodeLookup = $x("//input[@placeholder='XX-XXX']");
    public final SelenideElement cityPicklist = $x("//button[@name='city']");
    public final SelenideElement streetPicklist = $x("//button[@name='street']");
    public final SelenideElement noStreetCheckbox = $$x("//c-application-address//span[@class='slds-checkbox_faux']").last();
    public final SelenideElement streetInput = $x("//input[@name='street']");
    public final SelenideElement streetNumberInput = $x("//input[@name='streetNumber']");
    public final SelenideElement apartmentNumberInput = $x("//input[@name='apartmentNumber']");
    public final SelenideElement regulationProcessingAgreementCheckbox = $x("//*[@for='checkbox-769']/span[@class='slds-checkbox_faux']");
    public final SelenideElement processingAgreementCheckbox = $x("//*[@for='checkbox-775']/span[@class='slds-checkbox_faux']");
    public final SelenideElement processing12MonthAgreementCheckbox = $x("//*[@for='checkbox-781']/span[@class='slds-checkbox_faux']");
    public final SelenideElement marketingAgreementCheckbox = $x("//*[@for='checkbox-787']/span[@class='slds-checkbox_faux']");
    public final SelenideElement nextButton = $x("//lightning-button/button");
}
