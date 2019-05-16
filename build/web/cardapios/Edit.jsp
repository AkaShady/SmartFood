
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

    <%@page import="servlet.cardapios.UpdateCardapioServlet,model.Cardapios, java.util.*"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

    <%
        String id = request.getParameter("id");
        Cardapios obj = new Cardapios();
        obj.setId(Integer.parseInt(id));

    %>

    <form action="../UpdateCardapioServlet" method="GET">
        <div class="form-group">
            <label for="id">id</label>
            <input type="text" value="<%=id%>" name="id" class="input-sm form-control" required>
        </div>

        <div class="form-group">
            <label for="nome">Nome</label>
            <input type="text" name="nome" class="input-sm form-control" required>
        </div>

        <div class="form-group">
            <label for="preco">Pre�o</label>
            <input type="text" name="preco"  class="input-sm form-control" required>
        </div>
        
        <div class="text-right">
            <input type="submit" value="Salvar" class="btn btn-sucess">
        </div>
    </form>

</main>
<jsp:include page="../layout/footer.html"></jsp:include>       