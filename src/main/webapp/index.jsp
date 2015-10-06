<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  response.sendRedirect("http://localhost:8080/AppTaxi/index.html");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="author" content="webthemez"> 

    <!-- Title -->
    <title>AppTaxi</title>

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
        <li><a class="tooltip-side-nav" href="#to-top" title="" data-original-title="Services" data-placement="left"></a></li>
        <li><a class="tooltip-side-nav" href="#section-0" title="" data-original-title="Services" data-placement="left"></a></li>
        <li><a class="tooltip-side-nav" href="#section-1" title="" data-original-title="Back" data-placement="left"></a></li>
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
                <p>Somos una Empresa de Servicio de Taxi Remisse ejecutivo, nos caracterizamos por la puntualidad, responsabilidad y el compromiso con cada uno de nuestros clientes para brindarles un servicio de primer nivel.</p>
                <a href="nuevoUsuario.html" class="button"> Soy nuevo </a>
                <a href="login.html" class="button"> Login </a>
            </div>
          </div>
          <div class="col-md-5 col-sm-5">
          </div> <!-- /.col-md-5 -->
        </div> <!-- /.row -->
      </div> <!-- /.container -->
    </header> <!-- /.mainBanner -->
    <hr/>
    <section class="highlights" id="section-0">
      <div class="container">
          <div class="row">
                <h4>NOSOTROS</h4>
                <p>AppTaxi es la marca registrada de Door to Door Logistics SAC,
                    una empresa peruana que surge con el propósito de brindar una experiencia satisfactoria
                    en el transporte de pasajeros.
                    basándonos en tres pilares: Seguridad, Puntualidad y Confianza.
                </p>
          </div>
        <div class="row">
          <div class="col-md-4 highlightsCol">
            
            <h4>SEGURIDAD</h4>
            <p>Basándonos en una constante renovación de flota y
                excelentes conductores profesionales con gran experiencia 
                en el transporte de pasajeros.</p>
          </div> 
          <div class="col-md-4 highlightsCol">
           
            <h4>PUNTUALIDAD</h4>
            <p>Después de solicitado el servicio a nuestra pagina web, 
                usted tendrá un taxi a su disposición en un 
                promedio de 30 minutos.</p>
          </div> 
          <div class="col-md-4 highlightsCol">
            
            <h4>CONFIANZA</h4>
            <p>AppTaxi se lanza al mercado este año,
                trabajando para las principales empresas del Perú
                y una amplia cartera de clientes particulares.</p>
          </div> 
        </div> 
      </div> 
    </section> <!-- /.highlights -->
    <hr/>
    <section class="highlights" id="section-1">
      <div class="container">
            <div class="row">
                <h4>SERVICIOS</h4>
                <p>Todos nuestros choferes pasan por un proceso riguroso 
                    de selección antes de ser contratado; a su vez, 
                    todas nuestras unidades sin exepción cuentan con 
                    dispositivos de seguridad como; laminas de seguridad y 
                    dispositivos de GPS. Adicionalmente capacitamos a nuestros 
                    choferes en seguridad vial y de transito. 
                </p>
            </div>
        <div class="row">
            <div class="col-md-4 highlightsCol">
                <figure>
                    <img class="highlightsImg" src="images/slider_persona.png" alt="">
                </figure>
                <h4>RESERVA</h4>
                <p>Ahora puedes pedir tu taxi desde esta plataforma.</p>
                
                
                
            </div> 
            <div class="col-md-4 highlightsCol">
                <figure>
                    <img class="highlightsImg" src="images/us_servicios.png" alt="">
                </figure>
                <h4>PEDIDO</h4>
                <p>Ahora puedes pedir tu taxi desde esta plataforma.</p>
                
                
                
            </div> 
            <div class="col-md-4 highlightsCol">
                <figure>
                    <img class="highlightsImg" src="images/us_reclamos.png" alt="">
                </figure>
                <h4>RECLAMO</h4>
                <p>Ahora puedes pedir tu taxi desde esta plataforma.</p>
                
                
                
            </div>   
            <div class="col-md-4 highlightsCol">
                <figure>
                    <img class="highlightsImg" src="images/us_reclamos.png" alt="">
                </figure>
                <h4>COMUNIQUEMONOS</h4>
                <p>Teléfonos</p>
                <p>Central: (01) 289-6877</p>
                <p>Nextel: 422*2545</p>
                <p>RPM: #111500</p>
                <p>RPC: 989-111-791</p>
                <p>Movistar: 988-344-819</p>
                <p>Email</p>
                <p>info@apptaxi.com</p>
            </div>   
        </div> 
      </div> 
    </section> <!-- /.highlights -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/customScripts.js"></script>
    <script type="text/javascript"> 
    </script>
  </body>
</html>
