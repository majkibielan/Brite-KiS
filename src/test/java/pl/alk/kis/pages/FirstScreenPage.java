package pl.alk.kis.pages;

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
    public final SelenideElement dateOfBirthInput = $x("//input[@name='dateOfBirth']");
    public final SelenideElement countryOfBirthList = $x("//input[@name='countryOfBirth']");
    public final SelenideElement cityOfBirthInput = $x("//input[@name='cityOfBirth']");
    public final SelenideElement peselInput = $x("//input[@name=PESEL]");
    public final SelenideElement noPolishAddressCheckbox = $x("//input[@name='isNotInPoland']");
    public final SelenideElement polishPostalCodeInput = $x("//input[@placeholder='XX-XXX']");
    public final SelenideElement postalCodeOption = $x("//li/span[@role='option']");
    public final SelenideElement cityPicklist = $x("//button[@name='city']");
    public final SelenideElement streetPicklist = $x("//button[@name='street']");
    public final SelenideElement noStreetCheckbox = $x("//input[@name='isStreetNotOnTheList']");
    public final SelenideElement streetInput = $x("//input[@name='street']");
    public final SelenideElement streetNumberInput = $x("//input[@name='streetNumber']");
    public final SelenideElement apartmentNumberInput = $x("//input[@name='apartmentNumber']");
    public final SelenideElement regulationProcessingAgreementCheckbox = $x("//input[@name='regulationProcessingAgreement']");
    public final SelenideElement processingAgreementCheckbox = $x("//input[@name='checkboxProcessingAgreement']");
    public final SelenideElement processing12MonthAgreementCheckbox = $x("//input[@name='checkboxProcessing12Agreement']");
    public final SelenideElement marketingAgreementCheckbox = $x("//input[@name='marketingAgreement']");
    public final SelenideElement nextButton = $x("//lightning-button/button");
}
