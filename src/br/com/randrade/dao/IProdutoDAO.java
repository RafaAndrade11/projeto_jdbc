package br.com.randrade.dao;

import br.com.randrade.domain.Produto;

import java.util.List;

public interface IProdutoDAO {

    public Integer cadastrar(Produto produto) throws Exception;
    public Produto consultar (String codigo) throws Exception;

    public Integer excluir(Produto produto) throws Exception;

    public List<Produto> buscarTodos() throws Exception;

    public Integer atualizar(Produto produtoBanco) throws Exception;

}
