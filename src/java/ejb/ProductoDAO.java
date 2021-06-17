/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Pedidos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless
public class ProductoDAO {
@PersistenceContext(unitName = "2020_Parcial_2_Lab_5PU")
EntityManager em;
public void agregar(Pedidos x) {
em.persist(x);
}
public Pedidos modificar(Pedidos x) {
return em.merge(x);
}
public void borrar(Pedidos x) {
em.remove(em.merge(x));
}
public List<Pedidos> listarTodos() {
Query q = em.createNamedQuery("Producto.findAll");
return (List<Pedidos>)q.getResultList();
}
public Pedidos buscarPorId(int id){
Query q = em.createNamedQuery("Producto.findByProdCodigo");
q.setParameter("prodCodigo", id);
return (Pedidos)q.getSingleResult();
}
}