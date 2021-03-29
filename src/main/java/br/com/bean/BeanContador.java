package br.com.bean;

import javax.faces.bean.ManagedBean;

import br.com.airton.ContadordePessoas;

@ManagedBean(name = "beanConte")
public class BeanContador {
	
	
	ContadordePessoas cont = new ContadordePessoas();
	
	public ContadordePessoas getCont() {
		return cont;
	}
	
	public void setCont(ContadordePessoas cont) {
		this.cont = cont;
	}
	
	
	public void entrada() {	
		
		cont.setQuantPresente(cont.getQuantPresente());	
		
	}
	

}
