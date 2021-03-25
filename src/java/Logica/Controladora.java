
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    //inicializamos persistencia
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
    public void crearUsuario() {
        Usuario usua= new Usuario();
        
        usua.setNombreUsuario("jhoa1");
        usua.setContraseniaUsuario("123");
        
        controlPer.crearUsuario(usua);
        
    }
}

