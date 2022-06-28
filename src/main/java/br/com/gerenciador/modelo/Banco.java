package br.com.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> list = new ArrayList<>();
	private static List<Usuario> listaUsuarios= new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa("Alura");
		empresa1.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(chaveSequencial++);
		list.add(empresa1);
		list.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("artur");
		u1.setSenha("12345");
		Usuario u2 = new Usuario();
		u2.setLogin("nairana");
		u2.setSenha("12345");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
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

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario u : listaUsuarios) {
			if (u.ehIgual(login, senha)) {
				return u;
			}
		}
		return null;
	}
}
