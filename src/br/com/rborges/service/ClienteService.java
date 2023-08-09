package br.com.rborges.service;

import br.com.rborges.Cliente;
import br.com.rborges.dao.IClienteDAO;

public class ClienteService {
    private IClienteDAO clienteDao;

    public ClienteService (IClienteDAO clienteDao){
//        clienteDao = new ClienteDao();
//        clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;

    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }

    public String consultaClientes() {
        clienteDao.salvar();
        return "sucesso";
    }

    public void removerCliente(Cliente cliente) {
    }
}
