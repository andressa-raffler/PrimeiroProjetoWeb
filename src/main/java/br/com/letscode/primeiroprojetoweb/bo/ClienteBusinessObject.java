package br.com.letscode.primeiroprojetoweb.bo;

import br.com.letscode.primeiroprojetoweb.dao.ClienteDAO;
import br.com.letscode.primeiroprojetoweb.model.Cliente;

import java.util.List;
import java.util.Objects;

public class ClienteBusinessObject {
    private ClienteDAO clienteDAO;

    public ClienteBusinessObject(ClienteDAO clienteDAO){
        //clienteDAO = new ClienteDAO(); //REVER ISSO
        this.clienteDAO = clienteDAO;
        //IC inversao de controle
        //DI Injeçao de Dependencia - no clienteServlet
    }

    public Cliente save(Cliente cliente){
        valida(cliente);
        return clienteDAO.save(cliente);
    }

    private void valida(Cliente cliente) {
        if(Objects.isNull(cliente.getNome())){
            throw new IllegalArgumentException("Nome invalido");
        }
    }
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }
}
