package com.mycompany.steps;

import com.mycompany.pages.veterinarians.VeterinariansPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VeterinariansSteps {

    @Steps
    VeterinariansPage veterinariansPage;

    //Veterinarians  ListarVeterinarians
    @Given("el cliente navega a la pagina de Veterinarians")
    public void elClienteNavegaALaPaginaDeVeterinarians() {
        veterinariansPage.open();
    }

    @When("el cliente realiza una acción para listar Veterinarians")
    public void elClienteRealizaUnaAccionParaListarVeterinarians() {
        veterinariansPage.clickOnVeterinariansMenuLink();
    }

    @Then("la página debe mostrar una lista de Veterinarians válidos")
    public void laPaginaDebeMostrarUnaListaDeVeterinariansValidos() {
        String headerText = veterinariansPage.getVeterinariansHeaderText();
        assertEquals(headerText, "Veterinarians");
    }

    // Veterinarians VerJsonDeListaVeterinarians
    @Then("la página debe mostrar un enlace para abrir el JSON")
    public void laPaginaDebeMostrarUnEnlaceParaAbrirElJSON() {
        assertTrue(veterinariansPage.isViewAsJsonLinkPresent());
    }

    @When("el cliente hace clic en el enlace JSON")
    public void elClienteHaceClicEnElEnlaceJSON() {
        veterinariansPage.clickOnJsonVeterinariansLink();
    }

    @Then("el cliente debe ver el JSON con la lista de Veterinarians")
    public void elClienteDebeVerElJSONLlenoConLaListaDeVeterinarians() {
        String contenido = veterinariansPage.verificarJsonLlenoVeterinarians();
        assertFalse("El contenido del elemento está vacío", contenido.isEmpty());
    }

}
