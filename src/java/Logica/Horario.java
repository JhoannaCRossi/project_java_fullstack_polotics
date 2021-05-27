
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    int idHorario;
    
    @Basic
    String horarioApertura;
    String horarioCierre;

    public Horario() {
    }

    public Horario(int idHorario, String horarioApertura, String horarioCierre) {
        this.idHorario = idHorario;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }
    
    
}

