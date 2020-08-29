package testcal.cucumber;

import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import testcal.tasks.OpenTheApplication;

public class runn {
    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Given("^(?:.*) is on the google")
    public void open_google() {
        BrowsingTheWeb.with(herBrowser);
        OpenTheApplication.openBrower();
    }


}
