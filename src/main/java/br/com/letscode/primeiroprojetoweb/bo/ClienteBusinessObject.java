package br.com.letscode.primeiroprojetoweb.bo;

import br.com.letscode.primeiroprojetoweb.dao.ClienteDao;
import br.com.letscode.primeiroprojetoweb.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteBusinessObject {
    private ClienteDao clienteDao;
    private static List<ClienteDao> listaClientes = new ArrayList<>();

    public ClienteBusinessObject(){
        clienteDao = new ClienteDao();
    }

    public Cliente save(Cliente cliente){
        valida(cliente);
        return clienteDao.save(cliente);
    }

    private void valida(Cliente cliente) {
        if(Objects.isNull(cliente.getNome())){
            throw new IllegalArgumentException("Nome invalido");
        }

    }

    public List<ClienteDao> findAll() {
        return listaClientes;
    }

    // public List<Cliente> findAll(){
   //     return clienteDao;
   // }
}
