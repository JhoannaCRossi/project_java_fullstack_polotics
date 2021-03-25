
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente extends Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idCliente;
  

    public Cliente() {
    }

    public Cliente(int idCliente, String dni, String nombre, String apellido, String direccion, String telefono) {
        super(dni, nombre, apellido, direccion, telefono);
        this.idCliente = idCliente;
    }
    
     
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
