/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;


/**
 *
 * @author nazarov
 * 
 * Реализация патерна Комманда
 *  инкапсулирует объекты между друг другом
 * 
 */
public class Main {
    
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
 
        LightOnCommand livingRoomLightOn
                = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff
                = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        // Тест Вентилятора
        runCelling();
    }
    
    public static void runCelling(){
    
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
        CeilingFan ceilingFan = new CeilingFan("Living Room");
   
        // Создаем три скорости вентилятора все имплиментированные от комманд
        CeilingFanMediumCommand ceilingFanMedium = 
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = 
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = 
                new CeilingFanOffCommand(ceilingFan);
  
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff); // помещаем комманды 
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
   
        remoteControl.onButtonWasPushed(0); // Сначала включаем среднюю скорость.
        remoteControl.offButtonWasPushed(0); // Потом выключаем вентилятор.
        System.out.println(remoteControl);  
        remoteControl.undoButtonWasPushed();// Отмена! Снова должна включиться средняя скорость
  
        remoteControl.onButtonWasPushed(1); //На этот раз выбираем высокую
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed(); // И снова отмена; должна вернуться средняя скорость

    }
}
