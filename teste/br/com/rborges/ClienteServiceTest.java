package br.com.rborges;

import br.com.rborges.dao.ClienteDao;
import br.com.rborges.dao.ClienteDaoMock;
import br.com.rborges.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rebeca
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }
    @Test (expected = UnsupportedOperationException.class )
    public void EsperadoErroNoSalvarTest() {
        ClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

}
