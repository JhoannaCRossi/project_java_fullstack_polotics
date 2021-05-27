package Persistencia;

import Logica.Cliente;
import Logica.Entrada;
import Logica.Empleado;
import Logica.Juego;
import Logica.Usuario;
import Logica.Horario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    //inicializamos JpaControllers 
    EntradaJpaController entradaJPA = new EntradaJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    JuegoJpaController juegoJPA = new JuegoJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    HorarioJpaController horarioJPA = new HorarioJpaController();

    //ENTRADA
    //metodo para crear entrada
    public void crearEntrada(Entrada entrada) {
        try {
            entradaJPA.create(entrada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar entrada
    public void eliminarEntrada(int idEntrada) {
        try {
            entradaJPA.destroy(idEntrada);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar entrada
    public void editarEntrada(Entrada entrada) {
        try {
            entradaJPA.edit(entrada);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //CLIENTE
    //metodo para crear cliente
    public void crearCliente(Cliente cliente) {
        try {
            clienteJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar cliente
    public void eliminarCliente(int idCliente) {
        try {
            clienteJPA.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar cliente
    public void editarCliente(Cliente cliente) {
        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //lista de clientes
    public List<Cliente> getClientes(){
        return(clienteJPA.findClienteEntities());
    }
    
    public Cliente buscarCliente(int id){
        return(clienteJPA.findCliente(id));
    }

    //JUEGO
    //metodo para crear juego
    public void crearJuego(Juego juego) {
        try {
            juegoJPA.create(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar juego
    public void eliminarJuego(int idJuego) {
        try {
            juegoJPA.destroy(idJuego);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar juego
    public void editarJuego(Juego juego) {
        try {
            juegoJPA.edit(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //EMPLEADO
    //metodo para crear empleado
    public void crearEmpleado(Empleado empleado) {
        try {
            empleadoJPA.create(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar empleado
    public void eliminarEmpleado(int idEmpleado) {
        try {
            empleadoJPA.destroy(idEmpleado);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar empleado
    public void editarEmpleado(Empleado empleado) {
        try {
            empleadoJPA.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //USUARIO
    //metodo para crear empleado
    public void crearUsuario(Usuario usuario) {
        try {
            usuarioJPA.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar empleado
    public void eliminarUsuario(int idUsuario) {
        try {
            usuarioJPA.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar empleado
    public void editarUsuario(Usuario usuario) {
        try {
            usuarioJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //lista de usuarios
   public List<Usuario> getUsuarios(){
        return(usuarioJPA.findUsuarioEntities());
    }

   //metodo para editar usuario
    public Usuario buscarUsuario(int id){
        return(usuarioJPA.findUsuario(id));
    }
    
    //HORARIO
    //metodo para crear Horario
    public void crearHorario(Horario horario) {
        try {
            horarioJPA.create(horario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar Horario
    public void eliminarHorario(int idHorario) {
        try {
            horarioJPA.destroy(idHorario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar Horario
    public void editarHorario(Horario horario) {
        try {
            horarioJPA.edit(horario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
