/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatterIterator;

/**
 *
 * @author nazarov
 * 
 *  Патерн итератор инкапсулирует перебор разных коллекций в себе,
 * что бы клиент не думал о типе перебора данных
 * 
 *   Весь цирк этот с конями вначале с готовыми классами не понял, один хер просто
 * все переписали под итераторы с нисходящим интерфейсом.
 */
public class Main {
     public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu); // 
 
        waitress.printMenu();
    }
}
