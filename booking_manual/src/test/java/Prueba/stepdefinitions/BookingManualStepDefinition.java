package Prueba.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

import javax.swing.*;


import static org.junit.Assert.assertEquals;

public class BookingManualStepDefinition {

        private Scenario scenario;

        @Before
        public void getScenario(Scenario scenario) {
            this.scenario = scenario;
        }

        @When("^(.*)$")
        public void iExecuteIncomingINEDIIndividualWithTheJulianDate(String step) throws Exception {
            validate(step, scenario.getName());
        }

    private void validate(String step, String nameScenario) {
        int YES = 1;
        String reason = "";
        String[] options = {"No", "SI"};
        int optionSelected = JOptionPane.showOptionDialog(new JFrame(), "el paso se ejecuto de forma correcta \"" + step + "\" se ejecuto de forma correcta ?",
                nameScenario, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
        if(optionSelected == 0) {
            reason = JOptionPane.showInputDialog("Digite la razon por la que fallo");
        }
        assertEquals(reason, YES, optionSelected);
    }
}
