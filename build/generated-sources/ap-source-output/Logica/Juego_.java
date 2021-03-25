package Logica;

import Logica.Empleado;
import Logica.Horario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-14T19:20:06")
@StaticMetamodel(Juego.class)
public class Juego_ { 

    public static volatile ListAttribute<Juego, Empleado> listaEmpleados;
    public static volatile SingularAttribute<Juego, Integer> idJuego;
    public static volatile SingularAttribute<Juego, String> nombre;
    public static volatile SingularAttribute<Juego, Horario> unHorario;

}