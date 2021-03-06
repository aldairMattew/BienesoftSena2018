<%-- 
    Document   : seguridad
    Created on : Sep 23, 2018, 3:33:41 PM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
            <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Home Seguridad</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            <!--estilo del panel mensaje--> 
            <link type="text/css" rel="stylesheet" href="css/panel_mensaje.css"  media="screen,projection"/>
            
            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/login.css" media="screen,projection"/>
            
            <!--estilo cards menu-->
            <link type="text/css" rel="stylesheet" href="css/cards.css" media="screen,projection"/>
            
            <!--estilo footer---->
            <link type="text/css" rel="stylesheet" href="css/footer.css" media="screen,projection"/>
            
 
            <!--estilo materialize.css-->
            <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    
            
            <!--importando--->
            <script src="js/jquery.js"></script>
    </head>
    
    
    <body>
        
        
        
         <!--*******************************OBJETO NAV RESPONSIVE***************************-->
        
        <!--nav principal--->
        
        <nav class="nav-wrapper" id="nav_principal">
            <div class="container">

                <a id="logo_encab"  href="#" class="brand-logo hide-on-small-only black-text">Biene-Soft</a>
                
                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <i>
                        <img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" />
                    </i>
                    
                        <ul class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
            </div>  
        </nav> 
        
        <!--menu response-->
        
        <ul class="sidenav" id="menu-responsive">
                    
            <li><a href="#">Solicitar permiso</a></li>
      
        </ul>
        
        <!--------------------------------------------------->

        <!--**************************************************************************************************-->
        
        <!--MODULO INFORMACION USUARIO-->


        <label id="user_text" class="user_text hide-on-small-only">Seguridad</label> 
            
          <!--*********************************************************-->
          
          <!--PANEL MENSAJE------------------->
          
          <div class="container">
              <div class="panel-msg l12 m12 m12" >
                  <p class="msg-text">Informacion sobre los permisos</p>
              </div>
          </div>
          
          <!----------------------------------------------------------------------------------------->
          
          <!--MENU MAS + ---------------------------->
          
          <div class="">
              
          </div>
          
          <!----------------------------------------------------------------------------------------->
       
        <!--*****************************CARDS MENU************************************-->

        <div class="container">
                <div class="row">
                    <div class="col s12 m12 l12">
                        <div class="card small">
                            <div class="card-image">
                                <img src="imagenes/man.png">
                            </div>

                            <div class="card-content">
                                <p>Permiso</p>
                            </div>
                            
                            <div class="card-action center">
                                <a href="#" class="center blue-text">Solicitar</a>
                            </div>
                        </div>
                    </div>
   
                </div>

            </div>        
        <!--**************************************************************************************************-->
        
        <!--***************FOOTER*********************-->
        <footer class="page-footer" id="footer_form">

                    <div class="container white-text center">
                    © 2018 Biene-Soft
                    <br>
                    Todos los derechos reservados
                    </div>
                    
        </footer>
        <!------------------------------------------------------------------------------------------------------>
        
        <!--importando funciones para los objetos-->    
            <script>
                document.addEventListener('DOMContentLoaded', function() {
                    M.AutoInit();
                });
            </script>  
        
            <!--JavaScript at end of body for optimized loading-->
            <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

        
    </body>
</html>

