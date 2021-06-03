<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="Logica.Controladora"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="Start your development with a Dashboard for Bootstrap 4.">
  <title>Parque de Diversiones</title>
  <!-- Favicon -->
  <link rel="icon" href="../assets/img/brand/favicon.png" type="image/png">
  <!-- Fonts -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
  <!-- Icons -->
  <link rel="stylesheet" href="../assets/vendor/nucleo/css/nucleo.css" type="text/css">
  <link rel="stylesheet" href="../assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
  <!-- Argon CSS -->
  <link rel="stylesheet" href="../assets/css/argon.css?v=1.2.0" type="text/css">
</head>

<body class="bg-default">             
    <%  
          response.setHeader("Cache-Control","no-store");       
          response.setDateHeader("Expires",0);       
          response.setHeader("Pragma","no-cache");
          Controladora controladora = new Controladora(); 
    %>
  <!-- Navbar -->
  <nav id="navbar-main" class="navbar navbar-horizontal navbar-transparent navbar-main navbar-expand-lg navbar-light">
    <div class="container">
      
      <div class="navbar-collapse navbar-custom-collapse collapse" id="navbar-collapse">

        <ul class="navbar-nav align-items-lg-center ml-lg-auto">
          <li class="nav-item">
            <a class="nav-link nav-link-icon" href="https://github.com/JhoannaCRossi" target="_blank" data-toggle="tooltip" >
              <i class="fab fa-github fa-2x"></i>
              <span class="nav-link-inner--text d-lg-none">Github</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- Main content -->
  <div class="main-content">
    <!-- Header -->
    <div class="header bg-gradient-primary py-7 py-lg-7 pt-lg-2">
      <div class="container">
        <div class="header-body text-center mb-3">
          <div class="row justify-content-center">
            <div class="col-xl-5 col-lg-6 col-md-8 px-2">
              <h1 class="text-white">Bienvenid@!</h1>
                <div class="row">
                   <div class="col-xl-12 col-md-12 col-xs-12">
                       <div class="card card-stats">     
                           <img src="/assets/img/theme/index.jpg" alt="index" style="background-size: cover;">
                       </div>
                   </div>
               </div>
            </div>
          </div>
        </div>
      </div>
      <div class="separator separator-bottom separator-skew zindex-100">
        <svg x="0" y="0" viewBox="0 0 2560 100" preserveAspectRatio="none" version="1.1" xmlns="http://www.w3.org/2000/svg">
          <polygon class="fill-default" points="2560 0 2560 100 0 100"></polygon>
        </svg>
      </div>
    </div>
    <!-- Page content -->
    <div class="container mt--8 pb-5">
      <div class="row justify-content-center">
        <div class="col-lg-5 col-md-7">
          <div class="card bg-secondary border-0 mb-0">
            
            <div class="card-body px-lg-5 py-lg-5">
              <div class="text-center text-muted mb-4">
                <p>Ingresa con tus credenciales</p>
                
              </div>
              <form role="form" action="ServletLogin" method="POST">
                <div class="form-group mb-3">
                  <div class="input-group input-group-merge input-group-alternative">
                    <div class="input-group-prepend">
                      <span class="input-group-text"><i class="ni ni-email-83"></i></span>
                    </div>
                    <input class="form-control" name="usuario" placeholder="Email" type="email" placeholder="email@abc.com">
                  </div>
                </div>
                <div class="form-group">
                  <div class="input-group input-group-merge input-group-alternative">
                    <div class="input-group-prepend">
                      <span class="input-group-text"><i class="ni ni-lock-circle-open"></i></span>
                    </div>
                    <input class="form-control" placeholder="Contraseña" name="contrasenia" type="password">
                  </div>
                </div>
               
                <div class="text-center">
                  <button type="submit" class="btn btn-primary my-2">Ingresa</button>
                </div>
              </form>
            </div>
          </div>
         
        </div>
      </div>
    </div>
  </div>
  <!-- Footer -->
  <footer class="stycky-footer bg-white" style="position: fixed; bottom: 0; width: 100%;">
    <div class="container my-auto">
        <div class="col-lg-12">
            <div class="copyright text-center text-lg-center  my-auto text-muted">
                <p>   &copy; 2021 <a href="https://github.com/JhoannaCRossi" class="font-weight-bold ml-1" target="_blank">Jhoanna C. Rossi</a> </p>
            </div>
        </div>
    </div>
  </footer>
  <!-- Argon Scripts -->
  <!-- Core -->
  <script src="../assets/vendor/jquery/dist/jquery.min.js"></script>
  <script src="../assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="../assets/vendor/js-cookie/js.cookie.js"></script>
  <script src="../assets/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
  <script src="../assets/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>
  <!-- Argon JS -->
  <script src="../assets/js/argon.js?v=1.2.0"></script>
</body>

</html>