<jsp:include page="../layout/head.html"></jsp:include>
    <main role="main" class="container">

        <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
            <h1 class="h2">Cadastrar Pedidos</h1>
            <div class="btn-toolbar mb-2 mb-md-0">
                <div class="btn-group mr-2">
                    <a class="btn btn-sm btn-outline-secondary" href="List.jsp">Voltar <span data-feather="arrow-left"></span></a>
                </div>
            </div>
        </div>

        <form action="../CreatePedidoServlet" method="GET">
            <div class="form-group">
                <label for="cardapio">Card�pio</label>
                <input type="text" name="cardapio" class="input-sm form-control" required>
            </div>

            <div class="form-group">
                <label for="usuario">Usu�rio</label>
                <input type="text" name="usuario"  class="input-sm form-control" required>
            </div>
            
            <div class="form-group">
                <label for="mesa">Mesa</label>
                <input type="text" name="mesa"  class="input-sm form-control" required>
            </div>
            
            <div class="form-group">
                <label for="cliente">Cliente</label>
                <input type="text" name="cliente"  class="input-sm form-control" required>
            </div>
            
            <div class="form-group">
                <label for="funcionario">Funcion�rio</label>
                <input type="text" name="funcionario"  class="input-sm form-control" required>
            </div>

            <div class="text-right">
                <input type="submit" value="Salvar" class="btn btn-sucess">
            </div>
        </form>



    </main>
<jsp:include page="../layout/footer.html"></jsp:include>