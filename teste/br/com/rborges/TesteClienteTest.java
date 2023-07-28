package br.com.rborges;

import org.junit.Assert;
import org.junit.Test;

import br.com.rborges.TesteCliente;

public class TesteClienteTest {

    @Test
    public void TesteClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rebeca");
        cli.adicionarNome1("RebecaB");
        cli.adicionarNome2("RebecaBo");



        Assert.assertEquals("Rebeca", cli.getNome());
    }
}
