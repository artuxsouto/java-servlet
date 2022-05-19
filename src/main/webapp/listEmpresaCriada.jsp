<%@ page import="java.util.List, br.com.gerenciador.servlet.Empresa" %>
<html>
<body>
	Lista de Empresas: <br />
		<ul>
		<%
			List<Empresa> list = (List<Empresa>)request.getAttribute("empresas");
			for (Empresa empresa : list) {
		%>
			<li><%= empresa.getNome() %></li>
		<%
			}
		%>
</ul>
</body></html>

