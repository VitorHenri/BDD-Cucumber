package br.com.alura.leilao.acceptance.steps;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PropondoLancesSteps {
	private Lance lance;
	private Leilao leilao;
	
	@Given("Dado um lance valido")
	public void dado_um_lance_valido() {
		Usuario usuario = new Usuario("fulano");	
	    new Lance(usuario,BigDecimal.TEN);
	}

	@When("Quando propoe um lance")
	public void quando_propoe_um_lance() {
		leilao = new Leilao("Tablet XPTO");
		leilao.propoe(lance);
	}
	@Then("Entao o lance eh feito")
	public void entao_o_lance_eh_feito() {
		Assertions.assertEquals(1, leilao.getLances().size());
		Assertions.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
		
		leilao.getLances();
	}

}
