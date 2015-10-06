
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
    <title>AppTaxi>Pedido </title>

    <!-- CSS -->
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
	<link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet">
    <!-- Favicons -->
    <link href="images/favicon/favicon.png" rel="shortcut icon">
    <script src="js/modernizr-2.7.1.min.js"></script>
    <script src="js/jquery-2.1.0.min.js"></script>
    
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
          <div class="col-md-9 col-sm-9">
            <div class="row">
                <div class="col-md-6">
                    <figure>
                        <a href="./index.html">
                        <img class="img-logo" src="images/logo1.png" alt="">
                        </a>
                    </figure> 
                </div>
                <div class="col-md-6">
                    <figure>
                        <img class="img-logo-user" src="images/slider_persona.png" alt="">
                    </figure> 
                    <p>${usuario}</p>
                </div>
            </div>
            <div class="buttons-wrapper">
                <div class="row">
                    <div class="col-lg-6">
                        <form action="registrarPedido.html" method="GET">
                            <div class="form-group">
                                <label>Nombre</label>
                                <input name="nombre" class="form-control" placeholder="juan" value="${nombre}" required>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input name="email" class="form-control" type="email" placeholder="juan1421@mimail.com" value="${email}" required>
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                <input name="telefono" class="form-control" pattern="^[1|2|3|4|5|6|7|8|9|0]\d{8}$" placeholder="94818755" value="${telefono}" required>
                            </div>
                            <div class="form-group">
                                <label>Direccion</label>
                                <input name="direccion" class="form-control" placeholder="Las flores de San Fernando 123" value="${direccion}" required>
                            </div>
                            <div class="form-group">
                                <label>Numero unidades</label>
                                <input name="numeroUnidades" class="form-control" pattern="^[1|2|3|4|5|6|7|8|9|0]$" value="1" required>
                            </div>
                            <div class="form-group">
                                <label>Fecha</label>
                                <input name="fecha" type="date" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Otros</label>
                                <input name="anotaciones" class="form-control" placeholder="Hora?, preguntar por ?, referencias?">
                            </div>
                            <button type="submit" class="btn btn-default">Pedir</button>
                        </form>
                    </div>
                </div>
            </div>
          </div>
          <div class="col-md-5 col-sm-5">
          </div> <!-- /.col-md-5 -->
        </div> <!-- /.row -->
      </div> <!-- /.container -->
    </header> <!-- /.mainBanner -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/customScripts.js"></script>
    <script type="text/javascript"> 
    </script>
  </body>
</html>
