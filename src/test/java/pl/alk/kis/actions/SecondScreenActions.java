package pl.alk.kis.actions;

import pl.alk.kis.pages.SecondScreenPage;
import pl.alk.kis.pages.ThirdScreenPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static pl.alk.kis.utils.DataGenerator.generateRandomText;

public class SecondScreenActions extends SecondScreenPage {

    public void notAlumni() {
        secondScreenIndicator.shouldBe(visible, Duration.ofSeconds(10));
        notAlumniRadioOption.click();
        howProspectFindOutTextArea.sendKeys(generateRandomText());
        nextButton.click();
    }

    public void assertThirdScreenDisplayed() {
        ThirdScreenPage thirdScreenPage = new ThirdScreenPage();
        thirdScreenPage.thirdScreenIndicator.shouldBe(visible, Duration.ofSeconds(10));
    }
}
