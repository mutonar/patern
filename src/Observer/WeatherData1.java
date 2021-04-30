/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author nazarov
 * 
 * Реализация наблюдателя по средствам встроеного в Джаву 
 * Плох тем что реализация от Абстрактного класса
 * 
 */

// --- Субъект за кем каблюдают (что изменилось) ---
public class WeatherData1 extends Observable {
    // Данные метеостанции
    int minTemperature;
    int maxTemperature; 
    int valueTemperature;
    

    public void measurementsChanged(){
        setChanged();   // прежде чем сообщить наблюдателям фиксируем
        notifyObservers();  // Оповещаем(Объект не передается, означает что используем модель запрос данных)
    }
    
     // метод изменения состояни 
    public void setValueObserver(int minTemperature, int maxTemperature, int valueTemperature){
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature; 
        this.valueTemperature = valueTemperature;
        measurementsChanged();
    }
    
    // --- Через это берем данные наблюдателями ---
    public int[] getDataStation(){
        return new int[]{minTemperature, maxTemperature, valueTemperature};
    
    }
    
}
