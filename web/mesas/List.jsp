<jsp:include page="../layout/head.html"></jsp:include>  
    <main role="main" class="container">
    
        <main role="main" class="container">

               <%@page import="DAO.FiliaisDAO,model.Filiais, java.util.*"%>  
               <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
                
            <%
                
                FiliaisDAO obj = new FiliaisDAO();
                List<Filiais> list = obj.read();
                request.setAttribute("list", list);
            %>  

            <div class="btn-group mr-2">
                <a href="Create.jsp" class="btn btn-sm btn-outline-primary">Novo <span data-feather="file-plus"></span></a>
            </div>
            <div >
                <table class="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>disponibilidade</th>
                            <th>lugares</th>
                            <th>#</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="u">  
                        <tr>
                            <td>${u.getId()}</td>
                            <td>${u.getDisponibilidade()}</td>
                            <td>${u.getLugares()}</td>
                            <td><a  class="btn btn-sm btn-warning" href="Edit.jsp?id=${u.getId()}">Editar</a></td>
                            <td><a  class="btn btn-sm btn-danger"  href="../DeleteFilialServlet?id=${u.getId()}">Excluir</a></td>
                        </tr>
                        </c:forEach>  
                    </tbody>
                </table>
            </div>

        </main>

        
    </main>
<jsp:include page="../layout/footer.html"></jsp:include>       
