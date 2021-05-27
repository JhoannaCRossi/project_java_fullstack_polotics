
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    //inicializamos persistencia
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
  
   

    public void crearCliente(String dni, String nombre, String apellido, String direccion, String telefono) {
        Cliente cliente = new Cliente();
        
        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        controlPer.crearCliente(cliente);
    }
    
    //pedido a la persistencia la lista de clientes
    public List<Cliente> getListaClientes(){
        return (this.controlPer.getClientes());
    }
    
    //pedido a la persistencia la lista de usuarios
    public List<Usuario> getListaUsuarios(){
        return (this.controlPer.getUsuarios());
    }
    
    public Cliente buscarCliente(int id){
        Cliente clie = controlPer.buscarCliente(id);
        return clie;
    }
    public void borrarCliente(int id) {
        controlPer.eliminarCliente(id);
    }

    public void editarCliente(Cliente cliente) {
        controlPer.editarCliente(cliente);
    }
    
   

    public void crearUsuario(String usuario, String contrasena) {
        Usuario usuari = new Usuario();
        usuari.setNombreUsuario(usuario);
        usuari.setContraseniaUsuario(contrasena);
        controlPer.crearUsuario(usuari);
    }
    public void borrarUsuario(int id) {
        controlPer.eliminarUsuario(id);
    }
    
    public Usuario buscarUsuario(int id){
        Usuario usu = controlPer.buscarUsuario(id);
        return usu;
    }

    public void editarUsuario(Usuario usuario) {
        controlPer.editarUsuario(usuario);
    }
}


