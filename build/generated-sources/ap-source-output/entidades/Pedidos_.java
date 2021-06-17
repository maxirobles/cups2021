package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-23T15:32:24")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Integer> pedId;
    public static volatile SingularAttribute<Pedidos, String> pedProducto;
    public static volatile SingularAttribute<Pedidos, Integer> pedCantidad;
    public static volatile SingularAttribute<Pedidos, String> pedPeluqueria;
    public static volatile SingularAttribute<Pedidos, Date> pedFecha;

}