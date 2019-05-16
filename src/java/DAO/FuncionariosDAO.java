/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Funcionarios;

/**
 *
 * @author will
 */
public class FuncionariosDAO {
    public List<Funcionarios> read() {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("SmartFood4PU");
        EntityManager em = factory.createEntityManager();
        
        return em.createQuery("SELECT u FROM Funcionarios u").getResultList();  
    }
}
