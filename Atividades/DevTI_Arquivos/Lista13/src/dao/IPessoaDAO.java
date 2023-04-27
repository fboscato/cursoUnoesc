package dao;

import java.util.List;

import db.DbException;
import modelo.Pessoa;

public interface IPessoaDAO {
	void adicionar(Pessoa p) throws DbException;

	void alterar(Pessoa p) throws DbException;

	void excluir(Integer id) throws DbException;

	List<Pessoa> listarTodos() throws DbException;

	Pessoa buscarPorId(Integer id) throws DbException;
}
