package code.stepsDefinitions;


import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import code.pages.guru99Home;
import code.pages.guru99OrderSuccess;
import code.pages.guru99Payment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class guru99Steps extends BrowserUtils {
    code.pages.guru99Home guru99Home=new guru99Home();
    code.pages.guru99Payment guru99Payment=new guru99Payment();
    code.pages.guru99OrderSuccess guru99OrderSuccess=new guru99OrderSuccess();

    @Given("The user wants to go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        setWaitTime();
    }
    @When("The user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy() {
        guru99Home.getQuantityDropdown("1");
        guru99Home.getBuyNowButton();
    }
    @Then("The user wants to provide requested payment information")
    public void the_user_wants_to_provide_requested_payment_information() {
        guru99Payment.setCardNumber("5454545454545454");
        guru99Payment.setMonth("10");
        guru99Payment.setYear("2024");
        guru99Payment.setCvv_code("369");
    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        guru99Payment.setPayButton();
    }
    @Then("The user wants to verify order is successful")
    public void the_user_wants_to_verify_order_is_successful() {

        guru99OrderSuccess.setVerificationText("Payment successfull!");
    }
    @When("The user wants to buy an elephant toy as {string}")
    public void the_user_wants_to_buy_an_elephant_toy_as(String string) {
        guru99Home.getQuantityDropdown(string);
        guru99Home.getBuyNowButton();

    }
    @Then("The user wants tp enter Credit Card Number as {string}")
    public void the_user_wants_tp_enter_credit_card_number_as(String string) {
        guru99Payment.setCardNumber(string);

    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        guru99Payment.setMonth(string);

    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        guru99Payment.setYear(string);

    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99Payment.setCvv_code(string);

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99OrderSuccess.setVerificationText("Payment successfull!");

    }

    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        guru99Payment.setCardNumber(dataTable.get("CNumber"));
        guru99Payment.setMonth(dataTable.get("EMonth"));
        guru99Payment.setYear(dataTable.get("EYear"));
        guru99Payment.setCvv_code((dataTable.get("CVVCode")));

    }

    @When("The user wants to buy an elephant toy as following quantity")
    public void the_user_wants_to_buy_an_elephant_toy_as_following_quantity(List <List<String>> dataTable) {
        guru99Home.getQuantityDropdown(dataTable.get(0).get(0));
        guru99Home.getBuyNowButton();
    }
    @Then("The user wants to provide payment information as following as a List")
    public void the_user_wants_to_provide_payment_information_as_following_as_a_list(List <List<String>>  dataTable) {
        guru99Payment.setCardNumber(dataTable.get(0).get(0));
        guru99Payment.setMonth(dataTable.get(0).get(1));
        guru99Payment.setYear(dataTable.get(0).get(2));
        guru99Payment.setCvv_code(dataTable.get(0).get(1));

    }
}