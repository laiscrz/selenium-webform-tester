package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Setup;

public class Hooks {

    @Before
    public void openDriver() {
        Setup.createDriverInstance();
    }
    @After
    public  void closeDriver() {
        Setup.quitDriver();
    }
}
