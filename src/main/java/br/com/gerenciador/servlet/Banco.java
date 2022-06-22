package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> list = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa("Alura");
		empresa1.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(chaveSequencial++);
		list.add(empresa1);
		list.add(empresa2);
	}
	public void adiciona(Empresa e) {
		e.setId(Banco.chaveSequencial++);
		list.add(e);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.list;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = list.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}	
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : list) {
			if(empresa.getId() == id) {
				return empresa;
			}
			
		}
		return null;
	}
}
