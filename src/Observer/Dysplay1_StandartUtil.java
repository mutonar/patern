/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author nazarov
 */
public class Dysplay1_StandartUtil implements DysplayElement, Observer{

    int min;
    int max;
    int value;
    Observable subject; // стандартный наблюдаемый

    public Dysplay1_StandartUtil(Observable subject)
    {
        this.subject = subject;
        subject.addObserver(this);
    }
    
    @Override
    public void showDataDisplay() {
         // метод вывод просто информации
        System.out.println(min + " " + max + " " + value);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData1) {
            WeatherData1 weatherData1 = (WeatherData1)o;
            this.min = weatherData1.getDataStation()[0]; // берем данные на прямую
            this.max = weatherData1.getDataStation()[1];
            this.value = weatherData1.getDataStation()[2];
            showDataDisplay();
        }
    }
    
}
