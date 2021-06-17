/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import ejb.ProductoDAO;
import entidades.Pedidos;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "borrarBean")
@SessionScoped
public class BorrarBean implements Serializable {

    @EJB
    private ProductoDAO servicio;
    private Pedidos prod;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BorrarBean() {
    }

    public Pedidos getProd() {
        return prod;
    }

    public String buscarProducto(int id) {
        this.prod = this.servicio.buscarPorId(id);
        return "vistas/BorrarPedido";
    }

    public String borrarProducto() {
        this.servicio.borrar(this.prod);
        return "/index";
    }
    
}
