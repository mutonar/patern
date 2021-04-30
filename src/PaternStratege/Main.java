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
public class Main {
     public static void main(String[] args) {
      Duck mallard = new MallardDuck();
      mallard.performQuack();
      mallard.performFly();
      // Изменяем на ходу      
      Duck model = new ModelDuck();
      model.performFly();
      model.setFlyBehavior(new FlyRocketPowered()); // присваивание нового реализованного интерфейса
      model.performFly();  
      model.setQuackBehavior(new MuteQuack()); // присваивание нового реализованного интерфейса звука
      model.performQuack();

   }
}
