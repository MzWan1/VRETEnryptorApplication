/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.services;

import javax.ejb.Stateless;

import za.ac.tut.exception.IsNotDigitException;
import za.ac.tut.exception.NotRequiredLengthException;
import za.ac.tut.exception.UserExistException;

/**
 *
 * @author Student
 */
@Stateless
public class ValidateUserID implements ValidateUserIDInterface{

    
    @Override
    public void validateUserID(String userid) throws NotRequiredLengthException, IsNotDigitException, UserExistException{
        if (userid.isEmpty() || userid.length() != 3) {
            throw new NotRequiredLengthException("The userid should be exactly three charecters");
        }
        
        if (!userid.matches("\\d{3}")) {
            throw new IsNotDigitException("The userid should only be digits");
        }
    }
}
