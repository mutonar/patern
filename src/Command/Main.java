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
 * тут есть комманды с отменой
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
        remoteControl.undoButtonWasPushed();// отмена команды
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        
        // Тест Вентилятора
        runCelling();
        
        // Тест макрокоманд
        useMacrocommands();
        
        // Тест лямбды вместо готовых классов
        useLambdaCommand();
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
    
    // --- Использование макрокоманд ---
    public static void useMacrocommands(){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        // Сначала создается набор команд, которые войдут в макропоследовательность:
        // Устройства
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub(); // Джакузи
        // комманды этими устройствами
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        // (включение и выключение), заполняются соответствующими командами:
        CommandWithUndo[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
        CommandWithUndo[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
        // и два объекта макрокоманд, в которых они хранятся.
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        //  Затем макрокоманда, как обычно, связывается с кнопкой:
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        //дальше нажимаем кнопки и смотрим, как работает макрокоманда.
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On--");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off--");
        remoteControl.offButtonWasPushed(0);
    }
    
     // --- Использование лямбда функции вместо кеализации конкретных комманд ---
    public static void useLambdaCommand(){
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light); //(вместо этого)
        
        Command stereoOnWithCD = () -> { // лябда в несколько действий
            stereo.on(); stereo.setCD(); stereo.setVolume(11);
        };
        
        RemoteControl remoteControl = new RemoteControl(); // тут просто реализация без отмены
        remoteControl.setCommand(0, () -> {light.on();}, () -> {light.on();});
        remoteControl.setCommand(1, stereo::on, stereo::off); // без лямб просто ссылкой на метод
        remoteControl.setCommand(2, stereoOnWithCD, stereo::off); // тут лябда с большим количеством действий
        
        //дальше нажимаем кнопки и смотрим, как работает макрокоманда.
        System.out.println(remoteControl);
        System.out.println("--- Pushing Liambda On--");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Liambda Off--");
        remoteControl.offButtonWasPushed(0);
    }
}
