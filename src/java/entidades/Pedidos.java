/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ministerio
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findByPedId", query = "SELECT p FROM Pedidos p WHERE p.pedId = :pedId")
    , @NamedQuery(name = "Pedidos.findByPedPeluqueria", query = "SELECT p FROM Pedidos p WHERE p.pedPeluqueria = :pedPeluqueria")
    , @NamedQuery(name = "Pedidos.findByPedProducto", query = "SELECT p FROM Pedidos p WHERE p.pedProducto = :pedProducto")
    , @NamedQuery(name = "Pedidos.findByPedFecha", query = "SELECT p FROM Pedidos p WHERE p.pedFecha = :pedFecha")
    , @NamedQuery(name = "Pedidos.findByPedCantidad", query = "SELECT p FROM Pedidos p WHERE p.pedCantidad = :pedCantidad")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pedId", nullable = false)
    private Integer pedId;
    @Size(max = 50)
    @Column(name = "pedPeluqueria", length = 50)
    private String pedPeluqueria;
    @Size(max = 20)
    @Column(name = "pedProducto", length = 20)
    private String pedProducto;
    @Basic(optional = false)
    @Column(name = "pedFecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pedFecha;
    @Column(name = "pedCantidad")
    private Integer pedCantidad;

    public Pedidos() {
    }

    public Pedidos(Integer pedId) {
        this.pedId = pedId;
    }

    public Pedidos(Integer pedId, Date pedFecha) {
        this.pedId = pedId;
        this.pedFecha = pedFecha;
    }

    public Integer getPedId() {
        return pedId;
    }

    public void setPedId(Integer pedId) {
        this.pedId = pedId;
    }

    public String getPedPeluqueria() {
        return pedPeluqueria;
    }

    public void setPedPeluqueria(String pedPeluqueria) {
        this.pedPeluqueria = pedPeluqueria;
    }

    public String getPedProducto() {
        return pedProducto;
    }

    public void setPedProducto(String pedProducto) {
        this.pedProducto = pedProducto;
    }

    public Date getPedFecha() {
        return pedFecha;
    }

    public void setPedFecha(Date pedFecha) {
        this.pedFecha = pedFecha;
    }

    public Integer getPedCantidad() {
        return pedCantidad;
    }

    public void setPedCantidad(Integer pedCantidad) {
        this.pedCantidad = pedCantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedId != null ? pedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.pedId == null && other.pedId != null) || (this.pedId != null && !this.pedId.equals(other.pedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pedidos[ pedId=" + pedId + " ]";
    }
    
}
