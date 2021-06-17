/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

import ejb.ProductoDAO;
import entidades.Pedidos;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author 
 */
@Named(value = "IndexBean")
@RequestScoped
public class IndexBean {
    
    @EJB
    private ProductoDAO servicio;
    private List<Pedidos> pedidos;
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }
    
    @PostConstruct
    private void BuscarPedidos() {
        this.pedidos = servicio.listarTodos();
    }
    public List<Pedidos> getPedidos() {
        this.pedidos = servicio.listarTodos();
        return pedidos;
    }
    
    
}
