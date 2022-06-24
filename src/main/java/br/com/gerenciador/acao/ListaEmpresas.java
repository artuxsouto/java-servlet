package br.com.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class ListaEmpresas {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("listando empresas");
		
		Banco banco = new Banco();
		List<Empresa> list = banco.getEmpresas();

		request.setAttribute("empresas", list);
		
		return "forward:/listEmpresaCriada.jsp";
	}

}
