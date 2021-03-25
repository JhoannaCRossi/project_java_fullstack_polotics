package Logica;

import Logica.Cliente;
import Logica.Juego;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-14T19:20:07")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Date> fecha;
    public static volatile SingularAttribute<Entrada, Cliente> unCliente;
    public static volatile SingularAttribute<Entrada, Integer> idEntrada;
    public static volatile SingularAttribute<Entrada, String> observacion;
    public static volatile SingularAttribute<Entrada, Juego> unJuego;

}