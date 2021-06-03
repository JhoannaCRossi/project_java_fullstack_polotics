
package Logica;

import Persistencia.ControladoraPersistencia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    //pedido a la persistencia la lista de usuarios
    public List<Usuario> getListaUsuarios(){
        return (this.controlPer.getUsuarios());
    }
    
    
    public void crearHorario(String horarioApertura, String horarioCierre) {
        Horario horario = new Horario();
        horario.setHorarioApertura(horarioApertura);
        horario.setHorarioCierre(horarioCierre);
        controlPer.crearHorario(horario);
    }
    //pedido a la persistencia la lista de horarios
    public List<Horario> getListaHorarios(){
        return (this.controlPer.getHorarios());
    }
    public void editarHorario(Horario horario) {
        controlPer.editarHorario(horario);
    }
    public void borrarHorario(int id) {
        controlPer.eliminarHorario(id);
    }
    public Horario buscarHorario(int id) {
        Horario horario = controlPer.buscarHorario(id);
        return horario;
    }

    
    public void crearEmpleado(Usuario usuario, String dniEmple, String nombreEmple, String apellidoEmple, String direccionEmple, String telefonoEmple) {
        Empleado empleado = new Empleado();
        empleado.setUnUsuario(usuario);
        empleado.setDni(dniEmple);
        empleado.setNombre(nombreEmple);
        empleado.setApellido(apellidoEmple);
        empleado.setDireccion(direccionEmple);
        empleado.setTelefono(telefonoEmple);
        controlPer.crearEmpleado(empleado);
    }
    //pedido a la persistencia la lista de empleados
    public List<Empleado> getListaEmpleados(){
        return (this.controlPer.getEmpleados());
    }
    public void borrarEmpleado(int id) {
        controlPer.eliminarEmpleado(id);
    }
    public Empleado buscarEmpleado(int id) {
        Empleado empleado = controlPer.buscarEmpleado(id);
        return empleado;
    }
     public void editarEmpleado(Empleado empleado) {
        controlPer.editarEmpleado(empleado);
    }

     
    public void crearJuego(String nombreJuego, String idHorario, String idEmpleado) {
        Juego juego = new Juego();
        
        Horario horario = buscarHorario(Integer.parseInt(idHorario));
        Empleado empleado = buscarEmpleado(Integer.parseInt(idEmpleado));
        
        List<Empleado> listaEmpleados = getListaEmpleados();
        listaEmpleados.add(empleado);
        
        juego.setNombre(nombreJuego);
        juego.setUnHorario(horario);
        juego.setListaEmpleados(listaEmpleados);
        
        controlPer.crearJuego(juego);
    }
    //pedido a la persistencia la lista de empleados
    public List<Juego> getListaJuegos(){
        return (this.controlPer.getJuegos());
    }
    public void borrarJuego(int id) {
        controlPer.eliminarJuego(id);
    }
    public Juego buscarJuego(int id) {
        Juego juego = controlPer.buscarJuego(id);
        return juego;
    }
    public void editarJuego(Juego juego) {
        controlPer.editarJuego(juego);
    }

    public void crearEntrada(Date fecha, String hora, String observacion, Juego juegoEntrada, Cliente clienteEntrada) {
        Entrada entrada = new Entrada();
        
        entrada.setFecha(fecha);
        entrada.setHora(hora);
        entrada.setObservacion(observacion);
        entrada.setUnJuego(juegoEntrada);
        entrada.setCliente(clienteEntrada);
        
        controlPer.crearEntrada(entrada);
    }
    //pedido a la persistencia la lista de empleados
    public List<Entrada> getListaEntradas(){
        return (this.controlPer.getEntradas());
    }
    //pedido a la persistencia borrar entrada por id
    public void borrarEntrada(int id) {
        controlPer.eliminarEntrada(id);
    }
    //buscamos entrada por id
    public Entrada buscarEntrada(int id) {
        Entrada entrada = controlPer.buscarEntrada(id);
        return entrada;
    }
     public void editarEntrada(Entrada entrada) {
        controlPer.editarEntrada(entrada);
    }

    public boolean comprobarIngreso(String usua, String contra) {
        boolean estaONO = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPer.getUsuarios();
        
        for (Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usua) && usu.getContraseniaUsuario().equals(contra)){
                estaONO = true;
                return estaONO;
            }
        }
        return estaONO;
    }
   
    
}


