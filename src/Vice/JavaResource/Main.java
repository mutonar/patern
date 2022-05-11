/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice.JavaResource;

import java.lang.reflect.Proxy;

/**
 *
 * @author nazarov
 *
 * Заместитель библиотеками Java
 * Заместитель динамический(получается во время исполения)
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        Main test = new Main();
        test.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl("Joe Javabean"); 
        PersonBean ownerProxy = getOwnerProxy(joe);        
        System.out.println("Name is " + ownerProxy.getName());
        
        ownerProxy.setInterests("bowling, Go");
        
        System.out.println("Interests set from owner proxy");
        
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can’t set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);    // заместитель который не может редактировать    
        System.out.println("Name is " + nonOwnerProxy.getName());
        
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can’t set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {   
        // Метод можем все редактировать(перекручиваем интерфейс на свой лад)
        /*  Во-первых, ewProxyInstance()  всегда  передается 
        массив интерфейсов — разрешены толь-
        ко  интерфейсы,  но  не  классы.  Главное 
        ограничение  заключается  в  том,  что  все 
        интерфейсы с уровнем доступа, отличным 
        от  public,  должны  принадлежать  одному 
        пакету. Кроме того, запрещены конфликты 
        имен в интерфейсах (то есть интерфейсы 
        с  методами,  имеющими  одинаковую  сиг-
        натуру).  Существуют  и  другие  второсте-
        пенные  ограничения;  информацию  о  них 
        можно найти в javadoc
        */
        return (PersonBean) Proxy.newProxyInstance( 
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        // Метод стороннего юзера
        return (PersonBean) Proxy.newProxyInstance( 
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvoсationHandler(person));
    }
    
}
