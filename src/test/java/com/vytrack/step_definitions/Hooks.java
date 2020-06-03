package com.vytrack.step_definitions;


import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void startUp(Scenario scenario) {
        System.out.println("===============");
        System.out.println(scenario.getName() + "  test is started");
        System.out.println("===============");

    }

    @After

    public void tearDown(Scenario scenario) {
        System.out.println(scenario.getName() + " result : " + scenario.getStatus());
        Driver.closeDriver();
        System.out.println("===============");
    }
}
