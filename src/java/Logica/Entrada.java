
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Entrada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEntrada;
    
    @Temporal(TemporalType.DATE)
    Date fecha;
   
    
    @Basic
    String observacion;
    String hora;
    
    
    @OneToOne
    Juego unJuego;
    
    @OneToOne
    Cliente cliente;
    
    
        
    public Entrada() {
    }

    public Entrada(int idEntrada, Date fecha, String observacion, String hora, Juego unJuego, Cliente cliente) {
        this.idEntrada = idEntrada;
        this.fecha = fecha;
        this.observacion = observacion;
        this.hora = hora;
        this.unJuego = unJuego;
        this.cliente = cliente;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

  
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Juego getUnJuego() {
        return unJuego;
    }

    public void setUnJuego(Juego unJuego) {
        this.unJuego = unJuego;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}

