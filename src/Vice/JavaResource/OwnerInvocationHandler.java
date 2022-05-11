/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice.JavaResource;

/**
 *
 * @author nazarov
 */
import java.lang.reflect.*;
 
public class OwnerInvocationHandler implements InvocationHandler {  // реализуем интерфейс встроенного заместителя
    PersonBean person;
 
    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }
 
    @Override // реализуем этот метод с проверкой
    public Object invoke(Object proxy, Method method, Object[] args) 
            throws IllegalAccessException {
  
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            } 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        return null;
    }
    
}
