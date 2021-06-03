
package Logica;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idJuego;
    
    @Basic
    String nombre;
    
    @OneToOne
    Horario unHorario;
    
    @OneToMany
    List<Empleado> listaEmpleados;
    
    public Juego() {
    }

    public Juego(int idJuego, String nombre, Horario unHorario, List<Empleado> listaEmpleados) {
        this.idJuego = idJuego;
        this.nombre = nombre;
        this.unHorario = unHorario;
        this.listaEmpleados = listaEmpleados;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }



  

   
    
    
}

