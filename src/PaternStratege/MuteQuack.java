/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PaternStratege;

public class MuteQuack implements QuackBehavior {
   public void quack() {
  System.out.println("<< Silence >>");
   }
}