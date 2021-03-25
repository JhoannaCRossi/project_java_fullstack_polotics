
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="Start your development with a Dashboard for Bootstrap 4.">
  <meta name="author" content="Creative Tim">
  <title>Parque de Atracciones</title>
  <!-- Favicon -->

  <link rel="icon" type="image/png" sizes="32x32" href="assets/img/brand/favicon-32x32.png">
  <!-- Fonts -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
  <!-- Icons -->
  <link rel="stylesheet" href="assets/vendor/nucleo/css/nucleo.css" type="text/css">
  <link rel="stylesheet" href="assets/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
  <!-- Page plugins -->
  <!-- Argon CSS -->
  <link rel="stylesheet" href="assets/css/argon.css?v=1.2.0" type="text/css">
</head>

<body>
  <!-- Sidenav -->
  <nav class="sidenav navbar navbar-vertical  fixed-left  navbar-expand-xs navbar-light bg-white" id="sidenav-main">
    <div class="scrollbar-inner">
      <!-- Brand -->
      <div class="sidenav-header  align-items-center">
        <a class="navbar-brand" href="javascript:void(0)">
            <img src="assets/img/brand/images.png" alt="...">
        </a>
      </div>

      <div class="navbar-inner">
        <!-- Collapse -->
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <!-- Nav items -->
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" href="#">
                
                <span class="nav-link-text">Menú</span>
              </a>
            </li>
            
            <!--Clientes-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-users text-orange"></i>
                <span class="nav-link-text">Clientes</span>
              </a>
             
            <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Clientes:</h6>
                </div>
                <a href="nuevoCliente.jsp" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="listaCliente.jsp" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>
            </li>
            
            <!--Entradas-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-ticket-alt text-primary"></i>
                <span class="nav-link-text">Entradas</span>
              </a>
                
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Entradas:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>  
            </li>
            
            <!--Usuarios-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-circle text-yellow"></i>
                <span class="nav-link-text">Usuarios</span>
              </a>
 
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Usuarios:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>  
            </li>
            
            <!--Empleados-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-friends text-green"></i>
                <span class="nav-link-text">Empleados</span>
              </a>
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Empleados:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>
            </li>
            
            <!--Login-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="ni ni-key-25 text-info"></i>
                <span class="nav-link-text">Login</span>
              </a>
               
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Login:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>
            </li>
            
            <!--Juegos-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-rocket text-pink"></i>
                <span class="nav-link-text">Juegos</span>
              </a>
               
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Juegos:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>
            </li>
            
            <!--Horarios-->
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-stopwatch text-danger"></i>
                <span class="nav-link-text">Horarios de Juegos</span>
              </a>
               
               <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Modificación de Horarios:</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-plus"></i>
                  <span>Alta</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-user-times"></i>
                  <span>Baja</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="fas fa-users-cog"></i>
                  <span>Editar</span>
                </a>
                
              </div>
            </li>
          </ul>
          
          
        </div>
      </div>
    </div>
  </nav>
  <!-- Main content -->
  <div class="main-content" id="panel">
    <!-- Topnav -->
    <nav class="navbar navbar-top navbar-expand navbar-dark bg-primary border-bottom">
      <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          
          <!-- Navbar links -->
          <ul class="navbar-nav align-items-center  ml-md-auto ">
            <li class="nav-item d-xl-none">
              <!-- Sidenav toggler -->
              <div class="pr-3 sidenav-toggler sidenav-toggler-dark" data-action="sidenav-pin" data-target="#sidenav-main">
                <div class="sidenav-toggler-inner">
                  <i class="sidenav-toggler-line"></i>
                  <i class="sidenav-toggler-line"></i>
                  <i class="sidenav-toggler-line"></i>
                </div>
              </div>
            </li>
            <li class="nav-item d-sm-none">
              <a class="nav-link" href="#" data-action="search-show" data-target="#navbar-search-main">
                <i class="ni ni-zoom-split-in"></i>
              </a>
            </li>
            <li class="nav-item dropdown">
              
            </li>
            <li class="nav-item dropdown">
             
            </li>
          </ul>
          <ul class="navbar-nav align-items-center  ml-auto ml-md-0 ">
            <li class="nav-item dropdown">
              <a class="nav-link pr-0" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <div class="media align-items-center">
                  <span class="avatar avatar-sm rounded-circle">
                    <img alt="Image placeholder" src="assets/img/theme/team-4.jpg">
                  </span>
                  <div class="media-body  ml-2  d-none d-lg-block">
                    <span class="mb-0 text-sm  font-weight-bold">John Snow</span>
                  </div>
                </div>
              </a>
              <div class="dropdown-menu  dropdown-menu-right ">
                <div class="dropdown-header noti-title">
                  <h6 class="text-overflow m-0">Bienvenid@!</h6>
                </div>
                <a href="#!" class="dropdown-item">
                  <i class="ni ni-single-02"></i>
                  <span>My profile</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="ni ni-settings-gear-65"></i>
                  <span>Settings</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="ni ni-calendar-grid-58"></i>
                  <span>Activity</span>
                </a>
                <a href="#!" class="dropdown-item">
                  <i class="ni ni-support-16"></i>
                  <span>Support</span>
                </a>
                <div class="dropdown-divider"></div>
                <a href="#!" class="dropdown-item">
                  <i class="ni ni-user-run"></i>
                  <span>Logout</span>
                </a>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- Header -->
    <!-- Header -->
    <div class="header bg-primary pb-6">
      <div class="container-fluid">
        <div class="header-body">
          <div class="row align-items-center py-4">
            <div class="col-lg-6 col-7">
              <!--agrega aqui el buscador JHOA-->
            </div>
            <div class="col-lg-6 col-5 text-right">
             
            </div>
          </div>
          <!-- Card stats -->
            
        </div>
      </div>
    </div>
    <!-- Page content -->
    <div class="container-fluid mt-6">
      <div class="row">
        <div class="col-xl-8">
          <div class="card bg-default">
           
          </div>
        </div>
        <div class="col-xl-4">
          <div class="card">
            
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xl-8">
          <div class="card">
            
            
          </div>
        </div>
        <div class="col-xl-4">
          <div class="card">
            
            
          </div>
        </div>
      </div>
      <!-- Footer -->
      <footer class="footer pt-0">
        <div class="row align-items-center justify-content-lg-between">
          <div class="col-lg-6">
            <div class="copyright text-center  text-lg-left  text-muted">
              &copy; 2021 <a href="" class="font-weight-bold ml-1" target="_blank">Jhoanna C. Rossi</a>
            </div>
          </div>
          <div class="col-lg-6">
            <ul class="nav nav-footer justify-content-center justify-content-lg-end">
              <li class="nav-item">
                <a href="https://www.creative-tim.com" class="nav-link" target="_blank">Creative Tim</a>
              </li>
              <li class="nav-item">
                <a href="https://www.creative-tim.com/presentation" class="nav-link" target="_blank">About Us</a>
              </li>
              <li class="nav-item">
                <a href="http://blog.creative-tim.com" class="nav-link" target="_blank">Blog</a>
              </li>
              <li class="nav-item">
                <a href="https://github.com/creativetimofficial/argon-dashboard/blob/master/LICENSE.md" class="nav-link" target="_blank">MIT License</a>
              </li>
            </ul>
          </div>
        </div>
      </footer>
    </div>
  </div>
  <!-- Argon Scripts -->
  <!-- Core -->
  <script src="assets/vendor/jquery/dist/jquery.min.js"></script>
  <script src="assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/js-cookie/js.cookie.js"></script>
  <script src="assets/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
  <script src="assets/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>
  <!-- Optional JS -->
  <script src="assets/vendor/chart.js/dist/Chart.min.js"></script>
  <script src="assets/vendor/chart.js/dist/Chart.extension.js"></script>
  <!-- Argon JS -->
  <script src="assets/js/argon.js?v=1.2.0"></script>
</body>

</html>

