/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatternMethod;

/**
 *
 * @author nazarov
 * 
 *  Паттерн  Шаблонный  Метод  задает  «скелет»  алгоритма 
    в методе, оставляя определение реализации некоторых шагов субклассам.
    Субклассы могут переопределять некоторые 
    части алгоритма без изменения его структуры.

 * 
 */
public class Main {
    public static void main(String[] args){ 
        // реализация каждого напитка по своему
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        
        Coffee myCofee = new Coffee();
        myCofee.prepareRecipe();
        
        CoffeeWithHook myCoffeeWithHook = new CoffeeWithHook();
        myCoffeeWithHook.prepareRecipe();
    }
    
}
