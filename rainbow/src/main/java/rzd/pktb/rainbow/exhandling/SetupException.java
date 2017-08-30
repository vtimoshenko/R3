/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzd.pktb.rainbow.exhandling;

/**
 * Критическое исключение возникшее по причине не правильной настройки или установки приложения.
 * Необходимо сообщить пользователю.
 * @author vtimoshenko
 */
public class SetupException extends Exception {
    public SetupException (String message){
        super(message);
    }
}
