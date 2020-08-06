<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    import="java.sql.SQLException"
    import="java.util.ArrayList"
    import="java.util.List"
    import="dao.ClienteDao"
    import="model.Cliente"
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Cliente</title>
</head>
<body>
    <h1>Listagem de Clientes</h1>
    <%
        try {
            ClienteDao dao = new ClienteDao();
            List<Client> listagemClientes = dao.list();
        } catch (SQLException e) {
            out.println("<p>Erro " + e.getMessage() + "</p>");   
        }
    %>
    <table>
        <tbody>
            <% for (Client client : listagemClientes) { %>
                <tr>
                    <td><% client.getId() %></td>
                    <td><% client.getName() %></td>
                    <td><% client.getAddress() %></td>
                    <td><% client.getPhone() %></td>
                    <td><% client.getCEP() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>