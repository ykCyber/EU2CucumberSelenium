package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    @Then("the user enters ID {string} and Password {string}")
    public void the_user_enters_and(String userName, String password) {
        LoginPage loginPage = new LoginPage();
        switch (userName) {
            case "driver":
                userName = ConfigurationReader.get("driver_username");
                break;
            case "sales manager":
                userName = ConfigurationReader.get("sales_manager_username");
                break;
            case "store manager":
                userName = ConfigurationReader.get("store_manager_username");
                break;
            default:
                System.out.println("Wrong ID or PassWord");
                System.exit(0);
                break;
        }

        loginPage.login(userName, password);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String title = Driver.get().getTitle();
        System.out.println(title);
        Assert.assertEquals("I am on the Dashboard", "Dashboard", title);
    }
}
