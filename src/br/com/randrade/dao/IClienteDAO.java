package br.com.randrade.dao;

import br.com.randrade.domain.Cliente;

import java.util.List;

public interface IClienteDAO {


    public Integer cadastrar(Cliente cliente) throws Exception;
    public Cliente consultar (String codigo) throws Exception;

    public Integer excluir(Cliente cliente) throws Exception;

    public List<Cliente> buscarTodos() throws Exception;

    public Integer atualizar(Cliente clienteBanco) throws Exception;
}
