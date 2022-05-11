/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice.JavaResource;

/**
 *
 * @author nazarov
 * 
 * Обработчик данных других пользователей NonOwnerInvo cationHandler 
работает точно так же, как OwnerInvocation Handler, если не считать 
того, что он разрешает вызовы setHotOrNotRating() и запрещает вызовы 
еиненжарпУвсех остальных s
 */
import java.lang.reflect.*;
 
public class NonOwnerInvoсationHandler implements InvocationHandler {  // реализуем интерфейс встроенного заместителя
    PersonBean person;
 
    public NonOwnerInvoсationHandler(PersonBean person) {
        this.person = person;
    }
 
    @Override // реализуем этот метод с проверкой
    public Object invoke(Object proxy, Method method, Object[] args) 
            throws IllegalAccessException {
  
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("setName")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("setGender")) {
               throw new IllegalAccessException();
            } else if (method.getName().startsWith("setName")) {
               throw new IllegalAccessException();
            } else if (method.getName().startsWith("setInterests")) {
               throw new IllegalAccessException();
            }  
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        return null;
    }
}