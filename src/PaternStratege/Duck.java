/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PaternStratege;

/**
 *
 * @author nazarov
 */
public abstract class Duck {
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;
   public Duck() {
   } 
  
   public abstract void display();
   
   public void performFly() {
    flyBehavior.fly();
   }
   public void performQuack() {
    quackBehavior.quack();
   } 
   public void swim() {
    System.out.println("All ducks float, even decoys!");
   }
   
    //-----------------------------------------
   // Динамическое изменене Полета
   public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
   }
   
    //-----------------------------------------
   // Динамическое изменене звука
   public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;

    }
}
