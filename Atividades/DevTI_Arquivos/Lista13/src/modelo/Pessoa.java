package modelo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class Pessoa {
	private Integer idPessoa;
	private String nomePessoa;
	private java.sql.Date dataNascimento;
	private BigDecimal salario;

	public Pessoa() {
	}

	public Pessoa(Integer idPessoa, String nomePessoa, Date dataNascimento, BigDecimal salario) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Integer getidPessoa() {
		return idPessoa;
	}

	public void setidPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public java.sql.Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(java.sql.Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Produto [idProd=" + idPessoa + ", nomeProd=" + nomePessoa + ", dataCadastro=" + dataNascimento
				+ ", preco=" + salario + "]";
	}
}
