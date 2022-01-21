/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Adapter;

/**
 *
 * @author nazarov
 */
// --- это патерн адаптер реализация через наследование класса и нужного интерфейса (методом и ссылкой на объект который адаптируем)---
// Всеголишь обертка для интерфейса
public class AdapterPatern_1  implements EngeneRocket{
    Rocket1 rocket;
    
    public AdapterPatern_1(Rocket1 rocket){
        this.rocket = rocket;
    }
    
    @Override
    public void upSpeed() {
        rocket.disconnectStage(); // вот тут уже из реализации интерфейса и выполняем что нужно в классе
    }

    @Override
    public void downSpeed() {
        System.out.println("Speed is up!");
    }
    
}