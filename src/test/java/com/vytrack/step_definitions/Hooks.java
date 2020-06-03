package com.vytrack.step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void startUp(Scenario scenario) {
        System.out.println("===============");
        System.out.println("before method");
        System.out.println(scenario.getName() + " is started");
        System.out.println("===============");

    }

    @After

    public void tearDown(Scenario scenario) {
        System.out.println("after method");
        System.out.println(scenario.getName() + " result : "+scenario.getStatus());
    }
}
