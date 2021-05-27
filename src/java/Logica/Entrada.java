
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
public class Entrada implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idEntrada;
    
    @Temporal(TemporalType.DATE)
    Date fecha;
    
    @Basic
    String observacion;
    
    @OneToOne
    Juego unJuego;
    
    
        
    public Entrada() {
    }

    public Entrada(int idEntrada, Date fecha, String observacion, Juego unJuego) {
        this.idEntrada = idEntrada;
        this.fecha = fecha;
        this.observacion = observacion;
        this.unJuego = unJuego;
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

