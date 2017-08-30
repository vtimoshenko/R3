/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.exhandling;

/**
 * Исключение, возникающее при функционировании приложения.
 * Необходимо вывести сообщение пользователю.
 * @author vtimoshenko
 */
public class FunctionalException extends Exception {
    public FunctionalException(String message){
        super(message);
    }
}
