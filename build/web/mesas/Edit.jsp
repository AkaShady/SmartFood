<jsp:include page="../layout/head.html"></jsp:include>  
    <main role="main" class="container">

        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Editar Mesas</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
                <div class="btn-group mr-2">
                    <a class="btn btn-sm btn-outline-secondary" href="List.jsp">Voltar <span data-feather="arrow-left"></span></a>
                </div>
            </div>
        </div>

    <%@page import="servlets.mesas.UpdateMesaServlet,model.Mesas, java.util.*"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

    <%
        String id = request.getParameter("id");
        Mesas obj = new Mesas();
        obj.setId(Integer.parseInt(id));

    %>

    <form action="../UpdateMesaServlet" method="GET">
        <div class="form-group">
            <label for="id">id</label>
            <input type="text" value="<%=id%>" name="id" class="input-sm form-control" required>
        </div>

        <div class="form-group">
            <label for="disponibilidade">Disponibilidade</label>
            <select name="disponibilidade" class="form-control" required>
                <option value="1">Sim</option>
                <option value="0">Nao</option>
            </select>
        </div>

        <div class="form-group">
            <label for="lugares">Número de lugares</label>
            <input type="number" name="lugares"  class="input-sm form-control" required>
        </div>

        <div class="text-right">
            <input type="submit" value="Salvar" class="btn btn-sucess">
        </div>
    </form>

</main>
<jsp:include page="../layout/footer.html"></jsp:include>       