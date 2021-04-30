/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazarov
 */

// --- Субъект за кем каблюдают (что изменилось) ---
public class WeatherData implements Subject {

    List<Observer> observers = new ArrayList<>(); // Список наблюдателей
    
    // Данные метеостанции
    int minTemperature;
    int maxTemperature; 
    int valueTemperature;
    
    // ----------------------------
    @Override
    public void addObserver(Observer o) { // добавить слушателя
        observers.add(o);
    }

    // ----------------------------
    @Override
    public void removeObserver(Observer o) { // удалить слушателя
        observers.remove(o);
    }

    // ----------------------------
    @Override
    public void notifyObserver() {
       for(Observer o: observers){ // Рассылаем слушетелям 
       o.updateDate(minTemperature, maxTemperature, valueTemperature);
       }
    }
    
     // метод изменения состояни 
    public void setValueObserver(int minTemperature, int maxTemperature, int valueTemperature){
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature; 
        this.valueTemperature = valueTemperature;
        notifyObserver(); // вызов оповещения всем слушателям
    }
    
}
