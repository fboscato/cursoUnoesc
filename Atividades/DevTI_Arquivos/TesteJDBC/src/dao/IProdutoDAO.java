package dao;

import java.util.List;

import db.DbException;
import modelo.Produto;

public interface IProdutoDAO {
	void adicionar(Produto p) throws DbException;
	void alterar(Produto p) throws DbException;
	void excluir(Integer id) throws DbException;
	List<Produto> listarTodos() throws DbException;
	Produto buscarPorId(Integer id) throws DbException;	
}
