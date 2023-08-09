package br.com.rborges.dao;

import br.com.rborges.Cliente;

import java.util.Collection;

/**
 * @author Rebeca
 */
public class ClienteDaoMock implements IClienteDAO {
    @Override
    public String salvar() {
        return null;
    }

    public void adicionarCliente(Cliente cliente1) {
    }

    public Collection<Object> getClientes() {
        return null;
    }
}
