/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.model.Messages;

/**
 *
 * @author Student
 */
@Local
public interface MessagesFacadeLocal {

    void create(Messages messages);

    void edit(Messages messages);

    void remove(Messages messages);

    Messages find(Object id);

    List<Messages> findAll();

    List<Messages> findRange(int[] range);

    int count();
    
    String viewLongestMessage();
    
}
