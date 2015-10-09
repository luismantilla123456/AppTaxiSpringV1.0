
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
    <title>AppTaxi>Login </title>

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
          <div class="col-md-9 col-sm-9">
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
                <div class="row">
                    <div class="col-lg-6">
                        
                        <form action="LoginUsuarioTP.html" method="POST">
                            <div class="form-group">
                                <label>Telefono</label>
                                <input name="telefono" type="text" class="form-control" placeholder="94818755" pattern="^[1|2|3|4|5|6|7|8|9|0]\d{8}$" title="Se necesita un telefono" required>
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input name="password" type="password" class="form-control" placeholder="*********" required>
                            </div>
                            <button type="submit" class="btn btn-default">Iniciar</button>
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
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/css/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/customScripts.js"></script>
    <script type="text/javascript"> 
    </script>
  </body>
</html>
