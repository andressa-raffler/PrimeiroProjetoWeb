package br.com.letscode.primeiroprojetoweb.dao;

import br.com.letscode.primeiroprojetoweb.model.Cliente;

import java.util.ArrayList;
import java.util.List;

/** Classe que representa o acesso a base de dados
 * @author andressaraffler
 * @since 22/07/2022
 * @version 1.0.0
 * isso deve ser substituido pela nomenclatura repository
 */


public class ClienteDao {
    //Data Acess Object, objeto de acesso a dados

    private static List<Cliente> bancoClientes = new ArrayList<>();
    private static long countCliente;


    public Cliente save (Cliente cliente){
        countCliente ++;
        cliente.setId(countCliente);
        bancoClientes.add(cliente);
        return cliente;
    }

    public List<Cliente> findAll(){
        return bancoClientes;
    }



}
