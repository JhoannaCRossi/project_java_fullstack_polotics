
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado extends Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEmpleado;
    
   
    @OneToOne
    Usuario unUsuario;

    public Empleado() {
    }

    public Empleado(int idEmpleado, Usuario unUsuario, String dni, String nombre, String apellido, String direccion, String telefono) {
        super(dni, nombre, apellido, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.unUsuario = unUsuario;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
      public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    @Override
    public String getDireccion() {
        return direccion;
    }
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String getTelefono() {
        return telefono;
    }
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String getDni() {
        return dni;
    }
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

  
    
    
}
