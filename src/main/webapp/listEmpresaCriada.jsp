<%@ page import="java.util.List,br.com.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
	Lista de Empresas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">edita</a>
			<a href="/gerenciador/entrada?acao=RemovaEmpresa&id=${empresa.id}">remove</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>

