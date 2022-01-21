/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatternMethod;

/**
 *
 * @author nazarov
 * Основа шаблонного метода
 * 
 * Просто дергаем неизменяемый метод а в нем есть вызовы того что нужно переопределить
 */
public abstract class CaffeineBeverage {
  
    final void prepareRecipe() { // наследники не должны изменять шаблонный метод
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }
 
    // Каждый наследник реализует это по своему
    abstract void brew(); 
    abstract void addCondiments();
 
    void boilWater() {
        System.out.println("Boiling water");
    }
  
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() { // метод перехватчик (можно переопределять а можно нет)
        return true;
    }
}