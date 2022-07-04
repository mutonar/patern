/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author nazarov
 *
 * патерн наблюдатель
 */
public class Main {

    public static void main(String[] args)
    {

        WeatherData weatherData = new WeatherData();
        Dysplay1 d0 = new Dysplay1(weatherData); // передаем за кем наблюдать
        Dysplay1 d1 = new Dysplay1(); 
        weatherData.addObserver(d1); // передаем наблюдателя
        Dysplay2 d2 = new Dysplay2(weatherData);
        
        // тут реализация встроенного в Джава Наблюдателя
        WeatherData1 weatherData1 = new WeatherData1();
        Dysplay1_StandartUtil dysplay1_StandartUtil = new Dysplay1_StandartUtil(weatherData1);
        
        // изменяем значения
        for (int i = 0; i < 10; i++) {
            //weatherData.setValueObserver(i +  i*2, i * i*2, i + i*22);
            weatherData1.setValueObserver(i +  i*2, i * i*2, i + i*22);
        }
    }
}
