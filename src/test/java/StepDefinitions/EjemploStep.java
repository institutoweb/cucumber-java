package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class EjemploStep {

    @Given("que ingrese en saucedemo.com")
    public void IngresoSaucedemo(){
        System.exit(1);
        System.out.println("Ingresé en Saucedemo.com");
    }

    @Then("ingreso un usuario en la pantalla de login")
    public void IngresoUsuario(){
        System.out.println("Ingresé un usuario");
    }
}
