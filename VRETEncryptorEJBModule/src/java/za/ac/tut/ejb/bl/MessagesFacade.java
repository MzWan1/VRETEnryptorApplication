/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.ejb.model.Messages;

/**
 *
 * @author Student
 */
@Stateless
public class MessagesFacade extends AbstractFacade<Messages> implements MessagesFacadeLocal {

    @PersistenceContext(unitName = "VRETEncryptorEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessagesFacade() {
        super(Messages.class);
    }
    
    @Override
    public String viewLongestMessage() {
        String jpql = "SELECT m.agentid, m.message,m.messagelen FROM Messages m ORDER BY m.messagelen DESC";
        Query query = em.createQuery(jpql);
        
        query.setMaxResults(1);
        Object[] result = (Object[]) query.getSingleResult();
       
        String outcome = "Agent ID: " + result[0] + " \nCyphered Text: " + result[1] + " \nMessage Length: " + result[2];
        return  outcome;
    }
}
