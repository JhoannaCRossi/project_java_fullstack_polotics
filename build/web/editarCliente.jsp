
<%@page import="Logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
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
<%         response.setHeader("Cache-Control","no-store");       
           response.setDateHeader("Expires",0);       
           response.setHeader("Pragma","no-cache");

            HttpSession misession = request.getSession();
            //comprobar si existe usuario que haya iniciado session
            String usua = (String) request.getSession().getAttribute("usuario");
            if(usua == null){
                response.sendRedirect("sinLogin.jsp");
            }else{
                Controladora controladora = new Controladora();
                misession.setAttribute("controladora",controladora);
            }
        %>

        <!-- Sidenav -->
        <nav class="sidenav navbar navbar-vertical  fixed-left  navbar-expand-xs navbar-light bg-white" id="sidenav-main">
            <div class="scrollbar-inner">
                <!-- Brand -->
                <div class="sidenav-header  align-items-center">
                    <a class="navbar-brand" href="index.jsp">
                        <img src="assets/img/brand/images.png" alt="...">
                    </a>
                </div>

                <div class="navbar-inner">
                    <!-- Collapse -->
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <!-- Nav items -->
                        <ul class="navbar-nav">

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

                                    <a href="listaCliente.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                    <a href="nuevaEntrada.jsp" class="dropdown-item">
                                        <i class="fas fa-user-plus"></i>
                                        <span>Alta</span>
                                    </a>
                                    <a href="listaEntrada.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                    <a href="nuevoUsuario.jsp" class="dropdown-item">
                                        <i class="fas fa-user-plus"></i>
                                        <span>Alta</span>
                                    </a>
                                   
                                    <a href="listaUsuario.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                    <a href="nuevoEmpleado.jsp" class="dropdown-item">
                                        <i class="fas fa-user-plus"></i>
                                        <span>Alta</span>
                                    </a>
                                    <a href="listaEmpleado.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                    <a href="nuevoJuego.jsp" class="dropdown-item">
                                        <i class="fas fa-user-plus"></i>
                                        <span>Alta</span>
                                    </a>
                                    <a href="listaJuego.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                    <a href="nuevoHorario.jsp" class="dropdown-item">
                                        <i class="fas fa-user-plus"></i>
                                        <span>Alta</span>
                                    </a>
                                    <a href="listaHorario.jsp" class="dropdown-item">
                                        <i class="fas fa-users-cog"></i>
                                        <span>Lista</span>
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
                                            <span class="mb-0 text-sm  font-weight-bold"><%=request.getSession().getAttribute("usuario")%></span>
                                        </div>
                                    </div>
                                </a>
                                <div class="dropdown-menu  dropdown-menu-right ">
                                    <div class="dropdown-header noti-title">
                                        <h6 class="text-overflow m-0">Bienvenid@!</h6>
                                    </div>

                                    <div class="dropdown-divider"></div>
                                    <a href="outLogin.jsp" class="dropdown-item">
                                        <i class="ni ni-user-run"></i>
                                        <span>Logout</span>
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <div class="container-fluid mt-2 mb-4">
                <h3>Editar Cliente</h3>
                <%  Cliente cli = (Cliente) request.getSession().getAttribute("cliente");

                    // String idRecibido = request.getParameter("id");
                    // int id = Integer.parseInt(idRecibido);
                    // Controladora controladora = new Controladora();
                    // Cliente cli = controladora.buscarCliente(id);
%>
                <form action="ServletEditarCliente" method="POST" class="row g-3">
                    <div class="col-md-2">
                        <label for="inputId" class="form-label">ID</label>
                        <input type="text" name="inputId" class="form-control" id="inputId" readonly value="<%=cli.getIdCliente()%>">
                    </div>

                    <div class="col-md-2">
                        <label for="inputDNI" class="form-label">DNI</label>
                        <input type="text" name="inputDNI" class="form-control" id="inputDNI" value="<%=cli.getDni()%>">
                    </div>
                    <div class="col-md-8">

                    </div>
                    <div class="col-md-6">
                        <label for="inputNombre" class="form-label">Nombre</label>
                        <input type="text" name="inputNombre" class="form-control" id="inputNombre" value="<%=cli.getNombre()%>">
                    </div>
                    <div class="col-md-6">
                        <label for="inputApellido" class="form-label">Apellido</label>
                        <input type="text" name="inputApellido" class="form-control" id="inputApellido" value="<%=cli.getApellido()%>">
                    </div>
                    <div class="col-md-6">
                        <label for="inputDirección" class="form-label">Dirección</label>
                        <input type="text" name="inputDireccion" class="form-control" id="inputDirección" value="<%=cli.getDireccion()%>">
                    </div>
                    <div class="col-md-6">
                        <label for="inputTelefono" class="form-label">Teléfono</label>
                        <input type="text" name="inputTelefono" class="form-control" id="inputTelefono" value="<%=cli.getTelefono()%>">
                    </div>


                    <div class="col-12 mt-3 text-lg-right">
                        <button type="submit" class="btn btn-primary">Editar</button>
                    </div>
                </form>


            </div>
        </div>
        <!-- Footer -->
        <footer class="stycky-footer bg-white" style="position: fixed; bottom: 0; width: 100%;">
            <div class="container my-auto">
                <div class="col-lg-12">
                    <div class="copyright text-center text-lg-center  my-auto text-muted">
                        <p>   &copy; 2021 <a href="" class="font-weight-bold ml-1" target="_blank">Jhoanna C. Rossi</a> </p>
                    </div>
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
