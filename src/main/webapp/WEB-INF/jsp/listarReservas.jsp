<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="webthemez"> 

    <!-- Title -->
    <title>AppTaxi>Reservas</title>

    <!-- CSS -->
	<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/fonts/font-awesome/css/font-awesome.css" rel="stylesheet">
    <!-- Favicons -->
    <link href="${pageContext.request.contextPath}/images/favicon/favicon.png" rel="shortcut icon">
    <script src="${pageContext.request.contextPath}/js/modernizr-2.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    
  </head>
  <body class="index" id="to-top">

    <!-- Side nav -->
    <nav class="side-nav" role="navigation">

      <ul class="nav-side-nav">
        <li><a class="tooltip-side-nav" href="#section-0" title="" data-original-title="Services" data-placement="left"></a></li>
        <li><a class="tooltip-side-nav" href="#section-1" title="" data-original-title="Services" data-placement="left"></a></li>
        <li><a class="tooltip-side-nav" href="#to-top" title="" data-original-title="Back" data-placement="left"></a></li>
      </ul>
      
    </nav> <!-- /.side-nav -->

    <header class="mainBanner" role="banner">
      <div class="container">
        <div class="row">
          <div class="col-md-10 col-sm-10">
            <div class="row">
                <div class="col-md-6">
                    <figure>
                        <a href="./index.html">
                        <img class="img-logo" src="${pageContext.request.contextPath}/images/logo1.png" alt="">
                        </a>
                    </figure> 
                </div>
                <div class="col-md-6">
                    <figure>
                        <img class="img-logo-user" src="${pageContext.request.contextPath}/images/slider_persona.png" alt="">
                    </figure> 
                    <p>${usuario}</p>
                </div>
            </div>
            <div class="buttons-wrapper">
                
                <div class="col-lg-10">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Mis Pedidos
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Direccion </th>
                                            <th>Unidades  </th>
                                            <th>Fecha     </th>
                                            <th>Referencia</th>
                                            <td>Modificar</td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${lista}" var="fila">
                                            <tr>      
                                                <td>${fila.direccion}</td>
                                                <td>${fila.unidades}</td>
                                                <td>${fila.fecha}</td>
                                                <td>${fila.referencia}</td>
                                                <td>
                                                    <form action="modificarPedido.html" method="GET">
                                                        <input name="id" hidden="hidden" value="${fila.id}"/>
                                                        <input type="submit" value="Modificar"/>
                                                    </form>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
            </div>
          </div>
          <div class="col-md-5 col-sm-5">
          </div> <!-- /.col-md-5 -->
        </div> <!-- /.row -->
      </div> <!-- /.container -->
    </header> <!-- /.mainBanner -->
    
    
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/css/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/customScripts.js"></script>
    <script type="text/javascript"> 
    </script>
    <script>
        $(function() {
            
        });
    </script>
  </body>
</html>
