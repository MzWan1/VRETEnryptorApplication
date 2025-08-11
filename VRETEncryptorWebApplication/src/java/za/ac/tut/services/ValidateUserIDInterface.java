/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.services;

import javax.ejb.Local;
import za.ac.tut.exception.IsNotDigitException;
import za.ac.tut.exception.NotRequiredLengthException;
import za.ac.tut.exception.UserExistException;

/**
 *
 * @author Student
 */
@Local
public interface ValidateUserIDInterface {
    void validateUserID(String userid)throws NotRequiredLengthException, IsNotDigitException, UserExistException;
}
