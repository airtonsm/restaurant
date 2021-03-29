package br.com.airton;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ViewScoped
@ManagedBean(name = "contador")
public class ContadordePessoas {
	
	private int limitePessoas; // limite de pessoas no local
	
	private int quantPresente; // quantidade de pessoas presentes no local
	
	private int quantPessoas; // contador de pessoas que passaram no restaurante

	public int getLimitePessoas() {
		return limitePessoas;
	}


	public void setLimitePessoas(int limitePessoas) {
		this.limitePessoas = limitePessoas;
	}


	public int getQuantPresente() {
		return quantPresente;
	}


	public void setQuantPresente(int quantPresente) {
		this.quantPresente = quantPresente;
	}


	public int getQuantPessoas() {
		return quantPessoas;
	}


	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}
	


}
