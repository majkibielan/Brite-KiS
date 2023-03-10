package pl.alk.kis.actions;

import pl.alk.kis.pages.FirstScreenPage;
import pl.alk.kis.pages.SecondScreenPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static pl.alk.kis.utils.ElementUtils.selectComboboxPosition;
import static pl.alk.kis.utils.DataGenerator.*;

public class FirstScreenActions extends FirstScreenPage {

    public void fillCourseSection() {
        firstScreenIndicator.shouldBe(visible, Duration.ofSeconds(10));
        courseSelectList.shouldBe(visible, Duration.ofSeconds(10)).click();
        selectComboboxPosition("Word 101");
        courseOfferingSelectList.click();
        selectComboboxPosition("Word 101 (2023-05-08)");
    }

    public void fillPersonalDetailsSection() {
        surnameInput.sendKeys(generateLastName());
        firstNameInput.sendKeys(generateFirstName());
        middleNameInput.sendKeys(generateMiddleName());
        emailInput.sendKeys(generateEmailAddress());
        phoneInput.sendKeys(generatePhoneNumber());
//        noPeselCheckbox.click();
        dateOfBirthInput.sendKeys(generateDateOfBirth());
        countryOfBirthList.click();
        selectComboboxPosition("Polska");
        cityOfBirthInput.sendKeys(generateCityOfBirth());
    }

    public void fillMailingAddressSection() {
        polishPostalCodeInput.sendKeys("00-");
        postalCodeOption.click();
        noStreetCheckbox.click();
        streetInput.sendKeys(generateStreetName());
        streetNumberInput.sendKeys(generateHouseNumber());
        apartmentNumberInput.sendKeys(generateApartmentNumber());
    }

    public void checkConsents() {
        regulationProcessingAgreementCheckbox.click();
        processingAgreementCheckbox.click();
        processing12MonthAgreementCheckbox.click();
        marketingAgreementCheckbox.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void assertSecondScreenDisplayed() {
        SecondScreenPage secondScreenPage = new SecondScreenPage();
        secondScreenPage.secondScreenIndicator.shouldBe(visible, Duration.ofSeconds(20));
    }
}
