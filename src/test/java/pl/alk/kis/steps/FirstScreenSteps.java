package pl.alk.kis.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import pl.alk.kis.actions.FirstScreenActions;
import pl.alk.kis.configuration.PropertiesManager;
import pl.alk.kis.pages.FirstScreenPage;

import static com.codeborne.selenide.Selenide.open;

public class FirstScreenSteps extends FirstScreenPage {

    private final FirstScreenActions firstScreenActions = new FirstScreenActions();

    @Before
    public void beforeTest() {
        PropertiesManager.setUpProperties();
    }

    @Given("an open browser with {word}")
    public void goToUrl(String url) {
        open(url);
    }

    @And("I populate course section")
    public void populateCourseSection() {
        firstScreenActions.fillCourseSection();
    }

    @And("I populate personal details section")
    public void populatePersonalDetailsSection() {
        firstScreenActions.fillPersonalDetailsSection();
    }

    @And("I populate mailing address section")
    public void populateMailingAddressSection() {
        firstScreenActions.fillMailingAddressSection();
    }

    @And("I check consents")
    public void checkConsents() {
        firstScreenActions.checkConsents();
    }

    @When("I click Next")
    public void clickNext() {
        firstScreenActions.clickNextButton();
    }

    @Then("Second screen is displayed")
    public void secondScreenIsDisplayed() {
        firstScreenActions.assertSecondScreenDisplayed();
    }
}
