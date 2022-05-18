package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> list = new ArrayList<>();

	static {
		Empresa empresa1 = new Empresa("Alura");
		Empresa empresa2 = new Empresa("Caelum");
		list.add(empresa1);
		list.add(empresa2);
	}
	public void adiciona(Empresa e) {
		list.add(e);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.list;
	}
}
