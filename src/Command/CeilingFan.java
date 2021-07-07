/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ad
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
 
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
  
    public void high() {
        speed = HIGH;
        // Высокая скорость
    } 
 
    public void medium() {
        speed = MEDIUM;
        // Средняя скорость 
    }
 
    public void low() {
        speed = LOW;
        // Низкая скорость
    }
  
    public void off() {
        speed = OFF;
        // Выключение вентилятора
    }
  
    public int getSpeed() {
        return speed;
    }
}
