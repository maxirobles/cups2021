/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import ejb.ProductoDAO;
import entidades.Pedidos;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "agregarBean")
@RequestScoped
public class AgregarBean {

    @EJB
    private ProductoDAO servicio;
    private Pedidos prod;

    public AgregarBean() {
    }

    @PostConstruct
    public void Iniciar() {
        this.prod = new Pedidos();
    }

    public Pedidos getProd() {
        return prod;
    }

    public void setProd(Pedidos prod) {
        this.prod = prod;
    }

    public String GuardarProducto() {
        this.servicio.agregar(this.prod);
        return "/index";
    }
}
