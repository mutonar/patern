/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author nazarov
 */
public class Dysplay2 implements DysplayElement, Observer{

    int min;
    int max;
    int value;
    Subject stationWeather;
    
    public Dysplay2(Subject stationWeather){ // в конструктор передаем Субъект за которым смотрим
        this.stationWeather = stationWeather;
        stationWeather.addObserver(this); // Регестрируемся в наблюдаемом
    }
    @Override
    public void showDataDisplay() {
    // метод вывод просто информации(немного по другому)
        System.out.println("min: " + min + " max: " + max + " Value: "+ value);
    }

    @Override
    public void updateDate(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
        showDataDisplay();
    }
        
    
}
